package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class Ejercicio9 {
	
	public static final int encrip = 45;
	
	public static void registrado(String nombre,String pass) throws IOException{
		File dir1 = new File("C:\\Users\\Alumno\\git\\JavaEclipse\\src\\Ejercicios\\Usuarios");
		dir1.createNewFile();
		File dir2 = new File("C:\\Users\\Alumno\\git\\JavaEclipse\\src\\Ejercicios\\Contraseñas");
		dir2.createNewFile();
		
		FileWriter regisName;
				regisName = new FileWriter(dir1);
			
			
		FileWriter regisPass;
				regisPass = new FileWriter(dir2);
			
		
		BufferedWriter regUsr = new BufferedWriter(regisName);
		
		BufferedWriter regPass = new BufferedWriter(regisPass);
	
		
			
			regUsr.write(nombre);
			regUsr.newLine();
			regPass.write(pass);
			regPass.newLine();
			
		if((dir1!=null)&&(dir2!=null)){
			System.out.println("El usuario se registro bien");
		}else{
			System.out.println("Hubo un error el el registro, revisa el codigo");
		}
		regUsr.close();
		regPass.close();
		regisName.close();
		regisPass.close();
		
		
		
	}
	
	public static boolean registrar() throws IOException{
		boolean registro = false;
		Scanner sc = new Scanner(System.in);
		String aux=null;
		String pass=null;
		String passConf=null;
		
		System.out.println("Porfavor introduzca su Nombre de Usuario, este debe tener almenos 6 caracteres:");
		
		aux = sc.nextLine();
		
		if(aux.length()>6){
			
			
		
		
		System.out.println("Gracias ahora introduzca su Contraseña, esta debe tener almenos 8 caracteres:");
		
		pass=sc.nextLine();
		
		if(pass.length()>8){
			
			System.out.println("Ahora confirme su contraseña:");
			passConf=sc.nextLine();
			if((pass)==(passConf)){
				System.out.println("Gracias usted se ha registrado correctamente");
				registro = true;
				System.exit(0);
				}
			}else{
			System.out.println("La contraseña introducida no cumple con los requisitos, intente denuevo:");
		registrar();
			}
		}else{
			System.out.println("Su nombre de usuario no cumple los requisitos");
			registrar();
		}
		registrado(aux, passConf);
		
		return registro;
	}
	
	
	
	
	public static void acceder() throws IOException{
		Scanner sc = new Scanner(System.in);
		String auxPass=null;
		String auxName=null;
		int contador=1;
		
		File file = new File("C:\\Users\\Alumno\\git\\JavaEclipse\\src\\Ejercicios\\Usuarios");
		File file2 = new File ("C:\\Users\\Alumno\\git\\JavaEclipse\\src\\Ejercicios\\Contraseñas");
		BufferedReader comprobarUsr = new BufferedReader(new FileReader(file));
		BufferedReader comprobarPass = new BufferedReader(new FileReader(file2));
	
		
			auxName = comprobarUsr.readLine();
			auxPass = comprobarPass.readLine();
			
			while(contador<4){
			
				System.out.println("Introduzca su nombre de usuario:");
				String name = sc.nextLine();
				System.out.println("Introduzca su contraseña:");
				String pass = sc.nextLine();
				if((auxName.equals(name))&&(auxPass.equals(pass)))
			{
				
				System.out.println("Bienvenido devuelta");
				contador=4;
			}else{
				System.out.println("Nombre de usuario o contraseña incorrecto, intenta otra vez");
				
				System.out.println("Tienes 3 intentos como maximo y estas en el intento NRO "+contador);
				contador++;
				
				
				
				
				if(contador>=4){
					System.exit(1);
				}
				
			}
				
			comprobarPass.close();
			comprobarUsr.close();
			
			
		}
			
	}
	
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-Registrarse\n2-Acceder\n3-Salir");
		int aux = sc.nextInt();
		if(aux==1){
		registrar();
		
		}
		else if (aux==2){
			acceder();
			
		}
		else if(aux==3){
			System.out.println("Adios <3");
			System.exit(0);
		}
	}
}
