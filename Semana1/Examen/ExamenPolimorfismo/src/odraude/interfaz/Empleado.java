package odraude.interfaz;

public abstract class Empleado {
	//Cada empleado debe tener nombre y edad
	protected String nombre;
	protected int edad;
	
	public Empleado(String nombre,int edad){
		this.edad=edad;
		this.nombre=nombre;
	}
	
	//Cada empleado debe heredar un metodo para trabajar
	public abstract void trabajar();
	
	
	//Getter y setter 
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
