package Controlador;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Modelo.Ciudadano;
import persistencias.PorcentajeVotacionRango;
import persistencias.PorcentajesRangoEdad;

public class CreacionHilos {
	public static void main(String[]args) {
		SessionFactory sf=null;
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		ArrayList<Ciudadano>votantes=new ArrayList<Ciudadano>();
		ArrayList<Integer>votosandalucia=getPoblacionTotalComunidad(sf, "Andalucia");
		ArrayList<Integer>votosaragon=getPoblacionTotalComunidad(sf, "Aragon");
		ArrayList<Integer>votosasturias=getPoblacionTotalComunidad(sf, "Asturias");
		ArrayList<Integer>votosbaleares=getPoblacionTotalComunidad(sf, "Baleares");
		ArrayList<Integer>votoscanarias=getPoblacionTotalComunidad(sf, "Canarias");
		ArrayList<Integer>votoscantabria=getPoblacionTotalComunidad(sf, "Cantabria");
		ArrayList<Integer>votosclm=getPoblacionTotalComunidad(sf, "Castilla La Mancha");
		ArrayList<Integer>votoscyl=getPoblacionTotalComunidad(sf, "Castilla y Leon");
		ArrayList<Integer>votoscatalunia=getPoblacionTotalComunidad(sf, "Catalunia");
		ArrayList<Integer>votosceuta=getPoblacionTotalComunidad(sf, "Ceuta");
		ArrayList<Integer>votosvalencia=getPoblacionTotalComunidad(sf, "Comunidad Valenciana");
		ArrayList<Integer>votosextremadura=getPoblacionTotalComunidad(sf, "Extremadura");
		ArrayList<Integer>votosgalicia=getPoblacionTotalComunidad(sf, "Galicia");
		ArrayList<Integer>votoslarioja=getPoblacionTotalComunidad(sf, "La Rioja");
		ArrayList<Integer>votosmadrid=getPoblacionTotalComunidad(sf, "Madrid");
		ArrayList<Integer>votosmelilla=getPoblacionTotalComunidad(sf, "Melilla");
		ArrayList<Integer>votosmurcia=getPoblacionTotalComunidad(sf, "Murcia");
		ArrayList<Integer>votosnavarra=getPoblacionTotalComunidad(sf, "Navarra");
		ArrayList<Integer>votospaisvasco=getPoblacionTotalComunidad(sf, "Pais Vasco");
		Ciudadano ciudadano=null;
		//Generar Ciudadanos de 18-25 años Andalucia
		for(int i=0;i<votosandalucia.get(1);i++) {
			ciudadano=new Ciudadano("Andalucia", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		//Generar Ciudadanos de 26-40 años Andalucia
		for(int i=0;i<votosandalucia.get(2);i++) {
			ciudadano=new Ciudadano("Andalucia", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		//Generar Ciudadanos de 41-65 años Andalucia
		for(int i=0;i<votosandalucia.get(3);i++) {
					ciudadano=new Ciudadano("Andalucia", "RANGO_41_65");
					ciudadano.start();
					votantes.add(ciudadano);
		}
		//Generar Ciudadanos de 66 y mas años Andalucia
		for(int i=0;i<votosandalucia.get(4);i++) {
							ciudadano=new Ciudadano("Andalucia", "RANGO_MAS_66");
							ciudadano.start();
							votantes.add(ciudadano);
		}
		////////////////////////////////////////////////////////////////////////////
		//Generar Ciudadanos de 18-25 años Aragon
				for(int i=0;i<votosaragon.get(1);i++) {
					ciudadano=new Ciudadano("Aragon", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Aragon
				for(int i=0;i<votosaragon.get(2);i++) {
					ciudadano=new Ciudadano("Aragon", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Aragon
				for(int i=0;i<votosaragon.get(3);i++) {
							ciudadano=new Ciudadano("Aragon", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Aragon
				for(int i=0;i<votosaragon.get(4);i++) {
									ciudadano=new Ciudadano("Aragon", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				//////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Asturias
				for(int i=0;i<votosasturias.get(1);i++) {
					ciudadano=new Ciudadano("Asturias", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Asturias
				for(int i=0;i<votosasturias.get(2);i++) {
					ciudadano=new Ciudadano("Asturias", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Asturias
				for(int i=0;i<votosasturias.get(3);i++) {
							ciudadano=new Ciudadano("Asturias", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Asturias
				for(int i=0;i<votosasturias.get(4);i++) {
									ciudadano=new Ciudadano("Asturias", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				//////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Baleares
				for(int i=0;i<votosbaleares.get(1);i++) {
					ciudadano=new Ciudadano("Baleares", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Baleares
				for(int i=0;i<votosbaleares.get(2);i++) {
					ciudadano=new Ciudadano("Baleares", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Baleares
				for(int i=0;i<votosbaleares.get(3);i++) {
							ciudadano=new Ciudadano("Baleares", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Baleares
				for(int i=0;i<votosbaleares.get(4);i++) {
									ciudadano=new Ciudadano("Baleares", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				//////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Canarias
				for(int i=0;i<votoscanarias.get(1);i++) {
					ciudadano=new Ciudadano("Canarias", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Canarias
				for(int i=0;i<votoscanarias.get(2);i++) {
					ciudadano=new Ciudadano("Canarias", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Canarias
				for(int i=0;i<votoscanarias.get(3);i++) {
							ciudadano=new Ciudadano("Canarias", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Canarias
				for(int i=0;i<votoscanarias.get(4);i++) {
									ciudadano=new Ciudadano("Canarias", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Cantabria
				for(int i=0;i<votoscantabria.get(1);i++) {
					ciudadano=new Ciudadano("Cantabria", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Cantabria
				for(int i=0;i<votoscantabria.get(2);i++) {
					ciudadano=new Ciudadano("Cantabria", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Cantabria
				for(int i=0;i<votoscantabria.get(3);i++) {
							ciudadano=new Ciudadano("Cantabria", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Cantabria
				for(int i=0;i<votoscantabria.get(4);i++) {
									ciudadano=new Ciudadano("Cantabria", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Castilla La Mancha
				for(int i=0;i<votosclm.get(1);i++) {
					ciudadano=new Ciudadano("Castilla La Mancha", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Castilla La Mancha
				for(int i=0;i<votosclm.get(2);i++) {
					ciudadano=new Ciudadano("Castilla La Mancha", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Castilla La Mancha
				for(int i=0;i<votosclm.get(3);i++) {
							ciudadano=new Ciudadano("Castilla La Mancha", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Castilla La Mancha
				for(int i=0;i<votosclm.get(4);i++) {
									ciudadano=new Ciudadano("Castilla La Mancha", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Castilla y Leon
				for(int i=0;i<votoscyl.get(1);i++) {
					ciudadano=new Ciudadano("Castilla y Leon", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Castilla y Leon
				for(int i=0;i<votoscyl.get(2);i++) {
					ciudadano=new Ciudadano("Castilla y Leon", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Castilla y Leon
				for(int i=0;i<votoscyl.get(3);i++) {
							ciudadano=new Ciudadano("Castilla y Leon", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Castilla y Leon
				for(int i=0;i<votoscyl.get(4);i++) {
									ciudadano=new Ciudadano("Castilla y Leon", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Catalunia
				for(int i=0;i<votoscatalunia.get(1);i++) {
					ciudadano=new Ciudadano("Catalunia", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Catalunia
				for(int i=0;i<votoscatalunia.get(2);i++) {
					ciudadano=new Ciudadano("Catalunia", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Catalunia
				for(int i=0;i<votoscatalunia.get(3);i++) {
							ciudadano=new Ciudadano("Catalunia", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Catalunia
				for(int i=0;i<votoscatalunia.get(4);i++) {
									ciudadano=new Ciudadano("Catalunia", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Ceuta
				for(int i=0;i<votosceuta.get(1);i++) {
					ciudadano=new Ciudadano("Ceuta", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Ceuta
				for(int i=0;i<votosceuta.get(2);i++) {
					ciudadano=new Ciudadano("Ceuta", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Ceuta
				for(int i=0;i<votosceuta.get(3);i++) {
							ciudadano=new Ciudadano("Ceuta", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Ceuta
				for(int i=0;i<votosceuta.get(4);i++) {
									ciudadano=new Ciudadano("Ceuta", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Comunidad Valenciana
				for(int i=0;i<votosvalencia.get(1);i++) {
					ciudadano=new Ciudadano("Comunidad Valenciana", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Comunidad Valenciana
				for(int i=0;i<votosvalencia.get(2);i++) {
					ciudadano=new Ciudadano("Comunidad Valenciana", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Comunidad Valenciana
				for(int i=0;i<votosvalencia.get(3);i++) {
							ciudadano=new Ciudadano("Comunidad Valenciana", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Comunidad Valenciana
				for(int i=0;i<votosvalencia.get(4);i++) {
									ciudadano=new Ciudadano("Comunidad Valenciana", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Extremadura
				for(int i=0;i<votosextremadura.get(1);i++) {
					ciudadano=new Ciudadano("Extremadura", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Extremadura
				for(int i=0;i<votosextremadura.get(2);i++) {
					ciudadano=new Ciudadano("Extremadura", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Extremadura
				for(int i=0;i<votosextremadura.get(3);i++) {
							ciudadano=new Ciudadano("Extremadura", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Extremadura
				for(int i=0;i<votosextremadura.get(4);i++) {
									ciudadano=new Ciudadano("Extremadura", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Galicia
				for(int i=0;i<votosgalicia.get(1);i++) {
					ciudadano=new Ciudadano("Galicia", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Galicia
				for(int i=0;i<votosgalicia.get(2);i++) {
					ciudadano=new Ciudadano("Galicia", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Galicia
				for(int i=0;i<votosgalicia.get(3);i++) {
							ciudadano=new Ciudadano("Galicia", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Galicia
				for(int i=0;i<votosgalicia.get(4);i++) {
									ciudadano=new Ciudadano("Galicia", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años La Rioja
				for(int i=0;i<votoslarioja.get(1);i++) {
					ciudadano=new Ciudadano("La Rioja", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años La Rioja
				for(int i=0;i<votoslarioja.get(2);i++) {
					ciudadano=new Ciudadano("La Rioja", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años La Rioja
				for(int i=0;i<votoslarioja.get(3);i++) {
							ciudadano=new Ciudadano("La Rioja", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años La Rioja
				for(int i=0;i<votoslarioja.get(4);i++) {
									ciudadano=new Ciudadano("La Rioja", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Madrid
				for(int i=0;i<votosmadrid.get(1);i++) {
					ciudadano=new Ciudadano("Madrid", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Madrid
				for(int i=0;i<votosmadrid.get(2);i++) {
					ciudadano=new Ciudadano("Madrid", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Madrid
				for(int i=0;i<votosmadrid.get(3);i++) {
							ciudadano=new Ciudadano("Madrid", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Madrid
				for(int i=0;i<votosmadrid.get(4);i++) {
									ciudadano=new Ciudadano("Madrid", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Melilla
				for(int i=0;i<votosmelilla.get(1);i++) {
					ciudadano=new Ciudadano("Melilla", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Melilla
				for(int i=0;i<votosmelilla.get(2);i++) {
					ciudadano=new Ciudadano("Melilla", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Melilla
				for(int i=0;i<votosmelilla.get(3);i++) {
							ciudadano=new Ciudadano("Melilla", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Melilla
				for(int i=0;i<votosmelilla.get(4);i++) {
									ciudadano=new Ciudadano("Melilla", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Murcia
				for(int i=0;i<votosmurcia.get(1);i++) {
					ciudadano=new Ciudadano("Murcia", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Murcia
				for(int i=0;i<votosmurcia.get(2);i++) {
					ciudadano=new Ciudadano("Murcia", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Murcia
				for(int i=0;i<votosmurcia.get(3);i++) {
							ciudadano=new Ciudadano("Murcia", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Murcia
				for(int i=0;i<votosmurcia.get(4);i++) {
									ciudadano=new Ciudadano("Murcia", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Navarra
				for(int i=0;i<votosnavarra.get(1);i++) {
					ciudadano=new Ciudadano("Navarra", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Navarra
				for(int i=0;i<votosnavarra.get(2);i++) {
					ciudadano=new Ciudadano("Navarra", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Navarra
				for(int i=0;i<votosnavarra.get(3);i++) {
							ciudadano=new Ciudadano("Navarra", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Navarra
				for(int i=0;i<votosnavarra.get(4);i++) {
									ciudadano=new Ciudadano("Navarra", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
				//Generar Ciudadanos de 18-25 años Pais Vasco
				for(int i=0;i<votospaisvasco.get(1);i++) {
					ciudadano=new Ciudadano("Pais Vasco", "RANGO_18_25");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 26-40 años Pais Vasco
				for(int i=0;i<votospaisvasco.get(2);i++) {
					ciudadano=new Ciudadano("Pais Vasco", "RANGO_26_40");
					ciudadano.start();
					votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 41-65 años Pais Vasco
				for(int i=0;i<votospaisvasco.get(3);i++) {
							ciudadano=new Ciudadano("Pais Vasco", "RANGO_41_65");
							ciudadano.start();
							votantes.add(ciudadano);
				}
				//Generar Ciudadanos de 66 y mas años Pais Vasco
				for(int i=0;i<votospaisvasco.get(4);i++) {
									ciudadano=new Ciudadano("Pais Vasco", "RANGO_MAS_66");
									ciudadano.start();
									votantes.add(ciudadano);
				}
				////////////////////////////////////////////////////////////////////////////
		for(int y=0;y<votantes.size();y++) {
			System.out.println(votantes.get(y).getCantantevotado()+" "+votantes.get(y).getComunidad());
		}
		 
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
