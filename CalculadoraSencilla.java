package aplicaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculadoraSencilla implements ActionListener {

	// variables de la ventana
	private JFrame ventana;
	private JTextField ValorEnt;
	private JTextField ValorEnt2;
	private JLabel NumeroEnt;
	private JLabel NumeroEnt2;
	private JLabel Resultado;
	private JButton Suma;
	private JButton Resta;
	private JButton Multi;
	private JButton Div;
	private JButton botonReset;

	public CalculadoraSencilla() {

		// Configuración de la ventana
		ventana = new JFrame();
		ventana.setLayout(null); // posicionamiento absoluto, con coordenadas
		ventana.setBounds(400, 250, 450, 220); // X Y Ancho Alto
		ventana.setTitle("Calculadora Sensilla");// Nombre de la ventana
		ventana.setResizable(false);// Dimencion de la ventana no modificable
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Botones y Textos de la ventana
		NumeroEnt = new JLabel("Ingrese un Entero:");
		NumeroEnt.setBounds(20, 10, 150, 30);
		ventana.add(NumeroEnt);

		NumeroEnt2 = new JLabel("Ingrese un Entero:");
		NumeroEnt2.setBounds(20, 40, 150, 30);
		ventana.add(NumeroEnt2);

		Suma = new JButton("Suma");
		Suma.setBounds(20, 70, 95, 30);
		ventana.add(Suma);
		Suma.addActionListener(this); // Ver evento click

		Resta = new JButton("Resta");
		Resta.setBounds(120, 70, 95, 30);
		ventana.add(Resta);
		Resta.addActionListener(this); // Ver evento click

		Multi = new JButton("Multiplicar");
		Multi.setBounds(220, 70, 95, 30);
		ventana.add(Multi);
		Multi.addActionListener(this); // Ver evento click

		Div = new JButton("Dividir");
		Div.setBounds(320, 70, 95, 30);
		ventana.add(Div);
		Div.addActionListener(this); // Ver evento click

		Resultado = new JLabel("Resultado :");
		Resultado.setBounds(20, 100, 300, 30);
		ventana.add(Resultado);

		ValorEnt = new JTextField("0");
		ValorEnt.setBounds(160, 14, 100, 20);
		ventana.add(ValorEnt);

		ValorEnt2 = new JTextField("0");
		ValorEnt2.setBounds(160, 45, 100, 20);
		ventana.add(ValorEnt2);

		// Boton Borrar
		botonReset = new JButton("Borrar");
		botonReset.setBounds(20, 130, 95, 30);
		ventana.add(botonReset);
		botonReset.addActionListener(this);// ver evento click

		ventana.setVisible(true);
	}

	// Metodo de evento con Try catch + programa
	public void actionPerformed(ActionEvent evento) {
		try {
			if (evento.getSource() == Suma) {
				double numero = Double.valueOf(ValorEnt.getText());
				double numero2 = Double.valueOf(ValorEnt2.getText());
				numero = numero + numero2;
				Resultado.setText("Resultado : " + numero);
				
				
				
			}

			if (evento.getSource() == Resta) {
				double numero = Double.valueOf(ValorEnt.getText());
				double numero2 = Double.valueOf(ValorEnt2.getText());
				numero = numero - numero2;
				Resultado.setText("Resultado : " + numero);
			}

			if (evento.getSource() == Multi) {
				double numero = Double.valueOf(ValorEnt.getText());
				double numero2 = Double.valueOf(ValorEnt2.getText());
				numero = numero * numero2;
				Resultado.setText("Resultado : " + numero);
			}

			if (evento.getSource() == Div) {
				double numero = Double.valueOf(ValorEnt.getText());
				double numero2 = Double.valueOf(ValorEnt2.getText());
				numero = numero / numero2;
				Resultado.setText("Resultado : " + numero);
			}

			if (evento.getSource() == botonReset) {
				ValorEnt.setText("0");
				ValorEnt2.setText("0");
				Resultado.setText("Resultado :");
			}
		} catch (Exception e) {
			Resultado.setText("Dato invalido");
		}

	}

	public static void iniciar() {

		new CalculadoraSencilla();

	}
}
