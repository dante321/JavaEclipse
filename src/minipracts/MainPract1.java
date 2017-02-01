package minipracts;


public class MainPract1 {

	
	public static final int[] HOLA= new int[20];
	
	public static int listarArgs(int[] hola){
		int aux=0;
		for(int i =0;i<hola.length;i++){
			
			if (hola[i]>aux){
				
				aux = hola[i];
				
			}else{
				
			}
			
			
		}
		
		return aux;
	}
	
	
	public static void main(String[] args) {
		int h=0;
		for(int i =0;i< HOLA.length;i++){
			HOLA[i] = i*10-6;
		}
		h=listarArgs(HOLA);
		System.out.println(h);
		
	}
	
	
	
	
}
