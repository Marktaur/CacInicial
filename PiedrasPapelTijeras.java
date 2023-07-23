package aplicaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.lang.Math;

public class PiedrasPapelTijeras implements ActionListener {

	// Variables
	private JFrame ventana;

	private JLabel Texto1;
	private JLabel texto2;
	private JLabel texto3;
	private JLabel texto4;
	private JLabel texto5;
	private JButton Piedras;
	private JButton Papel;
	private JButton Tijeras;
	private JButton botonReset;
	Integer numAleat;
	Integer ronda;
	Integer Jugador;
	Integer Computadora;

	public PiedrasPapelTijeras() {

		// Ventana
		ventana = new JFrame();
		ventana.setLayout(null); // 
		ventana.setBounds(470, 150, 335, 250);
		ventana.setTitle("Piedra Papel o Tijera");
		ventana.setResizable(false);
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Botones
		Texto1 = new JLabel("Bienvenido al Juego Piedra Papel y Tijera");
		Texto1.setBounds(20, 10, 250, 30);
		ventana.add(Texto1);

		texto2 = new JLabel("Elija una opcion y juegue contra la computadora");
		texto2.setBounds(20, 40, 300, 30);
		ventana.add(texto2);

		// Area de texto del Valor final
		texto2 = new JLabel("A JUGAR!!!");
		texto2.setBounds(120, 140, 250, 30);
		ventana.add(texto2);

		texto3 = new JLabel("Jugador:  0");
		texto3.setBounds(20, 120, 250, 30);
		ventana.add(texto3);

		texto4 = new JLabel("Computadora:  0");
		texto4.setBounds(200, 120, 250, 30);
		ventana.add(texto4);

		texto5 = new JLabel("Ronda:  0");
		texto5.setBounds(20, 100, 250, 30);
		ventana.add(texto5);

		// Botones de juego
		Piedras = new JButton("Piedra");
		Piedras.setBounds(20, 80, 90, 20);
		ventana.add(Piedras);
		Piedras.addActionListener(this);// Evento boton

		Papel = new JButton("Papel");
		Papel.setBounds(115, 80, 90, 20);
		ventana.add(Papel);
		Papel.addActionListener(this);// Evento boton

		Tijeras = new JButton("Tijera");
		Tijeras.setBounds(210, 80, 90, 20);
		ventana.add(Tijeras);
		Tijeras.addActionListener(this);// Evento boton

		botonReset = new JButton("Nuevo Juego");
		botonReset.setBounds(80, 180, 150, 20);
		ventana.add(botonReset);
		botonReset.addActionListener(this);// Evento boton
		ventana.setVisible(true);
		ronda = 0;
		Jugador = 0;
		Computadora = 0;
	}

	// Metodo programa accion de evento +try catch + programa
	public void actionPerformed(ActionEvent evento) {
		try {
			if (evento.getSource() == Piedras) {
				JuegoAleatorio();
			}
			if (evento.getSource() == Papel) {
				JuegoAleatorio();
			}
			if (evento.getSource() == Tijeras) {
				JuegoAleatorio();
			}
			if (evento.getSource() == botonReset) {

				texto2.setText("   A JUGAR!!! ");
				texto2.setBounds(120, 140, 250, 30);
				ronda = 0;
				Jugador = 0;
				Computadora = 0;
				texto4.setText("Computadora:  0");
				texto3.setText("Jugador:  0");
				texto5.setText("Ronda:  0");
			}
		} catch (Exception e) {
			texto2.setText(" **Dato invalido** ");
		}
	}
	private void JuegoAleatorio() {
		// TODO Auto-generated method stub
		
		//Buscamos un numero aleatorio entre  1 y 3
		numAleat = (int) (Math.random() * (3 - 1 + 1)) + 1;
		
		//condicionamos el resultado math y le asigamos un premio
		if (numAleat == 1) {
			texto2.setText(" Has Ganado ");
		}
		if (numAleat == 2) {
			texto2.setText(" Has Empatado ");
		}
		if (numAleat == 3) {
			texto2.setText(" Has Perdido ");
		}
		//Sumamos la ronda y puntajes
		ronda++;
		texto5.setText("Ronda: " + ronda);
		if (numAleat == 1) {
			Jugador++;
			texto3.setText("Jugador: " + Jugador);
		}
		if (numAleat == 3) {
			Computadora++;
			texto4.setText("Computadora: " + Computadora);
		}
        //Preguntamos si ya termino la partida
		if (ronda == 5) {
			if (Jugador == Computadora) {
				texto2.setText("RONDA EMPATADA INTENTA NUEVAMENTE");
				texto2.setBounds(50, 140, 300, 30);
			}
			if (Jugador > Computadora) {
				texto2.setText("A GANADO LA RONDA El JUGADOR ");
				texto2.setBounds(50, 140, 300, 30);
			}
			if (Jugador < Computadora) {
				texto2.setText("A GANADO LA RONDA LA COMPUTADORA ");
				texto2.setBounds(50, 140, 300, 30);
			}

		}
		return;
	}

	/* En el método main creamos un objeto de la clase */
	public static void iniciar() {

		new PiedrasPapelTijeras();

	}

}
