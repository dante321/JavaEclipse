package minipracts;

import java.io.FileInputStream;
import java.io.IOException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class ProcesoSAX {

	public static void main(String[] args) {  
//        LibroXML aux=new LibroXML();
//        Libro aux2= new Libro();
	      try {  
	         // Creamos nuestro objeto libro vacío  
	         Libro libro = new Libro();  
	         // Creamos la factoria de parseadores por defecto  
	         XMLReader reader = XMLReaderFactory.createXMLReader();  
	         // Añadimos nuestro manejador al reader pasandole el objeto libro  
	         reader.setContentHandler(new LibroXML(libro));           
	         // Procesamos el xml de ejemplo  
	         reader.parse(new InputSource(new FileInputStream("libros.xml")));  
	         
	         //System.out.println(libro.toString());
	         
	        
	       // for (aux2:aux.getListaLibros()) {
	        	
	        	
	        	
	        
	      } catch (SAXException e) {  
	         e.printStackTrace();  
	      } catch (IOException e) {  
	         e.printStackTrace();  
	      }  
	  
	   }  
}
