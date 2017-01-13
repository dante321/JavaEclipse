package Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejemplos_lectura {

	public static void leer_fichero(String fichero) throws IOException{
		
		FileReader fichero1 = new FileReader(new File(fichero));
		int i=0;
		int charAux;
		int suma=0;
		
		
		while(i!=-1){
			charAux=fichero1.read();
			
			i=charAux;
			char aux = (char)charAux;
			
			suma = suma + i;
		System.out.println("La letra es "+aux);
		}
	
		System.out.println("La suma de la equivalencia int de todos los caracteres es "+suma);
		fichero1.close();
	}

	
	

	public static void main(String[] args) throws IOException {
		String direccion = "C:\\Users\\Alumno\\git\\JavaEclipse\\nada";
		leer_fichero(direccion);
		
		
	}
	
	
	
	
	
}
