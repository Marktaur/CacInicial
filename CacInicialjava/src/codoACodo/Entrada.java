package codoACodo;
//usamos la libreria de util, clase scanner
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		//variables
         int edad;
         Scanner  miTeclado;
  
         
         //le pedimos ingresar una edad entera
         System.out.println("Ingrese su edad");
         
         miTeclado = new Scanner(System.in); 
         edad = miTeclado.nextInt(); //proximo es int es entero
         miTeclado.close();

         
         
         
         System.out.println(edad);
         System.out.println("Programa Finalizado");
      


	}

}
