package inyeccion.v0;

public class Becario {
	//has-a
	String nombre;
	//ALTO ACOPLAMIENTO
	Computadora computadora= new Computadora("vista");
	
	Becario(String nombre){
		this.nombre=nombre;
	}

	@Override
	public String toString() {
		return "Becario [nombre=" + nombre + "]";
	}
	
	void encenderCompu(){
		System.out.println(nombre);
		computadora.iniciar();
	}
}
