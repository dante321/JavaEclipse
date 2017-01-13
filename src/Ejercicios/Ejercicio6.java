package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	/**
	 * Para calcular la letra del DNI, hay un algoritmo, que consiste en obtener el resto de la división entera entre el número dni y 23.

Esto, nos da un número, cuya posición en la lista de caracteres dada, representa la letra del DNI.

AYUDA: Usad el código que se adjunta como base de la solución
	 */
	public static String caracteresDNI="TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static void adivinarLetraDni(int num){
		int aux = num%23;
		
		
			System.out.println(caracteresDNI.charAt(aux));		
		
		}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Dime tu numero de DNI y te dire su letra correspondiente");
		int dni =sc.nextInt();
		
		adivinarLetraDni(dni);
	}
	
	
	
}
