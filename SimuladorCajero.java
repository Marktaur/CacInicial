package aplicaciones;

import java.util.ArrayList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimuladorCajero implements ActionListener {

	// variables de la ventana
	private JFrame ventana;
	private JTextField Pin;
	private JTextField Entero;
	private JTextField DatoTexto;

	private JLabel Bienvenido;
	private JLabel Bienvenido1;
	private JLabel Bienvenido2;

	private JButton DatosCliente;
	private JButton Deposito;
	private JButton SaldoActual;
	private JButton Extraccion;
	private JButton Transferencia;
	private JButton Ingreso;
	private JButton botonReset;
	private JButton VolverMenu;
	private JButton Enter;
	private JButton Enter1;
	private JButton Enter2;
	private JLabel Datos1;
	private JLabel Datos2;
	private JLabel Datos3;
	private JLabel Datos4;
	private JLabel Datos5;
	private JLabel DatoInvalido;
	Integer numero;

	ArrayList<String> persona1 = new ArrayList<String>();

	public SimuladorCajero() {

		// definimos al usuario de ejemplo
		persona1.add("Lionel Messi");
		persona1.add("123456789");
		persona1.add("1234");
		persona1.add("100000");

		// Configuración de la ventana
		ventana = new JFrame();
		ventana.setLayout(null); // posicionamiento absoluto, con coordenadas
		ventana.setBounds(400, 250, 450, 450); // X Y Ancho Alto
		ventana.setTitle("Calculadora Sensilla");// Nombre de la ventana
		ventana.setResizable(false);// Dimencion de la ventana no modificable
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Botones y Textos de la ventana de bienvenida
		Bienvenido = new JLabel("           Bienvenido a la red Banelco");
		Bienvenido.setBounds(100, 40, 200, 30);
		ventana.add(Bienvenido);

		Bienvenido1 = new JLabel("                  Ingrese su tarjeta");
		Bienvenido1.setBounds(100, 80, 200, 30);
		ventana.add(Bienvenido1);

		Bienvenido2 = new JLabel("                      y digite su pin");
		Bienvenido2.setBounds(100, 120, 150, 30);
		ventana.add(Bienvenido2);

		Pin = new JTextField("0");
		Pin.setBounds(160, 160, 100, 20);
		ventana.add(Pin);

		Ingreso = new JButton("Ingresar");
		Ingreso.setBounds(140, 200, 150, 30);
		ventana.add(Ingreso);
		Ingreso.addActionListener(this); // Ver evento click

		// Boton Borrar
		botonReset = new JButton("Salir / Reiniciar");
		botonReset.setBounds(250, 350, 150, 30);
		ventana.add(botonReset);
		botonReset.addActionListener(this);// ver evento click

		// texto de try dato invalido oculto
		DatoInvalido = new JLabel("Dato Invalido ");
		DatoInvalido.setBounds(600, 600, 150, 30);
		ventana.add(DatoInvalido);
		// Boton Volver al Menu oculto
		VolverMenu = new JButton("Volver al Menu");
		VolverMenu.setBounds(600, 600, 150, 30);
		ventana.add(VolverMenu);
		VolverMenu.addActionListener(this);// ver evento click

		Enter = new JButton(" ");
		Enter.setBounds(600, 600, 150, 30);
		ventana.add(Enter);
		Enter.addActionListener(this);// ver evento click

		Enter1 = new JButton(" ");
		Enter1.setBounds(600, 600, 150, 30);
		ventana.add(Enter1);
		Enter1.addActionListener(this);// ver evento click

		Enter2 = new JButton(" ");
		Enter2.setBounds(600, 600, 150, 30);
		ventana.add(Enter2);
		Enter2.addActionListener(this);// ver evento click

		// Datos genericos Ocultos
		Datos1 = new JLabel("");
		Datos1.setBounds(600, 600, 250, 30);
		ventana.add(Datos1);
		Datos2 = new JLabel("");
		Datos2.setBounds(600, 600, 250, 30);
		ventana.add(Datos2);
		Datos3 = new JLabel("");
		Datos3.setBounds(600, 600, 250, 30);
		ventana.add(Datos3);
		Datos4 = new JLabel("");
		Datos4.setBounds(600, 600, 250, 30);
		ventana.add(Datos4);
		Datos5 = new JLabel("");
		Datos5.setBounds(600, 600, 250, 30);
		ventana.add(Datos5);

		Entero = new JTextField("0");
		Entero.setBounds(600, 600, 100, 20);
		ventana.add(Entero);

		DatoTexto = new JTextField("0");
		DatoTexto.setBounds(600, 600, 100, 20);
		ventana.add(DatoTexto);

		ventana.setVisible(true);

	}

	// Metodo de evento con Try catch + programa
	public void actionPerformed(ActionEvent evento) {

		DatoInvalido.setBounds(600, 600, 150, 30);

		// si el pin coincide borramos la pantalla y agregamos el menu
		try {

			if (evento.getSource() == Ingreso) {
				numero = Integer.valueOf(Pin.getText());
				Integer pin = Integer.valueOf(persona1.get(2));
				if (numero.equals(pin)) {
					QuitarBienvenida(); // quitamos bienvenida
					IngresarAlMenu(); // Agregamos el menu

				} else
					Datos1.setBounds(140, 230, 150, 30);
				Datos1.setText("Pin Incorrecto");
			}

			if (evento.getSource() == DatosCliente) {
				QuitarMenu();

				// traemos al Frente los datos
				Datos1.setText("Nombre completo: " + persona1.get(0));
				Datos1.setBounds(140, 100, 250, 30);

				Datos2.setText("CBU :" + persona1.get(1));
				Datos2.setBounds(140, 140, 250, 30);

				Datos3.setText("Pin: " + persona1.get(2));
				Datos3.setBounds(140, 180, 250, 30);

				Datos4.setText("Saldo Actual: " + persona1.get(3) + "$");
				Datos4.setBounds(140, 220, 250, 30);
				// traemos boton de volver
				VolverMenu.setBounds(140, 260, 150, 30);

			} else if (evento.getSource() == SaldoActual) {
				QuitarMenu();
				Datos4.setText("Saldo Actual: " + persona1.get(3) + "$");
				Datos4.setBounds(140, 220, 250, 30);
				VolverMenu.setBounds(140, 260, 150, 30);

			} else if (evento.getSource() == Deposito) {
				QuitarMenu();
				numero = 0;
				Datos1.setText("Ingrese el valor a depositar");
				Datos1.setBounds(140, 80, 250, 30);
				Entero.setBounds(90, 110, 250, 30);
				Enter.setBounds(140, 160, 150, 30);
				Enter.setText("Depositar");
				Datos2.setText("El monto depositado es : " + numero);
				Datos2.setBounds(140, 200, 250, 30);
				Datos4.setText("Saldo Actual: " + persona1.get(3) + "$");
				Datos4.setBounds(140, 220, 250, 30);
				VolverMenu.setBounds(140, 260, 150, 30);

			} else if (evento.getSource() == Enter) {
				numero = Integer.valueOf(Entero.getText());

				persona1.set(3, (Integer.toString((Integer.valueOf(persona1.get(3))) + numero)));
				Datos2.setText("El monto depositado es : " + numero);
				Datos2.setBounds(140, 200, 250, 30);
				Datos4.setText("Saldo Actual: " + persona1.get(3) + "$");
				Datos4.setBounds(140, 220, 250, 30);
				VolverMenu.setBounds(140, 260, 150, 30);
				Entero.setText("0");

			}

			else if (evento.getSource() == Extraccion) {
				QuitarMenu();
				numero = 0;
				Datos1.setText("Ingrese el valor a Extraer");
				Datos1.setBounds(140, 80, 250, 30);
				Entero.setBounds(90, 110, 250, 30);
				Enter1.setBounds(140, 160, 150, 30);
				Enter1.setText("Extraer");
				Datos2.setText("El monto Extraido es : " + numero);
				Datos2.setBounds(140, 200, 250, 30);
				Datos4.setText("Saldo Actual: " + persona1.get(3) + "$");
				Datos4.setBounds(140, 220, 250, 30);
				VolverMenu.setBounds(140, 260, 150, 30);

			} else if (evento.getSource() == Enter1) {
				numero = Integer.valueOf(Entero.getText());
				if ((Integer.valueOf(persona1.get(3))) > numero) {
					persona1.set(3, (Integer.toString((Integer.valueOf(persona1.get(3))) - numero)));
					Datos2.setText("El monto Extraido es : " + numero);
					Datos2.setBounds(140, 200, 250, 30);
					Datos4.setText("Saldo Actual: " + persona1.get(3) + "$");
					Datos4.setBounds(140, 220, 250, 30);
					VolverMenu.setBounds(140, 260, 150, 30);
					Entero.setText("0");
				} else
					Datos2.setText("El monto supera el saldo actual");

			} else if (evento.getSource() == Transferencia) {
				QuitarMenu();
				numero = 0;
				Datos1.setText("Ingrese el valor a transferir");
				Datos1.setBounds(140, 20, 250, 30);
				Entero.setBounds(90, 45, 250, 30);
				Datos3.setBounds(90, 70, 250, 30);
				Datos3.setText("Ingrese el Alias o CBU");
				DatoTexto.setBounds(90, 95, 250, 30);
				Enter2.setBounds(140, 135, 150, 30);
				Enter2.setText("Transferir");
				Datos5.setBounds(140, 180, 250, 30);
				Datos5.setText("CBU/ALIAS : ");
				Datos2.setText("El monto transferido es : " + numero);
				Datos2.setBounds(140, 200, 250, 30);
				Datos4.setText("Saldo Actual: " + persona1.get(3) + "$");
				Datos4.setBounds(140, 220, 250, 30);
				VolverMenu.setBounds(140, 260, 150, 30);

			} else if (evento.getSource() == Enter2) {
				numero = Integer.valueOf(Entero.getText());
				if ((Integer.valueOf(persona1.get(3))) > numero) {
					persona1.set(3, (Integer.toString((Integer.valueOf(persona1.get(3))) - numero)));
					Datos2.setText("El monto trasnferido es : " + numero);
					Datos2.setBounds(140, 200, 250, 30);
					Datos4.setText("Saldo Actual: " + persona1.get(3) + "$");
					Datos5.setText("CBU/ALIAS : " + (DatoTexto.getText()));
					Datos4.setBounds(140, 220, 250, 30);
					VolverMenu.setBounds(140, 260, 150, 30);
					Entero.setText("0");
				} else
					Datos2.setText("El monto supera el saldo actual");

			} else if (evento.getSource() == VolverMenu) {
				IngresarAlMenu();
				QuitarDatos();
			}
		} catch (Exception e) {
			DatoInvalido.setBounds(200, 300, 150, 30);

		}
		if (evento.getSource() == botonReset) {
			iniciar();
		}
	}

	private void QuitarDatos() {
		// TODO Auto-generated method stub
		Datos1.setBounds(600, 600, 200, 30);
		Datos2.setBounds(600, 600, 200, 30);
		Datos3.setBounds(600, 600, 200, 30);
		Datos4.setBounds(600, 600, 100, 20);
		VolverMenu.setBounds(600, 600, 150, 30);
		Entero.setBounds(600, 600, 250, 30);
		Enter.setBounds(600, 600, 150, 30);
		Enter1.setBounds(600, 600, 150, 30);
		Enter2.setBounds(600, 600, 150, 30);
		Datos5.setBounds(600, 600, 250, 30);
		DatoTexto.setBounds(600, 600, 100, 20);
		DatoInvalido.setBounds(600, 600, 150, 30);
	}

	private void QuitarMenu() {
		// TODO Auto-generated method stub
		DatosCliente.setBounds(600, 600, 200, 30);
		SaldoActual.setBounds(600, 600, 200, 30);
		Deposito.setBounds(600, 600, 200, 30);
		Extraccion.setBounds(600, 600, 100, 20);
		Transferencia.setBounds(600, 600, 150, 30);
		DatoInvalido.setBounds(600, 600, 150, 30);

	}

	private void IngresarAlMenu() {
		// TODO Auto-generated method stub
		DatosCliente = new JButton("Datos del Cliente");
		DatosCliente.setBounds(140, 100, 150, 30);
		ventana.add(DatosCliente);
		DatosCliente.addActionListener(this); // Ver evento click

		SaldoActual = new JButton("Saldo Actual");
		SaldoActual.setBounds(140, 140, 150, 30);
		ventana.add(SaldoActual);
		SaldoActual.addActionListener(this); // Ver evento click

		Deposito = new JButton("Deposito");
		Deposito.setBounds(140, 180, 150, 30);
		ventana.add(Deposito);
		Deposito.addActionListener(this); // Ver evento click

		Extraccion = new JButton("Extraccion");
		Extraccion.setBounds(140, 220, 150, 30);
		ventana.add(Extraccion);
		Extraccion.addActionListener(this); // Ver evento click

		Transferencia = new JButton("Transferencia");
		Transferencia.setBounds(140, 260, 150, 30);
		ventana.add(Transferencia);
		Transferencia.addActionListener(this); // Ver evento click
		ventana.setVisible(true);
	}

	private void QuitarBienvenida() {
		// TODO Auto-generated method stub
		Bienvenido.setBounds(600, 600, 200, 30);
		Bienvenido1.setBounds(600, 600, 200, 30);
		Bienvenido2.setBounds(600, 600, 200, 30);
		Pin.setBounds(600, 600, 100, 20);
		Ingreso.setBounds(600, 600, 150, 30);
		Datos1.setBounds(600, 600, 150, 30);
		DatoInvalido.setBounds(600, 600, 150, 30);
	}

	public static void iniciar() {

		new SimuladorCajero();

	}

}
