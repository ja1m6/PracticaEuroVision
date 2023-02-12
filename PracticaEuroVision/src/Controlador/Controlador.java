package Controlador;

import vista.Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import persistencias.Resultado;

public class Controlador implements ActionListener {
	Vista inicio = new Vista();
	ArrayList<String> codigoColor = new ArrayList<String>();
	CreacionHilos crearHilos = new CreacionHilos();
	Color nuevoColor = new Color(0, 0, 0);

	public Controlador(Vista vista) {
		inicio = vista;

		// COLORES INTERFAZ
		for (int u = 0; u < 256; u++) {
			codigoColor.add(String.valueOf(u));
		}

		// LISTENER BOTONES
		this.inicio.btcomprobarpersonalizacion.addActionListener(this);
		this.inicio.btsalirpersonalizacion.addActionListener(this);
		this.inicio.crearColor.addActionListener(this);
		this.inicio.fondoAzul.addActionListener(this);
		this.inicio.fondoNegro.addActionListener(this);
		this.inicio.fondoVerde.addActionListener(this);
		this.inicio.fondoRojo.addActionListener(this);
		this.inicio.fondoBlanco.addActionListener(this);
		this.inicio.nuevoFondo.addActionListener(this);
		this.inicio.letraAzul.addActionListener(this);
		this.inicio.letraBlanco.addActionListener(this);
		this.inicio.letraNegro.addActionListener(this);
		this.inicio.letraRojo.addActionListener(this);
		this.inicio.letraVerde.addActionListener(this);
		this.inicio.nuevoLetra.addActionListener(this);
		this.inicio.btsalircomunidades.addActionListener(this);
		this.inicio.mostrarComunidades.addActionListener(this);
		this.inicio.mostrarEdades.addActionListener(this);
		this.inicio.btsaliredades.addActionListener(this);
		this.inicio.bt18anios.addActionListener(this);
		this.inicio.bt26anios.addActionListener(this);
		this.inicio.bt41anios.addActionListener(this);
		this.inicio.bt66anios.addActionListener(this);
		this.inicio.btnAndalucia.addActionListener(this);
		this.inicio.btaragon.addActionListener(this);
		this.inicio.btasturias.addActionListener(this);
		this.inicio.bislasbaleares.addActionListener(this);
		this.inicio.bislascanarias.addActionListener(this);
		this.inicio.btcastillaleon.addActionListener(this);
		this.inicio.btnCastillaLaMancha.addActionListener(this);
		this.inicio.btnCatalunia.addActionListener(this);
		this.inicio.bceuta.addActionListener(this);
		this.inicio.btvalencia.addActionListener(this);
		this.inicio.btextremadura.addActionListener(this);
		this.inicio.btgalicia.addActionListener(this);
		this.inicio.btlarioja.addActionListener(this);
		this.inicio.btmadrid.addActionListener(this);
		this.inicio.bmelilla.addActionListener(this);
		this.inicio.btmurcia.addActionListener(this);
		this.inicio.btnavarra.addActionListener(this);
		this.inicio.btpaisvasco.addActionListener(this);
		
		// LLAMAMOS AL METODO CREAR VOTANTES DE LA CLASE CREACION HILOS
		// crearHilos.generarVotantes();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> artista = new ArrayList<String>();
		artista.add("Joel");
		artista.add("Marc");
		artista.add("Alba");
		artista.add("Thiago");
		artista.add("Amie");
		artista.add("Sarah");
		artista.add("Nahid");
		artista.add("Julio");
		artista.add("Elton");
		artista.add("Victoria");
		
		// CAMBIAR COLOR FONDO
		if (e.getSource() == inicio.fondoAzul) {
			inicio.contentPane.setBackground(Color.blue);
			inicio.panelPersonalizacion.setBackground(Color.blue);
			inicio.panelComunidades.setBackground(Color.blue);
		}
		
		if (e.getSource() == inicio.fondoBlanco) {
			inicio.contentPane.setBackground(Color.white);
			inicio.panelPersonalizacion.setBackground(Color.white);
			inicio.panelComunidades.setBackground(Color.white);
		}
		
		if (e.getSource() == inicio.fondoVerde) {
			inicio.contentPane.setBackground(Color.green);
			inicio.panelPersonalizacion.setBackground(Color.green);
			inicio.panelComunidades.setBackground(Color.green);
		}
		
		if (e.getSource() == inicio.fondoNegro) {
			inicio.contentPane.setBackground(Color.black);
			inicio.panelPersonalizacion.setBackground(Color.black);
			inicio.panelComunidades.setBackground(Color.black);
		}
		
		if (e.getSource() == inicio.fondoRojo) {
			inicio.contentPane.setBackground(Color.red);
			inicio.panelPersonalizacion.setBackground(Color.red);
			inicio.panelComunidades.setBackground(Color.red);
		}
		
		if (e.getSource() == inicio.nuevoFondo) {
			inicio.contentPane.setBackground(nuevoColor);
			inicio.panelPersonalizacion.setBackground(nuevoColor);
			inicio.panelComunidades.setBackground(nuevoColor);
		}
		
		// CAMBIAR COLOR LETRA
		if (e.getSource() == inicio.letraAzul) {
			/**
			 * inicio.lbcolor1.setForeground(Color.blue);
			 * inicio.lbcolor2.setForeground(Color.blue);
			 * inicio.lbcolor3.setForeground(Color.blue);
			 * inicio.lbt1.setForeground(Color.blue); inicio.lbt2.setForeground(Color.blue);
			 * inicio.lbt3.setForeground(Color.blue);
			 * inicio.lbmodt.setForeground(Color.blue);
			 * inicio.btComprobar.setForeground(Color.blue);
			 * inicio.btsalir.setForeground(Color.blue);
			 * inicio.listalugares.setForeground(Color.blue);
			 * inicio.lbLugar.setForeground(Color.blue);
			 * inicio.lblTidr.setForeground(Color.blue);
			 * inicio.lblTid.setForeground(Color.blue);
			 * inicio.lblTlugarr.setForeground(Color.blue);
			 * inicio.lblTlugar.setForeground(Color.blue);
			 * inicio.lblTlocalidad.setForeground(Color.blue);
			 * inicio.lbllocalidad.setForeground(Color.blue);
			 * inicio.bsciu.setForeground(Color.blue);
			 * inicio.bstol.setForeground(Color.blue);
			 * inicio.bscue.setForeground(Color.blue);
			 * inicio.bsalb.setForeground(Color.blue);
			 * inicio.bsgua.setForeground(Color.blue);
			 * inicio.bsdefecto.setForeground(Color.blue);
			 * inicio.bspnacional.setForeground(Color.blue);
			 * inicio.bspnatural.setForeground(Color.blue);
			 * inicio.bsrnatural.setForeground(Color.blue);
			 * inicio.lbProvincia.setForeground(Color.blue);
			 * inicio.bsmicroreserva.setForeground(Color.blue);
			 * inicio.bsrfluvial.setForeground(Color.blue);
			 * inicio.bsmonumentonatural.setForeground(Color.blue);
			 * inicio.bspaisajeprotegido.setForeground(Color.blue);
			 * inicio.lbtipo.setForeground(Color.blue);
			 * inicio.bssinfiltro.setForeground(Color.blue);
			 **/
		}
		
		if (e.getSource() == inicio.letraBlanco) {
			/**
			 * inicio.lbcolor1.setForeground(Color.white);
			 * inicio.lbcolor2.setForeground(Color.white);
			 * inicio.lbcolor3.setForeground(Color.white);
			 * inicio.lbt1.setForeground(Color.white);
			 * inicio.lbt2.setForeground(Color.white);
			 * inicio.lbt3.setForeground(Color.white);
			 * inicio.lbmodt.setForeground(Color.white);
			 * inicio.btComprobar.setForeground(Color.white);
			 * inicio.btsalir.setForeground(Color.white);
			 * inicio.listalugares.setForeground(Color.white);
			 * inicio.lbLugar.setForeground(Color.white);
			 * inicio.lblTidr.setForeground(Color.white);
			 * inicio.lblTid.setForeground(Color.white);
			 * inicio.lblTlugarr.setForeground(Color.white);
			 * inicio.lblTlugar.setForeground(Color.white);
			 * inicio.lblTlocalidad.setForeground(Color.white);
			 * inicio.lbllocalidad.setForeground(Color.white);
			 * inicio.bsciu.setForeground(Color.white);
			 * inicio.bstol.setForeground(Color.white);
			 * inicio.bscue.setForeground(Color.white);
			 * inicio.bsalb.setForeground(Color.white);
			 * inicio.bsgua.setForeground(Color.white);
			 * inicio.bsdefecto.setForeground(Color.white);
			 * inicio.bspnacional.setForeground(Color.white);
			 * inicio.bspnatural.setForeground(Color.white);
			 * inicio.bsrnatural.setForeground(Color.white);
			 * inicio.lbProvincia.setForeground(Color.white);
			 * inicio.bsmicroreserva.setForeground(Color.white);
			 * inicio.bsrfluvial.setForeground(Color.white);
			 * inicio.bsmonumentonatural.setForeground(Color.white);
			 * inicio.bspaisajeprotegido.setForeground(Color.white);
			 * inicio.lbtipo.setForeground(Color.white);
			 * inicio.bssinfiltro.setForeground(Color.white);
			 **/
		}
		
		if (e.getSource() == inicio.letraNegro) {
			/**
			 * inicio.lbcolor1.setForeground(Color.black);
			 * inicio.lbcolor2.setForeground(Color.black);
			 * inicio.lbcolor3.setForeground(Color.black);
			 * inicio.lbt1.setForeground(Color.black);
			 * inicio.lbt2.setForeground(Color.black);
			 * inicio.lbt3.setForeground(Color.black);
			 * inicio.lbmodt.setForeground(Color.black);
			 * inicio.btComprobar.setForeground(Color.black);
			 * inicio.btsalir.setForeground(Color.black);
			 * inicio.listalugares.setForeground(Color.black);
			 * inicio.lbLugar.setForeground(Color.black);
			 * inicio.lblTidr.setForeground(Color.black);
			 * inicio.lblTid.setForeground(Color.black);
			 * inicio.lblTlugarr.setForeground(Color.black);
			 * inicio.lblTlugar.setForeground(Color.black);
			 * inicio.lblTlocalidad.setForeground(Color.black);
			 * inicio.lbllocalidad.setForeground(Color.black);
			 * inicio.bsciu.setForeground(Color.black);
			 * inicio.bstol.setForeground(Color.black);
			 * inicio.bscue.setForeground(Color.black);
			 * inicio.bsalb.setForeground(Color.black);
			 * inicio.bsgua.setForeground(Color.black);
			 * inicio.bsdefecto.setForeground(Color.black);
			 * inicio.bspnacional.setForeground(Color.black);
			 * inicio.bspnatural.setForeground(Color.black);
			 * inicio.bsrnatural.setForeground(Color.black);
			 * inicio.lbProvincia.setForeground(Color.black);
			 * inicio.bsmicroreserva.setForeground(Color.black);
			 * inicio.bsrfluvial.setForeground(Color.black);
			 * inicio.bsmonumentonatural.setForeground(Color.black);
			 * inicio.bspaisajeprotegido.setForeground(Color.black);
			 * inicio.lbtipo.setForeground(Color.black);
			 * inicio.bssinfiltro.setForeground(Color.black);
			 **/
		}
		
		if (e.getSource() == inicio.letraRojo) {
			/**
			 * inicio.lbcolor1.setForeground(Color.red);
			 * inicio.lbcolor2.setForeground(Color.red);
			 * inicio.lbcolor3.setForeground(Color.red);
			 * inicio.lbt1.setForeground(Color.red); inicio.lbt2.setForeground(Color.red);
			 * inicio.lbt3.setForeground(Color.red); inicio.lbmodt.setForeground(Color.red);
			 * inicio.btComprobar.setForeground(Color.red);
			 * inicio.btsalir.setForeground(Color.red);
			 * inicio.listalugares.setForeground(Color.red);
			 * inicio.lbLugar.setForeground(Color.red);
			 * inicio.lblTidr.setForeground(Color.red);
			 * inicio.lblTid.setForeground(Color.red);
			 * inicio.lblTlugarr.setForeground(Color.red);
			 * inicio.lblTlugar.setForeground(Color.red);
			 * inicio.lblTlocalidad.setForeground(Color.red);
			 * inicio.lbllocalidad.setForeground(Color.red);
			 * inicio.bsciu.setForeground(Color.red); inicio.bstol.setForeground(Color.red);
			 * inicio.bscue.setForeground(Color.red); inicio.bsalb.setForeground(Color.red);
			 * inicio.bsgua.setForeground(Color.red);
			 * inicio.bsdefecto.setForeground(Color.red);
			 * inicio.bspnacional.setForeground(Color.red);
			 * inicio.bspnatural.setForeground(Color.red);
			 * inicio.bsrnatural.setForeground(Color.red);
			 * inicio.lbProvincia.setForeground(Color.red);
			 * inicio.bsmicroreserva.setForeground(Color.red);
			 * inicio.bsrfluvial.setForeground(Color.red);
			 * inicio.bsmonumentonatural.setForeground(Color.red);
			 * inicio.bspaisajeprotegido.setForeground(Color.red);
			 * inicio.lbtipo.setForeground(Color.red);
			 * inicio.bssinfiltro.setForeground(Color.red);
			 **/
		}
		
		if (e.getSource() == inicio.letraVerde) {
			/**
			 * inicio.lbcolor1.setForeground(Color.green);
			 * inicio.lbcolor2.setForeground(Color.green);
			 * inicio.lbcolor3.setForeground(Color.green);
			 * inicio.lbt1.setForeground(Color.green);
			 * inicio.lbt2.setForeground(Color.green);
			 * inicio.lbt3.setForeground(Color.green);
			 * inicio.lbmodt.setForeground(Color.green);
			 * inicio.btComprobar.setForeground(Color.green);
			 * inicio.btsalir.setForeground(Color.green);
			 * inicio.listalugares.setForeground(Color.green);
			 * inicio.lbLugar.setForeground(Color.green);
			 * inicio.lblTidr.setForeground(Color.green);
			 * inicio.lblTid.setForeground(Color.green);
			 * inicio.lblTlugarr.setForeground(Color.green);
			 * inicio.lblTlugar.setForeground(Color.green);
			 * inicio.lblTlocalidad.setForeground(Color.green);
			 * inicio.lbllocalidad.setForeground(Color.green);
			 * inicio.bsciu.setForeground(Color.green);
			 * inicio.bstol.setForeground(Color.green);
			 * inicio.bscue.setForeground(Color.green);
			 * inicio.bsalb.setForeground(Color.green);
			 * inicio.bsgua.setForeground(Color.green);
			 * inicio.bsdefecto.setForeground(Color.green);
			 * inicio.bspnacional.setForeground(Color.green);
			 * inicio.bspnatural.setForeground(Color.green);
			 * inicio.bsrnatural.setForeground(Color.green);
			 * inicio.lbProvincia.setForeground(Color.green);
			 * inicio.bsmicroreserva.setForeground(Color.green);
			 * inicio.bsrfluvial.setForeground(Color.green);
			 * inicio.bsmonumentonatural.setForeground(Color.green);
			 * inicio.bspaisajeprotegido.setForeground(Color.green);
			 * inicio.lbtipo.setForeground(Color.green);
			 * inicio.bssinfiltro.setForeground(Color.green);
			 **/
		}
		
		if (e.getSource() == inicio.nuevoLetra) {
			/**
			 * inicio.lbcolor1.setForeground(nuevocolor);
			 * inicio.lbcolor2.setForeground(nuevocolor);
			 * inicio.lbcolor3.setForeground(nuevocolor);
			 * inicio.lbt1.setForeground(nuevocolor); inicio.lbt2.setForeground(nuevocolor);
			 * inicio.lbt3.setForeground(nuevocolor);
			 * inicio.lbmodt.setForeground(nuevocolor);
			 * inicio.btComprobar.setForeground(nuevocolor);
			 * inicio.btsalir.setForeground(nuevocolor);
			 * inicio.listalugares.setForeground(nuevocolor);
			 * inicio.lbLugar.setForeground(nuevocolor);
			 * inicio.lblTidr.setForeground(nuevocolor);
			 * inicio.lblTid.setForeground(nuevocolor);
			 * inicio.lblTlugarr.setForeground(nuevocolor);
			 * inicio.lblTlugar.setForeground(nuevocolor);
			 * inicio.lblTlocalidad.setForeground(nuevocolor);
			 * inicio.lbllocalidad.setForeground(nuevocolor);
			 * inicio.bsciu.setForeground(nuevocolor);
			 * inicio.bstol.setForeground(nuevocolor);
			 * inicio.bscue.setForeground(nuevocolor);
			 * inicio.bsalb.setForeground(nuevocolor);
			 * inicio.bsgua.setForeground(nuevocolor);
			 * inicio.bsdefecto.setForeground(nuevocolor);
			 * inicio.bspnacional.setForeground(nuevocolor);
			 * inicio.bspnatural.setForeground(nuevocolor);
			 * inicio.bsrnatural.setForeground(nuevocolor);
			 * inicio.lbProvincia.setForeground(nuevocolor);
			 * inicio.bsmicroreserva.setForeground(nuevocolor);
			 * inicio.bsrfluvial.setForeground(nuevocolor);
			 * inicio.bsmonumentonatural.setForeground(nuevocolor);
			 * inicio.bspaisajeprotegido.setForeground(nuevocolor);
			 * inicio.lbtipo.setForeground(nuevocolor);
			 * inicio.bssinfiltro.setForeground(nuevocolor);
			 **/
		}
		
		// MODIFICAR COLOR - CRER UN NUEVO COLOR PERSONALIZADO
		if (e.getSource() == inicio.crearColor) {
			inicio.panelPersonalizacion.setVisible(true);
			inicio.panelComunidades.setVisible(false);
			inicio.panelEdades.setVisible(false);
		}
		
		if (e.getSource() == inicio.btsalirpersonalizacion) {
			inicio.panelPersonalizacion.setVisible(false);
		}
		
		// COMPROBAR CREAR UN COLOR PERSONALIZADO
		if (e.getSource() == inicio.btcomprobarpersonalizacion) {
			// COMPROBAR PRIMER DIGITO
			if (codigoColor.contains(inicio.colorDigito1.getText())) {
				inicio.textocolordigito1.setText("Digito Valido.");
			} else {
				inicio.textocolordigito1.setText("Digito No Valido.");
			}
			
			// COMPROBAR SEGUNDO DIGITO
			if (codigoColor.contains(inicio.colorDigito2.getText())) {
				inicio.textocolordigito2.setText("Digito Valido.");
			} else {
				inicio.textocolordigito2.setText("Digito No Valido.");
			}
			
			// COMPROBAR TERCER DIGITO
			if (codigoColor.contains(inicio.colorDigito3.getText())) {
				inicio.textoColorDigito1.setText("Digito Valido.");
			} else {
				inicio.textoColorDigito1.setText("Digito No Valido.");
			}
			
			// MOSTRAR COLOR PERSONALIZADO
			if (codigoColor.contains(inicio.colorDigito3.getText())
					&& codigoColor.contains(inicio.colorDigito2.getText())
					&& codigoColor.contains(inicio.colorDigito1.getText())) {
				int d1 = Integer.parseInt(inicio.colorDigito1.getText());
				int d2 = Integer.parseInt(inicio.colorDigito2.getText());
				int d3 = Integer.parseInt(inicio.colorDigito3.getText());
				nuevoColor = new Color(d1, d2, d3);
				inicio.colorPrevisto.setBackground(nuevoColor);
			}

		}
		
		// MOSTRAR PANEL COMUNIDADES
		if (e.getSource() == inicio.btsalircomunidades) {
			inicio.panelComunidades.setVisible(false);
		}
		if (e.getSource() == inicio.mostrarComunidades) {
			inicio.panelComunidades.setVisible(true);
			inicio.panelEdades.setVisible(false);
		}
		
		// MOSTRAR PANEL EDADES
		if (e.getSource() == inicio.btsaliredades) {
			inicio.panelEdades.setVisible(false);
		}
		if (e.getSource() == inicio.mostrarEdades) {
			inicio.panelComunidades.setVisible(false);
			inicio.panelEdades.setVisible(true);
		}
		
		// OBTENER RESULTADOS POR EDAD
		// 18-26 AÑOS
		if (e.getSource() == inicio.bt18anios) {
			List<Resultado> r = new ArrayList<Resultado>();
			r = crearHilos.obtenerVotosEdad("RANGO_18_25");
			
			// 1 POSICION
			inicio.nombreedad1.setText(r.get(0).getArtista());
			int valor = r.get(0).getVotos();
			inicio.puntosedad1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				} else if (inicio.nombreedad1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				} else if (inicio.nombreedad1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				} else if (inicio.nombreedad1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				} else if (inicio.nombreedad1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				} else if (inicio.nombreedad1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				} else if (inicio.nombreedad1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				} else if (inicio.nombreedad1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				} else if (inicio.nombreedad1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				} else if (inicio.nombreedad1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
			}
			
			// 2 POSICION
			inicio.nombreedad2.setText(r.get(1).getArtista());
			valor = r.get(1).getVotos();
			inicio.puntosEdad2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				} else if (inicio.nombreedad2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				} else if (inicio.nombreedad2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				} else if (inicio.nombreedad2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				} else if (inicio.nombreedad2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				} else if (inicio.nombreedad2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				} else if (inicio.nombreedad2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				} else if (inicio.nombreedad2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				} else if (inicio.nombreedad2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				} else if (inicio.nombreedad2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
			}
			
