package Controlador;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Modelo.Ciudadano;
import persistencias.Artista;
import persistencias.PorcentajeVotacionRango;
import persistencias.PorcentajesRangoEdad;
import persistencias.Resultado;
import persistencias.ResultadosComunidad;
import persistencias.ResultadosEdad;
import persistencias.ResultadosGenerales;

public class CreacionHilos {
	
	public static void main(String[] args) {
		List<Resultado>resultadoscom=new ArrayList();
		resultadoscom=obtenerpuntosedad("RANGO_26_40");
		Artista r=null;
		for(int i=0;i<3;i++) {
		System.out.println(resultadoscom.get(i).getArtista());
		System.out.println(resultadoscom.get(i).getVotos());
		}
	}
	
	public void generarVotantes() {
		/*
		 * CONFIGURAMOS LA CONEXION CON HIBERNATE PARA REALIZAR LAS CONSULTAS E
		 * INSERCIONES NECESARIAS
		 */
		SessionFactory sf = null;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();

		/*
		 * ARRAYLIST PARA GUARDAR LOS VOTANTES TANTO GENERALES COMO DE CADA COMUNIDAD
		 * AUTONOMA
		 */
		ArrayList<Ciudadano> votantes = new ArrayList<Ciudadano>();
		ArrayList<Integer> votosAndalucia = consultaVotantes(sf, "Andalucia");
		ArrayList<Integer> votosAragon = consultaVotantes(sf, "Aragon");
		ArrayList<Integer> votosAsturias = consultaVotantes(sf, "Asturias");
		ArrayList<Integer> votosBaleares = consultaVotantes(sf, "Baleares");
		ArrayList<Integer> votosCanarias = consultaVotantes(sf, "Canarias");
		ArrayList<Integer> votosCantabria = consultaVotantes(sf, "Cantabria");
		ArrayList<Integer> votosCLM = consultaVotantes(sf, "Castilla La Mancha");
		ArrayList<Integer> votosCYL = consultaVotantes(sf, "Castilla y Leon");
		ArrayList<Integer> votosCatalunia = consultaVotantes(sf, "Catalunia");
		ArrayList<Integer> votosCeuta = consultaVotantes(sf, "Ceuta");
		ArrayList<Integer> votosValencia = consultaVotantes(sf, "Comunidad Valenciana");
		ArrayList<Integer> votosExtremadura = consultaVotantes(sf, "Extremadura");
		ArrayList<Integer> votosGalicia = consultaVotantes(sf, "Galicia");
		ArrayList<Integer> votosLaRioja = consultaVotantes(sf, "La Rioja");
		ArrayList<Integer> votosMadrid = consultaVotantes(sf, "Madrid");
		ArrayList<Integer> votosMelilla = consultaVotantes(sf, "Melilla");
		ArrayList<Integer> votosMurcia = consultaVotantes(sf, "Murcia");
		ArrayList<Integer> votosNavarra = consultaVotantes(sf, "Navarra");
		ArrayList<Integer> votosPaisVasco = consultaVotantes(sf, "Pais Vasco");
		Ciudadano ciudadano = null;

		/*
		 * GENERACION DE HILOS DE CADA COMUNIDAD AUTONOMA Y POR CADA RANGO DE EDAD
		 */

		/* -------------------- ANDALUCIA --------------------- */
		// GENERAR CIUDADANOS DE 18-25 ANIOS ANDALUCIA
		for (int i = 0; i < votosAndalucia.get(1); i++) {
			ciudadano = new Ciudadano("Andalucia", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		// GENERAR CIUDADANOS DE 26-40 ANIOS ANDALUCIA
		for (int i = 0; i < votosAndalucia.get(2); i++) {
			ciudadano = new Ciudadano("Andalucia", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Andalucia
		for (int i = 0; i < votosAndalucia.get(3); i++) {
			ciudadano = new Ciudadano("Andalucia", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Andalucia
		for (int i = 0; i < votosAndalucia.get(4); i++) {
			ciudadano = new Ciudadano("Andalucia", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- ARAGON --------------------- */
		// Generar Ciudadanos de 18-25 años Aragon
		for (int i = 0; i < votosAragon.get(1); i++) {
			ciudadano = new Ciudadano("Aragon", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Aragon
		for (int i = 0; i < votosAragon.get(2); i++) {
			ciudadano = new Ciudadano("Aragon", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Aragon
		for (int i = 0; i < votosAragon.get(3); i++) {
			ciudadano = new Ciudadano("Aragon", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Aragon
		for (int i = 0; i < votosAragon.get(4); i++) {
			ciudadano = new Ciudadano("Aragon", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- ASTURIAS --------------------- */
		// Generar Ciudadanos de 18-25 años Asturias
		for (int i = 0; i < votosAsturias.get(1); i++) {
			ciudadano = new Ciudadano("Asturias", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Asturias
		for (int i = 0; i < votosAsturias.get(2); i++) {
			ciudadano = new Ciudadano("Asturias", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Asturias
		for (int i = 0; i < votosAsturias.get(3); i++) {
			ciudadano = new Ciudadano("Asturias", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Asturias
		for (int i = 0; i < votosAsturias.get(4); i++) {
			ciudadano = new Ciudadano("Asturias", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- BALEARES --------------------- */
		// Generar Ciudadanos de 18-25 años Baleares
		for (int i = 0; i < votosBaleares.get(1); i++) {
			ciudadano = new Ciudadano("Baleares", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Baleares
		for (int i = 0; i < votosBaleares.get(2); i++) {
			ciudadano = new Ciudadano("Baleares", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Baleares
		for (int i = 0; i < votosBaleares.get(3); i++) {
			ciudadano = new Ciudadano("Baleares", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Baleares
		for (int i = 0; i < votosBaleares.get(4); i++) {
			ciudadano = new Ciudadano("Baleares", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- ISLAS CANARIAS --------------------- */
		// Generar Ciudadanos de 18-25 años Canarias
		for (int i = 0; i < votosCanarias.get(1); i++) {
			ciudadano = new Ciudadano("Canarias", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Canarias
		for (int i = 0; i < votosCanarias.get(2); i++) {
			ciudadano = new Ciudadano("Canarias", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Canarias
		for (int i = 0; i < votosCanarias.get(3); i++) {
			ciudadano = new Ciudadano("Canarias", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Canarias
		for (int i = 0; i < votosCanarias.get(4); i++) {
			ciudadano = new Ciudadano("Canarias", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- CANTABRIA --------------------- */
		// Generar Ciudadanos de 18-25 años Cantabria
		for (int i = 0; i < votosCantabria.get(1); i++) {
			ciudadano = new Ciudadano("Cantabria", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Cantabria
		for (int i = 0; i < votosCantabria.get(2); i++) {
			ciudadano = new Ciudadano("Cantabria", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Cantabria
		for (int i = 0; i < votosCantabria.get(3); i++) {
			ciudadano = new Ciudadano("Cantabria", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Cantabria
		for (int i = 0; i < votosCantabria.get(4); i++) {
			ciudadano = new Ciudadano("Cantabria", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- CASTILLA LA MANCHA --------------------- */
		// Generar Ciudadanos de 18-25 años Castilla La Mancha
		for (int i = 0; i < votosCLM.get(1); i++) {
			ciudadano = new Ciudadano("Castilla La Mancha", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Castilla La Mancha
		for (int i = 0; i < votosCLM.get(2); i++) {
			ciudadano = new Ciudadano("Castilla La Mancha", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Castilla La Mancha
		for (int i = 0; i < votosCLM.get(3); i++) {
			ciudadano = new Ciudadano("Castilla La Mancha", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Castilla La Mancha
		for (int i = 0; i < votosCLM.get(4); i++) {
			ciudadano = new Ciudadano("Castilla La Mancha", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- CASTILLA Y LEON --------------------- */
		// Generar Ciudadanos de 18-25 años Castilla y Leon
		for (int i = 0; i < votosCYL.get(1); i++) {
			ciudadano = new Ciudadano("Castilla y Leon", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Castilla y Leon
		for (int i = 0; i < votosCYL.get(2); i++) {
			ciudadano = new Ciudadano("Castilla y Leon", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Castilla y Leon
		for (int i = 0; i < votosCYL.get(3); i++) {
			ciudadano = new Ciudadano("Castilla y Leon", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Castilla y Leon
		for (int i = 0; i < votosCYL.get(4); i++) {
			ciudadano = new Ciudadano("Castilla y Leon", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- CATALUNIA --------------------- */
		// Generar Ciudadanos de 18-25 años Catalunia
		for (int i = 0; i < votosCatalunia.get(1); i++) {
			ciudadano = new Ciudadano("Catalunia", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Catalunia
		for (int i = 0; i < votosCatalunia.get(2); i++) {
			ciudadano = new Ciudadano("Catalunia", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Catalunia
		for (int i = 0; i < votosCatalunia.get(3); i++) {
			ciudadano = new Ciudadano("Catalunia", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Catalunia
		for (int i = 0; i < votosCatalunia.get(4); i++) {
			ciudadano = new Ciudadano("Catalunia", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- CEUTA --------------------- */
		// Generar Ciudadanos de 18-25 años Ceuta
		for (int i = 0; i < votosCeuta.get(1); i++) {
			ciudadano = new Ciudadano("Ceuta", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Ceuta
		for (int i = 0; i < votosCeuta.get(2); i++) {
			ciudadano = new Ciudadano("Ceuta", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Ceuta
		for (int i = 0; i < votosCeuta.get(3); i++) {
			ciudadano = new Ciudadano("Ceuta", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Ceuta
		for (int i = 0; i < votosCeuta.get(4); i++) {
			ciudadano = new Ciudadano("Ceuta", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- COMUNIDAD VALENCIANA --------------------- */
		// Generar Ciudadanos de 18-25 años Comunidad Valenciana
		for (int i = 0; i < votosValencia.get(1); i++) {
			ciudadano = new Ciudadano("Comunidad Valenciana", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Comunidad Valenciana
		for (int i = 0; i < votosValencia.get(2); i++) {
			ciudadano = new Ciudadano("Comunidad Valenciana", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Comunidad Valenciana
		for (int i = 0; i < votosValencia.get(3); i++) {
			ciudadano = new Ciudadano("Comunidad Valenciana", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Comunidad Valenciana
		for (int i = 0; i < votosValencia.get(4); i++) {
			ciudadano = new Ciudadano("Comunidad Valenciana", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- EXTREMADURA --------------------- */
		// Generar Ciudadanos de 18-25 años Extremadura
		for (int i = 0; i < votosExtremadura.get(1); i++) {
			ciudadano = new Ciudadano("Extremadura", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Extremadura
		for (int i = 0; i < votosExtremadura.get(2); i++) {
			ciudadano = new Ciudadano("Extremadura", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Extremadura
		for (int i = 0; i < votosExtremadura.get(3); i++) {
			ciudadano = new Ciudadano("Extremadura", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Extremadura
		for (int i = 0; i < votosExtremadura.get(4); i++) {
			ciudadano = new Ciudadano("Extremadura", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- GALICIA --------------------- */
		// Generar Ciudadanos de 18-25 años Galicia
		for (int i = 0; i < votosGalicia.get(1); i++) {
			ciudadano = new Ciudadano("Galicia", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Galicia
		for (int i = 0; i < votosGalicia.get(2); i++) {
			ciudadano = new Ciudadano("Galicia", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Galicia
		for (int i = 0; i < votosGalicia.get(3); i++) {
			ciudadano = new Ciudadano("Galicia", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Galicia
		for (int i = 0; i < votosGalicia.get(4); i++) {
			ciudadano = new Ciudadano("Galicia", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- LA RIOJA --------------------- */
		// Generar Ciudadanos de 18-25 años La Rioja
		for (int i = 0; i < votosLaRioja.get(1); i++) {
			ciudadano = new Ciudadano("La Rioja", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años La Rioja
		for (int i = 0; i < votosLaRioja.get(2); i++) {
			ciudadano = new Ciudadano("La Rioja", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años La Rioja
		for (int i = 0; i < votosLaRioja.get(3); i++) {
			ciudadano = new Ciudadano("La Rioja", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años La Rioja
		for (int i = 0; i < votosLaRioja.get(4); i++) {
			ciudadano = new Ciudadano("La Rioja", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- MADRID --------------------- */
		// Generar Ciudadanos de 18-25 años Madrid
		for (int i = 0; i < votosMadrid.get(1); i++) {
			ciudadano = new Ciudadano("Madrid", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Madrid
		for (int i = 0; i < votosMadrid.get(2); i++) {
			ciudadano = new Ciudadano("Madrid", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Madrid
		for (int i = 0; i < votosMadrid.get(3); i++) {
			ciudadano = new Ciudadano("Madrid", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Madrid
		for (int i = 0; i < votosMadrid.get(4); i++) {
			ciudadano = new Ciudadano("Madrid", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- MELILLA --------------------- */
		// Generar Ciudadanos de 18-25 años Melilla
		for (int i = 0; i < votosMelilla.get(1); i++) {
			ciudadano = new Ciudadano("Melilla", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Melilla
		for (int i = 0; i < votosMelilla.get(2); i++) {
			ciudadano = new Ciudadano("Melilla", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Melilla
		for (int i = 0; i < votosMelilla.get(3); i++) {
			ciudadano = new Ciudadano("Melilla", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Melilla
		for (int i = 0; i < votosMelilla.get(4); i++) {
			ciudadano = new Ciudadano("Melilla", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- MURCIA --------------------- */
		// Generar Ciudadanos de 18-25 años Murcia
		for (int i = 0; i < votosMurcia.get(1); i++) {
			ciudadano = new Ciudadano("Murcia", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Murcia
		for (int i = 0; i < votosMurcia.get(2); i++) {
			ciudadano = new Ciudadano("Murcia", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Murcia
		for (int i = 0; i < votosMurcia.get(3); i++) {
			ciudadano = new Ciudadano("Murcia", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Murcia
		for (int i = 0; i < votosMurcia.get(4); i++) {
			ciudadano = new Ciudadano("Murcia", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- NAVARRA --------------------- */
		// Generar Ciudadanos de 18-25 años Navarra
		for (int i = 0; i < votosNavarra.get(1); i++) {
			ciudadano = new Ciudadano("Navarra", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 26-40 años Navarra
		for (int i = 0; i < votosNavarra.get(2); i++) {
			ciudadano = new Ciudadano("Navarra", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 41-65 años Navarra
		for (int i = 0; i < votosNavarra.get(3); i++) {
			ciudadano = new Ciudadano("Navarra", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}
		// Generar Ciudadanos de 66 y mas años Navarra
		for (int i = 0; i < votosNavarra.get(4); i++) {
			ciudadano = new Ciudadano("Navarra", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		/* -------------------- PAIS VASCO --------------------- */
		// Generar Ciudadanos de 18-25 años Pais Vasco
		for (int i = 0; i < votosPaisVasco.get(1); i++) {
			ciudadano = new Ciudadano("Pais Vasco", "RANGO_18_25");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		// GENERAR CIUDADANOS DE 26-40 ANIOS PAIS VASCO
		for (int i = 0; i < votosPaisVasco.get(2); i++) {
			ciudadano = new Ciudadano("Pais Vasco", "RANGO_26_40");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		// GENERAR CIUDADANOS DE 41-65 ANIOS PAIS VASCO
		for (int i = 0; i < votosPaisVasco.get(3); i++) {
			ciudadano = new Ciudadano("Pais Vasco", "RANGO_41_65");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		// GENERAR CIUDADANOS DE 66 Y MAS ANIOS PAIS VASCO
		for (int i = 0; i < votosPaisVasco.get(4); i++) {
			ciudadano = new Ciudadano("Pais Vasco", "RANGO_MAS_66");
			ciudadano.start();
			votantes.add(ciudadano);
		}

		// PERSISTIMOS LOS DATOS EN LA BASE DE DATOS PARA PODER RECUPERARLOS DESPUÉS
		eliminaresgistros(sf);
		insertarVotosGenerales(sf, votantes);
		insertarVotosEdad(sf, votantes);
		insertarVotosComunidad(sf, votantes);
	}
	
	public static List<Resultado> obtenerpuntoscomunidad(String nombrecomunidad){
		SessionFactory sf = null;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
		Session s=sf.getCurrentSession();
		List<Resultado>resultadoscom=new ArrayList();
		try {
			s.beginTransaction();
			Query q=s.createSQLQuery("select  rs.numero_votos_comunidad,a.nombre from resultados_comunidad as rs inner join artista as a on a.dni=rs.dni_artista where nombre_comunidad=:name  order by numero_votos_comunidad desc")
			.setParameter("name",nombrecomunidad);
			List<Object[]> resultado =q.getResultList();
			for(Object[] fila:resultado) {
				int votos=(int) fila[0];
				String artista=(String) fila[1];
				resultadoscom.add(new Resultado(artista,votos));
			}
		} catch (Exception e) {
			s.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		return resultadoscom;
	}
	
	public static List<Resultado> obtenerpuntosedad(String rangoedad){
		SessionFactory sf = null;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
		Session s=sf.getCurrentSession();
		List<Resultado>resultadoscom=new ArrayList();
		try {
			s.beginTransaction();
			Query q=s.createSQLQuery("select re.numero_votos_edad,a.nombre from resultados_edad as re inner join artista as a on re.dni_artista=a.dni where rango=:name order by numero_votos_edad desc")
			.setParameter("name",rangoedad);
			List<Object[]> resultado =q.getResultList();
			for(Object[] fila:resultado) {
				int votos=(int) fila[0];
				String artista=(String) fila[1];
				resultadoscom.add(new Resultado(artista,votos));
			}
		} catch (Exception e) {
			s.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		return resultadoscom;
	}

	private void eliminaresgistros(SessionFactory sf) {
		Session s =sf.getCurrentSession();
		try {
			s.beginTransaction();
			//Query q=s.createSQLQuery("delete from resultados_generales");
			Query q2=s.createQuery("delete ResultadosEdad");
			q2.executeUpdate();
			//Query q3=s.createSQLQuery("delete from resultados_comunidad");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			s.close();
		}
		
	}

	public ArrayList<Integer> consultaVotantes(SessionFactory sessionFac, String nombreComunidad) {
		Session session = null;
		PorcentajesRangoEdad data = new PorcentajesRangoEdad();
		int poblacionTotal = 0, poblacion18_25 = 0, poblacion26_40 = 0, poblacion41_65 = 0, poblacion66mas = 0;
		int calcular_18_25 = 0, calcular_26_40 = 0, calcular_41_65 = 0, calcular_66mas = 0;
		Double hporcentaje_18_25 = 0.0, hporcentaje_26_40 = 0.0, hporcentaje_41_65 = 0.0, hporcentaje_66mas = 0.0;
		ArrayList<Integer> cantidadpoblacion = new ArrayList<Integer>();

		// ESQUEMA DEL ARRAY
		// POSICION 0 ---- POBLACION TOTAL DE LA COMUNIDAD
		// POSICION 1 ---- POBLACION QUE VOTA ENTRE 18 Y 25 AÑOS
		// POSICION 2 ---- POBLACION QUE VOTA ENTRE 26 Y 40 AÑOS
		// POSICION 3 ---- POBLACION QUE VOTA ENTRE 41 Y 65 AÑOS
		// POSICION 4 ---- POBLACION QUE VOTA ENTRE 66 y MAS AÑOS

		try {
			session = sessionFac.getCurrentSession();
			session.beginTransaction();

			// REALIZAMOS LA CONSULTA PARA CALCULAR POBLACION TOTAL DE X COMUNIDAD
			Query query = session.createQuery("FROM PorcentajesRangoEdad WHERE nombreComunidad = :var");
			query.setParameter("var", nombreComunidad);
			data = (PorcentajesRangoEdad) query.getSingleResult();

			// CALCULAR CUANTA POBLACION HAY POR EDAD
			poblacionTotal = data.getTotalHabitantes();
			cantidadpoblacion.add(poblacionTotal);
			calcular_18_25 = (poblacionTotal * data.getRango1825()) / 100;
			calcular_26_40 = (poblacionTotal * data.getRango2640()) / 100;
			calcular_41_65 = (poblacionTotal * data.getRango4165()) / 100;
			calcular_66mas = (poblacionTotal * data.getRangoMas66()) / 100;

			// OBTENEMOS EL PROCENTAJE SEGUN EL RANGO DE EDAD PARA SABER CUANTAS PERSONAS
			// VOTAN POR EDAD Y GENERAR LOS HILOS
			Query q2 = session.createQuery("FROM PorcentajeVotacionRango");
			ArrayList<PorcentajeVotacionRango> porcentajes = (ArrayList<PorcentajeVotacionRango>) q2.getResultList();
			for (int i = 0; i < porcentajes.size(); i++) {
				if (porcentajes.get(i).getRango().equals("RANGO_18_25")) {
					hporcentaje_18_25 = porcentajes.get(i).getPorcentaje().doubleValue();
					poblacion18_25 = (int) (calcular_18_25 * hporcentaje_18_25) / 100;
					cantidadpoblacion.add(poblacion18_25);
				}
				if (porcentajes.get(i).getRango().equals("RANGO_26_40")) {
					hporcentaje_26_40 = porcentajes.get(i).getPorcentaje().doubleValue();
					poblacion26_40 = (int) (hporcentaje_26_40 * calcular_26_40) / 100;
					cantidadpoblacion.add(poblacion26_40);
				}
				if (porcentajes.get(i).getRango().equals("RANGO_41_65")) {
					hporcentaje_41_65 = porcentajes.get(i).getPorcentaje().doubleValue();
					poblacion41_65 = (int) (calcular_41_65 * hporcentaje_41_65) / 100;
					cantidadpoblacion.add(poblacion41_65);
				}
				if (porcentajes.get(i).getRango().equals("RANGO_MAS_66")) {
					hporcentaje_66mas = porcentajes.get(i).getPorcentaje().doubleValue();
					poblacion66mas = (int) (calcular_66mas * hporcentaje_66mas) / 100;
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

	/*
	 * METODO PARA GUARDAR LAS VOTACIONES TOTALES EN LA BASE DE DATOS
	 */

	public void insertarVotosGenerales(SessionFactory sessionFac, ArrayList<Ciudadano> votantes) {
		Session session = null;

		try {
			session = sessionFac.getCurrentSession();
			session.beginTransaction();

			// TENEMOS QUE OBTENER DEL ARRAYLIST VOTANTES, CADA UNO DE LOS ARTISTAS Y SUS
			// VOTOS
			int contadores[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

			for (int i = 0; i < votantes.size(); i++) {
				if (votantes.get(i).getCantantevotado().equals("Joel")) {
					contadores[0]++;
				} else if (votantes.get(i).getCantantevotado().equals("Victoria")) {
					contadores[1]++;
				} else if (votantes.get(i).getCantantevotado().equals("Thiago")) {
					contadores[2]++;
				} else if (votantes.get(i).getCantantevotado().equals("Sarah")) {
					contadores[3]++;
				} else if (votantes.get(i).getCantantevotado().equals("Elton")) {
					contadores[4]++;
				} else if (votantes.get(i).getCantantevotado().equals("Amie")) {
					contadores[5]++;
				} else if (votantes.get(i).getCantantevotado().equals("Nahid")) {
					contadores[6]++;
				} else if (votantes.get(i).getCantantevotado().equals("Marc")) {
					contadores[7]++;
				} else if (votantes.get(i).getCantantevotado().equals("Alba")) {
					contadores[8]++;
				} else if (votantes.get(i).getCantantevotado().equals("Julio")) {
					contadores[9]++;
				}
			}

			// HACEMOS UNA CONSULTA PARA RECUPERAR EL DNI DE CADA ARTISTA
			Query queryDni = session.createQuery("FROM Artista");
			List<Artista> artistas = queryDni.list();

			// INSERTAMOS EN LA TABLA DE RESULTADOS GENERALES LOS VOTOS OBTENIDOS
			ResultadosGenerales resultados;
			for (int i = 0; i < artistas.size(); i++) {
				resultados = new ResultadosGenerales();
				resultados.setDniArtista(artistas.get(i).getDni());
				resultados.setVotosTotales(contadores[i]);

				session.saveOrUpdate(resultados);
			}

			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw e;
		} finally {
			if (null != session) {
				session.close();
			}
		}
	}

	/*
	 * METODO PARA GUARDAR LAS VOTACIONES POR EDADES EN LA BASE DE DATOS
	 */
	public void insertarVotosEdad(SessionFactory sessionFac, ArrayList<Ciudadano> votantes) {
		Session session = null;
		List<Ciudadano> edad_18_25 = new ArrayList<Ciudadano>();
		List<Ciudadano> edad_26_40 = new ArrayList<Ciudadano>();
		List<Ciudadano> edad_41_65 = new ArrayList<Ciudadano>();
		List<Ciudadano> edad_66_mas = new ArrayList<Ciudadano>();

		int contador18Anios[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contador26Anios[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contador41Anios[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contador66Anios[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		try {
			session = sessionFac.getCurrentSession();
			session.beginTransaction();

			// RECORREMOS EL ARRAYLIST VOTANTES PARA RECUPERAR LOS VOTANTES DE LAS DISTINTAS
			// EDADES
			for (int i = 0; i < votantes.size(); i++) {
				if (votantes.get(i).getRangoedad().equals("RANGO_18_25")) {
					edad_18_25.add(votantes.get(i));
				} else if (votantes.get(i).getRangoedad().equals("RANGO_26_40")) {
					edad_26_40.add(votantes.get(i));
				} else if (votantes.get(i).getRangoedad().equals("RANGO_41_65")) {
					edad_41_65.add(votantes.get(i));
				} else if (votantes.get(i).getRangoedad().equals("RANGO_MAS_66")) {
					edad_66_mas.add(votantes.get(i));
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DEL RANGO DE EDAD 18_25
			for (int i = 0; i < edad_18_25.size(); i++) {
				if (edad_18_25.get(i).getCantantevotado().equals("Joel")) {
					contador18Anios[0]++;
				} else if (edad_18_25.get(i).getCantantevotado().equals("Victoria")) {
					contador18Anios[1]++;
				} else if (edad_18_25.get(i).getCantantevotado().equals("Thiago")) {
					contador18Anios[2]++;
				} else if (edad_18_25.get(i).getCantantevotado().equals("Sarah")) {
					contador18Anios[3]++;
				} else if (edad_18_25.get(i).getCantantevotado().equals("Elton")) {
					contador18Anios[4]++;
				} else if (edad_18_25.get(i).getCantantevotado().equals("Amie")) {
					contador18Anios[5]++;
				} else if (edad_18_25.get(i).getCantantevotado().equals("Nahid")) {
					contador18Anios[6]++;
				} else if (edad_18_25.get(i).getCantantevotado().equals("Marc")) {
					contador18Anios[7]++;
				} else if (edad_18_25.get(i).getCantantevotado().equals("Alba")) {
					contador18Anios[8]++;
				} else if (edad_18_25.get(i).getCantantevotado().equals("Julio")) {
					contador18Anios[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DEL RANGO DE EDAD 26-40
			for (int i = 0; i < edad_26_40.size(); i++) {
				if (edad_26_40.get(i).getCantantevotado().equals("Joel")) {
					contador26Anios[0]++;
				} else if (edad_26_40.get(i).getCantantevotado().equals("Victoria")) {
					contador26Anios[1]++;
				} else if (edad_26_40.get(i).getCantantevotado().equals("Thiago")) {
					contador26Anios[2]++;
				} else if (edad_26_40.get(i).getCantantevotado().equals("Sarah")) {
					contador26Anios[3]++;
				} else if (edad_26_40.get(i).getCantantevotado().equals("Elton")) {
					contador26Anios[4]++;
				} else if (edad_26_40.get(i).getCantantevotado().equals("Amie")) {
					contador26Anios[5]++;
				} else if (edad_26_40.get(i).getCantantevotado().equals("Nahid")) {
					contador26Anios[6]++;
				} else if (edad_26_40.get(i).getCantantevotado().equals("Marc")) {
					contador26Anios[7]++;
				} else if (edad_26_40.get(i).getCantantevotado().equals("Alba")) {
					contador26Anios[8]++;
				} else if (edad_26_40.get(i).getCantantevotado().equals("Julio")) {
					contador26Anios[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DEL RANGO DE EDAD 41-65
			for (int i = 0; i < edad_41_65.size(); i++) {
				if (edad_41_65.get(i).getCantantevotado().equals("Joel")) {
					contador41Anios[0]++;
				} else if (edad_41_65.get(i).getCantantevotado().equals("Victoria")) {
					contador41Anios[1]++;
				} else if (edad_41_65.get(i).getCantantevotado().equals("Thiago")) {
					contador41Anios[2]++;
				} else if (edad_41_65.get(i).getCantantevotado().equals("Sarah")) {
					contador41Anios[3]++;
				} else if (edad_41_65.get(i).getCantantevotado().equals("Elton")) {
					contador41Anios[4]++;
				} else if (edad_41_65.get(i).getCantantevotado().equals("Amie")) {
					contador41Anios[5]++;
				} else if (edad_41_65.get(i).getCantantevotado().equals("Nahid")) {
					contador41Anios[6]++;
				} else if (edad_41_65.get(i).getCantantevotado().equals("Marc")) {
					contador41Anios[7]++;
				} else if (edad_41_65.get(i).getCantantevotado().equals("Alba")) {
					contador41Anios[8]++;
				} else if (edad_41_65.get(i).getCantantevotado().equals("Julio")) {
					contador41Anios[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DEL RANGO DE EDAD 66+
			for (int i = 0; i < edad_66_mas.size(); i++) {
				if (edad_66_mas.get(i).getCantantevotado().equals("Joel")) {
					contador66Anios[0]++;
				} else if (edad_66_mas.get(i).getCantantevotado().equals("Victoria")) {
					contador66Anios[1]++;
				} else if (edad_66_mas.get(i).getCantantevotado().equals("Thiago")) {
					contador66Anios[2]++;
				} else if (edad_66_mas.get(i).getCantantevotado().equals("Sarah")) {
					contador66Anios[3]++;
				} else if (edad_66_mas.get(i).getCantantevotado().equals("Elton")) {
					contador66Anios[4]++;
				} else if (edad_66_mas.get(i).getCantantevotado().equals("Amie")) {
					contador66Anios[5]++;
				} else if (edad_66_mas.get(i).getCantantevotado().equals("Nahid")) {
					contador66Anios[6]++;
				} else if (edad_66_mas.get(i).getCantantevotado().equals("Marc")) {
					contador66Anios[7]++;
				} else if (edad_66_mas.get(i).getCantantevotado().equals("Alba")) {
					contador66Anios[8]++;
				} else if (edad_66_mas.get(i).getCantantevotado().equals("Julio")) {
					contador66Anios[9]++;
				}
			}

			// HACEMOS UNA CONSULTA PARA RECUPERAR EL DNI DE CADA ARTISTA
			Query queryDni = session.createQuery("FROM Artista");
			List<Artista> artistas = queryDni.list();

			// INSERTAMOS EN LA TABLA DE RESULTADOS POR EDADES LOS VOTOS OBTENIDOS
			ResultadosEdad resultados18Anios;
			ResultadosEdad resultados26Anios;
			ResultadosEdad resultados41Anios;
			ResultadosEdad resultados66Anios;
			
			
			for(int i=0;i<artistas.size();i++) {
				//AÑADIMOS LOS VOTOS DE 18 AÑOS
				resultados18Anios=new ResultadosEdad();
				resultados18Anios.setArtista(artistas.get(i));
				resultados18Anios.setRango("RANGO_18_25");
				resultados18Anios.setNumeroVotosEdad(contador18Anios[i]);
				//AÑADIMOS LOS VOTOS DE 26 AÑOS
				resultados26Anios=new ResultadosEdad();
				resultados26Anios.setArtista(artistas.get(i));
				resultados26Anios.setRango("RANGO_26_40");
				resultados26Anios.setNumeroVotosEdad(contador26Anios[i]);
				//AÑADIMOS LOS VOTOS DE 41 AÑOS
				resultados41Anios=new ResultadosEdad();
				resultados41Anios.setArtista(artistas.get(i));
				resultados41Anios.setRango("RANGO_41_65");
				resultados41Anios.setNumeroVotosEdad(contador41Anios[i]);
				//AÑADIMOS LOS VOTOS DE 66 Y MAS AÑOS
				resultados66Anios=new ResultadosEdad();
				resultados66Anios.setArtista(artistas.get(i));
				resultados66Anios.setRango("RANGO_MAS_66");
				resultados66Anios.setNumeroVotosEdad(contador66Anios[i]);
				session.saveOrUpdate(resultados18Anios);
				session.saveOrUpdate(resultados26Anios);
				session.saveOrUpdate(resultados41Anios);
				session.saveOrUpdate(resultados66Anios);
			}
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw e;
		} finally {
			if (null != session) {
				session.close();
			}
		}

	}

	/*
	 * METODO PARA GUARDAR LAS VOTACIONES POR COMUNIDAD EN LA BASE DE DATOS
	 */
	public void insertarVotosComunidad(SessionFactory sessionFac, ArrayList<Ciudadano> votantes) {
		Session session = null;

		List<Ciudadano> andalucia = new ArrayList<Ciudadano>();
		List<Ciudadano> aragon = new ArrayList<Ciudadano>();
		List<Ciudadano> asturias = new ArrayList<Ciudadano>();
		List<Ciudadano> baleares = new ArrayList<Ciudadano>();
		List<Ciudadano> canarias = new ArrayList<Ciudadano>();
		List<Ciudadano> cantabria = new ArrayList<Ciudadano>();
		List<Ciudadano> castillaLaMancha = new ArrayList<Ciudadano>();
		List<Ciudadano> castillaYLeon = new ArrayList<Ciudadano>();
		List<Ciudadano> catalunia = new ArrayList<Ciudadano>();
		List<Ciudadano> ceuta = new ArrayList<Ciudadano>();
		List<Ciudadano> valencia = new ArrayList<Ciudadano>();
		List<Ciudadano> extremadura = new ArrayList<Ciudadano>();
		List<Ciudadano> galicia = new ArrayList<Ciudadano>();
		List<Ciudadano> laRioja = new ArrayList<Ciudadano>();
		List<Ciudadano> madrid = new ArrayList<Ciudadano>();
		List<Ciudadano> melilla = new ArrayList<Ciudadano>();
		List<Ciudadano> murcia = new ArrayList<Ciudadano>();
		List<Ciudadano> navarra = new ArrayList<Ciudadano>();
		List<Ciudadano> paisVasco = new ArrayList<Ciudadano>();

		int contadorAndalucia[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorAragon[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorAsturias[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorBaleares[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorCanarias[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorCantabria[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorCastillaLaMancha[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorCastillaYLeon[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorCatalunia[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorCeuta[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorValencia[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorExtremadura[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorGalicia[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorLaRioja[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorMadrid[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorMelilla[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorMurcia[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorNavarra[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int contadorPaisVasco[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		try {
			session = sessionFac.getCurrentSession();
			session.beginTransaction();

			// RECORREMOS EL ARRAYLIST VOTANTES PARA RECUPERAR LOS VOTANTES DE LAS DISTINTAS
			// COMUNIDADES
			for (int i = 0; i < votantes.size(); i++) {
				if (votantes.get(i).getComunidad().equals("Andalucia")) {
					andalucia.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Aragon")) {
					aragon.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Asturias")) {
					asturias.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Baleares")) {
					baleares.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Canarias")) {
					canarias.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Cantabria")) {
					cantabria.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Castilla La Mancha")) {
					castillaLaMancha.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Castilla y Leon")) {
					castillaYLeon.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Catalunia")) {
					catalunia.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Ceuta")) {
					ceuta.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Comunidad Valenciana")) {
					valencia.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Extremadura")) {
					extremadura.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Galicia")) {
					galicia.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("La Rioja")) {
					laRioja.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Madrid")) {
					madrid.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Melilla")) {
					melilla.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Murcia")) {
					murcia.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Navarra")) {
					navarra.add(votantes.get(i));
				} else if (votantes.get(i).getComunidad().equals("Pais Vasco")) {
					paisVasco.add(votantes.get(i));
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE ANDALUCIA
			for (int i = 0; i < andalucia.size(); i++) {
				if (andalucia.get(i).getCantantevotado().equals("Joel")) {
					contadorAndalucia[0]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Victoria")) {
					contadorAndalucia[1]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Thiago")) {
					contadorAndalucia[2]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Sarah")) {
					contadorAndalucia[3]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Elton")) {
					contadorAndalucia[4]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Amie")) {
					contadorAndalucia[5]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Nahid")) {
					contadorAndalucia[6]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Marc")) {
					contadorAndalucia[7]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Alba")) {
					contadorAndalucia[8]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Julio")) {
					contadorAndalucia[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE ARAGON
			for (int i = 0; i < aragon.size(); i++) {
				if (aragon.get(i).getCantantevotado().equals("Joel")) {
					contadorAragon[0]++;
				} else if (aragon.get(i).getCantantevotado().equals("Victoria")) {
					contadorAragon[1]++;
				} else if (aragon.get(i).getCantantevotado().equals("Thiago")) {
					contadorAragon[2]++;
				} else if (aragon.get(i).getCantantevotado().equals("Sarah")) {
					contadorAragon[3]++;
				} else if (aragon.get(i).getCantantevotado().equals("Elton")) {
					contadorAragon[4]++;
				} else if (aragon.get(i).getCantantevotado().equals("Amie")) {
					contadorAragon[5]++;
				} else if (aragon.get(i).getCantantevotado().equals("Nahid")) {
					contadorAragon[6]++;
				} else if (aragon.get(i).getCantantevotado().equals("Marc")) {
					contadorAragon[7]++;
				} else if (aragon.get(i).getCantantevotado().equals("Alba")) {
					contadorAragon[8]++;
				} else if (aragon.get(i).getCantantevotado().equals("Julio")) {
					contadorAragon[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE ASTURIAS
			for (int i = 0; i < asturias.size(); i++) {
				if (asturias.get(i).getCantantevotado().equals("Joel")) {
					contadorAsturias[0]++;
				} else if (asturias.get(i).getCantantevotado().equals("Victoria")) {
					contadorAsturias[1]++;
				} else if (asturias.get(i).getCantantevotado().equals("Thiago")) {
					contadorAsturias[2]++;
				} else if (asturias.get(i).getCantantevotado().equals("Sarah")) {
					contadorAsturias[3]++;
				} else if (asturias.get(i).getCantantevotado().equals("Elton")) {
					contadorAsturias[4]++;
				} else if (asturias.get(i).getCantantevotado().equals("Amie")) {
					contadorAsturias[5]++;
				} else if (asturias.get(i).getCantantevotado().equals("Nahid")) {
					contadorAsturias[6]++;
				} else if (asturias.get(i).getCantantevotado().equals("Marc")) {
					contadorAsturias[7]++;
				} else if (asturias.get(i).getCantantevotado().equals("Alba")) {
					contadorAsturias[8]++;
				} else if (asturias.get(i).getCantantevotado().equals("Julio")) {
					contadorAsturias[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE ASTURIAS
			for (int i = 0; i < baleares.size(); i++) {
				if (baleares.get(i).getCantantevotado().equals("Joel")) {
					contadorBaleares[0]++;
				} else if (baleares.get(i).getCantantevotado().equals("Victoria")) {
					contadorBaleares[1]++;
				} else if (baleares.get(i).getCantantevotado().equals("Thiago")) {
					contadorBaleares[2]++;
				} else if (baleares.get(i).getCantantevotado().equals("Sarah")) {
					contadorBaleares[3]++;
				} else if (baleares.get(i).getCantantevotado().equals("Elton")) {
					contadorBaleares[4]++;
				} else if (baleares.get(i).getCantantevotado().equals("Amie")) {
					contadorBaleares[5]++;
				} else if (baleares.get(i).getCantantevotado().equals("Nahid")) {
					contadorBaleares[6]++;
				} else if (baleares.get(i).getCantantevotado().equals("Marc")) {
					contadorBaleares[7]++;
				} else if (baleares.get(i).getCantantevotado().equals("Alba")) {
					contadorBaleares[8]++;
				} else if (baleares.get(i).getCantantevotado().equals("Julio")) {
					contadorBaleares[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CANARIAS
			for (int i = 0; i < canarias.size(); i++) {
				if (canarias.get(i).getCantantevotado().equals("Joel")) {
					contadorCanarias[0]++;
				} else if (canarias.get(i).getCantantevotado().equals("Victoria")) {
					contadorCanarias[1]++;
				} else if (canarias.get(i).getCantantevotado().equals("Thiago")) {
					contadorCanarias[2]++;
				} else if (canarias.get(i).getCantantevotado().equals("Sarah")) {
					contadorCanarias[3]++;
				} else if (canarias.get(i).getCantantevotado().equals("Elton")) {
					contadorCanarias[4]++;
				} else if (canarias.get(i).getCantantevotado().equals("Amie")) {
					contadorCanarias[5]++;
				} else if (canarias.get(i).getCantantevotado().equals("Nahid")) {
					contadorCanarias[6]++;
				} else if (canarias.get(i).getCantantevotado().equals("Marc")) {
					contadorCanarias[7]++;
				} else if (canarias.get(i).getCantantevotado().equals("Alba")) {
					contadorCanarias[8]++;
				} else if (canarias.get(i).getCantantevotado().equals("Julio")) {
					contadorCanarias[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CANTABRIA
			for (int i = 0; i < cantabria.size(); i++) {
				if (cantabria.get(i).getCantantevotado().equals("Joel")) {
					contadorCantabria[0]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Victoria")) {
					contadorCantabria[1]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Thiago")) {
					contadorCantabria[2]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Sarah")) {
					contadorCantabria[3]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Elton")) {
					contadorCantabria[4]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Amie")) {
					contadorCantabria[5]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Nahid")) {
					contadorCantabria[6]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Marc")) {
					contadorCantabria[7]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Alba")) {
					contadorCantabria[8]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Julio")) {
					contadorCantabria[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CASTILLA LA MANCHA
			for (int i = 0; i < castillaLaMancha.size(); i++) {
				if (castillaLaMancha.get(i).getCantantevotado().equals("Joel")) {
					contadorCastillaLaMancha[0]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Victoria")) {
					contadorCastillaLaMancha[1]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Thiago")) {
					contadorCastillaLaMancha[2]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Sarah")) {
					contadorCastillaLaMancha[3]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Elton")) {
					contadorCastillaLaMancha[4]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Amie")) {
					contadorCastillaLaMancha[5]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Nahid")) {
					contadorCastillaLaMancha[6]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Marc")) {
					contadorCastillaLaMancha[7]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Alba")) {
					contadorCastillaLaMancha[8]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Julio")) {
					contadorCastillaLaMancha[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CASTILLA Y LEON
			for (int i = 0; i < castillaYLeon.size(); i++) {
				if (castillaYLeon.get(i).getCantantevotado().equals("Joel")) {
					contadorCastillaYLeon[0]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Victoria")) {
					contadorCastillaYLeon[1]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Thiago")) {
					contadorCastillaYLeon[2]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Sarah")) {
					contadorCastillaYLeon[3]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Elton")) {
					contadorCastillaYLeon[4]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Amie")) {
					contadorCastillaYLeon[5]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Nahid")) {
					contadorCastillaYLeon[6]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Marc")) {
					contadorCastillaYLeon[7]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Alba")) {
					contadorCastillaYLeon[8]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Julio")) {
					contadorCastillaYLeon[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CATALUNIA
			for (int i = 0; i < catalunia.size(); i++) {
				if (catalunia.get(i).getCantantevotado().equals("Joel")) {
					contadorCatalunia[0]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Victoria")) {
					contadorCatalunia[1]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Thiago")) {
					contadorCatalunia[2]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Sarah")) {
					contadorCatalunia[3]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Elton")) {
					contadorCatalunia[4]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Amie")) {
					contadorCatalunia[5]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Nahid")) {
					contadorCatalunia[6]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Marc")) {
					contadorCatalunia[7]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Alba")) {
					contadorCatalunia[8]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Julio")) {
					contadorCatalunia[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CEUTA
			for (int i = 0; i < ceuta.size(); i++) {
				if (ceuta.get(i).getCantantevotado().equals("Joel")) {
					contadorCeuta[0]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Victoria")) {
					contadorCeuta[1]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Thiago")) {
					contadorCeuta[2]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Sarah")) {
					contadorCeuta[3]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Elton")) {
					contadorCeuta[4]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Amie")) {
					contadorCeuta[5]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Nahid")) {
					contadorCeuta[6]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Marc")) {
					contadorCeuta[7]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Alba")) {
					contadorCeuta[8]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Julio")) {
					contadorCeuta[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE VALENCIA
			for (int i = 0; i < valencia.size(); i++) {
				if (valencia.get(i).getCantantevotado().equals("Joel")) {
					contadorValencia[0]++;
				} else if (valencia.get(i).getCantantevotado().equals("Victoria")) {
					contadorValencia[1]++;
				} else if (valencia.get(i).getCantantevotado().equals("Thiago")) {
					contadorValencia[2]++;
				} else if (valencia.get(i).getCantantevotado().equals("Sarah")) {
					contadorValencia[3]++;
				} else if (valencia.get(i).getCantantevotado().equals("Elton")) {
					contadorValencia[4]++;
				} else if (valencia.get(i).getCantantevotado().equals("Amie")) {
					contadorValencia[5]++;
				} else if (valencia.get(i).getCantantevotado().equals("Nahid")) {
					contadorValencia[6]++;
				} else if (valencia.get(i).getCantantevotado().equals("Marc")) {
					contadorValencia[7]++;
				} else if (valencia.get(i).getCantantevotado().equals("Alba")) {
					contadorValencia[8]++;
				} else if (valencia.get(i).getCantantevotado().equals("Julio")) {
					contadorValencia[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE EXTREMADURA
			for (int i = 0; i < extremadura.size(); i++) {
				if (extremadura.get(i).getCantantevotado().equals("Joel")) {
					contadorExtremadura[0]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Victoria")) {
					contadorExtremadura[1]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Thiago")) {
					contadorExtremadura[2]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Sarah")) {
					contadorExtremadura[3]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Elton")) {
					contadorExtremadura[4]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Amie")) {
					contadorExtremadura[5]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Nahid")) {
					contadorExtremadura[6]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Marc")) {
					contadorExtremadura[7]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Alba")) {
					contadorExtremadura[8]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Julio")) {
					contadorExtremadura[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE GALICIA
			for (int i = 0; i < galicia.size(); i++) {
				if (galicia.get(i).getCantantevotado().equals("Joel")) {
					contadorGalicia[0]++;
				} else if (galicia.get(i).getCantantevotado().equals("Victoria")) {
					contadorGalicia[1]++;
				} else if (galicia.get(i).getCantantevotado().equals("Thiago")) {
					contadorGalicia[2]++;
				} else if (galicia.get(i).getCantantevotado().equals("Sarah")) {
					contadorGalicia[3]++;
				} else if (galicia.get(i).getCantantevotado().equals("Elton")) {
					contadorGalicia[4]++;
				} else if (galicia.get(i).getCantantevotado().equals("Amie")) {
					contadorGalicia[5]++;
				} else if (galicia.get(i).getCantantevotado().equals("Nahid")) {
					contadorGalicia[6]++;
				} else if (galicia.get(i).getCantantevotado().equals("Marc")) {
					contadorGalicia[7]++;
				} else if (galicia.get(i).getCantantevotado().equals("Alba")) {
					contadorGalicia[8]++;
				} else if (galicia.get(i).getCantantevotado().equals("Julio")) {
					contadorGalicia[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE LA RIOJA
			for (int i = 0; i < laRioja.size(); i++) {
				if (laRioja.get(i).getCantantevotado().equals("Joel")) {
					contadorLaRioja[0]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Victoria")) {
					contadorLaRioja[1]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Thiago")) {
					contadorLaRioja[2]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Sarah")) {
					contadorLaRioja[3]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Elton")) {
					contadorLaRioja[4]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Amie")) {
					contadorLaRioja[5]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Nahid")) {
					contadorLaRioja[6]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Marc")) {
					contadorLaRioja[7]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Alba")) {
					contadorLaRioja[8]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Julio")) {
					contadorLaRioja[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE MADRID
			for (int i = 0; i < madrid.size(); i++) {
				if (madrid.get(i).getCantantevotado().equals("Joel")) {
					contadorMadrid[0]++;
				} else if (madrid.get(i).getCantantevotado().equals("Victoria")) {
					contadorMadrid[1]++;
				} else if (madrid.get(i).getCantantevotado().equals("Thiago")) {
					contadorMadrid[2]++;
				} else if (madrid.get(i).getCantantevotado().equals("Sarah")) {
					contadorMadrid[3]++;
				} else if (madrid.get(i).getCantantevotado().equals("Elton")) {
					contadorMadrid[4]++;
				} else if (madrid.get(i).getCantantevotado().equals("Amie")) {
					contadorMadrid[5]++;
				} else if (madrid.get(i).getCantantevotado().equals("Nahid")) {
					contadorMadrid[6]++;
				} else if (madrid.get(i).getCantantevotado().equals("Marc")) {
					contadorMadrid[7]++;
				} else if (madrid.get(i).getCantantevotado().equals("Alba")) {
					contadorMadrid[8]++;
				} else if (madrid.get(i).getCantantevotado().equals("Julio")) {
					contadorMadrid[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE MELILLA
			for (int i = 0; i < melilla.size(); i++) {
				if (melilla.get(i).getCantantevotado().equals("Joel")) {
					contadorMelilla[0]++;
				} else if (melilla.get(i).getCantantevotado().equals("Victoria")) {
					contadorMelilla[1]++;
				} else if (melilla.get(i).getCantantevotado().equals("Thiago")) {
					contadorMelilla[2]++;
				} else if (melilla.get(i).getCantantevotado().equals("Sarah")) {
					contadorMelilla[3]++;
				} else if (melilla.get(i).getCantantevotado().equals("Elton")) {
					contadorMelilla[4]++;
				} else if (melilla.get(i).getCantantevotado().equals("Amie")) {
					contadorMelilla[5]++;
				} else if (melilla.get(i).getCantantevotado().equals("Nahid")) {
					contadorMelilla[6]++;
				} else if (melilla.get(i).getCantantevotado().equals("Marc")) {
					contadorMelilla[7]++;
				} else if (melilla.get(i).getCantantevotado().equals("Alba")) {
					contadorMelilla[8]++;
				} else if (melilla.get(i).getCantantevotado().equals("Julio")) {
					contadorMelilla[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE MURCIA
			for (int i = 0; i < murcia.size(); i++) {
				if (murcia.get(i).getCantantevotado().equals("Joel")) {
					contadorMurcia[0]++;
				} else if (murcia.get(i).getCantantevotado().equals("Victoria")) {
					contadorMurcia[1]++;
				} else if (murcia.get(i).getCantantevotado().equals("Thiago")) {
					contadorMurcia[2]++;
				} else if (murcia.get(i).getCantantevotado().equals("Sarah")) {
					contadorMurcia[3]++;
				} else if (murcia.get(i).getCantantevotado().equals("Elton")) {
					contadorMurcia[4]++;
				} else if (murcia.get(i).getCantantevotado().equals("Amie")) {
					contadorMurcia[5]++;
				} else if (murcia.get(i).getCantantevotado().equals("Nahid")) {
					contadorMurcia[6]++;
				} else if (murcia.get(i).getCantantevotado().equals("Marc")) {
					contadorMurcia[7]++;
				} else if (murcia.get(i).getCantantevotado().equals("Alba")) {
					contadorMurcia[8]++;
				} else if (murcia.get(i).getCantantevotado().equals("Julio")) {
					contadorMurcia[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE NAVARRA
			for (int i = 0; i < navarra.size(); i++) {
				if (navarra.get(i).getCantantevotado().equals("Joel")) {
					contadorNavarra[0]++;
				} else if (navarra.get(i).getCantantevotado().equals("Victoria")) {
					contadorNavarra[1]++;
				} else if (navarra.get(i).getCantantevotado().equals("Thiago")) {
					contadorNavarra[2]++;
				} else if (navarra.get(i).getCantantevotado().equals("Sarah")) {
					contadorNavarra[3]++;
				} else if (navarra.get(i).getCantantevotado().equals("Elton")) {
					contadorNavarra[4]++;
				} else if (navarra.get(i).getCantantevotado().equals("Amie")) {
					contadorNavarra[5]++;
				} else if (navarra.get(i).getCantantevotado().equals("Nahid")) {
					contadorNavarra[6]++;
				} else if (navarra.get(i).getCantantevotado().equals("Marc")) {
					contadorNavarra[7]++;
				} else if (navarra.get(i).getCantantevotado().equals("Alba")) {
					contadorNavarra[8]++;
				} else if (navarra.get(i).getCantantevotado().equals("Julio")) {
					contadorNavarra[9]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE PAIS VASCO
			for (int i = 0; i < paisVasco.size(); i++) {
				if (paisVasco.get(i).getCantantevotado().equals("Joel")) {
					contadorPaisVasco[0]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Victoria")) {
					contadorPaisVasco[1]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Thiago")) {
					contadorPaisVasco[2]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Sarah")) {
					contadorPaisVasco[3]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Elton")) {
					contadorPaisVasco[4]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Amie")) {
					contadorPaisVasco[5]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Nahid")) {
					contadorPaisVasco[6]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Marc")) {
					contadorPaisVasco[7]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Alba")) {
					contadorPaisVasco[8]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Julio")) {
					contadorPaisVasco[9]++;
				}
			}

			// HACEMOS UNA CONSULTA PARA RECUPERAR EL DNI DE CADA ARTISTA
			Query queryDni = session.createQuery("FROM Artista");
			List<Artista> artistas = queryDni.list();

			// INSERTAMOS EN LA TABLA DE RESULTADOS POR COMUNIDADES LOS VOTOS OBTENIDOS
			ResultadosComunidad resultadosAndalucia;
			ResultadosComunidad resultadosAragon;
			ResultadosComunidad resultadosAsturias;
			ResultadosComunidad resultadosBaleares;
			ResultadosComunidad resultadosCanarias;
			ResultadosComunidad resultadosCantabria;
			ResultadosComunidad resultadosCastillaLaMancha;
			ResultadosComunidad resultadosCastillaYLeon;
			ResultadosComunidad resultadosCatalunia;
			ResultadosComunidad resultadosCeuta;
			ResultadosComunidad resultadosValencia;
			ResultadosComunidad resultadosExtremadura;
			ResultadosComunidad resultadosGalicia;
			ResultadosComunidad resultadosLaRioja;
			ResultadosComunidad resultadosMadrid;
			ResultadosComunidad resultadosMelilla;
			ResultadosComunidad resultadosMurcia;
			ResultadosComunidad resultadosNavarra;
			ResultadosComunidad resultadosPaisVasco;
			int n=11;
			for(int i=0;i<artistas.size();i++) {
				resultadosAndalucia=new ResultadosComunidad();
				resultadosAndalucia.setIdResultadoComunidad(n);
				resultadosAndalucia.setArtista(artistas.get(i));
				resultadosAndalucia.setNombreComunidad("Andalucia");
				resultadosAndalucia.setNumeroVotosComunidad(contadorAndalucia[i]);
				n=n+1;
				resultadosAragon=new ResultadosComunidad();
				resultadosAragon.setArtista(artistas.get(i));
				resultadosAragon.setIdResultadoComunidad(n);
				resultadosAragon.setNombreComunidad("Aragon");
				resultadosAragon.setNumeroVotosComunidad(contadorAragon[i]);
				n=n+1;
				resultadosAsturias=new ResultadosComunidad();
				resultadosAsturias.setArtista(artistas.get(i));
				resultadosAsturias.setIdResultadoComunidad(n);
				resultadosAsturias.setNombreComunidad("Asturias");
				resultadosAsturias.setNumeroVotosComunidad(contadorAsturias[i]);
				n=n+1;
				resultadosBaleares=new ResultadosComunidad();
				resultadosBaleares.setArtista(artistas.get(i));
				resultadosBaleares.setIdResultadoComunidad(n);
				resultadosBaleares.setNombreComunidad("Baleares");
				resultadosBaleares.setNumeroVotosComunidad(contadorBaleares[i]);
				resultadosBaleares.setIdResultadoComunidad(n);
				n=n+1;
				resultadosCanarias=new ResultadosComunidad();
				resultadosCanarias.setArtista(artistas.get(i));
				resultadosCanarias.setNombreComunidad("Canarias");
				resultadosCanarias.setNumeroVotosComunidad(contadorCanarias[i]);
				resultadosCanarias.setIdResultadoComunidad(n);
				n=n+1;
				resultadosCantabria=new ResultadosComunidad();
				resultadosCantabria.setArtista(artistas.get(i));
				resultadosCantabria.setNombreComunidad("Cantabria");
				resultadosCantabria.setNumeroVotosComunidad(contadorCantabria[i]);
				resultadosCantabria.setIdResultadoComunidad(n);
				n=n+1;
				resultadosCastillaLaMancha=new ResultadosComunidad();
				resultadosCastillaLaMancha.setArtista(artistas.get(i));
				resultadosCastillaLaMancha.setNombreComunidad("Castilla La Mancha");
				resultadosCastillaLaMancha.setNumeroVotosComunidad(contadorCastillaLaMancha[i]);
				resultadosCastillaLaMancha.setIdResultadoComunidad(n);
				n=n+1;
				resultadosCastillaYLeon=new ResultadosComunidad();
				resultadosCastillaYLeon.setArtista(artistas.get(i));
				resultadosCastillaYLeon.setNombreComunidad("Castilla y Leon");
				resultadosCastillaYLeon.setNumeroVotosComunidad(contadorCastillaYLeon[i]);
				resultadosCastillaYLeon.setIdResultadoComunidad(n);
				n=n+1;
				resultadosCatalunia=new ResultadosComunidad();
				resultadosCatalunia.setArtista(artistas.get(i));
				resultadosCatalunia.setNombreComunidad("Catalunia");
				resultadosCatalunia.setNumeroVotosComunidad(contadorCatalunia[i]);
				resultadosCatalunia.setIdResultadoComunidad(n);
				n=n+1;
				resultadosCeuta=new ResultadosComunidad();
				resultadosCeuta.setArtista(artistas.get(i));
				resultadosCeuta.setNombreComunidad("Ceuta");
				resultadosCeuta.setNumeroVotosComunidad(contadorCeuta[i]);
				resultadosCeuta.setIdResultadoComunidad(n);
				n=n+1;
				resultadosValencia=new ResultadosComunidad();
				resultadosValencia.setArtista(artistas.get(i));
				resultadosValencia.setNombreComunidad("Comunidad Valenciana");
				resultadosValencia.setNumeroVotosComunidad(contadorValencia[i]);
				resultadosValencia.setIdResultadoComunidad(n);
				n=n+1;
				resultadosExtremadura=new ResultadosComunidad();
				resultadosExtremadura.setArtista(artistas.get(i));
				resultadosExtremadura.setNombreComunidad("Extremadura");
				resultadosExtremadura.setNumeroVotosComunidad(contadorExtremadura[i]);
				resultadosExtremadura.setIdResultadoComunidad(n);
				n=n+1;
				resultadosGalicia=new ResultadosComunidad();
				resultadosGalicia.setArtista(artistas.get(i));
				resultadosGalicia.setNombreComunidad("Galicia");
				resultadosGalicia.setNumeroVotosComunidad(contadorGalicia[i]);
				resultadosGalicia.setIdResultadoComunidad(n);
				n=n+1;
				resultadosLaRioja=new ResultadosComunidad();
				resultadosLaRioja.setArtista(artistas.get(i));
				resultadosLaRioja.setNombreComunidad("La Rioja");
				resultadosLaRioja.setNumeroVotosComunidad(contadorLaRioja[i]);
				resultadosLaRioja.setIdResultadoComunidad(n);
				n=n+1;
				resultadosMadrid=new ResultadosComunidad();
				resultadosMadrid.setArtista(artistas.get(i));
				resultadosMadrid.setNombreComunidad("Madrid");
				resultadosMadrid.setNumeroVotosComunidad(contadorMadrid[i]);
				resultadosMadrid.setIdResultadoComunidad(n);
				n=n+1;
				resultadosMelilla=new ResultadosComunidad();
				resultadosMelilla.setArtista(artistas.get(i));
				resultadosMelilla.setNombreComunidad("Melilla");
				resultadosMelilla.setNumeroVotosComunidad(contadorMelilla[i]);
				resultadosMelilla.setIdResultadoComunidad(n);
				n=n+1;
				resultadosMurcia=new ResultadosComunidad();
				resultadosMurcia.setArtista(artistas.get(i));
				resultadosMurcia.setNombreComunidad("Murcia");
				resultadosMurcia.setNumeroVotosComunidad(contadorMurcia[i]);
				resultadosMurcia.setIdResultadoComunidad(n);
				n=n+1;
				resultadosNavarra=new ResultadosComunidad();
				resultadosNavarra.setArtista(artistas.get(i));
				resultadosNavarra.setNombreComunidad("Navarra");
				resultadosNavarra.setNumeroVotosComunidad(contadorNavarra[i]);
				resultadosNavarra.setIdResultadoComunidad(n);
				n=n+1;
				resultadosPaisVasco=new ResultadosComunidad();
				resultadosPaisVasco.setArtista(artistas.get(i));
				resultadosPaisVasco.setNombreComunidad("Pais Vasco");
				resultadosPaisVasco.setNumeroVotosComunidad(contadorPaisVasco[i]);
				resultadosPaisVasco.setIdResultadoComunidad(n);
				n=n+1;
				
				session.saveOrUpdate(resultadosAndalucia);
				session.saveOrUpdate(resultadosAragon);
				session.saveOrUpdate(resultadosAsturias);
				session.saveOrUpdate(resultadosBaleares);
				session.saveOrUpdate(resultadosCanarias);
				session.saveOrUpdate(resultadosCantabria);
				session.saveOrUpdate(resultadosCastillaLaMancha);
				session.saveOrUpdate(resultadosCastillaYLeon);
				session.saveOrUpdate(resultadosCatalunia);
				session.saveOrUpdate(resultadosCeuta);
				session.saveOrUpdate(resultadosValencia);
				session.saveOrUpdate(resultadosExtremadura);
				session.saveOrUpdate(resultadosGalicia);
				session.saveOrUpdate(resultadosPaisVasco);
				session.saveOrUpdate(resultadosLaRioja);
				session.saveOrUpdate(resultadosMadrid);
				session.saveOrUpdate(resultadosMelilla);
				session.saveOrUpdate(resultadosMurcia);
				session.saveOrUpdate(resultadosNavarra);
			}
			
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			throw e;
		} finally {
			if (null != session) {
				session.close();
			}
		}
	}
}
