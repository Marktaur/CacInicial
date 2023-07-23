package aplicaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumeroParImpar implements ActionListener {

	// variables de la ventana
	private JFrame ventana;
	private JTextField ValorEnt;
	private JLabel NumeroEnt;
	private JLabel Resultado;
	private JButton ResultadoEnt;
	private JButton botonReset;

	public NumeroParImpar() {
		// Configuración de la ventana
		ventana = new JFrame();
		ventana.setLayout(null); // posicionamiento absoluto, con coordenadas
		ventana.setBounds(400, 250, 315, 160); // X Y Alto Ancho
		ventana.setTitle("Numero par o impar");// Nombre de la ventana
		ventana.setResizable(false);// Dimencion de la ventana no modificable
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Botones y Textos de la ventana
		NumeroEnt = new JLabel("Ingrese un Entero:");
		NumeroEnt.setBounds(20, 10, 150, 30);
		ventana.add(NumeroEnt);

		Resultado = new JLabel("Resultado :");
		Resultado.setBounds(20, 40, 300, 30);
		ventana.add(Resultado);

		ValorEnt = new JTextField("0");
		ValorEnt.setBounds(160, 14, 100, 20);
		ventana.add(ValorEnt);

		// Boton Borrar
		botonReset = new JButton("Borrar");
		botonReset.setBounds(20, 80, 100, 30);
		ventana.add(botonReset);
		botonReset.addActionListener(this);// ver evento click

		ResultadoEnt = new JButton("Resultado");
		ResultadoEnt.setBounds(180, 80, 100, 30);
		ventana.add(ResultadoEnt);
		ResultadoEnt.addActionListener(this); // Ver evento click

		ventana.setVisible(true);
	}

	// Metodo de evento con Try catch + programa
	public void actionPerformed(ActionEvent evento) {
		try {
			if (evento.getSource() == ResultadoEnt) {
				Integer numero = Integer.valueOf(ValorEnt.getText());
				// Bloque for

				if ((numero % 2) == 0) // programa que calcula si el resto es Par o impar
				{
					Resultado.setText("Resultado : El numero es par");
				} else
					Resultado.setText("Resultado : El numero es impar");

			}
			if (evento.getSource() == botonReset) {
				ValorEnt.setText("0");
				Resultado.setText("Resultado :");
			}
		} catch (Exception e) {
			Resultado.setText("Dato invalido");
		}

	}

	public static void iniciar() {

		new NumeroParImpar();

	}
}
