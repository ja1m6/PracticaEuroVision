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
import javax.swing.JOptionPane;

import persistencias.Cargador;
import persistencias.Resultado;

public class Controlador implements ActionListener {
	Vista inicio = new Vista();
	ArrayList<String> codigoColor = new ArrayList<String>();
	CreacionHilos crearHilos = new CreacionHilos();
	Color nuevoColor = new Color(0, 0, 0);

	public Controlador(Vista vista) {
		inicio = vista;
		
		// LLAMAMOS AL METODO CREAR VOTANTES DE LA CLASE CREACION HILOS
		crearHilos.generarVotantes();
		
		//OBTENEMOS LOS RESULTADOS GENERALES
		List<Resultado> resultados = new ArrayList<Resultado>();
		resultados=crearHilos.obtenerresultadosgenerales();
		this.inicio.nombreResultado1.setText(resultados.get(0).getArtista());
		this.inicio.nombreResultado2.setText(resultados.get(1).getArtista());
		this.inicio.nombreResultado3.setText(resultados.get(2).getArtista());
		this.inicio.votosResultado1.setText("VOTOS: "+String.valueOf(resultados.get(0).getVotos()));
		this.inicio.votosResultado2.setText("VOTOS: "+String.valueOf(resultados.get(1).getVotos()));
		this.inicio.votosResultado3.setText("VOTOS: "+String.valueOf(resultados.get(2).getVotos()));
		//PRIMERO
		if (resultados.get(0).getArtista().equals("Joel")) {
			ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
			Image fotoedt = fotoed.getImage(); // transform it
			Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
			fotoed = new ImageIcon(fotoedtt);
			inicio.resultados1.setIcon(fotoed);
		} else if (resultados.get(0).getArtista().equals("Marc")) {
			ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
			Image fotoedt = fotoed.getImage(); // transform it
			Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
			fotoed = new ImageIcon(fotoedtt);
			inicio.resultados1.setIcon(fotoed);
		} else if (resultados.get(0).getArtista().equals("Alba")) {
			ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
			Image fotoedt = fotoed.getImage(); // transform it
			Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
			fotoed = new ImageIcon(fotoedtt);
			inicio.resultados1.setIcon(fotoed);
		} else if (resultados.get(0).getArtista().equals("Thiago")) {
			ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
			Image fotoedt = fotoed.getImage(); // transform it
			Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
			fotoed = new ImageIcon(fotoedtt);
			inicio.resultados1.setIcon(fotoed);
		} else if (resultados.get(0).getArtista().equals("Amie")) {
			ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
			Image fotoedt = fotoed.getImage(); // transform it
			Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
			fotoed = new ImageIcon(fotoedtt);
			inicio.resultados1.setIcon(fotoed);
		} else if (resultados.get(0).getArtista().equals("Sarah")) {
			ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
			Image fotoedt = fotoed.getImage(); // transform it
			Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
			fotoed = new ImageIcon(fotoedtt);
			inicio.resultados1.setIcon(fotoed);
		} else if (resultados.get(0).getArtista().equals("Nahid")) {
			ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
			Image fotoedt = fotoed.getImage(); // transform it
			Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
			fotoed = new ImageIcon(fotoedtt);
			inicio.resultados1.setIcon(fotoed);
		} else if (resultados.get(0).getArtista().equals("Julio")) {
			ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
			Image fotoedt = fotoed.getImage(); // transform it
			Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
			fotoed = new ImageIcon(fotoedtt);
			inicio.resultados1.setIcon(fotoed);
		} else if (resultados.get(0).getArtista().equals("Elton")) {
			ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
			Image fotoedt = fotoed.getImage(); // transform it
			Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
			fotoed = new ImageIcon(fotoedtt);
			inicio.resultados1.setIcon(fotoed);
		} else if (resultados.get(0).getArtista().equals("Victoria")) {
			ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
			Image fotoedt = fotoed.getImage(); // transform it
			Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
			fotoed = new ImageIcon(fotoedtt);
			inicio.resultados1.setIcon(fotoed);
		}
		//SEGUNDO
				if (resultados.get(1).getArtista().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados2.setIcon(fotoed);
				} else if (resultados.get(1).getArtista().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados2.setIcon(fotoed);
				} else if (resultados.get(1).getArtista().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados2.setIcon(fotoed);
				} else if (resultados.get(1).getArtista().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados2.setIcon(fotoed);
				} else if (resultados.get(1).getArtista().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados2.setIcon(fotoed);
				} else if (resultados.get(1).getArtista().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados2.setIcon(fotoed);
				} else if (resultados.get(1).getArtista().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados2.setIcon(fotoed);
				} else if (resultados.get(1).getArtista().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados2.setIcon(fotoed);
				} else if (resultados.get(1).getArtista().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados2.setIcon(fotoed);
				} else if (resultados.get(1).getArtista().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados1.setIcon(fotoed);
				}
				//TERCERO
				if (resultados.get(2).getArtista().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados3.setIcon(fotoed);
				} else if (resultados.get(2).getArtista().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados3.setIcon(fotoed);
				} else if (resultados.get(2).getArtista().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados3.setIcon(fotoed);
				} else if (resultados.get(2).getArtista().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados3.setIcon(fotoed);
				} else if (resultados.get(2).getArtista().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados3.setIcon(fotoed);
				} else if (resultados.get(2).getArtista().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados3.setIcon(fotoed);
				} else if (resultados.get(2).getArtista().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados3.setIcon(fotoed);
				} else if (resultados.get(2).getArtista().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados3.setIcon(fotoed);
				} else if (resultados.get(2).getArtista().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados3.setIcon(fotoed);
				} else if (resultados.get(2).getArtista().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.resultados3.setIcon(fotoed);
				}
		
		
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
		this.inicio.fondoRojo.addActionListener(this);
		this.inicio.fondoBlanco.addActionListener(this);
		this.inicio.nuevoFondo.addActionListener(this);
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
		this.inicio.btcantabria.addActionListener(this);
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
		this.inicio.botonempezar.addActionListener(this);
		this.inicio.botonverresultados.addActionListener(this);

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
		//PASAR DE PANEL PRINCIPAL A CARGA
		if(e.getSource()==inicio.botonverresultados) {
			if(inicio.procesocargar.getValue()!=100) {
				JOptionPane.showMessageDialog(null,"Proceso de Carga no Finalizado.");
			}else {
				inicio.panelcargar.setVisible(false);
				inicio.menuVerVotosporComunidad.setVisible(true);
				inicio.menuVerVotosporEdad.setVisible(true);
			}
		}
		if(e.getSource()==inicio.botonempezar) {
			inicio.panelinicio.setVisible(false);
			inicio.panelcargar.setVisible(true);
			Cargador c=new Cargador(inicio.procesocargar);
			c.start();
		}
		//CAMBIAR COLOR LETRA
				if (e.getSource() == inicio.nuevoLetra) {
					inicio.botonempezar.setForeground(nuevoColor);
					inicio.btcomprobarpersonalizacion.setForeground(nuevoColor);
					inicio.btsalirpersonalizacion.setForeground(nuevoColor);
					inicio.crearColor.setForeground(nuevoColor);
					inicio.fondoAzul.setForeground(nuevoColor);
					inicio.btsalircomunidades.setForeground(nuevoColor);
					inicio.mostrarComunidades.setForeground(nuevoColor);
					inicio.mostrarEdades.setForeground(nuevoColor);
					inicio.btsaliredades.setForeground(nuevoColor);
					inicio.bt18anios.setForeground(nuevoColor);
					inicio.bt26anios.setForeground(nuevoColor);
					inicio.bt41anios.setForeground(nuevoColor);
					inicio.bt66anios.setForeground(nuevoColor);
					inicio.btnAndalucia.setForeground(nuevoColor);
					inicio.btaragon.setForeground(nuevoColor);
					inicio.btasturias.setForeground(nuevoColor);
					inicio.bislasbaleares.setForeground(nuevoColor);
					inicio.bislascanarias.setForeground(nuevoColor);
					inicio.btcastillaleon.setForeground(nuevoColor);
					inicio.btnCastillaLaMancha.setForeground(nuevoColor);
					inicio.btcantabria.setForeground(nuevoColor);
					inicio.btnCatalunia.setForeground(nuevoColor);
					inicio.bceuta.setForeground(nuevoColor);
					inicio.btvalencia.setForeground(nuevoColor);
					inicio.btextremadura.setForeground(nuevoColor);
					inicio.btgalicia.setForeground(nuevoColor);
					inicio.btlarioja.setForeground(nuevoColor);
					inicio.btmadrid.setForeground(nuevoColor);
					inicio.bmelilla.setForeground(nuevoColor);
					inicio.btmurcia.setForeground(nuevoColor);
					inicio.btnavarra.setForeground(nuevoColor);
					inicio.btpaisvasco.setForeground(nuevoColor);
				}
		// CAMBIAR COLOR FONDO
		if (e.getSource() == inicio.fondoAzul) {
			inicio.contentPane.setBackground(Color.blue);
			inicio.panelPersonalizacion.setBackground(Color.blue);
			inicio.panelComunidades.setBackground(Color.blue);
			inicio.bceuta.setBackground(Color.blue);
			inicio.bmelilla.setBackground(Color.blue);
			inicio.bislasbaleares.setBackground(Color.blue);
			inicio.bislascanarias.setBackground(Color.blue);
			inicio.panelinicio.setBackground(Color.blue);
		}
		
		if (e.getSource() == inicio.fondoBlanco) {
			inicio.contentPane.setBackground(Color.white);
			inicio.panelPersonalizacion.setBackground(Color.white);
			inicio.panelComunidades.setBackground(Color.white);
			inicio.bceuta.setBackground(Color.white);
			inicio.bmelilla.setBackground(Color.white);
			inicio.bislasbaleares.setBackground(Color.white);
			inicio.bislascanarias.setBackground(Color.white);
			inicio.panelinicio.setBackground(Color.white);
		}
		if (e.getSource() == inicio.fondoNegro) {
			inicio.contentPane.setBackground(Color.black);
			inicio.panelPersonalizacion.setBackground(Color.black);
			inicio.panelComunidades.setBackground(Color.black);
			inicio.bceuta.setBackground(Color.black);
			inicio.bmelilla.setBackground(Color.black);
			inicio.bislasbaleares.setBackground(Color.black);
			inicio.bislascanarias.setBackground(Color.black);
			inicio.panelinicio.setBackground(Color.black);
		}
		
		if (e.getSource() == inicio.fondoRojo) {
			inicio.contentPane.setBackground(Color.red);
			inicio.panelPersonalizacion.setBackground(Color.red);
			inicio.panelComunidades.setBackground(Color.red);
			inicio.bceuta.setBackground(Color.red);
			inicio.bmelilla.setBackground(Color.red);
			inicio.bislasbaleares.setBackground(Color.red);
			inicio.bislascanarias.setBackground(Color.red);
			inicio.panelinicio.setBackground(Color.red);
		}
		
		if (e.getSource() == inicio.nuevoFondo) {
			inicio.contentPane.setBackground(nuevoColor);
			inicio.panelPersonalizacion.setBackground(nuevoColor);
			inicio.panelComunidades.setBackground(nuevoColor);
			inicio.bceuta.setBackground(nuevoColor);
			inicio.bmelilla.setBackground(nuevoColor);
			inicio.bislasbaleares.setBackground(nuevoColor);
			inicio.bislascanarias.setBackground(nuevoColor);
			inicio.panelinicio.setBackground(nuevoColor);
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
		// OBTENER RESULTADOR POR COMUNIDAD
		//ANDALUCIA
		if(e.getSource()==inicio.btnAndalucia) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Andalucia");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		}
		if(e.getSource()==inicio.btpaisvasco) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Pais Vasco");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btnavarra) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Navarra");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btmurcia) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Murcia");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.bmelilla) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Melilla");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btmadrid) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Madrid");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btlarioja) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("La Rioja");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btgalicia) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Galicia");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btextremadura) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Extremadura");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btvalencia) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Comunidad Valenciana");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.bceuta) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Ceuta");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btcastillaleon) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Castilla y Leon");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btnCastillaLaMancha) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Castilla La Mancha");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btcantabria) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Cantabria");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btnCatalunia) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Catalunia");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.bislascanarias) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Canarias");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.bislasbaleares) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Baleares");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btaragon) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Aragon");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
		}
		if(e.getSource()==inicio.btasturias) {
			List<Resultado> r = new ArrayList<Resultado>();
			r=crearHilos.obtenerVotosComunidad("Asturias");
			//1 POSICION 
			inicio.nombreComun1.setText(r.get(0).getArtista());
			int valor=r.get(0).getVotos();
			inicio.puntoscomun1.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun1.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				} else if (inicio.nombreComun1.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad1.setIcon(fotoed);
				}
			}
			//2 POSICION 
			inicio.nombreComun2.setText(r.get(1).getArtista());
			 valor=r.get(1).getVotos();
			inicio.puntoscomun2.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun2.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				} else if (inicio.nombreComun2.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad2.setIcon(fotoed);
				}
			}
			//3 POSICION 
			inicio.nombreComun3.setText(r.get(2).getArtista());
			 valor=r.get(2).getVotos();
			inicio.puntoscomun3.setText(String.valueOf(valor));
			for (int i = 0; i < artista.size(); i++) {
				if (inicio.nombreComun3.getText().equals("Joel")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante1.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Marc")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante8.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Alba")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante9.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Thiago")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante3.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Amie")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante6.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Sarah")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante4.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Nahid")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante7.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Julio")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante10.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Elton")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante5.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				} else if (inicio.nombreComun3.getText().equals("Victoria")) {
					ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/cantante2.png"));
					Image fotoedt = fotoed.getImage(); // transform it
					Image fotoedtt = fotoedt.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
					fotoed = new ImageIcon(fotoedtt);
					inicio.ftcomunidad3.setIcon(fotoed);
				}
			}
		
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
