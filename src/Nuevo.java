import java.util.Scanner;
public class Nuevo {
/** A)HACED UN MÉTODO QUE DADA UNA CADENA, MUESTRE CADA UNA DE LAS LETRAS CON UN BUCLE FOR
	B)HACED UN MÉTODO QUE DADA UNA CADENA Y UN NÚMERO N, MUESTRE LOS N PRIMEROS NÚMEROS DE LA CADENA
	C)HACED UN MÉTODO QUE DADA UNA CADENA Y UN NÚMERO N, MUESTRE LOS N ÚLTIMOS NÚMEROS DE LA CADENA
	D)HACED UN MÉTODO QUE DADA UNA CADENA Y UNA LETRA, DEVUELVA EL NÚMERO DE VECES QUE APARECE ESA LETRA EN ESA PALABRA
	**/
	
	
	
	
	//Problema B)
	public static void mostrarPalabraLetra(String palabra, int numero)
	{
		
		
		for (int i = 0; i < numero ; i++)
		{
			System.out.println("los primeros caracteres son "+palabra.charAt(i));
			
		}
	}
	
	
	public static void main(String[] args) {
		
		 
		mostrarPalabraLetra("dante", 3);
		
	
		
		
		
	}
}
