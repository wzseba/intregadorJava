package integrador;

public class Persona {

	private int cantidadHijos;
	private int edad;
	
	public Persona(int edad, int cantidadHijos) {
		this.edad = edad;
		this.cantidadHijos = cantidadHijos;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public int getCantidadHijos() {
		return this.cantidadHijos;
	}
}
