package aplicaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ContadorDeClics implements ActionListener {
	// Propiedades de la clase
	JFrame ventana;
	JLabel texto;
	JButton boton;
	int contador;

	// Métodos de la clase
	// Constructor
	public ContadorDeClics() {
		// creamos la ventana
		ventana = new JFrame();
		ventana.setTitle("Contador de Clics");
		ventana.setVisible(true);
		// Ubicación x,y posición ancho, alto
		ventana.setBounds(400, 250, 315, 160);
		// propiedades de la ventana
		ventana.setResizable(false);
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);

		// creamos un botón en la ventana
		boton = new JButton("Clic");
		boton.setBounds(20, 20, 255, 40);
		ventana.add(boton);

		// agregamos el listener al botón
		boton.addActionListener(this);

		// creamos el texto en la ventana
		texto = new JLabel("Cantidad de clics: 0");
		texto.setBounds(20, 70, 255, 20);
		ventana.add(texto);

		contador = 0;
	}

	public static void iniciar() {

		new ContadorDeClics();

	}

	// método del ActionListener que se ejecuta
	// cuando se detecta el evento en el botón
	@Override
	public void actionPerformed(ActionEvent e) {
		contador++;
		texto.setText("Cantidad de clics: " + contador);
	}
}
