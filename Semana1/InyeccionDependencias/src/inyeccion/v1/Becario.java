package inyeccion.v1;

public class Becario {
	//has-a
	String nombre;
	//ALTO ACOPLAMIENTO
	Computadora computadora;
	
	Becario(String nombre){
		this.nombre=nombre;
	}

	@Override
	public String toString() {
		return "Becario [nombre=" + nombre + "]";
	}
	
	void encenderCompu(){
		computadora.iniciar();
	}
}
