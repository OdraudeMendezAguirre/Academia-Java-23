package odraude.entidades;

import odraude.interfaz.Empleado;

public class TrabajadorDormilon extends Empleado{

	public TrabajadorDormilon(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	
	public void trabajar() {
		System.out.println(nombre+" esta durmiendo en el trabajo\n");
	}

}
