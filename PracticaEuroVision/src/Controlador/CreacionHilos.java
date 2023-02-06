package Controlador;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import persistencias.PorcentajeVotacionRango;
import persistencias.PorcentajesRangoEdad;

public class CreacionHilos {
	public static void main(String[]args) {
		SessionFactory sf=null;
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		 System.out.println("Rangos Poblacion Andalucia "+getPoblacionTotalComunidad(sf, "Andalucia"));
	}
	
	
	 public static ArrayList<Integer> getPoblacionTotalComunidad(SessionFactory sessionFac, String nombreComunidad) {
	        Session session = null;
	        PorcentajesRangoEdad data = new PorcentajesRangoEdad();
	        int poblacionTotal = 0,poblacion18_25 = 0,poblacion26_40 = 0,poblacion41_65 = 0,poblacion66mas = 0;
	        int calcular_18_25=0,calcular_26_40=0,calcular_41_65=0,calcular_66mas=0;
	        Double hporcentaje_18_25=0.0,hporcentaje_26_40=0.0,hporcentaje_41_65=0.0,hporcentaje_66mas=0.0;
	        ArrayList<Integer>cantidadpoblacion=new ArrayList<Integer>();
	        /* ESQUEMA DEL ARRAY
	         * POSICION 0 ---- POBLACION TOTAL DE LA COMUNIDAD
	         * POSICION 1 ---- POBLACION QUE VOTA ENTRE 18 Y 25 AÑOS
	         * POSICION 2 ---- POBLACION QUE VOTA ENTRE 26 Y 40 AÑOS
	         * POSICION 3 ---- POBLACION QUE VOTA ENTRE 41 Y 65 AÑOS
	         * POSICION 4 ---- POBLACION QUE VOTA ENTRE 66 y MAS AÑOS
	        */
	        try {
	            session = sessionFac.getCurrentSession();
	            session.beginTransaction();

	            // REALIZAMOS LA CONSULTA PARA CALCULAR POBLACION TOTAL DE X COMUNIDAD
	            Query query = session
	                    .createQuery("FROM PorcentajesRangoEdad WHERE nombreComunidad = :var");
	            query.setParameter("var", nombreComunidad);
	            data = (PorcentajesRangoEdad) query.getSingleResult();
	            //CALCULAR CUANTA POBLACION HAY POR EDAD
	            poblacionTotal = data.getTotalHabitantes();
	            cantidadpoblacion.add(poblacionTotal);
	            calcular_18_25=(poblacionTotal*data.getRango1825())/100;
	            calcular_26_40=(poblacionTotal*data.getRango2640())/100;
	            calcular_41_65=(poblacionTotal*data.getRango4165())/100;
	            calcular_66mas=(poblacionTotal*data.getRangoMas66())/100;
	            
	            // OBTENEMOS EL PROCENTAJE SEGUN EL RANGO DE EDAD PARA SABER CUANTAS PERSONAS VOTAN POR EDAD Y GENERAR LOS HILOS
	            Query q2=session.createQuery("FROM PorcentajeVotacionRango");
	            ArrayList<PorcentajeVotacionRango>porcentajes=(ArrayList<PorcentajeVotacionRango>) q2.getResultList();
	            for(int i=0;i<porcentajes.size();i++) {
	            	if(porcentajes.get(i).getRango().equals("RANGO_18_25")) {
	            		hporcentaje_18_25=porcentajes.get(i).getPorcentaje().doubleValue();
	            		poblacion18_25=(int) (calcular_18_25*hporcentaje_18_25)/100;
	            		cantidadpoblacion.add(poblacion18_25);
	            	}
	            	if(porcentajes.get(i).getRango().equals("RANGO_26_40")) {
	            		hporcentaje_26_40=porcentajes.get(i).getPorcentaje().doubleValue();
	            		poblacion26_40=(int) (hporcentaje_26_40*calcular_26_40)/100;
	            		cantidadpoblacion.add(poblacion26_40);
	            	}
	            	if(porcentajes.get(i).getRango().equals("RANGO_41_65")) {
	            		hporcentaje_41_65=porcentajes.get(i).getPorcentaje().doubleValue();
	            		poblacion41_65=(int) (calcular_41_65*hporcentaje_41_65)/100;
	            		cantidadpoblacion.add(poblacion41_65);
	            	}
	            	if(porcentajes.get(i).getRango().equals("RANGO_MAS_66")) {
	            		hporcentaje_66mas=porcentajes.get(i).getPorcentaje().doubleValue();
	            		poblacion66mas=(int) (calcular_66mas*hporcentaje_66mas)/100;
	            		cantidadpoblacion.add(poblacion66mas);
	            	}
	            }
	        } catch (HibernateException e) {
	            e.printStackTrace();
	            if (null != session) {
	                session.getTransaction().rollback();
	            }
	            throw e;
	        } finally {
	            if (null != session) {
	                session.close();
	            }
	        }

	        return cantidadpoblacion;
	    }
	
	
	
}
