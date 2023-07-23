package aplicaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Factorial implements ActionListener {
	//Variables de la ventana
	private JFrame ventana;
	private JTextField ValorFac;
	private JLabel NumeroFac;
	private JLabel Resultado;
	private JButton ResultadoFac;
	private JButton botonReset;

	public Factorial() {
		//Configuracion de Ventana
		ventana = new JFrame();
		ventana.setLayout(null); // posicionamiento absoluto, con coordenadas
		ventana.setBounds(400, 250, 315, 160);  //X Y Alto Ancho
		ventana.setTitle("Factorial de un Numero");
		ventana.setResizable(false);
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Botones y Area de Texto
		NumeroFac = new JLabel("Ingrese un Entero:");
		NumeroFac.setBounds(20, 10, 150, 30);
		ventana.add(NumeroFac);
		
		Resultado = new JLabel("Resultado :");
		Resultado.setBounds(20, 40, 300, 30);
		ventana.add(Resultado);
		
		ValorFac = new JTextField("0");
		ValorFac.setBounds(160, 14, 100, 20);
		ventana.add(ValorFac);

		//Boton Borrar
		botonReset = new JButton("Borrar");
		botonReset.setBounds(20, 80, 100, 30);
		ventana.add(botonReset);
		botonReset.addActionListener(this); //capturar Evento click
		//Boton Resultado
		ResultadoFac = new JButton("Resultado");
		ResultadoFac.setBounds(180, 80, 100, 30);
		ventana.add(ResultadoFac);
		ResultadoFac.addActionListener(this); //capturar Evento click
		
		ventana.setVisible(true);//Ventana Visible
	}

	//Metodo de evento  + Try Catch + programa Factorial
	public void actionPerformed(ActionEvent evento) {
		try {
			if (evento.getSource() == ResultadoFac) {
				Integer numero = Integer.valueOf(ValorFac.getText());
				// Bloque for para calcular el factorial multiplicando por los numeros anteriores

				long f = 1; // inicializamos un long por sus 20 digitos maximos y lo condicionamos
				if (numero <= 20) {  //Solo permitimos hasta 20, ya que 21 enteros de resultado dan error
					for (int i = 1; i <= numero; i++) {

						f = f * i;
						Resultado.setText("Resultado : " + f);
					}
				} else
					Resultado.setText("Error valor maximo 20");

			}
			if (evento.getSource() == botonReset) {
				ValorFac.setText("0");
				Resultado.setText("Resultado :");
			}
		} catch (Exception e) {
			Resultado.setText("Dato invalido");
		}
	}

	public static void iniciar() {

		new Factorial();

	}
}