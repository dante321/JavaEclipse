
public class Persona {
	String nombre = null;
	int edad = 0;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarPersona ()
	{
		System.out.println("Nombre = " + this.nombre);
		System.out.println("Edad = " + this.edad);
	}
		
	
}

