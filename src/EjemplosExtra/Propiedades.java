package EjemplosExtra;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javafx.beans.property.SetProperty;

public class Propiedades {

	public static void main(String[] args) throws IOException {
		String valor_Driver;
		Properties fichero_propiedades= new Properties();
		FileReader fR = new FileReader("DB.properties");
		fichero_propiedades.load(fR);
		
		valor_Driver=fichero_propiedades.getProperty("Driver");
		System.out.println(valor_Driver);
		valor_Driver=fichero_propiedades.getProperty("Cadena_conex");
		System.out.println(valor_Driver);
		valor_Driver=fichero_propiedades.getProperty("User");
		System.out.println(valor_Driver);
		valor_Driver=fichero_propiedades.getProperty("Password");
		System.out.println(valor_Driver);
		
		fichero_propiedades.setProperty("User", "HR");
		
		System.out.println("Nuevo user: ");
		valor_Driver=fichero_propiedades.getProperty("User");
		System.out.println(valor_Driver);
		
		fR.close();
		
		
	}
	
	
}
