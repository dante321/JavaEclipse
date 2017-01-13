package Ejercicios;

import java.io.File;

public class Ejercicio3 {

	/**Hacer un programa que liste los directorios que contengan una vocal 'a'.
	 * 
	 */

	public static boolean encontrada(String palabra){
		char charAt;
		
		boolean encontrado = false;
		
		for (int i=0;i<palabra.length();i++){
			charAt = palabra.charAt(i);
			if (charAt == 'a'){
				
		encontrado=true;
		
			}
		}
		return encontrado;
	}
	
	public static void leerDirectorio(String[] dir){
		
		
		
		for (int i=0;i<dir.length;i++){
		
			if(encontrada(dir[i])){
				System.out.println(dir[i]);			
			}
		}
		
	}
	
	public static void main(String[] args) {
	
		File dir = null;
		String direccion = "C:\\Users\\Alumno\\Desktop\\Random cosas";
		String[] lista =null;
		dir = new File(direccion);
		
		lista = dir.list();
		
		leerDirectorio(lista);
				
	}
}