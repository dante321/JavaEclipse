import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class CargarHashmap {

	 public  Map<String, Libro> getIsbn_libro() {
			return isbn_libro;
		}


		public void setIsbn_libro(Map<String, Libro> isbn_libro) {
			this.isbn_libro = isbn_libro;
		}
		
		
		public static Map<String, Libro> isbn_libro = new HashMap<String, Libro>();
		
	
}
