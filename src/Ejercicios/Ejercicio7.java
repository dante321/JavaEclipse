package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	/**
     * HACED EL CUERPO DEL MAIN
     * PARA QUE DEVUELVA LA NOTA
     * MEDIA
     *
     * Ojo con los tipos
     * la media será real (float)
     *
     */
     
     public static void main(String[] args) {
         float aux=0;
         
       System.out.println("Tus notas son: ");
       for (int i=0;i<array_notas.length;i++){
       System.out.println(array_notas[i]);
       }
       aux =mediaNota(array_notas);
             
       System.out.println("Tu media es: "+aux);
         
     }
     private static int[] array_notas = {0, 10, 2, 6, 7, 5, 4};
     
     public static float mediaNota(int[]notas){
         float media=0;
         int aux=0;
         int suma=0;
         
         for(int i=0;i<notas.length;i++){
         aux = notas[i];
         suma = suma+aux;
         }
         media = suma/notas.length;
         return media;
     }
   
     
     }
