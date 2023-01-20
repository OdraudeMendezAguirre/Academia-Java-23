package inyeccion.v2;

public class Becario {
	//has-a
	private String nombre;
	private Computadora computadora;
	
	Becario(String nombre,Computadora computadora){
		this.nombre=nombre;
		this.computadora=computadora;
	}

	@Override
	public String toString() {
		return "Becario [nombre=" + nombre + "]";
	}
	
	void encenderCompu(){
		computadora.iniciar();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
}
