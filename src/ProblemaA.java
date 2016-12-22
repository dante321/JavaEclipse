
public class ProblemaA {
	

		
		public static void mostrarLetrasP (String palabra)
		{
		int longi = 0;
		
		longi = palabra.length();
		for (int i = 0; i< longi; i= i+1)
		{
		System.out.println(palabra.charAt(i));
		}
		}


		public static void main(String[] args) {
		
		
		String vida = "ascodevida";
		mostrarLetrasP(vida);
		}
		
		
	}
	
	
	

