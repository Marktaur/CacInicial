package codoACodo;
import java.util.Scanner;

public class entradaString {

	public static void main(String[] args) {
		
		//variables
         
         Scanner miTecladoString;
         String nombre;
 
         
         System.out.println("Ingrese su nombre");
         
         miTecladoString = new Scanner(System.in); 
         nombre = miTecladoString.nextLine();
         miTecladoString.close();
         
         
 
         System.out.println(nombre);

	}

}
