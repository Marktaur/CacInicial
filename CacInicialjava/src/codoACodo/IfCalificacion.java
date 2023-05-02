package codoACodo;

public class IfCalificacion {
	public static void main(String[] args) {
		
		//variables
		int calificacion;
		
		//Calificacion 
		calificacion = 9;
		
		//Algoritmo
		if (calificacion==10) {
			System.out.println("Calificacion de honor");}
		 else if (calificacion==9){
			System.out.println("Sobresaliente");}
		 else if (calificacion==8&&calificacion==7){
			System.out.println("Notable");}
		 else if  (calificacion==6){
			System.out.println("Bien");}
		 else if  (calificacion==5){
			System.out.println("Aprobado");}
		 else if  (calificacion>=0||calificacion<5){
			System.out.println("Suspenso");}
		else {System.out.println("No es un calificacion");}
		
		
}
	}