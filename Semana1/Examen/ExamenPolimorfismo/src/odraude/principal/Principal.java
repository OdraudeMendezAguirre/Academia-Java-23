package odraude.principal;

import odraude.entidades.Accenture;
import odraude.entidades.TrabajadorAplicado;
import odraude.entidades.TrabajadorDormilon;
import odraude.entidades.Xideral;
import odraude.interfaz.Empleado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Construllo 2 variables que apunten al mismo objeto
		Xideral xideral = Xideral.getInstancia();
		Xideral xideral2 = Xideral.getInstancia();
		
		//Defino mi primer empleado utilizando el concepto de herencia
		Empleado empleado = new TrabajadorAplicado("Odraude", 21);
		
		System.out.println("\n-----Xideral-----\n");
		
		//contrato al empleado
		xideral.contratar(empleado);
		
		System.out.println("\n-----------xideral 2----------------\n");
		
		//Repito el proceso con xideral2  y muestro a los empleados que deberian estar contratados
		//en la empresa Xideral
		empleado = new TrabajadorDormilon("Dormilon", 30);
		xideral2.contratar(empleado);
		xideral2.mostrarEmpleados();
		
		//Ahora repito el proceso anterior con la Empresa Accenture
		System.out.println("\n-----Accenture-----\n");
		Accenture accenture = Accenture.getInstancia();
		Accenture accenture2 = Accenture.getInstancia();
		
		//defino, contrato y pongo a trabajar al nuevo empleado
		empleado = new TrabajadorAplicado("Odry", 22);
		accenture.contratar(empleado);
		accenture2.ponerTrabajo(0);
		
		System.out.println("\n-----Accenture 2-----\n");
		
		empleado = new TrabajadorDormilon("sandman", 25);
		accenture2.contratar(empleado);
		accenture2.ponerTrabajo(1);
		
		accenture2.mostrarEmpleados();
		
	}
	

}
