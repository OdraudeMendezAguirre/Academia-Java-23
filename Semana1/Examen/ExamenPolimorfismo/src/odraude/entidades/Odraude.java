package odraude.entidades;

import odraude.interfaz.Empleado;

public class Odraude extends Empleado{

	public Odraude(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void trabajar() {
		System.out.println(nombre + " esta trabajando\n");
	}
	
}
