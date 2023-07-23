package aplicaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConversorDeDivisas implements ActionListener {

	// Variables
	private JFrame ventana;
	private JTextField valor;
	private JLabel ingreseValor;
	private JLabel conversion;
	private JButton botonConvertir1;
	private JButton botonConvertir2;
	private JButton botonConvertir3;
	private JButton botonReset;

	public ConversorDeDivisas() {

		// Ventana
		ventana = new JFrame();
		ventana.setLayout(null); // posicionamiento absoluto, con coordenadas
		ventana.setBounds(470, 150, 335, 250);  
		ventana.setTitle("Conversor de divisas");
		ventana.setResizable(false);
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Botones
		ingreseValor = new JLabel("Ingrese un valor en pesos:");
		ingreseValor.setBounds(20, 10, 150, 30);
		ventana.add(ingreseValor);

		conversion = new JLabel("Elija una moneda a convertir:");
		conversion.setBounds(20, 40, 200, 30);
		ventana.add(conversion);

		// Area de texto para ingresar el valor a convertir:
		valor = new JTextField("0");
		valor.setBounds(175, 14, 80, 20);
		ventana.add(valor);

		// Area de texto del Valor final
		conversion = new JLabel(" **Valor Convertido** ");
		conversion.setBounds(20, 120, 250, 30);
		ventana.add(conversion);
		ventana.setVisible(true);

		// Botones de conversion
		botonConvertir1 = new JButton("YEN");
		botonConvertir1.setBounds(20, 80, 90, 20);
		ventana.add(botonConvertir1);
		botonConvertir1.addActionListener(this);// Evento boton

		botonConvertir2 = new JButton("U$$");
		botonConvertir2.setBounds(115, 80, 90, 20);
		ventana.add(botonConvertir2);
		botonConvertir2.addActionListener(this);// Evento boton

		botonConvertir3 = new JButton("Є");
		botonConvertir3.setBounds(210, 80, 90, 20);
		ventana.add(botonConvertir3);
		botonConvertir3.addActionListener(this);// Evento boton

		botonReset = new JButton("Reset");
		botonReset.setBounds(20, 160, 90, 20);
		ventana.add(botonReset);
		botonReset.addActionListener(this);// Evento boton

	}

	// Metodo programa accion de evento +try catch + programa que multiplica por el valor de la moneda
	public void actionPerformed(ActionEvent evento) {
		try {
			if (evento.getSource() == botonConvertir1) {
				double monedaInicial = Double.valueOf(valor.getText());
				double monedaConvertida = (monedaInicial / 1.78);
				conversion.setText(monedaConvertida + " Yen (Japones)");
			}
			if (evento.getSource() == botonConvertir2) {
				double monedaInicial = Double.valueOf(valor.getText());
				double monedaConvertida = (monedaInicial / 298);
				conversion.setText(monedaConvertida + " U$$ (Dolar Official)");
			}
			if (evento.getSource() == botonConvertir3) {
				double monedaInicial = Double.valueOf(valor.getText());
				double monedaConvertida = (monedaInicial / 280);
				conversion.setText(monedaConvertida + " Є (Euros)");
			}

			if (evento.getSource() == botonReset) {
				valor.setText("0");
				conversion.setText(" **Valor Convertido** ");
			}

		} catch (Exception e) {
			conversion.setText(" **Dato invalido** ");
		}
	}

	/* En el método main creamos un objeto de la clase */
	public static void iniciar() {

		new ConversorDeDivisas();

	}

}