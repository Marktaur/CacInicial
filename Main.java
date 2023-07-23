package aplicaciones;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main implements ActionListener {
    
	
	//definimos botones y textos
	private JFrame ventana;
	private JLabel titulo;
	private JLabel titulo2;
	private JLabel titulo3;
	private JLabel titulo4;
	private JLabel titulo5;
	private JLabel menu;
	private JButton boton;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton boton10;
	
	
	
	public Main() {
		
		//Definimos la Ventana
		ventana = new JFrame();  // ventana
		ventana.setTitle("Integrador Grupo 3");  //titulo de la ventana
		
		ventana.setBounds(150,150, 310,530); //  x y , ancho alto 
		ventana.setResizable(false); //que no pueda redimencionarse
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(null);
		
		//Creamos titulos y menu
		JLabel titulo = new JLabel("Tabajo integrador");
		JLabel titulo2 = new JLabel("Grupo n°3 ");
		JLabel titulo3 = new JLabel("integrates:");
		JLabel titulo4 = new JLabel("Giselle Bulacio");
		JLabel titulo5 = new JLabel("Marcos Benassi");
		JLabel menu = new JLabel("                                  MENU");
		
		// Ubicacion de titulos y menu en eje X Y Ancho y Alto
		titulo.setBounds(20,1,255,30);
		titulo2.setBounds(20,20,255,30);
		titulo3.setBounds(20,40,255,30);
		titulo4.setBounds(20,60,255,30);
		titulo5.setBounds(20,80,255,30);
		menu.setBounds(20,100,255,30);
		
		//Agregamos los titulos a la Ventana
		ventana.add(titulo); 
		ventana.add(titulo2);
		ventana.add(titulo3);
		ventana.add(titulo4);
		ventana.add(titulo5);
		ventana.add(menu);
		
		//Creamos los Botones
		boton= new JButton("Numero par o impar"); //creamos un boton y le agregamos un nombre
		boton.setBounds(20,125,255,30); //ubicacion y dimenciones del boton
		ventana.add(boton); // agregamos boton a la ventana
		boton.addActionListener(this);
		
		boton2= new JButton("Factorial de un numero"); 
		boton2.setBounds(20,160,255,30); 
		ventana.add(boton2);
		boton2.addActionListener(this);
		
		boton3= new JButton("Promedio de notas"); 
		boton3.setBounds(20,195,255,30); 
		ventana.add(boton3);
		boton3.addActionListener(this);
		
		boton4= new JButton("Piedra, Papel y Tijeras"); 
		boton4.setBounds(20,230,255,30); 
		ventana.add(boton4);
		boton4.addActionListener(this);
		
		boton5= new JButton("Simulador de cajero"); 
		boton5.setBounds(20,265,255,30); 
		ventana.add(boton5);
		boton5.addActionListener(this);
		
		boton6= new JButton("Lista de compras"); 
		boton6.setBounds(20,300,255,30); 
		ventana.add(boton6);
		boton6.addActionListener(this);
		
		boton7= new JButton("Conversor de Temperatura"); 
		boton7.setBounds(20,335,255,30); 
		ventana.add(boton7);
		boton7.addActionListener(this);
		
		boton8= new JButton("Contador de clics"); 
		boton8.setBounds(20,370,255,30); 
		ventana.add(boton8);
		boton8.addActionListener(this);
		
		boton9= new JButton("Calculadora Simple"); 
		boton9.setBounds(20,405,255,30); 
		ventana.add(boton9);
		boton9.addActionListener(this);
		
		boton10= new JButton("Conversor de divisas"); 
		boton10.setBounds(20,440,255,30); 
		ventana.add(boton10);
		boton10.addActionListener(this);
		
		ventana.setVisible(true);  //visibilidad de la ventana
	}
	
	public static void main(String[] args) {
		       new Main();

	}
    //capturamos cada click y lo redirigimos a su funcion
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getSource() == boton) {
			NumeroParImpar.iniciar(); }
		if (evento.getSource() == boton2) {
			Factorial.iniciar(); }
		if (evento.getSource() == boton3) {
			PromedioNotas.iniciar(); }
		if (evento.getSource() == boton4) {
			PiedrasPapelTijeras.iniciar(); }
		if (evento.getSource() == boton5) {
			SimuladorCajero.iniciar(); }
		if (evento.getSource() == boton6) {
			ListaDeCompras.iniciar(); }
		if (evento.getSource() == boton7) {
			ConvertirTemperatura.iniciar(); }
		if (evento.getSource() == boton8) {
			 ContadorDeClics.iniciar(); }
		if (evento.getSource() == boton9) {
			CalculadoraSencilla.iniciar(); }
		if (evento.getSource() == boton10) {
			ConversorDeDivisas.iniciar(); }

	}

}
