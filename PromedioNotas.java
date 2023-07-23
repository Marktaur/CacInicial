package aplicaciones;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PromedioNotas implements ActionListener {

	// variables de la ventana
	private JFrame ventana;
	// Notas x10
	private JTextField ValorEnt1;
	private JTextField ValorEnt2;
	private JTextField ValorEnt3;
	private JTextField ValorEnt4;
	private JTextField ValorEnt5;
	private JTextField ValorEnt6;
	private JTextField ValorEnt7;
	private JTextField ValorEnt8;
	private JTextField ValorEnt9;
	private JTextField ValorEnt10;

	// titulo
	private JLabel NumeroEnt1;
	private JLabel Resultado;
	private JLabel Aviso;
	// botones

	private JButton Promedio;
	private JButton botonReset;

	ArrayList<String> notas = new ArrayList<String>();

	public PromedioNotas() {

		// Configuración de la ventana
		ventana = new JFrame();
		ventana.setLayout(null); // posicionamiento absoluto, con coordenadas
		ventana.setBounds(400, 250, 330, 270); // X Y ancho alto
		ventana.setTitle("Promedio de notas");// Nombre de la ventana
		ventana.setResizable(false);// Dimencion de la ventana no modificable
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Textos de la ventana
		NumeroEnt1 = new JLabel("Ingrese hasta 10 notas :");
		NumeroEnt1.setBounds(20, 10, 150, 30);
		ventana.add(NumeroEnt1);

		Resultado = new JLabel("Resultado :");
		Resultado.setBounds(20, 110, 300, 30);
		ventana.add(Resultado);

		Aviso = new JLabel(" ");
		Aviso.setBounds(20, 130, 300, 30);
		ventana.add(Aviso);

		// botones
		Promedio = new JButton("Promedio");
		Promedio.setBounds(20, 160, 95, 30);
		ventana.add(Promedio);
		Promedio.addActionListener(this); // Ver evento click
		// Boton Borrar
		botonReset = new JButton("Borrar");
		botonReset.setBounds(200, 160, 95, 30);
		ventana.add(botonReset);
		botonReset.addActionListener(this);// ver evento click

		// Espacio de notas
		ValorEnt1 = new JTextField("0");
		ValorEnt1.setBounds(20, 45, 40, 20);
		ventana.add(ValorEnt1);

		ValorEnt2 = new JTextField("0");
		ValorEnt2.setBounds(80, 45, 40, 20);
		ventana.add(ValorEnt2);

		ValorEnt3 = new JTextField("0");
		ValorEnt3.setBounds(140, 45, 40, 20);
		ventana.add(ValorEnt3);

		ValorEnt4 = new JTextField("0");
		ValorEnt4.setBounds(200, 45, 40, 20);
		ventana.add(ValorEnt4);

		ValorEnt5 = new JTextField("0");
		ValorEnt5.setBounds(260, 45, 40, 20);
		ventana.add(ValorEnt5);

		ValorEnt6 = new JTextField("0");
		ValorEnt6.setBounds(20, 90, 40, 20);
		ventana.add(ValorEnt6);

		ValorEnt7 = new JTextField("0");
		ValorEnt7.setBounds(80, 90, 40, 20);
		ventana.add(ValorEnt7);

		ValorEnt8 = new JTextField("0");
		ValorEnt8.setBounds(140, 90, 40, 20);
		ventana.add(ValorEnt8);

		ValorEnt9 = new JTextField("0");
		ValorEnt9.setBounds(200, 90, 40, 20);
		ventana.add(ValorEnt9);

		ValorEnt10 = new JTextField("0");
		ValorEnt10.setBounds(260, 90, 40, 20);
		ventana.add(ValorEnt10);

		ValorEnt1.setText("0");
		ValorEnt2.setText("0");
		ValorEnt3.setText("0");
		ValorEnt4.setText("0");
		ValorEnt5.setText("0");
		ValorEnt6.setText("0");
		ValorEnt7.setText("0");
		ValorEnt8.setText("0");
		ValorEnt9.setText("0");
		ValorEnt10.setText("0");

		ventana.setVisible(true);
	}

	// Metodo de evento con Try catch + programa
	public void actionPerformed(ActionEvent evento) {

		notas.add(ValorEnt1.getText());
		notas.add(ValorEnt2.getText());
		notas.add(ValorEnt3.getText());
		notas.add(ValorEnt4.getText());
		notas.add(ValorEnt5.getText());
		notas.add(ValorEnt6.getText());
		notas.add(ValorEnt7.getText());
		notas.add(ValorEnt8.getText());
		notas.add(ValorEnt9.getText());
		notas.add(ValorEnt10.getText());

		double numero = 0.0;
		double cantNotas = 0.0;
		int i = 1;
		try {
			if (evento.getSource() == Promedio) {

				numero = 0.0;
				cantNotas = 0.0;

//llamo un for y detecto que casillas se completaron que sean mayores a 0
				for (i = 0; i < 10; i++) {

					if ((Double.valueOf(notas.get(i))) > 0.0) {

						numero = (Double.valueOf(notas.get(i))) + numero;// suma solo los mayores a 0
						cantNotas++; // cantnotas va a ser mi dividor

					} else
						Resultado.setText("Resultado : 0  ");
					Aviso.setText("Pulse borrar para volver a empezar");
				}
				if (numero != 0) {
					numero = numero / cantNotas; // divido la suma de las casillas x la cantidad condiciones que realize

					Resultado.setText("Resultado : " + numero);
					Aviso.setText("Pulse borrar para volver a empezar");
				}
			}

			// reseteo pantalla
			if (evento.getSource() == botonReset) {

				ventana.setVisible(false); // cierro la ventana
				PromedioNotas.iniciar();// abro ventana una nueva con valores de cero

			}

		} catch (Exception e) {
			Resultado.setText("Dato invalido");
		}
	}

	public static void iniciar() {

		new PromedioNotas();

	}

}