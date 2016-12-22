package edu.femxa.val;

import sun.applet.Main;

public class Ejercicio_D {

	public static void mostrarCodChars (String cadena){
		int longi = 0;
		int numero_caracter=0;
		char caracter=0;
		longi = cadena.length();
		
		for (int i = 0;i < longi; i++){
			
			
			caracter = cadena.charAt(i);
			System.out.println(caracter+"  ");
		}
	}
	
	public static void main(String[] args) {
		Ejercicio_D cesar = null;
		
		cesar = new Ejercicio_D();
		Ejercicio_D.mostrarCodChars("Lolipop");
		
		
		
	}
	
	
	
}
