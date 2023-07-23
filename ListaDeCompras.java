
package aplicaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ListaDeCompras implements ActionListener {
	// Listado de articulos
	ArrayList<String> Articulos = new ArrayList<String>();

	// variables Ventana principal y sub-ventanas
	private JFrame ventana;
	private JFrame ventana2;
	private JLabel texto;
	private JLabel Aviso;
	private JLabel Menu; // Menu de opciones de ventana principal
	private static JLabel leerGuardar;
	// variables boton / casilla de texto
	// ventana principal
	private JButton boton1; // +

	private JButton boton3; // Modificar Articulo
	private JButton boton4; // quitar Articulo
	private JButton boton5; // guardar lista
	private JButton boton6; // leer lista
	private JButton Reset;// borrar Cache del programa y reiniciar.

	// Sub ventanas
	private JButton Modificar; // Modificar sub ventana
	private JButton Eliminar; // Eliminar sub ventana
	private JButton Volver; // Volver sub ventana
	private JLabel Titulo1;// titulo generico sub ventana
	private JLabel Titulo2;// titulo generico sub ventana

	// para seleccionar el articulo a modificar o eliminar
	private JTextField casillaItem;

	// area de texto de ventana modificar Articulo
	private static JTextField NumeroDeitem;
	private JTextField Modificacion;

	// Articulos
	private static JLabel Articulo1;
	private static JLabel Articulo2;
	private static JLabel Articulo3;
	private static JLabel Articulo4;
	private static JLabel Articulo5;
	private static JLabel Articulo6;
	private static JLabel Articulo7;
	private static JLabel Articulo8;
	private static JLabel Articulo9;
	private static JLabel Articulo10;
	private static JLabel Articulo11;
	private static JLabel Articulo12;
	private static JLabel Articulo13;
	private static JLabel Articulo14;
	private static JLabel Articulo15;
	private static JLabel Articulo16;
	private static JLabel Articulo17;
	private static JLabel Articulo18;
	private static JLabel Articulo19;
	private static JLabel Articulo20;

	int NumeroItem;
	static int opcion;

	public ListaDeCompras() {
		// ventana principal
		ventana = new JFrame();
		ventana.setTitle("Lista de Compras");
		ventana.setVisible(true);

		ventana.setBounds(100, 70, 560, 650);
		ventana.setResizable(false);
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);

		// Sub ventanas
		ventana2 = new JFrame();
		ventana2.setTitle("");
		ventana2.setVisible(false);
		ventana2.setBounds(200, 200, 400, 200);
		ventana2.setResizable(false);
		//ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana2.setLayout(null);

		// Botones, textos ventana principal

		texto = new JLabel("Ingrese hasta un maximo 20 articulos " + "( Maximo 25 caracteres):");
		texto.setBounds(40, 30, 400, 30);
		ventana.add(texto);

		Aviso = new JLabel("Lista llena");
		Aviso.setBounds(700, 700, 400, 30);
		ventana.add(Aviso);

		Menu = new JLabel("Menu:");
		Menu.setBounds(410, 170, 50, 30);
		ventana.add(Menu);
		
		leerGuardar = new JLabel("");
		leerGuardar.setBounds(390, 345, 150, 30);
		ventana.add(leerGuardar);
		leerGuardar.setVisible(false);
		
		
		
		

		casillaItem = new JTextField("");
		casillaItem.setBounds(40, 70, 300, 30);
		ventana.add(casillaItem);

		boton1 = new JButton("+");
		boton1.setBounds(350, 70, 60, 30);
		ventana.add(boton1);
		boton1.addActionListener(this);

		boton3 = new JButton("Modificar articulo");
		boton3.setBounds(350, 200, 150, 30);
		ventana.add(boton3);
		boton3.addActionListener(this);

		boton4 = new JButton("Quitar articulo");
		boton4.setBounds(350, 260, 150, 30);
		ventana.add(boton4);
		boton4.addActionListener(this);

		boton5 = new JButton("Guardar lista");
		boton5.setBounds(350, 320, 150, 30);
		ventana.add(boton5);
		boton5.addActionListener(this);

		boton6 = new JButton("Leer Archivo");
		boton6.setBounds(350, 380, 150, 30);
		ventana.add(boton6);
		boton6.addActionListener(this);

		Reset = new JButton("Reset");
		Reset.setBounds(350, 540, 150, 30);
		ventana.add(Reset);
		Reset.addActionListener(this);

		// botones sub ventanas ocultos

		Modificar = new JButton("Modificar");
		Modificar.setBounds(60, 90, 90, 30);
		ventana2.add(Modificar);
		Modificar.addActionListener(this);
		Modificar.setVisible(false);

		Eliminar = new JButton("Eliminar");
		Eliminar.setBounds(60, 90, 90, 30);
		ventana2.add(Eliminar);
		Eliminar.addActionListener(this);
		Eliminar.setVisible(false);

		Volver = new JButton("Volver");
		Volver.setBounds(250, 90, 90, 30);
		ventana2.add(Volver);
		Volver.addActionListener(this);
		Volver.setVisible(false);

		NumeroDeitem = new JTextField("0");
		NumeroDeitem.setBounds(20, 40, 50, 30);
		ventana2.add(NumeroDeitem);
		NumeroDeitem.setVisible(false);

		Modificacion = new JTextField(" Ingrese el nuevo nombre del articulo");
		Modificacion.setBounds(80, 40, 250, 30);
		ventana2.add(Modificacion);
		Modificacion.setVisible(false);

		Titulo1 = new JLabel("");
		Titulo1.setBounds(20, 15, 300, 30);
		ventana2.add(Titulo1);
		Titulo1.setVisible(false);

		Titulo2 = new JLabel("");
		Titulo2.setBounds(80, 40, 250, 30);
		ventana2.add(Titulo2);

		// Articulos x 10 pri 40 120 300 475

		Articulo1 = new JLabel("-1-");
		Articulo1.setBounds(40, 120, 300, 30);
		ventana.add(Articulo1);

		Articulo2 = new JLabel("-2-");
		Articulo2.setBounds(40, 140, 300, 30);
		ventana.add(Articulo2);

		Articulo3 = new JLabel("-3-");
		Articulo3.setBounds(40, 160, 300, 30);
		ventana.add(Articulo3);

		Articulo4 = new JLabel("-4-");
		Articulo4.setBounds(40, 180, 300, 30);
		ventana.add(Articulo4);

		Articulo5 = new JLabel("-5-");
		Articulo5.setBounds(40, 200, 300, 30);
		ventana.add(Articulo5);

		Articulo6 = new JLabel("-6-");
		Articulo6.setBounds(40, 220, 300, 30);
		ventana.add(Articulo6);

		Articulo7 = new JLabel("-7-");
		Articulo7.setBounds(40, 240, 300, 30);
		ventana.add(Articulo7);

		Articulo8 = new JLabel("-8-");
		Articulo8.setBounds(40, 260, 300, 30);
		ventana.add(Articulo8);

		Articulo9 = new JLabel("-9-");
		Articulo9.setBounds(40, 280, 300, 30);
		ventana.add(Articulo9);

		Articulo10 = new JLabel("-10-");
		Articulo10.setBounds(40, 300, 300, 30);
		ventana.add(Articulo10);

		Articulo11 = new JLabel("-11-");
		Articulo11.setBounds(40, 320, 300, 30);
		ventana.add(Articulo11);

		Articulo12 = new JLabel("-12-");
		Articulo12.setBounds(40, 340, 300, 30);
		ventana.add(Articulo12);

		Articulo13 = new JLabel("-13-");
		Articulo13.setBounds(40, 360, 300, 30);
		ventana.add(Articulo13);

		Articulo14 = new JLabel("-14-");
		Articulo14.setBounds(40, 380, 300, 30);
		ventana.add(Articulo14);

		Articulo15 = new JLabel("-15-");
		Articulo15.setBounds(40, 400, 300, 30);
		ventana.add(Articulo15);

		Articulo16 = new JLabel("-16-");
		Articulo16.setBounds(40, 420, 300, 30);
		ventana.add(Articulo16);

		Articulo17 = new JLabel("-17-");
		Articulo17.setBounds(40, 440, 300, 30);
		ventana.add(Articulo17);

		Articulo18 = new JLabel("-18-");
		Articulo18.setBounds(40, 460, 300, 30);
		ventana.add(Articulo18);

		Articulo19 = new JLabel("-19-");
		Articulo19.setBounds(40, 480, 300, 30);
		ventana.add(Articulo19);

		Articulo20 = new JLabel("-20-");
		Articulo20.setBounds(40, 500, 300, 30);
		ventana.add(Articulo20);

		
		

		NumeroItem = 0;
		opcion = 0;
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		try {  // boton +
			if (evento.getSource() == boton1) {
				leerGuardar.setVisible(false);
				System.out.println("+");
				//preguntamos si el articulo a modificar ya existe
				
				int indiceItem;
				indiceItem = buscarItem(casillaItem.getText(), Articulos);
				if(indiceItem != -1) {
					leerGuardar.setVisible(true);
					leerGuardar.setText("El item ya se encuentra en la lista");
					Titulo2.setVisible(true);
					leerGuardar.setBounds(40, 100, 300, 30);
				} else {
				if (NumeroItem<=19) {
				agregarItem(NumeroItem);
				NumeroItem ++;}
				else avisoListaLLena();
				casillaItem.setText("");}
				
			}
		
			
			
			   //Modificar Articulo
			if (evento.getSource() == boton3) {
				leerGuardar.setVisible(false);
				System.out.println("Modificar lista");
				ventana2.setTitle("Modificar Articulo");
				ventana2.setVisible(true);
				Modificar.setVisible(true);
				Volver.setVisible(true);
				Modificacion.setVisible(true);
				NumeroDeitem.setVisible(true);
				Eliminar.setVisible(false);
				Titulo1.setVisible(true);
				Titulo1.setText("Ingrese el N° de articulo y modificacion :");
				
				
			}
			
			   //Quitar Articulo
			if (evento.getSource() == boton4) {
				leerGuardar.setVisible(false);
				System.out.println("Quitar");
				ventana2.setTitle("Quitar Articulo");
				ventana2.setVisible(true);
				Eliminar.setVisible(true);
				Modificar.setVisible(false);
				Volver.setVisible(true);
				
				NumeroDeitem.setVisible(true);
				Titulo1.setVisible(true);
				Titulo1.setText("Ingrese el N° de articulo a eliminar :");
				
				
			}
			
			   // Guardar Lista
			if (evento.getSource() == boton5) {
				System.out.println("Guardar");
				
				escribirArchivo(Articulos);
				
				
			}
			
			   // Leer Archivo
			if (evento.getSource() == boton6) {
				System.out.println("Leer");
				
				leerArchivo(Articulos);
			}
			
			
			if (evento.getSource() == Eliminar) {
				leerGuardar.setVisible(false);
				System.out.println("Eliminar articulo");
				
				if (((Integer.valueOf(NumeroDeitem.getText())>0)||(Integer.valueOf(NumeroDeitem.getText())>19)))
				{
					Titulo2.setText("Articulo Eliminado correctamente!!");
					Titulo2.setVisible(true);
		Articulos.add((Integer.valueOf(NumeroDeitem.getText())-1),"");
		
		
		
		
				
				  switch (Integer.valueOf(NumeroDeitem.getText())) {
				  case 1:
					  Articulo1.setText("-1- ");
					  break;
				  case 2:
					  Articulo2.setText("-2- ") ;
					  break;
				  case 3:
					  Articulo3.setText("-3- ");
					  break;
				  case 4:
					  Articulo4.setText("-4- ");
					  break;
				  case 5:
					  Articulo5.setText("-5- ");
					  break;
				  case 6:
					  Articulo6.setText("-6- ");
					  break;
				  case 7:
					  Articulo7.setText("-7- ");
					  break;
				  case 8:
					  Articulo8.setText("-8- ");
					  break;
				  case 9:
					  Articulo9.setText("-9- ");
					  break;
				  case 10:
					  Articulo10.setText("-10- ");
					  break;
				  case 11:
					  Articulo11.setText("-11- ");
					  break;
				  case 12:
					  Articulo12.setText("-12- ");
					  break;
				  case 13:
					  Articulo13.setText("-13- ");
					  break;
				  case 14:
					  Articulo14.setText("-14- ");
					  break;
				  case 15:
					  Articulo15.setText("-15- ");
					  break;
				  case 16:
					  Articulo16.setText("-16- ");
					  break;
				  case 17:
					  Articulo17.setText("-17- ");
					  break;
				  case 18:
					  Articulo18.setText("-18- ");
					  break;
				  case 19:
					  Articulo19.setText("-19- ");
					  break;
				  case 20:
					  Articulo20.setText("-20- ");
					  break;
					  default:
						  break;
				  }
			
				}
				else Titulo2.setText("Articulo inexistente");
				Titulo2.setVisible(true);
			
			}
			
			if (evento.getSource() == Modificar) {
				leerGuardar.setVisible(false);
				Modificacion.setVisible(false);
				Titulo2.setVisible(true);
				
				//preguntamos que el texto no quiera usarse como articulo
				if(!Modificacion.getText().equals(" Ingrese el nuevo nombre del articulo")) {
					
				
				
				//preguntamos si el numero a borrar es un numero entre 0 y 19 
				if (((Integer.valueOf(NumeroDeitem.getText())>0)||(Integer.valueOf(NumeroDeitem.getText())>19)))
				{
				 //preguntamos si el articulo a modificar ya existe
					
					int indiceItem;
					indiceItem = buscarItem(Modificacion.getText(), Articulos);
					if(indiceItem != -1) {
						Modificacion.setVisible(false);
						Titulo2.setText("El item ya se encuentra en la lista");
						Titulo2.setVisible(true);					
					} else {
						
						
					//sumamos a la lista de articulos la modificacion 
		Articulos.add((Integer.valueOf(NumeroDeitem.getText())-1),Modificacion.getText());
		Modificacion.setVisible(false);
		Titulo2.setText("Articulo modificado correctamente!!");
		Titulo2.setVisible(true);
		
		Modificacion.setVisible(false);
		
		
				//pasamos el articulo modificado a la linea de texto de la lista
				 
				  switch (Integer.valueOf(NumeroDeitem.getText())) {
				  case 1:
					  Articulo1.setText("-1- " +Articulos.get(0));
					  break;
				  case 2:
					  Articulo2.setText("-2- " +Articulos.get(1));
					  break;
				  case 3:
					  Articulo3.setText("-3- " +Articulos.get(2));
					  break;
				  case 4:
					  Articulo4.setText("-4- " +Articulos.get(3));
					  break;
				  case 5:
					  Articulo5.setText("-5- " +Articulos.get(4));
					  break;
				  case 6:
					  Articulo6.setText("-6- " +Articulos.get(5));
					  break;
				  case 7:
					  Articulo7.setText("-7- " +Articulos.get(6));
					  break;
				  case 8:
					  Articulo8.setText("-8- " +Articulos.get(7));
					  break;
				  case 9:
					  Articulo9.setText("-9- " +Articulos.get(8));
					  break;
				  case 10:
					  Articulo10.setText("-10- " +Articulos.get(9));
					  break;
				  case 11:
					  Articulo11.setText("-11- " +Articulos.get(10));
					  break;
				  case 12:
					  Articulo12.setText("-12- " +Articulos.get(11));
					  break;
				  case 13:
					  Articulo13.setText("-13- " +Articulos.get(12));
					  break;
				  case 14:
					  Articulo14.setText("-14 " +Articulos.get(13));
					  break;
				  case 15:
					  Articulo15.setText("-15- " +Articulos.get(14));
					  break;
				  case 16:
					  Articulo16.setText("-16- " +Articulos.get(15));
					  break;
				  case 17:
					  Articulo17.setText("-17- " +Articulos.get(16));
					  break;
				  case 18:
					  Articulo18.setText("-18- " +Articulos.get(17));
					  break;
				  case 19:
					  Articulo19.setText("-19- " +Articulos.get(18));
					  break;
				  case 20:
					  Articulo20.setText("-20- " +Articulos.get(19));
					  break;
					  default:
						  break;
				 
				 }
		      }
			}
			
		} else	Titulo2.setText("Dato invalido, Vuelva a Comenzar");
	}
			if (evento.getSource() == Volver) {
				System.out.println("Volver");
				ventana2.setVisible(false);
				ventana.setVisible(true);
				Titulo2.setText("");
				Modificacion.setText(" Ingrese el nuevo nombre del articulo");
				Modificacion.setVisible(false);
				NumeroDeitem.setText("0");
				Titulo2.setVisible(false);
				Eliminar.setVisible(false);
				Modificar.setVisible(false);
				Volver.setVisible(false);
				NumeroDeitem.setText("0");
				NumeroDeitem.setVisible(true);
				Titulo1.setVisible(true);
				
			}
			
			
			if (evento.getSource() == Reset) {
				leerGuardar.setVisible(false);
				System.out.println("reset");
				ventana.setVisible(false);
				ListaDeCompras.iniciar();//el programa se reinicia
				
			}
			
		}
	

	catch(Exception e)
	{   System.out.println("error");
	    Titulo2.setVisible(true);
		Titulo2.setText("Dato invalido");
	}
}

	static void escribirArchivo(ArrayList<String> Articulos) {
		// TODO Auto-generated method stub
		    System.out.println(Articulos.get(0));
		    System.out.println(Articulos.get(1));
			FileWriter archivo = null; //import java.io.FileWriter;
			String rutaArchivo = "listaCompras.txt";
			try {
			archivo = new FileWriter(rutaArchivo);
			// Escribimos linea a linea en el archivo
			for (String item : Articulos) {
			archivo.write(item + "\n");
			}
			System.out.println("Se escribieron los datos");
			leerGuardar.setVisible(true);
			leerGuardar.setText("Guardada ok");
			leerGuardar.setBounds(390, 345, 150, 30);
			
			archivo.close();
			} catch (Exception error) {
			System.out.println("Mensaje de la excepción: " +

			error.getMessage());
			leerGuardar.setVisible(true);
			leerGuardar.setText("Guardar fallo");
			leerGuardar.setBounds(390, 405, 150, 30);
			}
			}
		
	static  void leerArchivo(ArrayList<String> Articulos) {
		
		String rutaArchivo = "listaCompras.txt";
		File archivo = new File(rutaArchivo);
		Scanner contenidoArchivo = null;
		// Leemos el contenido del archivo
		try {
		System.out.println("... Leemos el contenido del archivo ...");
		contenidoArchivo = new Scanner(archivo);
		while (contenidoArchivo.hasNextLine()) {
		String linea = contenidoArchivo.nextLine();
		Articulos.add(linea);
		leerGuardar.setVisible(true);
		leerGuardar.setText("Leido ok");
		leerGuardar.setBounds(390, 405, 150, 30);
		System.out.println(Articulos.get(opcion));
		System.out.println(opcion);
		opcion++;
		switch (opcion) {
		  case 1:
			  Articulo1.setText("-1- " +Articulos.get(0));
			  break;
		  case 2:
			  Articulo2.setText("-2- " +Articulos.get(1));
			  break;
		  case 3:
			  Articulo3.setText("-3- " +Articulos.get(2));
			  break;
		  case 4:
			  Articulo4.setText("-4- " +Articulos.get(3));
			  break;
		  case 5:
			  Articulo5.setText("-5- " +Articulos.get(4));
			  break;
		  case 6:
			  Articulo6.setText("-6- " +Articulos.get(5));
			  break;
		  case 7:
			  Articulo7.setText("-7- " +Articulos.get(6));
			  break;
		  case 8:
			  Articulo8.setText("-8- " +Articulos.get(7));
			  break;
		  case 9:
			  Articulo9.setText("-9- " +Articulos.get(8));
			  break;
		  case 10:
			  Articulo10.setText("-10- " +Articulos.get(9));
			  break;
		  case 11:
			  Articulo11.setText("-11- " +Articulos.get(10));
			  break;
		  case 12:
			  Articulo12.setText("-12- " +Articulos.get(11));
			  break;
		  case 13:
			  Articulo13.setText("-13- " +Articulos.get(12));
			  break;
		  case 14:
			  Articulo14.setText("-14 " +Articulos.get(13));
			  break;
		  case 15:
			  Articulo15.setText("-15- " +Articulos.get(14));
			  break;
		  case 16:
			  Articulo16.setText("-16- " +Articulos.get(15));
			  break;
		  case 17:
			  Articulo17.setText("-17- " +Articulos.get(16));
			  break;
		  case 18:
			  Articulo18.setText("-18- " +Articulos.get(17));
			  break;
		  case 19:
			  Articulo19.setText("-19- " +Articulos.get(18));
			  break;
		  case 20:
			  Articulo20.setText("-20- " +Articulos.get(19));
			  break;
			  default:
				  break;
		 
		 }
		
		
		}
		contenidoArchivo.close();
		}
		catch (Exception exContenido) {
			leerGuardar.setVisible(true);
			leerGuardar.setText("Leer Fallo");
			leerGuardar.setBounds(390, 405, 150, 30);
		System.out.println("Mensaje: " + exContenido.getMessage());
		}
		}	
		
		
		
		
		
	

	private void avisoListaLLena() {

		Aviso.setBounds(40, 90, 400, 30);

	}

	static int buscarItem(String item, ArrayList<String> Articulos) {
		int indiceItem;
       
		indiceItem = Articulos.indexOf(item);
		System.out.println(indiceItem );
		return indiceItem; // retornar el índice del item o -1
	}

	private int agregarItem(int NumeroItem) {
		// TODO Auto-generated method stub

		Articulos.add(NumeroItem, casillaItem.getText());

		System.out.println(NumeroItem);
		switch (NumeroItem + 1) {
		case 1:
			Articulo1.setText("-1- " + Articulos.get(0));
			break;
		case 2:
			Articulo2.setText("-2- " + Articulos.get(1));
			break;
		case 3:
			Articulo3.setText("-3- " + Articulos.get(2));
			break;
		case 4:
			Articulo4.setText("-4- " + Articulos.get(3));
			break;
		case 5:
			Articulo5.setText("-5- " + Articulos.get(4));
			break;
		case 6:
			Articulo6.setText("-6- " + Articulos.get(5));
			break;
		case 7:
			Articulo7.setText("-7- " + Articulos.get(6));
			break;
		case 8:
			Articulo8.setText("-8- " + Articulos.get(7));
			break;
		case 9:
			Articulo9.setText("-9- " + Articulos.get(8));
			break;
		case 10:
			Articulo10.setText("-10- " + Articulos.get(9));
			break;
		case 11:
			Articulo11.setText("-11- " + Articulos.get(10));
			break;
		case 12:
			Articulo12.setText("-12- " + Articulos.get(11));
			break;
		case 13:
			Articulo13.setText("-13- " + Articulos.get(12));
			break;
		case 14:
			Articulo14.setText("-14 " + Articulos.get(13));
			break;
		case 15:
			Articulo15.setText("-15- " + Articulos.get(14));
			break;
		case 16:
			Articulo16.setText("-16- " + Articulos.get(15));
			break;
		case 17:
			Articulo17.setText("-17- " + Articulos.get(16));
			break;
		case 18:
			Articulo18.setText("-18- " + Articulos.get(17));
			break;
		case 19:
			Articulo19.setText("-19- " + Articulos.get(18));
			break;
		case 20:
			Articulo20.setText("-20- " + Articulos.get(19));
			break;
		default:
			break;

		}

		return 1;

	}

	public static void iniciar() {
		new ListaDeCompras();

	}
}
