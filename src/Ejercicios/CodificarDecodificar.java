package Ejercicios;

import java.util.Scanner;

public class CodificarDecodificar {

	
	/**
     * Haced el cuerpo de los métodos
     * y un pequeño main para probarse
     * de forma que luego podamos
     * usar esta clase para codificar
     * decodificar ficheros
     *
     * Un método codifica el mensaje
     * y llamando al método decodifica,
     * recuperaría el mensaje origina
     *
     * @author Administrador
     *
     */
	
		public final static int cod = 45;
        public static String codifica (String cadena)
        {
            String aux="";
            int a;
            char aux2=0;
            for (int i=0;i<cadena.length();i++){
                
            a = (int)cadena.charAt(i);
            
            aux2 =(char) ((char)a+cod);
            aux = aux +aux2;
            }
        return aux;
        }
        public static String decodifica (String cadena)
        {
            int i=0;
            String aux="";
            int aux2;
            char a;
            
            while(i<cadena.length()){
                if(cadena.charAt(i)!=' '){
                    
                    aux2 =(int)cadena.charAt(i);
                    a =(char) ((char)aux2-cod);
                    aux = aux +a;
                    
                }else{
                	i++;
                }
                
                
                i++;
            }
            
        return aux;
        
        
        }
        public static void main(String[] args) {
        	
            String aux;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la palabra");
            aux = sc.nextLine();
            
            aux=codifica(aux);
            System.out.println("La palabra codificada es "+aux);
            
            aux=decodifica(aux);
            System.out.println("La palabra decodificada es "+aux);
            
            
        }
	
	
	
	
	
}
