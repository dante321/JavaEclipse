package Ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Ejercicio11 {

	/**
	 * Leer las historias segun el argumento que te ponga el usuario
	 * y volcarlo a un nuevo fichero. por switch + cases y  transformar el
	 * Start, End, Body.
	 * @throws FileNotFoundException 
	 */
	
//	public static String recibirPalabra(){
//	Scanner sc = new Scanner(System.in);
//	
//	String aux = sc.nextLine();
//	
//	return aux;
//	}
	
	private static final String PREF = "story_";
	private static final String SUF = ".properties";
			
	public static void main(String[] args) throws Exception {
		String nF= args[0];
		Properties fichero = new Properties();
		String dirFich= PREF+nF+SUF;
		//System.out.println(dirFich);
		
		FileReader fR = new FileReader(dirFich);
		
		try {
			fichero.load(fR);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("error abriendo");
		}
		//File fichero2 = new File(dirFich+"1");
				//fichero2.createNewFile();
		//FileWriter escrF = new FileWriter(fichero2);
				//BufferedWriter escrF2 = new BufferedWriter(escrF2);
		
		//System.out.println("En que formato de idioma quiere la historia?\n -es\n -en \n -it");
		String aux="";
		switch(args[0]){
			
		
			
		case "es":
			aux =fichero.getProperty("outfile")+": "+ fichero.getProperty("start")+" "+fichero.getProperty("body")+" "+fichero.getProperty("end");
		System.out.println(aux);
		
		//escrF.write(aux);
		//escrF.close();
		case "en":
		aux =fichero.getProperty("outfile")+": "+ fichero.getProperty("start")+" "+fichero.getProperty("body")+" "+fichero.getProperty("end");
		System.out.println(aux);
		
		//escrF.write(aux);
		//escrF.close();
		case "it":

		aux =fichero.getProperty("outfile")+": "+ fichero.getProperty("start")+" "+fichero.getProperty("body")+" "+fichero.getProperty("end");
			System.out.println(aux);
		
			//escrF.write(aux);
			//escrF.close();
		}
		
		fR.close();
		
		}
}	
	

