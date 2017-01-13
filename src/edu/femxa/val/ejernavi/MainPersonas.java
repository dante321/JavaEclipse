package edu.femxa.val.ejernavi;

import java.util.Scanner;

import sun.util.BuddhistCalendar;

public class MainPersonas {

	public static String agregarNombre(){
		String nombre;
		
		Scanner sc = null;
		sc = new Scanner(System.in);	
		
		nombre = sc.nextLine();
		
		return nombre;
	}
	
	public static int agregarEdad(){
		int edad;
		
		Scanner sc = null;
		sc = new Scanner(System.in);
		edad = sc.nextInt();
		
		return edad;
	}
	
	
	public static void main(String[] args) {
		ListaPersonas lista;
		lista =new ListaPersonas();
		
		Persona persona1=null;
		persona1=new Persona();
		
		Persona persona=null;
		persona = new Persona();
		String n_aux;
		int ed_aux;
		
		int posBuscada=0;
		
		Persona personaAux=null;
		personaAux=new Persona();
		
			System.out.println("Introduzca nombre 1");
			n_aux=agregarNombre();
			
			System.out.println("Introduzca edad 1");
			ed_aux=agregarEdad();
			
			
			persona.setEdad(ed_aux);
			persona.setNombre(n_aux);
			lista.insertarPersona(persona);
			
			System.out.println("Introduzca nombre 2");
			n_aux=agregarNombre();
			System.out.println("Introduzca edad 2");
			ed_aux=agregarEdad();
			
			persona1.setNombre(n_aux);
			persona1.setEdad(ed_aux);
			lista.insertarPersona(persona1);
			
			posBuscada =lista.buscarPersonaPos("Mario");
			
			System.out.println("El usuario Buscado:");
			personaAux =lista.obtenerPersona(posBuscada);
			personaAux.mostrarPersona();
	
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
