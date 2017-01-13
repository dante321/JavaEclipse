package edu.femxa.val;

public class OrdenarNumeros {


	public static void mostrar(int []ae){
		
		for (int i=0;i<ae.length;i++){
			System.out.println(ae[i]);
		}
		
	}
	
	public static void moverPos(int ae[],int n){
		int pos_F= ae.length-1;
		//int aux =pos_F;
		
		
		for (int i =pos_F;i >n;i--){
			
			ae[i]=ae[i-1];
		
		}
			//ae[0]= aux;
		}
		
	public static int obtenerPos (int [] ae, int n)
	{
		int pos = 0;
		
		while ((pos < ae.length)&&(ae[pos]<n)){
			pos++;
			
		}
		//TODO haced el cuerpo del método para obtener
		//el resultado esperado
		
		return pos;
	}
	
	
	public static void main(String[] args) {
		int ae[] = new int [10];
		
		ae[0] = 1;
		ae[1] = 2;
		ae[2] = 5;
		ae[3] = 6;
		ae[4] = 7;
		 
		int n_usuario = 2;
		moverPos(ae,n_usuario);
		mostrar(ae);
		
		
		
		//int pos = obtenerPos(ae, n_usuario);
		
		
		//System.out.println("El numero " + n_usuario + " debe ir en " + pos+ " posicion");
		
	}

	
}
