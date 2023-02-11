package Controlador;

import vista.Vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador implements ActionListener {
	Vista inicio = new Vista();
	ArrayList<String> codigocolor = new ArrayList<String>();
	Color nuevocolor = new Color(0, 0, 0);

	public Controlador(Vista vista) {
		inicio = vista;

		// COLORES INTERFAZ
		for (int u = 0; u < 256; u++) {
			codigocolor.add(String.valueOf(u));
		}

		// LISTENER BOTONES
		this.inicio.btcomprobarpersonalizacion.addActionListener(this);
		this.inicio.btsalirpersonalizacion.addActionListener(this);
		this.inicio.crearcolor.addActionListener(this);
		this.inicio.fondoazul.addActionListener(this);
		this.inicio.fondonegro.addActionListener(this);
		this.inicio.fondoverde.addActionListener(this);
		this.inicio.fondorojo.addActionListener(this);
		this.inicio.fondoblanco.addActionListener(this);
		this.inicio.nuevofondo.addActionListener(this);
		this.inicio.letraazul.addActionListener(this);
		this.inicio.letrablanco.addActionListener(this);
		this.inicio.letranegro.addActionListener(this);
		this.inicio.letrarojo.addActionListener(this);
		this.inicio.letraverde.addActionListener(this);
		this.inicio.nuevoletra.addActionListener(this);
		this.inicio.btsalircomunidades.addActionListener(this);
		this.inicio.mostrarcomunidades.addActionListener(this);
		this.inicio.mostraredades.addActionListener(this);
		this.inicio.btsaliredades.addActionListener(this);
		
		// LLAMAMOS AL METODO CREAR VOTANTES DE LA CLASE CREACION HILOS
		CreacionHilos crearHilos = new CreacionHilos();
		//crearHilos.generarVotantes();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Cambiar Color Fondo
		if (e.getSource() == inicio.fondoazul) {
			inicio.contentPane.setBackground(Color.blue);
			inicio.ppersonalizacion.setBackground(Color.blue);
			inicio.panelcomunidades.setBackground(Color.blue);
		}
		if (e.getSource() == inicio.fondoblanco) {
			inicio.contentPane.setBackground(Color.white);
			inicio.ppersonalizacion.setBackground(Color.white);
			inicio.panelcomunidades.setBackground(Color.white);
		}
		if (e.getSource() == inicio.fondoverde) {
			inicio.contentPane.setBackground(Color.green);
			inicio.ppersonalizacion.setBackground(Color.green);
			inicio.panelcomunidades.setBackground(Color.green);
		}
		if (e.getSource() == inicio.fondonegro) {
			inicio.contentPane.setBackground(Color.black);
			inicio.ppersonalizacion.setBackground(Color.black);
			inicio.panelcomunidades.setBackground(Color.black);
		}
		if (e.getSource() == inicio.fondorojo) {
			inicio.contentPane.setBackground(Color.red);
			inicio.ppersonalizacion.setBackground(Color.red);
			inicio.panelcomunidades.setBackground(Color.red);
		}
		if (e.getSource() == inicio.nuevofondo) {
			inicio.contentPane.setBackground(nuevocolor);
			inicio.ppersonalizacion.setBackground(nuevocolor);
			inicio.panelcomunidades.setBackground(nuevocolor);
		}
		// Cambiar Color Letra
		if (e.getSource() == inicio.letraazul) {
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
		if (e.getSource() == inicio.letrablanco) {
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
		if (e.getSource() == inicio.letranegro) {
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
		if (e.getSource() == inicio.letrarojo) {
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
		if (e.getSource() == inicio.letraverde) {
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
		if (e.getSource() == inicio.nuevoletra) {
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
		// MODIFICAR COLOR
		if (e.getSource() == inicio.crearcolor) {
			inicio.ppersonalizacion.setVisible(true);
			inicio.panelcomunidades.setVisible(false);
			inicio.paneledades.setVisible(false);
		}
		if (e.getSource() == inicio.btsalirpersonalizacion) {
			inicio.ppersonalizacion.setVisible(false);
		}
		// Comprobacion crear nuevo color
		if (e.getSource() == inicio.btcomprobarpersonalizacion) {
			// Comparar primer digito
			if (codigocolor.contains(inicio.colordigito1.getText())) {
				inicio.textocolordigito1.setText("Digito Valido.");
			} else {
				inicio.textocolordigito1.setText("Digito No Valido.");
			}
			// Comparar segundo digito
			if (codigocolor.contains(inicio.colordigito2.getText())) {
				inicio.textocolordigito2.setText("Digito Valido.");
			} else {
				inicio.textocolordigito2.setText("Digito No Valido.");
			}
			// Comparar tercer digito
			if (codigocolor.contains(inicio.colordigito3.getText())) {
				inicio.textocolordigito3.setText("Digito Valido.");
			} else {
				inicio.textocolordigito3.setText("Digito No Valido.");
			}
			// Mostrar Color
			if (codigocolor.contains(inicio.colordigito3.getText())
					&& codigocolor.contains(inicio.colordigito2.getText())
					&& codigocolor.contains(inicio.colordigito1.getText())) {
				int d1 = Integer.parseInt(inicio.colordigito1.getText());
				int d2 = Integer.parseInt(inicio.colordigito2.getText());
				int d3 = Integer.parseInt(inicio.colordigito3.getText());
				nuevocolor = new Color(d1, d2, d3);
				inicio.colorprevisto.setBackground(nuevocolor);
			}

		}
		// Mostrar Panel Comunidades
		if (e.getSource() == inicio.btsalircomunidades) {
			inicio.panelcomunidades.setVisible(false);
		}
		if (e.getSource() == inicio.mostrarcomunidades) {
			inicio.panelcomunidades.setVisible(true);
			inicio.paneledades.setVisible(false);
		}
		// Mostrar Panel EDADES
				if (e.getSource() == inicio.btsaliredades) {
					inicio.paneledades.setVisible(false);
				}
				if (e.getSource() == inicio.mostraredades) {
					inicio.panelcomunidades.setVisible(false);
					inicio.paneledades.setVisible(true);
				}
	}
}
