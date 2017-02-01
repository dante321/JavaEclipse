package minipracts;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class LibroXML extends DefaultHandler{
	 private String valor = null;  
     
	   private Libro libro;  
	     
	   public LibroXML(Libro libro){  
	      this.libro=libro;  
	   } 
	   
	   public LibroXML() {
		// TODO Auto-generated constructor stub
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
	      // Seg�n la etiqueta guardamos el valor leido   
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
		for (Libro libro : listaLibros) {
			
		
		System.out.println("Autor: "+libro.getAutor()+"\n");
		System.out.println("Editorial: "+libro.getEditorial()+"\n");
		System.out.println("Titulo"+libro.getTitulo()+"\n");
		System.out.println("A�o"+libro.getAnyo()+"\n");
		System.out.println("ISBN"+libro.getIsbn()+"\n");
	}
	}
	  
	}  
