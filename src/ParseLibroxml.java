import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.stream.events.StartDocument;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class ParseLibroxml extends DefaultHandler{
	
	Map<String, Libro> mapita = new HashMap<String,Libro>();
	CargarHashmap hash = new CargarHashmap();
	String dir = null;
	
	private String valor = null;  
    
	private Libro libro;  
	     
	public ParseLibroxml() {
		super();
	}

	public ParseLibroxml(Libro libro) {
		super();
		this.libro = libro;
	}

	@Override
	public void startDocument() throws SAXException {
		//super.startDocument();
	
		
		
		
	}
	
	private ArrayList<Libro> listaLibros = new ArrayList<>();
	

	
    
	   @Override  
	   public void startElement(String uri, String localName, String name,  
	         Attributes attributes) throws SAXException { 
		   //listaLibros.clear();
		   
		  
	        
	      // Limpiamos la variable temporal.  
	      valor=null;  
	        
	      // Si la etiqueta es libro leemos el atributo isbn  
	      if(localName.equals("libro")){  
	    	  libro = new Libro();
	         String isbn = attributes.getValue("isbn");  
	         // Lo guardamos en el objeto libro  
	         libro.setIsbn(isbn);  
	      }  
	   }  
	     
	   @Override  
	   public void characters(char[] ch, int start, int length)  
	         throws SAXException {  
	      // Guardamos el texto en la variable temporal  
	      valor = new String(ch,start,length);  
	     // System.out.println(valor);
	  
	   }  
	  
	   @Override  
	   public void endElement(String uri, String localName, String name)  
	         throws SAXException {  
	      // Según la etiqueta guardamos el valor leido   
	      // en una propiedad del objeto libro  
		   //System.out.println(name);
	      if (localName.equals("titulo")){  
	         libro.setTitulo(valor);  
	      }else if (localName.equals("autor")){  
	         libro.setAutor(valor);  
	      }else if (localName.equals("anyo")){  
	         libro.setAnyo(valor);  
	      }else if (localName.equals("editorial")){  
	         libro.setEditorial(valor);  
	      }  
	        if(localName.equals("libro"))
	        	
	      listaLibros.add(this.libro);
	      
	        dir = this.libro.getIsbn();
	        mapita.put(dir, this.libro);
	    
	      //listaLibros.clear();
	      
	      
	      
	   }

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}  
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		//super.endDocument();
		hash.setIsbn_libro(mapita);
		
	}
	}