			// 3 POSICION
			inicio.nombreedad3.setText(r.get(2).getArtista());
			valor = r.get(2).getVotos();
			inicio.puntosEdad3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				} else if (inicio.nombreedad3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				} else if (inicio.nombreedad3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				} else if (inicio.nombreedad3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				} else if (inicio.nombreedad3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				} else if (inicio.nombreedad3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				} else if (inicio.nombreedad3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				} else if (inicio.nombreedad3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				} else if (inicio.nombreedad3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				} else if (inicio.nombreedad3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
			}
		}
		
		if (e.getSource() == inicio.bt26anios) {
			List<Resultado> r = new ArrayList();
			r = crearHilos.obtenerVotosEdad("RANGO_26_40");
			// 1 POSICION
			inicio.nombreedad1.setText(r.get(0).getArtista());
			int valor = r.get(0).getVotos();
			inicio.puntosedad1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}

			}
			// 2 POSICION
			inicio.nombreedad2.setText(r.get(1).getArtista());
			valor = r.get(1).getVotos();
			inicio.puntosEdad2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
			}
			// 3 POSICION
			inicio.nombreedad3.setText(r.get(2).getArtista());
			valor = r.get(2).getVotos();
			inicio.puntosEdad3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
			}
		}
		if (e.getSource() == inicio.bt41anios) {
			List<Resultado> r = new ArrayList();
			r = crearHilos.obtenerVotosEdad("RANGO_41_65");
			// 1 POSICION
			inicio.nombreedad1.setText(r.get(0).getArtista());
			int valor = r.get(0).getVotos();
			inicio.puntosedad1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}

			}
			// 2 POSICION
			inicio.nombreedad2.setText(r.get(1).getArtista());
			valor = r.get(1).getVotos();
			inicio.puntosEdad2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
			}
			// 3 POSICION
			inicio.nombreedad3.setText(r.get(2).getArtista());
			valor = r.get(2).getVotos();
			inicio.puntosEdad3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
			}

		}
		if (e.getSource() == inicio.bt66anios) {
			List<Resultado> r = new ArrayList();
			r = crearHilos.obtenerVotosEdad("RANGO_MAS_66");
			// 1 POSICION
			inicio.nombreedad1.setText(r.get(0).getArtista());
			int valor = r.get(0).getVotos();
			inicio.puntosedad1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}
				if (inicio.nombreedad1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad1.setIcon(fotoed);
				}

			}
			// 2 POSICION
			inicio.nombreedad2.setText(r.get(1).getArtista());
			valor = r.get(1).getVotos();
			inicio.puntosEdad2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
				if (inicio.nombreedad2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad2.setIcon(fotoed);
				}
			}
			// 3 POSICION
			inicio.nombreedad3.setText(r.get(2).getArtista());
			valor = r.get(2).getVotos();
			inicio.puntosEdad3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreedad3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
				if (inicio.nombreedad3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftedad3.setIcon(fotoed);
				}
			}
		}
	}
}
