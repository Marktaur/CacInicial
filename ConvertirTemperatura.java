package aplicaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertirTemperatura implements ActionListener {
	//Variables de la ventana
	private JFrame ventana;
	private JTextField gradosCelcius;
	private JTextField gradosFarenheit;
	private JLabel rotuloCelcius;
	private JLabel rotuloFarenheit;
	private JButton botonConvertir;
	private JButton botonBorrar;

	public ConvertirTemperatura() {
		//Ventana 
		ventana = new JFrame();
		ventana.setLayout(null); // posicionamiento absoluto, con coordenadas
		ventana.setBounds(400, 250, 315, 160);
		ventana.setTitle("Convertir temperatura");
		ventana.setResizable(false);
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Botones y area de textos
		rotuloCelcius = new JLabel("Grados Celcius:");
		rotuloCelcius.setBounds(20, 10, 100, 30);
		ventana.add(rotuloCelcius);
		
		rotuloFarenheit = new JLabel("Grados Farenheit:");
		rotuloFarenheit.setBounds(20, 40, 120, 30);
		ventana.add(rotuloFarenheit);
		
		gradosCelcius = new JTextField("0");
		gradosCelcius.setBounds(130, 14, 150, 20);
		ventana.add(gradosCelcius);
		
		gradosFarenheit = new JTextField("0");
		gradosFarenheit.setBounds(130, 44, 150, 20);
		ventana.add(gradosFarenheit);
		
		//boton borrar
		botonBorrar = new JButton("Borrar");
		botonBorrar.setBounds(20, 80, 100, 30);
		ventana.add(botonBorrar);
		botonBorrar.addActionListener(this);//Capturador de evento click
		//Boton convertir
		botonConvertir = new JButton("Convertir");
		botonConvertir.setBounds(180, 80, 100, 30);
		ventana.add(botonConvertir);
		botonConvertir.addActionListener(this);//Capturador de evento click
		
		ventana.setVisible(true);
	}

	//metodo de evento + try catch + programa calcular de temperatura
	public void actionPerformed(ActionEvent evento) {
		try {
			if (evento.getSource() == botonConvertir) {
				double celcius = Double.valueOf(gradosCelcius.getText());
				double farenheit = (celcius * 9 / 5) + 32;
				gradosFarenheit.setText("" + farenheit);
			}
			if (evento.getSource() == botonBorrar) {
				gradosCelcius.setText("0");
				gradosFarenheit.setText("0");
			}
		} catch (Exception e) {
			gradosCelcius.setText("Dato invalido");
			gradosFarenheit.setText("Dato invalido");
		}
	}

	// En el método main creamos un objeto de la clase
	public static void iniciar() {

		new ConvertirTemperatura();

	}

}
