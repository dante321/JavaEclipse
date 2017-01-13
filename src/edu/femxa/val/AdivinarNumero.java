package edu.femxa.val;

import java.util.Scanner;

public class AdivinarNumero {

	public int x = (int) (100*Math.random()+1);
	
	
	public boolean intentoBn (int numeroIntroducido){
		boolean acertaste=false;
		int numero = numeroIntroducido;
		if (x != numero) {
	 acertaste = false;
		}else 
			acertaste = true;
		System.out.println("Felicidades acertaste");
		return acertaste;
		
	
		
	}
			
			public int recibirNumero(){
				
				int numero =0;
				Scanner sc = null;
				
				sc = new Scanner(System.in);
				numero = sc.nextInt();
					return numero;
			}
			public void compararNumero(int x,int numero){
		
				int contador=0;
				
				contador = contador++;
				if (contador<5 ){
					if (x>numero){
						System.out.println("el numero introducido es menor que el buscado");
					}else if (x <numero){
						System.out.println("el numero introducido es mayor que el buscado");
					}
				
				}
				
				
				 
					
					
				
			}	
			}

	
	
	
	

