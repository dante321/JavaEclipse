package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

/*	Haced un programa (Una clase Main) con dos métodos:

1) El main
2) y una función que reciba una cadena (String) con espacios en blanco; es decir, una frase; y devuelva esa frase, sin espacios, toda junta.

EJEMPLO: Si el texto de entrada fuera este
ESTO ES UNA FRASE
el texto de salida, sería este
ESTOESUNAFRASE

Obligatorio para todo el mundo*/
	
	public static String borraEspacios(String frase){
		int long_frase =frase.length();//Numero de longitud de frase introducida.
		char carac_actual=0;//Caracter actual mientras que se recorre la frase.
		String frase_aux=" ";//Frase vacia que usaremos para sumar caracteres y luego devolver la frase sin espacios.
		String fraseSinEspacios=null;//Frase final que devolvera la frase entera.
		
		for(int i=0;i<long_frase;i++){//Bucle para recorrer la frase.
			
			carac_actual=frase.charAt(i);
			if (carac_actual==' '){//Cada vez que se encuentre con un espacio pasara a la siguiente posicion de caracter.
				carac_actual++;
				}else{
					frase_aux = frase_aux + carac_actual;//La palabra vacia va sumando una a una cada caracter sin espacios.
				}
			
			fraseSinEspacios = frase_aux;//Cada vez que se suma un caracter la palabra final se guarda.
		}
		
		
		return fraseSinEspacios;
	}
	
	public static void main(String[] args) {
		String frases =null;
		String aux= null;
		
		
		Scanner sc=null;
		sc = new Scanner(System.in);
		
		System.out.println("introduzca su frase:");
		frases = sc.nextLine();
		
		aux = borraEspacios(frases);
		
		System.out.println("Su frase sin espacios es:"+aux);
	}
	
}
