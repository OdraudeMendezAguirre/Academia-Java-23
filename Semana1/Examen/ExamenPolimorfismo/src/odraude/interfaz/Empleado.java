package odraude.interfaz;

public abstract class Empleado {
	protected String nombre;
	protected int edad;
	
	public Empleado(String nombre,int edad){
		this.edad=edad;
		this.nombre=nombre;
	}
	public abstract void trabajar();
	
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



	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
