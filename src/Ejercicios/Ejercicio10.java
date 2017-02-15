package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	/**
	 *HACED UNA APP QUE CON UN MENÚ QUE PERMITA DAR DE ALTA EMPLEADOS Y ELMINARLOS.
	 *PARA DAR DE ALTA, SE PEDIRÁN LOS DATOS DE UN EMPLEADO (SÓLO LOS OBLIGATORIOS REQUERIDOS POR LA BASE DE DATOS, ES DECIR; LOS QUE NO PUEDEN SER NULL Y LA CLAVE PRIMARIA) Y SE REALIZARÁ EL INSERT SQL EN LA TABLA EMPLOYEES
	 *PARA LA SEGUNDA OPCIÓN, SE PIDE EL ID DEL EMPLEADO Y SE EJECUTA EL DELETE DE ESE REGISTRO
	 */
	public static String Escribir(){
		String palabra=null;
		Scanner sc = new Scanner(System.in);
		palabra = sc.nextLine();
		return palabra;
	}
	
	
	public boolean Eliminado(String nombre,int id){
		boolean eliminar=false;
		
		
		return eliminar;
	}
	public boolean Alta(String nombre, int id){
		boolean deAlta=false;
		
		
		
		return deAlta;
	}
	
	public static void main(String[] args) {
		
	}
	
}
