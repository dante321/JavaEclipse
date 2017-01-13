package Ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {
	private static Scanner sc;



	/**
	 * Hacer un programa que te permita crear fichero y borrarlo.
	 * @throws IOException 
	 */
	
	public static boolean crearFichero(String nombreF) throws IOException{
		boolean creado = true;
		File crear = new File("."+"\\"+nombreF);
		
		if((creado)&&(crear.createNewFile())){
			
			
			
			System.out.println("El fichero se creo exitosamente, eres el nuevo Bill Gates :V");
			
		}else {
			System.out.println("No se pudo crear el fichero, deja la programacion :V");
		}
		
		
		return creado;
	}
	
	public static void borrarFichero(String nombreF) throws IOException{
		boolean borrado =true;
		File borrar = new File("."+"\\"+nombreF);
		
		if((borrado)&&(borrar.delete())){
			
			
			System.out.println("El fichero se ha borrado, ha parecido un accidente >:B");
			
		}else{
			System.out.println("El fichero no se puedo borrar, es hora de cambiar de profesion");
		}
		
		
		
		
		}
	
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc =null;
		
		String borrar;
		String crear ;
		String aux ;
		
		sc = new Scanner(System.in);
		
		System.out.println("¿Quieres Crear o Borrar un fichero?");
		aux = sc.nextLine();
		
	
		if((aux.equals("Crear"))||(aux.equals("crear"))){
		
			
			
		System.out.println("¿Con que nombre quieres crear el fichero?");
		crear = sc.nextLine();
		
		crearFichero(crear);
		
		
		}else if ((aux.equals("Borrar"))||(aux.equals("borrar"))){
			
			
			System.out.println("¿Que fichero quieres borrar?");
			borrar = sc.nextLine();
			
			borrarFichero(borrar);
			
		}
		}
}
