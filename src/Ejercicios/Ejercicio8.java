package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Ejercicio8 {
	
	public static String[] fromFichero2Array(File file) throws IOException{
		String[] listaCadena=new String[5];
		
		FileReader file1= new FileReader(file);
		
		BufferedReader file2 = new BufferedReader(file1);
		
		String aux;
		int i=0;
		
		aux = file2.readLine();
		while(aux!=null){
			
			
			listaCadena[i]=aux;
			
			
			aux = file2.readLine();
			

		i++;
		}
		
		file2.close();
		file1.close();
		
		
		
		return listaCadena;
	}
	public static boolean fromArray2Fichero(String[] listaCadena) throws IOException{
		boolean listo=false;
		File fichero = new File("C:\\Users\\Alumno\\git\\JavaEclipse\\src\\Ejercicios\\Pepito2");
		fichero.createNewFile();
		FileWriter fichero2 = new FileWriter(fichero);
		BufferedWriter escribir = new BufferedWriter(fichero2);
		int i=0;
		String aux= null;
		
		
		
		while(i<listaCadena.length){
			
			aux = listaCadena[i];
			escribir.write(aux);
			
			escribir.newLine();
			System.out.println(aux);
			
			
			
			i++;
		
		if(listaCadena[4]!=null){
			listo=true;
		}
		}
		
		
		escribir.close();
		fichero2.close();
		
		return listo;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Alumno\\git\\JavaEclipse\\src\\Ejercicios\\Pepito");
		String[]array = new String[5];
		
		array =fromFichero2Array(file);
		
		if(fromArray2Fichero(array)){
			System.out.println("Listo Creaste una copia del fichero");
			
		}else {
			System.out.println("Hiciste algo mal");
		}
		
	}
	
	
}
