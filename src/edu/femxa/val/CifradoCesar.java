package edu.femxa.val;

public class CifradoCesar {

	public static String codificacion(String palabra,int clave){
		int longi=0;
		
		int n_caracter=0;
		
		char caracter =0;
		
		char codificado = 0;
		
		String palabraCodificada = "";
		
		String palabra2 = null;
		
		longi = palabra.length();
		
		for (int i =0; i<longi;i ++){
		
			
				caracter=palabra.charAt(i);
			
			System.out.println("Caracter por codificar :"+caracter);
			
				
				n_caracter = (int)palabra.charAt(i)+clave;
				
				
			
			System.out.println("El caracter codificado es: "+n_caracter);
				
				codificado = (char)n_caracter;
			
				
			
				System.out.println("La codificacion es: "+codificado);
				
				palabraCodificada = palabraCodificada +codificado;
				
				
				palabra2 = palabraCodificada;
				
				
				
		}
		System.out.println("La palabra codificada es: "+palabra2);
		
		return palabraCodificada;
		
	}
	
	public static void main(String[] args) {
		
		
		CifradoCesar.codificacion("almendra",3);
	}	
}
