
public class ProblemaC {

	
	public static void ultimosCharCadena (String palabra, int n)
	{
		int sup = palabra.length()-1;
		
		
		for(int i = sup; i >= palabra.length()-n ; i--)
		{
			System.out.println("Los ultimos caracteres de dante son "+palabra.charAt(i));
			
		}
		}
		
	public static void muestraRevesN(String palabra2, int n2){
			int limSup= palabra2.length()-1;
			int limInf= palabra2.length()-n2;
			
		while (limSup>=limInf){
			System.out.println("Los ultimos caracteres de raul son "+palabra2.charAt(limSup));
			limSup--;
		}
			
		
	}
	public static void main(String[] args) {
		
		ultimosCharCadena("dante", 3);
		System.out.println(" ");
		muestraRevesN("raul", 3);
	}
	
}
