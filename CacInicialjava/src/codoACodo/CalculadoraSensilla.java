package codoACodo;
//usamos la libreria de util, clase scanner
import java.util.Scanner;

public class CalculadoraSensilla {

	public static void main(String[] args) {
		
		//variables
         int numero1=0, numero2=0, opcion=0;
         
         Scanner  miTeclado;   //variable scanner nombre miteclado
  
         
         //le pedimos ingresar un valor 
         miTeclado = new Scanner(System.in); 
         System.out.println("Bienvenidos a la calculadora");
         System.out.println("Por favor ingrese el primer valor");
         numero1 = miTeclado.nextInt();
         System.out.println("Por favor ingrese el segundo valor");
         numero2 = miTeclado.nextInt();
         System.out.println("Elija opcion 1 si quiere Sumar los dos valores");
         System.out.println("Elija opcion 2 si quiere restar los dos valores");
         System.out.println("Elija opcion 3 si quiere multiplicar los dos valores");
         System.out.println("Elija opcion 4 si quiere dividir los dos valores");
         opcion = miTeclado.nextInt();
         miTeclado.close();
         
         if (opcion==1) {
 			System.out.println("el resultador es " + (numero1+numero2));}
 		 else if (opcion==2){
 			System.out.println("el resultador es " + (numero1-numero2));  }
 		 else if (opcion==3){
 			System.out.println("el resultador es " + (numero1*numero2));  }
 		 else if  (opcion==4){
 			System.out.println("el resultador es " + (numero1/numero2));   }
 		 
 		else {System.out.println("Opcion incorrecta.");  }
         

        System.out.println("Programa Finalizado");
      


	}

}