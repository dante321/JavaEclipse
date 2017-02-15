package Json;

public class Persona {

	
	private String nM;
	private boolean casada;
	private boolean enParo;
	private int edad;
	private int nHijos;
	
	
	
	
	public Persona(String string, boolean b, boolean c, int i, int j) {
		
		this.nM = string;
		this.casada = b;
		this.enParo=c;
		this.edad=i;
		this.nHijos=j;
	}
	public String getnM() {
		return nM;
	}
	public void setnM(String nM) {
		this.nM = nM;
	}
	public boolean isCasada() {
		return casada;
	}
	public void setCasada(boolean casada) {
		this.casada = casada;
	}
	public boolean isEnParo() {
		return enParo;
	}
	public void setEnParo(boolean enParo) {
		this.enParo = enParo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getnHijos() {
		return nHijos;
	}
	public void setnHijos(int nHijos) {
		this.nHijos = nHijos;
	}
	
	
	
}
