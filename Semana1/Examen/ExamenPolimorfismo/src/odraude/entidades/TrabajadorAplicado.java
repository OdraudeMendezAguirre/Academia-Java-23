package odraude.entidades;

import odraude.interfaz.Empleado;

public class TrabajadorAplicado extends Empleado{//Un tipo de empleado

	public TrabajadorAplicado(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void trabajar() {
		System.out.println(nombre + " esta trabajando\n");
	}
	
}
