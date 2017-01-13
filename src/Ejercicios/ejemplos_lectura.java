package Ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ejemplos_lectura {

	public static void leer_fichero(String fichero) throws IOException{
		String dentroFichero="";
		FileReader fichero1 = new FileReader(new File(fichero));
		int i=0;
		int charAux;
		int suma=0;
		
		
		while((i=fichero1.read())!=-1){
			
			charAux=i;
			
			
			char aux = (char)charAux;
			
			dentroFichero = dentroFichero + aux;
			suma = suma + i;
		
		}
		System.out.println("Dentro del fichero hay: "+dentroFichero);
		System.out.println("La suma de la equivalencia int de todos los caracteres es "+suma);
		fichero1.close();
	}

	
	

	public static void main(String[] args) throws IOException {
		String direccion = "C:\\Users\\Alumno\\git\\JavaEclipse\\nada";
		leer_fichero(direccion);
		
		
	}
	
	
	
	
	
}
