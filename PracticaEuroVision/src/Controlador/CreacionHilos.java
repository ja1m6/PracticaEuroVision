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
import persistencias.ResultadosComunidad;
import persistencias.ResultadosEdad;
import persistencias.ResultadosGenerales;

public class CreacionHilos {
	public static void main (String [] args) {
		CreacionHilos helper = new CreacionHilos();
		helper.generarVotantes();
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
					contadorAndalucia[i]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Victoria")) {
					contadorAndalucia[i]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Thiago")) {
					contadorAndalucia[i]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Sarah")) {
					contadorAndalucia[i]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Elton")) {
					contadorAndalucia[i]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Amie")) {
					contadorAndalucia[i]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Nahid")) {
					contadorAndalucia[i]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Marc")) {
					contadorAndalucia[i]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Alba")) {
					contadorAndalucia[i]++;
				} else if (andalucia.get(i).getCantantevotado().equals("Julio")) {
					contadorAndalucia[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE ARAGON
			for (int i = 0; i < aragon.size(); i++) {
				if (aragon.get(i).getCantantevotado().equals("Joel")) {
					contadorAragon[i]++;
				} else if (aragon.get(i).getCantantevotado().equals("Victoria")) {
					contadorAragon[i]++;
				} else if (aragon.get(i).getCantantevotado().equals("Thiago")) {
					contadorAragon[i]++;
				} else if (aragon.get(i).getCantantevotado().equals("Sarah")) {
					contadorAragon[i]++;
				} else if (aragon.get(i).getCantantevotado().equals("Elton")) {
					contadorAragon[i]++;
				} else if (aragon.get(i).getCantantevotado().equals("Amie")) {
					contadorAragon[i]++;
				} else if (aragon.get(i).getCantantevotado().equals("Nahid")) {
					contadorAragon[i]++;
				} else if (aragon.get(i).getCantantevotado().equals("Marc")) {
					contadorAragon[i]++;
				} else if (aragon.get(i).getCantantevotado().equals("Alba")) {
					contadorAragon[i]++;
				} else if (aragon.get(i).getCantantevotado().equals("Julio")) {
					contadorAragon[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE ASTURIAS
			for (int i = 0; i < asturias.size(); i++) {
				if (asturias.get(i).getCantantevotado().equals("Joel")) {
					contadorAsturias[i]++;
				} else if (asturias.get(i).getCantantevotado().equals("Victoria")) {
					contadorAsturias[i]++;
				} else if (asturias.get(i).getCantantevotado().equals("Thiago")) {
					contadorAsturias[i]++;
				} else if (asturias.get(i).getCantantevotado().equals("Sarah")) {
					contadorAsturias[i]++;
				} else if (asturias.get(i).getCantantevotado().equals("Elton")) {
					contadorAsturias[i]++;
				} else if (asturias.get(i).getCantantevotado().equals("Amie")) {
					contadorAsturias[i]++;
				} else if (asturias.get(i).getCantantevotado().equals("Nahid")) {
					contadorAsturias[i]++;
				} else if (asturias.get(i).getCantantevotado().equals("Marc")) {
					contadorAsturias[i]++;
				} else if (asturias.get(i).getCantantevotado().equals("Alba")) {
					contadorAsturias[i]++;
				} else if (asturias.get(i).getCantantevotado().equals("Julio")) {
					contadorAsturias[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE ASTURIAS
			for (int i = 0; i < baleares.size(); i++) {
				if (baleares.get(i).getCantantevotado().equals("Joel")) {
					contadorBaleares[i]++;
				} else if (baleares.get(i).getCantantevotado().equals("Victoria")) {
					contadorBaleares[i]++;
				} else if (baleares.get(i).getCantantevotado().equals("Thiago")) {
					contadorBaleares[i]++;
				} else if (baleares.get(i).getCantantevotado().equals("Sarah")) {
					contadorBaleares[i]++;
				} else if (baleares.get(i).getCantantevotado().equals("Elton")) {
					contadorBaleares[i]++;
				} else if (baleares.get(i).getCantantevotado().equals("Amie")) {
					contadorBaleares[i]++;
				} else if (baleares.get(i).getCantantevotado().equals("Nahid")) {
					contadorBaleares[i]++;
				} else if (baleares.get(i).getCantantevotado().equals("Marc")) {
					contadorBaleares[i]++;
				} else if (baleares.get(i).getCantantevotado().equals("Alba")) {
					contadorBaleares[i]++;
				} else if (baleares.get(i).getCantantevotado().equals("Julio")) {
					contadorBaleares[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CANARIAS
			for (int i = 0; i < canarias.size(); i++) {
				if (canarias.get(i).getCantantevotado().equals("Joel")) {
					contadorCanarias[i]++;
				} else if (canarias.get(i).getCantantevotado().equals("Victoria")) {
					contadorCanarias[i]++;
				} else if (canarias.get(i).getCantantevotado().equals("Thiago")) {
					contadorCanarias[i]++;
				} else if (canarias.get(i).getCantantevotado().equals("Sarah")) {
					contadorCanarias[i]++;
				} else if (canarias.get(i).getCantantevotado().equals("Elton")) {
					contadorCanarias[i]++;
				} else if (canarias.get(i).getCantantevotado().equals("Amie")) {
					contadorCanarias[i]++;
				} else if (canarias.get(i).getCantantevotado().equals("Nahid")) {
					contadorCanarias[i]++;
				} else if (canarias.get(i).getCantantevotado().equals("Marc")) {
					contadorCanarias[i]++;
				} else if (canarias.get(i).getCantantevotado().equals("Alba")) {
					contadorCanarias[i]++;
				} else if (canarias.get(i).getCantantevotado().equals("Julio")) {
					contadorCanarias[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CANTABRIA
			for (int i = 0; i < cantabria.size(); i++) {
				if (cantabria.get(i).getCantantevotado().equals("Joel")) {
					contadorCantabria[i]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Victoria")) {
					contadorCantabria[i]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Thiago")) {
					contadorCantabria[i]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Sarah")) {
					contadorCantabria[i]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Elton")) {
					contadorCantabria[i]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Amie")) {
					contadorCantabria[i]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Nahid")) {
					contadorCantabria[i]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Marc")) {
					contadorCantabria[i]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Alba")) {
					contadorCantabria[i]++;
				} else if (cantabria.get(i).getCantantevotado().equals("Julio")) {
					contadorCantabria[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CASTILLA LA MANCHA
			for (int i = 0; i < castillaLaMancha.size(); i++) {
				if (castillaLaMancha.get(i).getCantantevotado().equals("Joel")) {
					contadorCastillaLaMancha[i]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Victoria")) {
					contadorCastillaLaMancha[i]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Thiago")) {
					contadorCastillaLaMancha[i]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Sarah")) {
					contadorCastillaLaMancha[i]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Elton")) {
					contadorCastillaLaMancha[i]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Amie")) {
					contadorCastillaLaMancha[i]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Nahid")) {
					contadorCastillaLaMancha[i]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Marc")) {
					contadorCastillaLaMancha[i]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Alba")) {
					contadorCastillaLaMancha[i]++;
				} else if (castillaLaMancha.get(i).getCantantevotado().equals("Julio")) {
					contadorCastillaLaMancha[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CASTILLA Y LEON
			for (int i = 0; i < castillaYLeon.size(); i++) {
				if (castillaYLeon.get(i).getCantantevotado().equals("Joel")) {
					contadorCastillaYLeon[i]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Victoria")) {
					contadorCastillaYLeon[i]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Thiago")) {
					contadorCastillaYLeon[i]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Sarah")) {
					contadorCastillaYLeon[i]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Elton")) {
					contadorCastillaYLeon[i]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Amie")) {
					contadorCastillaYLeon[i]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Nahid")) {
					contadorCastillaYLeon[i]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Marc")) {
					contadorCastillaYLeon[i]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Alba")) {
					contadorCastillaYLeon[i]++;
				} else if (castillaYLeon.get(i).getCantantevotado().equals("Julio")) {
					contadorCastillaYLeon[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CATALUNIA
			for (int i = 0; i < catalunia.size(); i++) {
				if (catalunia.get(i).getCantantevotado().equals("Joel")) {
					contadorCatalunia[i]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Victoria")) {
					contadorCatalunia[i]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Thiago")) {
					contadorCatalunia[i]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Sarah")) {
					contadorCatalunia[i]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Elton")) {
					contadorCatalunia[i]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Amie")) {
					contadorCatalunia[i]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Nahid")) {
					contadorCatalunia[i]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Marc")) {
					contadorCatalunia[i]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Alba")) {
					contadorCatalunia[i]++;
				} else if (catalunia.get(i).getCantantevotado().equals("Julio")) {
					contadorCatalunia[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE CEUTA
			for (int i = 0; i < ceuta.size(); i++) {
				if (ceuta.get(i).getCantantevotado().equals("Joel")) {
					contadorCeuta[i]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Victoria")) {
					contadorCeuta[i]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Thiago")) {
					contadorCeuta[i]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Sarah")) {
					contadorCeuta[i]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Elton")) {
					contadorCeuta[i]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Amie")) {
					contadorCeuta[i]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Nahid")) {
					contadorCeuta[i]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Marc")) {
					contadorCeuta[i]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Alba")) {
					contadorCeuta[i]++;
				} else if (ceuta.get(i).getCantantevotado().equals("Julio")) {
					contadorCeuta[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE VALENCIA
			for (int i = 0; i < valencia.size(); i++) {
				if (valencia.get(i).getCantantevotado().equals("Joel")) {
					contadorValencia[i]++;
				} else if (valencia.get(i).getCantantevotado().equals("Victoria")) {
					contadorValencia[i]++;
				} else if (valencia.get(i).getCantantevotado().equals("Thiago")) {
					contadorValencia[i]++;
				} else if (valencia.get(i).getCantantevotado().equals("Sarah")) {
					contadorValencia[i]++;
				} else if (valencia.get(i).getCantantevotado().equals("Elton")) {
					contadorValencia[i]++;
				} else if (valencia.get(i).getCantantevotado().equals("Amie")) {
					contadorValencia[i]++;
				} else if (valencia.get(i).getCantantevotado().equals("Nahid")) {
					contadorValencia[i]++;
				} else if (valencia.get(i).getCantantevotado().equals("Marc")) {
					contadorValencia[i]++;
				} else if (valencia.get(i).getCantantevotado().equals("Alba")) {
					contadorValencia[i]++;
				} else if (valencia.get(i).getCantantevotado().equals("Julio")) {
					contadorValencia[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE EXTREMADURA
			for (int i = 0; i < extremadura.size(); i++) {
				if (extremadura.get(i).getCantantevotado().equals("Joel")) {
					contadorExtremadura[i]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Victoria")) {
					contadorExtremadura[i]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Thiago")) {
					contadorExtremadura[i]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Sarah")) {
					contadorExtremadura[i]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Elton")) {
					contadorExtremadura[i]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Amie")) {
					contadorExtremadura[i]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Nahid")) {
					contadorExtremadura[i]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Marc")) {
					contadorExtremadura[i]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Alba")) {
					contadorExtremadura[i]++;
				} else if (extremadura.get(i).getCantantevotado().equals("Julio")) {
					contadorExtremadura[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE GALICIA
			for (int i = 0; i < galicia.size(); i++) {
				if (galicia.get(i).getCantantevotado().equals("Joel")) {
					contadorGalicia[i]++;
				} else if (galicia.get(i).getCantantevotado().equals("Victoria")) {
					contadorGalicia[i]++;
				} else if (galicia.get(i).getCantantevotado().equals("Thiago")) {
					contadorGalicia[i]++;
				} else if (galicia.get(i).getCantantevotado().equals("Sarah")) {
					contadorGalicia[i]++;
				} else if (galicia.get(i).getCantantevotado().equals("Elton")) {
					contadorGalicia[i]++;
				} else if (galicia.get(i).getCantantevotado().equals("Amie")) {
					contadorGalicia[i]++;
				} else if (galicia.get(i).getCantantevotado().equals("Nahid")) {
					contadorGalicia[i]++;
				} else if (galicia.get(i).getCantantevotado().equals("Marc")) {
					contadorGalicia[i]++;
				} else if (galicia.get(i).getCantantevotado().equals("Alba")) {
					contadorGalicia[i]++;
				} else if (galicia.get(i).getCantantevotado().equals("Julio")) {
					contadorGalicia[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE LA RIOJA
			for (int i = 0; i < laRioja.size(); i++) {
				if (laRioja.get(i).getCantantevotado().equals("Joel")) {
					contadorLaRioja[i]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Victoria")) {
					contadorLaRioja[i]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Thiago")) {
					contadorLaRioja[i]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Sarah")) {
					contadorLaRioja[i]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Elton")) {
					contadorLaRioja[i]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Amie")) {
					contadorLaRioja[i]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Nahid")) {
					contadorLaRioja[i]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Marc")) {
					contadorLaRioja[i]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Alba")) {
					contadorLaRioja[i]++;
				} else if (laRioja.get(i).getCantantevotado().equals("Julio")) {
					contadorLaRioja[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE MADRID
			for (int i = 0; i < madrid.size(); i++) {
				if (madrid.get(i).getCantantevotado().equals("Joel")) {
					contadorMadrid[i]++;
				} else if (madrid.get(i).getCantantevotado().equals("Victoria")) {
					contadorMadrid[i]++;
				} else if (madrid.get(i).getCantantevotado().equals("Thiago")) {
					contadorMadrid[i]++;
				} else if (madrid.get(i).getCantantevotado().equals("Sarah")) {
					contadorMadrid[i]++;
				} else if (madrid.get(i).getCantantevotado().equals("Elton")) {
					contadorMadrid[i]++;
				} else if (madrid.get(i).getCantantevotado().equals("Amie")) {
					contadorMadrid[i]++;
				} else if (madrid.get(i).getCantantevotado().equals("Nahid")) {
					contadorMadrid[i]++;
				} else if (madrid.get(i).getCantantevotado().equals("Marc")) {
					contadorMadrid[i]++;
				} else if (madrid.get(i).getCantantevotado().equals("Alba")) {
					contadorMadrid[i]++;
				} else if (madrid.get(i).getCantantevotado().equals("Julio")) {
					contadorMadrid[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE MELILLA
			for (int i = 0; i < melilla.size(); i++) {
				if (melilla.get(i).getCantantevotado().equals("Joel")) {
					contadorMelilla[i]++;
				} else if (melilla.get(i).getCantantevotado().equals("Victoria")) {
					contadorMelilla[i]++;
				} else if (melilla.get(i).getCantantevotado().equals("Thiago")) {
					contadorMelilla[i]++;
				} else if (melilla.get(i).getCantantevotado().equals("Sarah")) {
					contadorMelilla[i]++;
				} else if (melilla.get(i).getCantantevotado().equals("Elton")) {
					contadorMelilla[i]++;
				} else if (melilla.get(i).getCantantevotado().equals("Amie")) {
					contadorMelilla[i]++;
				} else if (melilla.get(i).getCantantevotado().equals("Nahid")) {
					contadorMelilla[i]++;
				} else if (melilla.get(i).getCantantevotado().equals("Marc")) {
					contadorMelilla[i]++;
				} else if (melilla.get(i).getCantantevotado().equals("Alba")) {
					contadorMelilla[i]++;
				} else if (melilla.get(i).getCantantevotado().equals("Julio")) {
					contadorMelilla[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE MURCIA
			for (int i = 0; i < murcia.size(); i++) {
				if (murcia.get(i).getCantantevotado().equals("Joel")) {
					contadorMurcia[i]++;
				} else if (murcia.get(i).getCantantevotado().equals("Victoria")) {
					contadorMurcia[i]++;
				} else if (murcia.get(i).getCantantevotado().equals("Thiago")) {
					contadorMurcia[i]++;
				} else if (murcia.get(i).getCantantevotado().equals("Sarah")) {
					contadorMurcia[i]++;
				} else if (murcia.get(i).getCantantevotado().equals("Elton")) {
					contadorMurcia[i]++;
				} else if (murcia.get(i).getCantantevotado().equals("Amie")) {
					contadorMurcia[i]++;
				} else if (murcia.get(i).getCantantevotado().equals("Nahid")) {
					contadorMurcia[i]++;
				} else if (murcia.get(i).getCantantevotado().equals("Marc")) {
					contadorMurcia[i]++;
				} else if (murcia.get(i).getCantantevotado().equals("Alba")) {
					contadorMurcia[i]++;
				} else if (murcia.get(i).getCantantevotado().equals("Julio")) {
					contadorMurcia[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE NAVARRA
			for (int i = 0; i < navarra.size(); i++) {
				if (navarra.get(i).getCantantevotado().equals("Joel")) {
					contadorNavarra[i]++;
				} else if (navarra.get(i).getCantantevotado().equals("Victoria")) {
					contadorNavarra[i]++;
				} else if (navarra.get(i).getCantantevotado().equals("Thiago")) {
					contadorNavarra[i]++;
				} else if (navarra.get(i).getCantantevotado().equals("Sarah")) {
					contadorNavarra[i]++;
				} else if (navarra.get(i).getCantantevotado().equals("Elton")) {
					contadorNavarra[i]++;
				} else if (navarra.get(i).getCantantevotado().equals("Amie")) {
					contadorNavarra[i]++;
				} else if (navarra.get(i).getCantantevotado().equals("Nahid")) {
					contadorNavarra[i]++;
				} else if (navarra.get(i).getCantantevotado().equals("Marc")) {
					contadorNavarra[i]++;
				} else if (navarra.get(i).getCantantevotado().equals("Alba")) {
					contadorNavarra[i]++;
				} else if (navarra.get(i).getCantantevotado().equals("Julio")) {
					contadorNavarra[i]++;
				}
			}

			// TENEMOS QUE RECUPERAR LOS DISTINTOS VOTOS DE PAIS VASCO
			for (int i = 0; i < paisVasco.size(); i++) {
				if (paisVasco.get(i).getCantantevotado().equals("Joel")) {
					contadorPaisVasco[i]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Victoria")) {
					contadorPaisVasco[i]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Thiago")) {
					contadorPaisVasco[i]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Sarah")) {
					contadorPaisVasco[i]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Elton")) {
					contadorPaisVasco[i]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Amie")) {
					contadorPaisVasco[i]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Nahid")) {
					contadorPaisVasco[i]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Marc")) {
					contadorPaisVasco[i]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Alba")) {
					contadorPaisVasco[i]++;
				} else if (paisVasco.get(i).getCantantevotado().equals("Julio")) {
					contadorPaisVasco[i]++;
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
			ResultadosComunidad resultadosLaRioja;
			ResultadosComunidad resultadosMadrid;
			ResultadosComunidad resultadosMelilla;
			ResultadosComunidad resultadosMurcia;
			ResultadosComunidad resultadosNavarra;
			ResultadosComunidad resultadosPaisVasco;

			for (int i = 0; i < andalucia.size(); i++) {
				resultadosAndalucia = new ResultadosComunidad();
				resultadosAndalucia.setNombreComunidad(andalucia.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (andalucia.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosAndalucia.setArtista(artistas.get(j));
						resultadosAndalucia.setNumeroVotosComunidad(contadorAndalucia[j]);
					}
				}

				session.saveOrUpdate(resultadosAndalucia);
			}

			for (int i = 0; i < aragon.size(); i++) {
				resultadosAragon = new ResultadosComunidad();
				resultadosAragon.setNombreComunidad(aragon.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (aragon.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosAragon.setArtista(artistas.get(j));
						resultadosAragon.setNumeroVotosComunidad(contadorAragon[j]);
					}
				}

				session.saveOrUpdate(resultadosAragon);
			}

			for (int i = 0; i < asturias.size(); i++) {
				resultadosAsturias = new ResultadosComunidad();
				resultadosAsturias.setNombreComunidad(asturias.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (asturias.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosAsturias.setArtista(artistas.get(j));
						resultadosAsturias.setNumeroVotosComunidad(contadorAsturias[j]);
					}
				}

				session.saveOrUpdate(resultadosAsturias);
			}

			for (int i = 0; i < baleares.size(); i++) {
				resultadosBaleares = new ResultadosComunidad();
				resultadosBaleares.setNombreComunidad(baleares.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (baleares.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosBaleares.setArtista(artistas.get(j));
						resultadosBaleares.setNumeroVotosComunidad(contadorBaleares[j]);
					}
				}

				session.saveOrUpdate(resultadosBaleares);
			}
			
			for (int i = 0; i < canarias.size(); i++) {
				resultadosCanarias = new ResultadosComunidad();
				resultadosCanarias.setNombreComunidad(canarias.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (canarias.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosCanarias.setArtista(artistas.get(j));
						resultadosCanarias.setNumeroVotosComunidad(contadorCanarias[j]);
					}
				}

				session.saveOrUpdate(resultadosCanarias);
			}
			
			for (int i = 0; i < cantabria.size(); i++) {
				resultadosCantabria = new ResultadosComunidad();
				resultadosCantabria.setNombreComunidad(cantabria.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (cantabria.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosCantabria.setArtista(artistas.get(j));
						resultadosCantabria.setNumeroVotosComunidad(contadorCantabria[j]);
					}
				}

				session.saveOrUpdate(resultadosCantabria);
			}
			
			for (int i = 0; i < castillaLaMancha.size(); i++) {
				resultadosCastillaLaMancha = new ResultadosComunidad();
				resultadosCastillaLaMancha.setNombreComunidad(castillaLaMancha.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (castillaLaMancha.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosCastillaLaMancha.setArtista(artistas.get(j));
						resultadosCastillaLaMancha.setNumeroVotosComunidad(contadorCastillaLaMancha[j]);
					}
				}

				session.saveOrUpdate(resultadosCastillaLaMancha);
			}
			
			for (int i = 0; i < castillaYLeon.size(); i++) {
				resultadosCastillaYLeon = new ResultadosComunidad();
				resultadosCastillaYLeon.setNombreComunidad(castillaYLeon.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (castillaYLeon.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosCastillaYLeon.setArtista(artistas.get(j));
						resultadosCastillaYLeon.setNumeroVotosComunidad(contadorCastillaYLeon[j]);
					}
				}

				session.saveOrUpdate(resultadosCastillaYLeon);
			}
			
			for (int i = 0; i < catalunia.size(); i++) {
				resultadosCatalunia = new ResultadosComunidad();
				resultadosCatalunia.setNombreComunidad(catalunia.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (catalunia.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosCatalunia.setArtista(artistas.get(j));
						resultadosCatalunia.setNumeroVotosComunidad(contadorCatalunia[j]);
					}
				}

				session.saveOrUpdate(resultadosCatalunia);
			}
			
			for (int i = 0; i < ceuta.size(); i++) {
				resultadosCeuta = new ResultadosComunidad();
				resultadosCeuta.setNombreComunidad(ceuta.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (ceuta.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosCeuta.setArtista(artistas.get(j));
						resultadosCeuta.setNumeroVotosComunidad(contadorCeuta[j]);
					}
				}

				session.saveOrUpdate(resultadosCeuta);
			}
			
			for (int i = 0; i < valencia.size(); i++) {
				resultadosValencia = new ResultadosComunidad();
				resultadosValencia.setNombreComunidad(valencia.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (valencia.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosValencia.setArtista(artistas.get(j));
						resultadosValencia.setNumeroVotosComunidad(contadorValencia[j]);
					}
				}

				session.saveOrUpdate(resultadosValencia);
			}
			
			for (int i = 0; i < laRioja.size(); i++) {
				resultadosLaRioja = new ResultadosComunidad();
				resultadosLaRioja.setNombreComunidad(laRioja.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (laRioja.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosLaRioja.setArtista(artistas.get(j));
						resultadosLaRioja.setNumeroVotosComunidad(contadorLaRioja[j]);
					}
				}

				session.saveOrUpdate(resultadosLaRioja);
			}
			
			for (int i = 0; i < madrid.size(); i++) {
				resultadosMadrid = new ResultadosComunidad();
				resultadosMadrid.setNombreComunidad(madrid.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (madrid.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosMadrid.setArtista(artistas.get(j));
						resultadosMadrid.setNumeroVotosComunidad(contadorMadrid[j]);
					}
				}

				session.saveOrUpdate(resultadosMadrid);
			}
			
			for (int i = 0; i < melilla.size(); i++) {
				resultadosMelilla = new ResultadosComunidad();
				resultadosMelilla.setNombreComunidad(melilla.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (melilla.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosMelilla.setArtista(artistas.get(j));
						resultadosMelilla.setNumeroVotosComunidad(contadorMelilla[j]);
					}
				}

				session.saveOrUpdate(resultadosMelilla);
			}
			
			for (int i = 0; i < murcia.size(); i++) {
				resultadosMurcia = new ResultadosComunidad();
				resultadosMurcia.setNombreComunidad(murcia.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (murcia.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosMurcia.setArtista(artistas.get(j));
						resultadosMurcia.setNumeroVotosComunidad(contadorMurcia[j]);
					}
				}

				session.saveOrUpdate(resultadosMurcia);
			}
			
			for (int i = 0; i < navarra.size(); i++) {
				resultadosNavarra = new ResultadosComunidad();
				resultadosNavarra.setNombreComunidad(navarra.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (navarra.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosNavarra.setArtista(artistas.get(j));
						resultadosNavarra.setNumeroVotosComunidad(contadorNavarra[j]);
					}
				}

				session.saveOrUpdate(resultadosNavarra);
			}
			
			for (int i = 0; i < paisVasco.size(); i++) {
				resultadosPaisVasco = new ResultadosComunidad();
				resultadosPaisVasco.setNombreComunidad(paisVasco.get(i).getComunidad());
				for (int j = 0; j < artistas.size(); j++) {
					if (paisVasco.get(i).getCantantevotado().equals(artistas.get(j).getNombre())) {
						resultadosPaisVasco.setArtista(artistas.get(j));
						resultadosPaisVasco.setNumeroVotosComunidad(contadorPaisVasco[j]);
					}
				}

				session.saveOrUpdate(resultadosPaisVasco);
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
