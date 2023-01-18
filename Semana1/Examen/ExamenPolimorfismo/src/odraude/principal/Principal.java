package odraude.principal;

import odraude.entidades.Accenture;
import odraude.entidades.Odraude;
import odraude.entidades.TrabajadorDormilon;
import odraude.entidades.Xideral;
import odraude.interfaz.Empleado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xideral xideral = Xideral.getInstancia();
		Xideral xideral2 = Xideral.getInstancia();
		Empleado empleado = new Odraude("Odraude", 21);
		
		System.out.println("\n-----Xideral-----\n");
		
		xideral.contratar(empleado);
		
		System.out.println("\n-----------xideral 2----------------\n");
		
		empleado = new TrabajadorDormilon("Dormilon", 30);
		xideral2.contratar(empleado);
		xideral2.mostrarEmpleados();
		
		System.out.println("\n-----Accenture-----\n");
		Accenture accenture = Accenture.getInstancia();
		Accenture accenture2 = Accenture.getInstancia();
		
		empleado = new Odraude("Odry", 22);
		accenture.contratar(empleado);
		accenture2.ponerTrabajo(0);
		
		System.out.println("\n-----Accenture 2-----\n");
		
		empleado = new TrabajadorDormilon("sandman", 25);
		accenture2.contratar(empleado);
		accenture2.ponerTrabajo(1);
		
		accenture2.mostrarEmpleados();
		
	}
	

}
