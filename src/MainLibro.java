import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


public class MainLibro {
	
	
	
	
	
	public static int getNlibros(){
		int num=0;
		
		CargarHashmap map = new CargarHashmap();
		
//		for(int i=0;i<map.isbn_libro.size();i++){
//			
//			map.isbn_libro.toString();
//			
//			
//		}
		
		num = map.isbn_libro.size();
		
		return num;
	}
	
	
	public static void llamarMap() throws FileNotFoundException, IOException{
		
		try {
			Libro libro = new Libro();
			
			XMLReader reader;
			reader = XMLReaderFactory.createXMLReader();
			
			reader.setContentHandler(new ParseLibroxml(libro));
			
			reader.parse(new InputSource(new FileInputStream("libros.xml")));
			
		} catch (SAXException e) {
			
			System.out.println("Error al leer fichero");
			e.printStackTrace();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		int numLibros =0;
		try{
			llamarMap();
			
			numLibros= getNlibros();
			
			System.out.println("Numero de libros leidos: "+numLibros);
		}catch (Exception e){
			
			e.printStackTrace();
		}
		
		
		
	}
	
}
