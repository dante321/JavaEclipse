import java.util.Scanner;
public class Nuevo {
/** A)HACED UN M�TODO QUE DADA UNA CADENA, MUESTRE CADA UNA DE LAS LETRAS CON UN BUCLE FOR
	B)HACED UN M�TODO QUE DADA UNA CADENA Y UN N�MERO N, MUESTRE LOS N PRIMEROS N�MEROS DE LA CADENA
	C)HACED UN M�TODO QUE DADA UNA CADENA Y UN N�MERO N, MUESTRE LOS N �LTIMOS N�MEROS DE LA CADENA
	D)HACED UN M�TODO QUE DADA UNA CADENA Y UNA LETRA, DEVUELVA EL N�MERO DE VECES QUE APARECE ESA LETRA EN ESA PALABRA
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
