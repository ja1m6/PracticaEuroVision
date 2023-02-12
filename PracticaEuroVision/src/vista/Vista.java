package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import Controlador.Controlador;
import vista.Vista;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Vista extends JFrame {

	public JPanel contentPane, panelPersonalizacion, colorPrevisto, panelComunidades, panelEdades;

	public JButton btsalirpersonalizacion, btcastillaleon, btasturias, btcomprobarpersonalizacion, btsalircomunidades,
			btgalicia, btnavarra, btcantabria, btsaliredades, bt18anios, btpaisvasco, bt26anios, bt41anios, bt66anios;

	public JLabel nombreedad1, resultados3, podioResultados, votosResultado1, votosResultado2, votosResultado3,
			imagenfondoresultados, resultados2, resultados1, puntoscomun1, puntoscomun2, puntoscomun3, puntosedad1,
			ftedad1, puntosEdad2, puntosEdad3, puntosedad3ftedad1, ftedad2, ftedad3, nombreedad2, nombreedad3,
			label_imgBenidormF, mapaEdades, textovistapreviap, textoColorDigito1, textocolordigito2, textocolordigito1,
			textoColor1, textoColor2, textoColor3, mapaComunidades, ftcomunidad1, ftcomunidad2, ftcomunidad3,
			nombreComun1, nombreComun2, nombreComun3;

	public JTextField colorDigito1, colorDigito2, colorDigito3;

	public JMenuBar menuBar;

	public JMenu menuFondo, menuCuadros, menuLetra, menuColorFondo, menuColorLetras, menuColorCuadros, menuColorNuevo,
			menuVerVotosporComunidad, menuPersonalizacion, menuVerVotosporEdad;

	public JMenuItem fondoRojo, mostrarEdades, fondoNegro, fondoAzul, fondoBlanco, crearColor, fondoVerde, nuevoFondo,
			nuevoCuadro, nuevoLetra, cuadroVerde, cuadroBlanco, cuadroNegro, cuadroAzul, cuadroRojo, letraRojo,
			letraNegro, letraAzul, letraBlanco, letraGris, letraVerde, mostrarComunidades;

	public JButton btnCatalunia, btnCastillaLaMancha, btextremadura, btnAndalucia, btaragon, btmurcia, bislasbaleares,
			btvalencia, btmadrid, btlarioja, bislascanarias, bceuta, bmelilla;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista vista = new Vista();
					vista.setVisible(true);
					vista.setResizable(false);
					vista.setLocationRelativeTo(null);
					Controlador controlador = new Controlador(vista);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Vista() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vista.class.getResource("/vista/img/icono.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 750);
		setTitle("BenidormFest");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// MENU OPCIONES
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menuPersonalizacion = new JMenu("Personalizacion");
		menuPersonalizacion.setFont(new Font("Andale Mono", 1, 14));
		menuBar.add(menuPersonalizacion);

		menuFondo = new JMenu("Fondo");
		menuFondo.setFont(new Font("Andale Mono", 1, 14));
		menuPersonalizacion.add(menuFondo);

		menuCuadros = new JMenu("Recuadros");
		menuCuadros.setFont(new Font("Andale Mono", 1, 14));
		menuPersonalizacion.add(menuCuadros);

		menuLetra = new JMenu("Letras");
		menuLetra.setFont(new Font("Andale Mono", 1, 14));
		menuPersonalizacion.add(menuLetra);

		menuColorNuevo = new JMenu("Color Nuevo");
		menuColorNuevo.setFont(new Font("Andale Mono", 1, 14));
		menuPersonalizacion.add(menuColorNuevo);

		menuVerVotosporComunidad = new JMenu("Votos Comunidad");
		menuVerVotosporComunidad.setFont(new Font("Andale Mono", 1, 14));
		menuBar.add(menuVerVotosporComunidad);

		mostrarComunidades = new JMenuItem("Mostrar");
		mostrarComunidades.setFont(new Font("Andale Mono", 1, 14));
		menuVerVotosporComunidad.add(mostrarComunidades);

		menuVerVotosporEdad = new JMenu("Votos Edades");
		menuVerVotosporEdad.setFont(new Font("Andale Mono", 1, 14));
		menuBar.add(menuVerVotosporEdad);

		mostrarEdades = new JMenuItem("Mostrar");
		mostrarEdades.setFont(new Font("Andale Mono", 1, 14));
		menuVerVotosporEdad.add(mostrarEdades);

		crearColor = new JMenuItem("Crear");
		crearColor.setFont(new Font("Andale Mono", 1, 14));
		menuColorNuevo.add(crearColor);

		menuColorFondo = new JMenu("Color de fondo");
		menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
		menuFondo.add(menuColorFondo);

		menuColorLetras = new JMenu("Color de Letra");
		menuColorLetras.setFont(new Font("Andale Mono", 1, 14));
		menuLetra.add(menuColorLetras);

		menuColorCuadros = new JMenu("Color de Recuadros");
		menuColorCuadros.setFont(new Font("Andale Mono", 1, 14));
		menuCuadros.add(menuColorCuadros);

		nuevoCuadro = new JMenuItem("Nuevo Color");
		nuevoCuadro.setFont(new Font("Andale Mono", 1, 14));
		menuCuadros.add(nuevoCuadro);

		cuadroRojo = new JMenuItem("Rojo");
		cuadroRojo.setFont(new Font("Andale Mono", 1, 14));
		menuColorCuadros.add(cuadroRojo);

		cuadroNegro = new JMenuItem("Negro");
		cuadroNegro.setFont(new Font("Andale Mono", 1, 14));
		menuColorCuadros.add(cuadroNegro);

		cuadroVerde = new JMenuItem("Verde");
		cuadroVerde.setFont(new Font("Andale Mono", 1, 14));
		menuColorCuadros.add(cuadroVerde);

		cuadroAzul = new JMenuItem("Azul");
		cuadroAzul.setFont(new Font("Andale Mono", 1, 14));
		menuColorCuadros.add(cuadroAzul);

		cuadroBlanco = new JMenuItem("Blanco");
		cuadroBlanco.setFont(new Font("Andale Mono", 1, 14));
		menuColorCuadros.add(cuadroBlanco);

		letraRojo = new JMenuItem("Rojo");
		letraRojo.setFont(new Font("Andale Mono", 1, 14));
		menuColorLetras.add(letraRojo);

		letraNegro = new JMenuItem("Negro");
		letraNegro.setFont(new Font("Andale Mono", 1, 14));
		menuColorLetras.add(letraNegro);

		letraVerde = new JMenuItem("Verde");
		letraVerde.setFont(new Font("Andale Mono", 1, 14));
		menuColorLetras.add(letraVerde);

		letraAzul = new JMenuItem("Azul");
		letraAzul.setFont(new Font("Andale Mono", 1, 14));
		menuColorLetras.add(letraAzul);

		letraBlanco = new JMenuItem("Blanco");
		letraBlanco.setFont(new Font("Andale Mono", 1, 14));
		menuColorLetras.add(letraBlanco);

		nuevoLetra = new JMenuItem("Nuevo Color");
		nuevoLetra.setFont(new Font("Andale Mono", 1, 14));
		menuLetra.add(nuevoLetra);

		fondoRojo = new JMenuItem("Rojo");
		fondoRojo.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.add(fondoRojo);

		fondoNegro = new JMenuItem("Negro");
		fondoNegro.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.add(fondoNegro);

		fondoAzul = new JMenuItem("Azul");
		fondoAzul.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.add(fondoAzul);

		fondoVerde = new JMenuItem("Verde");
		fondoVerde.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.add(fondoVerde);

		fondoBlanco = new JMenuItem("Blanco");
		fondoBlanco.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.add(fondoBlanco);

		nuevoFondo = new JMenuItem("Nuevo Color");
		nuevoFondo.setFont(new Font("Andale Mono", 1, 14));
		menuFondo.add(nuevoFondo);

		// Panel EDADES
		panelEdades = new JPanel();
		panelEdades.setBackground(Color.WHITE);
		panelEdades.setBounds(0, 0, 1236, 688);
		contentPane.add(panelEdades);
		panelEdades.setLayout(null);
		panelEdades.setVisible(false);

		// AGREAR FUNCIONES PANEL EDADES

		btsaliredades = new JButton("Salir");
		btsaliredades.setBounds(0, 0, 128, 44);
		btsaliredades.setFont(new Font("Andale Mono", 1, 14));
		panelEdades.add(btsaliredades);

		ImageIcon fotoedad1 = new ImageIcon(Vista.class.getResource("/vista/img/interro.jpg"));
		Image fotoedad1t = fotoedad1.getImage(); // transform it
		Image fotoedad1tt = fotoedad1t.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		fotoedad1 = new ImageIcon(fotoedad1tt);
		ftedad1 = new JLabel(fotoedad1);
		ftedad1.setBounds(10, 155, 135, 135);
		panelEdades.add(ftedad1);

		ImageIcon fotoedad2 = new ImageIcon(Vista.class.getResource("/vista/img/interro.jpg"));
		Image fotoedad2t = fotoedad2.getImage(); // transform it
		Image fotoedad2tt = fotoedad2t.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		fotoedad2 = new ImageIcon(fotoedad2tt);
		ftedad2 = new JLabel(fotoedad2);
		ftedad2.setBounds(10, 311, 135, 135);
		panelEdades.add(ftedad2);

		ImageIcon fotoedad3 = new ImageIcon(Vista.class.getResource("/vista/img/interro.jpg"));
		Image fotoedad3t = fotoedad3.getImage(); // transform it
		Image fotoedad3tt = fotoedad3t.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		fotoedad3 = new ImageIcon(fotoedad3tt);
		ftedad3 = new JLabel(fotoedad3);
		ftedad3.setBounds(10, 466, 135, 135);
		panelEdades.add(ftedad3);

		nombreedad1 = new JLabel("?");
		nombreedad1.setHorizontalAlignment(SwingConstants.CENTER);
		nombreedad1.setBounds(155, 188, 97, 35);
		nombreedad1.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		panelEdades.add(nombreedad1);

		nombreedad2 = new JLabel("?");
		nombreedad2.setHorizontalAlignment(SwingConstants.CENTER);
		nombreedad2.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		nombreedad2.setBounds(155, 346, 97, 35);
		panelEdades.add(nombreedad2);

		nombreedad3 = new JLabel("?");
		nombreedad3.setHorizontalAlignment(SwingConstants.CENTER);
		nombreedad3.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		nombreedad3.setBounds(155, 500, 97, 35);
		panelEdades.add(nombreedad3);

		puntosedad1 = new JLabel("PTS. ?");
		puntosedad1.setHorizontalAlignment(SwingConstants.CENTER);
		puntosedad1.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		puntosedad1.setBounds(139, 229, 134, 35);
		panelEdades.add(puntosedad1);

		puntosEdad2 = new JLabel("PTS. ?");
		puntosEdad2.setHorizontalAlignment(SwingConstants.CENTER);
		puntosEdad2.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		puntosEdad2.setBounds(139, 380, 134, 35);
		panelEdades.add(puntosEdad2);

		puntosEdad3 = new JLabel("PTS. ?");
		puntosEdad3.setHorizontalAlignment(SwingConstants.CENTER);
		puntosEdad3.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		puntosEdad3.setBounds(139, 544, 134, 35);
		panelEdades.add(puntosEdad3);

		bt18anios = new JButton("18-25 AÑOS");
		bt18anios.setFocusCycleRoot(true);
		bt18anios.setHorizontalTextPosition(SwingConstants.CENTER);
		bt18anios.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		bt18anios.setActionCommand("");
		bt18anios.setBounds(388, 184, 148, 44);
		bt18anios.setBackground(panelEdades.getBackground());
		bt18anios.setBorderPainted(false);
		panelEdades.add(bt18anios);

		bt26anios = new JButton("26-40 AÑOS");
		bt26anios.setHorizontalTextPosition(SwingConstants.CENTER);
		bt26anios.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		bt26anios.setFocusCycleRoot(true);
		bt26anios.setBorderPainted(false);
		bt26anios.setBackground(Color.WHITE);
		bt26anios.setActionCommand("");
		bt26anios.setBounds(551, 121, 148, 44);
		panelEdades.add(bt26anios);

		bt41anios = new JButton("41-65 AÑOS");
		bt41anios.setHorizontalTextPosition(SwingConstants.CENTER);
		bt41anios.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		bt41anios.setFocusCycleRoot(true);
		bt41anios.setBorderPainted(false);
		bt41anios.setBackground(Color.WHITE);
		bt41anios.setActionCommand("");
		bt41anios.setBounds(737, 13, 148, 44);
		panelEdades.add(bt41anios);

		bt66anios = new JButton("66 Y MAS AÑOS");
		bt66anios.setHorizontalTextPosition(SwingConstants.CENTER);
		bt66anios.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		bt66anios.setFocusCycleRoot(true);
		bt66anios.setBorderPainted(false);
		bt66anios.setBackground(Color.WHITE);
		bt66anios.setActionCommand("");
		bt66anios.setBounds(931, 69, 148, 44);
		panelEdades.add(bt66anios);

		ImageIcon fotoed = new ImageIcon(Vista.class.getResource("/vista/img/mapa_edades.png"));
		Image fotoedt = fotoed.getImage(); // transform it
		Image fotoedtt = fotoedt.getScaledInstance(943, 678, java.awt.Image.SCALE_SMOOTH);
		fotoed = new ImageIcon(fotoedtt);
		mapaEdades = new JLabel(fotoed);
		mapaEdades.setBounds(283, 0, 943, 678);
		panelEdades.add(mapaEdades);

		// Panel para Crear Color
		panelPersonalizacion = new JPanel();
		panelPersonalizacion.setBackground(Color.WHITE);
		panelPersonalizacion.setBounds(0, 0, 777, 442);
		contentPane.add(panelPersonalizacion);
		panelPersonalizacion.setLayout(null);
		panelPersonalizacion.setVisible(false);

		textoColor1 = new JLabel("Primer Digito");
		textoColor1.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		textoColor1.setHorizontalAlignment(SwingConstants.CENTER);
		textoColor1.setBounds(24, 106, 174, 35);
		panelPersonalizacion.add(textoColor1);

		textoColor2 = new JLabel("Segundo Digito");
		textoColor2.setHorizontalAlignment(SwingConstants.CENTER);
		textoColor2.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		textoColor2.setBounds(24, 198, 174, 35);
		panelPersonalizacion.add(textoColor2);

		textoColor3 = new JLabel("Tercer Digito");
		textoColor3.setHorizontalAlignment(SwingConstants.CENTER);
		textoColor3.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		textoColor3.setBounds(24, 282, 174, 35);
		panelPersonalizacion.add(textoColor3);

		colorDigito1 = new JTextField();
		colorDigito1.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 13));
		colorDigito1.setBounds(67, 133, 96, 35);
		panelPersonalizacion.add(colorDigito1);
		colorDigito1.setColumns(10);

		colorDigito2 = new JTextField();
		colorDigito2.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 13));
		colorDigito2.setColumns(10);
		colorDigito2.setBounds(67, 231, 96, 35);
		panelPersonalizacion.add(colorDigito2);

		colorDigito3 = new JTextField();
		colorDigito3.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 13));
		colorDigito3.setColumns(10);
		colorDigito3.setBounds(67, 316, 96, 35);
		panelPersonalizacion.add(colorDigito3);

		textocolordigito1 = new JLabel("Inserte Digito (0...250)");
		textocolordigito1.setHorizontalAlignment(SwingConstants.CENTER);
		textocolordigito1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		textocolordigito1.setBounds(153, 133, 174, 35);
		panelPersonalizacion.add(textocolordigito1);

		textocolordigito2 = new JLabel("Inserte Digito (0...250)");
		textocolordigito2.setHorizontalAlignment(SwingConstants.CENTER);
		textocolordigito2.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		textocolordigito2.setBounds(153, 231, 174, 35);
		panelPersonalizacion.add(textocolordigito2);

		textoColorDigito1 = new JLabel("Inserte Digito (0...250)");
		textoColorDigito1.setHorizontalAlignment(SwingConstants.CENTER);
		textoColorDigito1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		textoColorDigito1.setBounds(153, 316, 174, 35);
		panelPersonalizacion.add(textoColorDigito1);

		colorPrevisto = new JPanel();
		colorPrevisto.setBackground(Color.BLACK);
		colorPrevisto.setBounds(458, 88, 228, 229);
		panelPersonalizacion.add(colorPrevisto);

		textovistapreviap = new JLabel("Vista Previa");
		textovistapreviap.setHorizontalAlignment(SwingConstants.CENTER);
		textovistapreviap.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 25));
		textovistapreviap.setBounds(494, 43, 174, 35);
		panelPersonalizacion.add(textovistapreviap);

		btcomprobarpersonalizacion = new JButton("Comprobar");
		btcomprobarpersonalizacion.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 14));
		btcomprobarpersonalizacion.setBounds(127, 377, 131, 35);
		panelPersonalizacion.add(btcomprobarpersonalizacion);

		btsalirpersonalizacion = new JButton("Salir");
		btsalirpersonalizacion.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 14));
		btsalirpersonalizacion.setBounds(555, 377, 131, 35);
		panelPersonalizacion.add(btsalirpersonalizacion);

		// Panel Comunidades
		panelComunidades = new JPanel();
		panelComunidades.setBackground(Color.WHITE);
		panelComunidades.setBounds(0, 0, 1236, 688);
		contentPane.add(panelComunidades);
		panelComunidades.setLayout(null);
		panelComunidades.setVisible(false);
		// Botones Comunidades
		Color colorboton = new Color(161, 233, 213);

		btmadrid = new JButton("MADRID");
		btmadrid.setHorizontalTextPosition(SwingConstants.CENTER);
		btmadrid.setFont(new Font("Yu Gothic Medium", Font.BOLD, 5));
		btmadrid.setFocusCycleRoot(true);
		btmadrid.setBorderPainted(false);
		btmadrid.setBackground(new Color(161, 233, 213));
		btmadrid.setActionCommand("");
		btmadrid.setBounds(627, 229, 58, 38);
		panelComunidades.add(btmadrid);
		btvalencia = new JButton("C.V");
		btvalencia.setHorizontalTextPosition(SwingConstants.CENTER);
		btvalencia.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		btvalencia.setFocusCycleRoot(true);
		btvalencia.setBorderPainted(false);
		btvalencia.setBackground(colorboton);
		btvalencia.setActionCommand("");
		btvalencia.setBounds(841, 298, 58, 44);
		panelComunidades.add(btvalencia);

		btsalircomunidades = new JButton("Salir");
		btsalircomunidades.setBounds(0, 0, 128, 44);
		btsalircomunidades.setFont(new Font("Andale Mono", 1, 14));
		panelComunidades.add(btsalircomunidades);

		ImageIcon fotomp = new ImageIcon(Vista.class.getResource("/vista/img/mapa_comunidades.png"));
		Image fotompt = fotomp.getImage(); // transform it
		Image fotomptt = fotompt.getScaledInstance(943, 678, java.awt.Image.SCALE_SMOOTH);
		fotomp = new ImageIcon(fotomptt);

		btgalicia = new JButton("GALICIA");
		btgalicia.setFocusCycleRoot(true);
		btgalicia.setHorizontalTextPosition(SwingConstants.CENTER);
		btgalicia.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		btgalicia.setActionCommand("");
		btgalicia.setBounds(327, 58, 97, 44);
		btgalicia.setBackground(colorboton);
		btgalicia.setBorderPainted(false);
		panelComunidades.add(btgalicia);

		btasturias = new JButton("ASTURIAS");
		btasturias.setHorizontalTextPosition(SwingConstants.CENTER);
		btasturias.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		btasturias.setFocusCycleRoot(true);
		btasturias.setBorderPainted(false);
		btasturias.setBackground(new Color(161, 233, 213));
		btasturias.setActionCommand("");
		btasturias.setBounds(453, 31, 110, 25);
		panelComunidades.add(btasturias);

		btcastillaleon = new JButton("CASTILLA Y LEON");
		btcastillaleon.setHorizontalTextPosition(SwingConstants.CENTER);
		btcastillaleon.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		btcastillaleon.setFocusCycleRoot(true);
		btcastillaleon.setBorderPainted(false);
		btcastillaleon.setBackground(new Color(161, 233, 213));
		btcastillaleon.setActionCommand("");
		btcastillaleon.setBounds(490, 99, 171, 100);
		panelComunidades.add(btcastillaleon);

		btnCatalunia = new JButton("CATALU\u00D1A");
		btnCatalunia.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCatalunia.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		btnCatalunia.setFocusCycleRoot(true);
		btnCatalunia.setBorderPainted(false);
		btnCatalunia.setBackground(new Color(161, 233, 213));
		btnCatalunia.setActionCommand("");
		btnCatalunia.setBounds(966, 115, 116, 44);
		panelComunidades.add(btnCatalunia);

		btnCastillaLaMancha = new JButton("CASTILLA LA MANCHA");
		btnCastillaLaMancha.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCastillaLaMancha.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		btnCastillaLaMancha.setFocusCycleRoot(true);
		btnCastillaLaMancha.setBorderPainted(false);
		btnCastillaLaMancha.setBackground(new Color(161, 233, 213));
		btnCastillaLaMancha.setActionCommand("");
		btnCastillaLaMancha.setBounds(593, 292, 216, 89);
		panelComunidades.add(btnCastillaLaMancha);

		btextremadura = new JButton("EXTREMADURA");
		btextremadura.setHorizontalTextPosition(SwingConstants.CENTER);
		btextremadura.setFont(new Font("Yu Gothic Medium", Font.BOLD, 10));
		btextremadura.setFocusCycleRoot(true);
		btextremadura.setBorderPainted(false);
		btextremadura.setBackground(new Color(161, 233, 213));
		btextremadura.setActionCommand("");
		btextremadura.setBounds(430, 310, 122, 44);
		panelComunidades.add(btextremadura);

		btnAndalucia = new JButton("ANDALUCIA");
		btnAndalucia.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAndalucia.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		btnAndalucia.setFocusCycleRoot(true);
		btnAndalucia.setBorderPainted(false);
		btnAndalucia.setBackground(new Color(161, 233, 213));
		btnAndalucia.setActionCommand("");
		btnAndalucia.setBounds(513, 418, 224, 89);
		panelComunidades.add(btnAndalucia);

		btaragon = new JButton("ARAGON");
		btaragon.setHorizontalTextPosition(SwingConstants.CENTER);
		btaragon.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		btaragon.setFocusCycleRoot(true);
		btaragon.setBorderPainted(false);
		btaragon.setBackground(new Color(161, 233, 213));
		btaragon.setActionCommand("");
		btaragon.setBounds(794, 155, 134, 44);
		panelComunidades.add(btaragon);

		btmurcia = new JButton("MURCIA");
		btmurcia.setHorizontalTextPosition(SwingConstants.CENTER);
		btmurcia.setFont(new Font("Yu Gothic Medium", Font.BOLD, 7));
		btmurcia.setFocusCycleRoot(true);
		btmurcia.setBorderPainted(false);
		btmurcia.setBackground(new Color(161, 233, 213));
		btmurcia.setActionCommand("");
		btmurcia.setBounds(783, 408, 64, 44);
		panelComunidades.add(btmurcia);

		bislasbaleares = new JButton("ISLAS BALEARES");
		bislasbaleares.setHorizontalTextPosition(SwingConstants.CENTER);
		bislasbaleares.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		bislasbaleares.setFocusCycleRoot(true);
		bislasbaleares.setBorderPainted(false);
		bislasbaleares.setBackground(new Color(255, 255, 255));
		bislasbaleares.setActionCommand("");
		bislasbaleares.setBounds(1033, 215, 193, 44);
		panelComunidades.add(bislasbaleares);

		btcantabria = new JButton("CANTABRIA");
		btcantabria.setHorizontalTextPosition(SwingConstants.CENTER);
		btcantabria.setFont(new Font("Yu Gothic Medium", Font.BOLD, 7));
		btcantabria.setFocusCycleRoot(true);
		btcantabria.setBorderPainted(false);
		btcantabria.setBackground(new Color(161, 233, 213));
		btcantabria.setActionCommand("");
		btcantabria.setBounds(604, 29, 64, 44);
		panelComunidades.add(btcantabria);

		btnavarra = new JButton("NAVARRA");
		btnavarra.setHorizontalTextPosition(SwingConstants.CENTER);
		btnavarra.setFont(new Font("Yu Gothic Medium", Font.BOLD, 7));
		btnavarra.setFocusCycleRoot(true);
		btnavarra.setBorderPainted(false);
		btnavarra.setBackground(new Color(161, 233, 213));
		btnavarra.setActionCommand("");
		btnavarra.setBounds(768, 66, 64, 44);
		panelComunidades.add(btnavarra);

		btpaisvasco = new JButton("PAIS VASCO");
		btpaisvasco.setHorizontalTextPosition(SwingConstants.CENTER);
		btpaisvasco.setFont(new Font("Yu Gothic Medium", Font.BOLD, 7));
		btpaisvasco.setFocusCycleRoot(true);
		btpaisvasco.setBorderPainted(false);
		btpaisvasco.setBackground(new Color(161, 233, 213));
		btpaisvasco.setActionCommand("");
		btpaisvasco.setBounds(707, 44, 64, 44);
		panelComunidades.add(btpaisvasco);

		btlarioja = new JButton("LARIOJA");
		btlarioja.setHorizontalTextPosition(SwingConstants.CENTER);
		btlarioja.setFont(new Font("Yu Gothic Medium", Font.BOLD, 7));
		btlarioja.setFocusCycleRoot(true);
		btlarioja.setBorderPainted(false);
		btlarioja.setBackground(new Color(161, 233, 213));
		btlarioja.setActionCommand("");
		btlarioja.setBounds(707, 99, 64, 44);
		panelComunidades.add(btlarioja);

		bislascanarias = new JButton("ISLAS CANARIAS");
		bislascanarias.setHorizontalTextPosition(SwingConstants.CENTER);
		bislascanarias.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		bislascanarias.setFocusCycleRoot(true);
		bislascanarias.setBorderPainted(false);
		bislascanarias.setBackground(Color.WHITE);
		bislascanarias.setActionCommand("");
		bislascanarias.setBounds(936, 532, 193, 44);
		panelComunidades.add(bislascanarias);

		bceuta = new JButton("CEUTA");
		bceuta.setHorizontalTextPosition(SwingConstants.CENTER);
		bceuta.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		bceuta.setFocusCycleRoot(true);
		bceuta.setBorderPainted(false);
		bceuta.setBackground(Color.WHITE);
		bceuta.setActionCommand("");
		bceuta.setBounds(436, 582, 193, 44);
		panelComunidades.add(bceuta);

		mapaComunidades = new JLabel(fotomp);
		mapaComunidades.setBounds(283, 0, 943, 678);
		panelComunidades.add(mapaComunidades);

		bmelilla = new JButton("MELILLA");
		bmelilla.setHorizontalTextPosition(SwingConstants.CENTER);
		bmelilla.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		bmelilla.setFocusCycleRoot(true);
		bmelilla.setBorderPainted(false);
		bmelilla.setBackground(Color.WHITE);
		bmelilla.setActionCommand("");
		bmelilla.setBounds(593, 623, 193, 44);
		panelComunidades.add(bmelilla);

		ImageIcon fotocomun1 = new ImageIcon(Vista.class.getResource("/vista/img/interro.jpg"));
		Image fotocomun1t = fotocomun1.getImage(); // transform it
		Image fotocomun1tt = fotocomun1t.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		fotocomun1 = new ImageIcon(fotocomun1tt);
		ftcomunidad1 = new JLabel(fotocomun1);
		ftcomunidad1.setBounds(10, 155, 135, 135);
		panelComunidades.add(ftcomunidad1);

		ImageIcon fotocomun2 = new ImageIcon(Vista.class.getResource("/vista/img/interro.jpg"));
		Image fotocomun2t = fotocomun2.getImage(); // transform it
		Image fotocomun2tt = fotocomun2t.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		fotocomun2 = new ImageIcon(fotocomun2tt);
		ftcomunidad2 = new JLabel(fotocomun2);
		ftcomunidad2.setBounds(10, 311, 135, 135);
		panelComunidades.add(ftcomunidad2);

		ImageIcon fotocomun3 = new ImageIcon(Vista.class.getResource("/vista/img/interro.jpg"));
		Image fotocomun3t = fotocomun3.getImage(); // transform it
		Image fotocomun3tt = fotocomun3t.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		fotocomun3 = new ImageIcon(fotocomun3tt);
		ftcomunidad3 = new JLabel(fotocomun3);
		ftcomunidad3.setBounds(10, 466, 135, 135);
		panelComunidades.add(ftcomunidad3);

		nombreComun1 = new JLabel("?");
		nombreComun1.setHorizontalAlignment(SwingConstants.CENTER);
		nombreComun1.setBounds(155, 188, 97, 35);
		nombreComun1.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		panelComunidades.add(nombreComun1);

		nombreComun2 = new JLabel("?");
		nombreComun2.setHorizontalAlignment(SwingConstants.CENTER);
		nombreComun2.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		nombreComun2.setBounds(155, 346, 97, 35);
		panelComunidades.add(nombreComun2);

		nombreComun3 = new JLabel("?");
		nombreComun3.setHorizontalAlignment(SwingConstants.CENTER);
		nombreComun3.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		nombreComun3.setBounds(155, 500, 97, 35);
		panelComunidades.add(nombreComun3);

		puntoscomun1 = new JLabel("PTS. ?");
		puntoscomun1.setHorizontalAlignment(SwingConstants.CENTER);
		puntoscomun1.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		puntoscomun1.setBounds(139, 229, 134, 35);
		panelComunidades.add(puntoscomun1);

		puntoscomun2 = new JLabel("PTS. ?");
		puntoscomun2.setHorizontalAlignment(SwingConstants.CENTER);
		puntoscomun2.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		puntoscomun2.setBounds(139, 380, 134, 35);
		panelComunidades.add(puntoscomun2);

		puntoscomun3 = new JLabel("PTS. ?");
		puntoscomun3.setHorizontalAlignment(SwingConstants.CENTER);
		puntoscomun3.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		puntoscomun3.setBounds(139, 544, 134, 35);
		panelComunidades.add(puntoscomun3);

		// Agregar Imagen a Logo

		ImageIcon fotobf = new ImageIcon(Vista.class.getResource("/vista/img/logo_benidormfest.png"));
		Image fotot = fotobf.getImage(); // transform it
		Image fotott = fotot.getScaledInstance(400, 200, java.awt.Image.SCALE_SMOOTH);
		fotobf = new ImageIcon(fotott);
		label_imgBenidormF = new JLabel(fotobf);
		label_imgBenidormF.setBounds(-117, 488, 647, 200);
		contentPane.add(label_imgBenidormF);

		ImageIcon resultado3 = new ImageIcon(Vista.class.getResource("/vista/img/interro.jpg"));
		Image resultado3t = resultado3.getImage(); // transform it
		Image resultado3tt = resultado3t.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		resultado3 = new ImageIcon(resultado3tt);
		resultados3 = new JLabel(resultado3);
		resultados3.setBounds(994, 139, 200, 200);
		contentPane.add(resultados3);

		ImageIcon resultado2 = new ImageIcon(Vista.class.getResource("/vista/img/interro.jpg"));
		Image resultado2t = resultado2.getImage(); // transform it
		Image resultado2tt = resultado2t.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		resultado2 = new ImageIcon(resultado2tt);
		resultados2 = new JLabel(resultado2);
		resultados2.setBounds(455, 102, 200, 200);
		contentPane.add(resultados2);

		ImageIcon resultado1 = new ImageIcon(Vista.class.getResource("/vista/img/interro.jpg"));
		Image resultado1t = resultado1.getImage(); // transform it
		Image resultado1tt = resultado1t.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		resultado1 = new ImageIcon(resultado1tt);
		resultados1 = new JLabel(resultado1);
		resultados1.setBounds(725, 0, 200, 200);
		contentPane.add(resultados1);

		votosResultado2 = new JLabel("VOTOS: ???");
		votosResultado2.setHorizontalAlignment(SwingConstants.CENTER);
		votosResultado2.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		votosResultado2.setBounds(455, 590, 218, 35);
		contentPane.add(votosResultado2);

		votosResultado1 = new JLabel("VOTOS: ???");
		votosResultado1.setHorizontalAlignment(SwingConstants.CENTER);
		votosResultado1.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		votosResultado1.setBounds(719, 590, 218, 35);
		contentPane.add(votosResultado1);

		votosResultado3 = new JLabel("VOTOS: ???");
		votosResultado3.setHorizontalAlignment(SwingConstants.CENTER);
		votosResultado3.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 21));
		votosResultado3.setBounds(976, 590, 218, 35);
		contentPane.add(votosResultado3);

		ImageIcon podio = new ImageIcon(Vista.class.getResource("/vista/img/podio.png"));
		Image podiot = podio.getImage(); // transform it
		Image podiott = podiot.getScaledInstance(1000, 600, java.awt.Image.SCALE_SMOOTH);
		podio = new ImageIcon(podiott);
		podioResultados = new JLabel(podio);
		podioResultados.setBounds(333, 201, 984, 414);
		contentPane.add(podioResultados);

		imagenfondoresultados = new JLabel("New label");
		imagenfondoresultados.setBounds(0, 0, 1234, 686);
		contentPane.add(imagenfondoresultados);

	}
}
