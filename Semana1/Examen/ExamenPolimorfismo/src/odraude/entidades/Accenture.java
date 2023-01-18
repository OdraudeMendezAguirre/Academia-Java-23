package odraude.entidades;

import java.util.ArrayList;

import odraude.interfaz.Empleado;
import odraude.interfaz.Empresa;

public class Accenture implements Empresa<Empleado>{
	
	ArrayList<Empleado>empleados=new ArrayList<>();
	public static Accenture accenture;

	@Override
	public void contratar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleados.add(empleado);
		System.out.println(empleado+" contratado en Accenture \n");
	}

	@Override
	public void mostrarEmpleados() {
		// TODO Auto-generated method stub
		System.out.println("Mostrando empleados de Accenture:\n");
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
		}
	}
	
	public static Accenture getInstancia() {
		if(accenture==null)
			accenture=new Accenture();
		return accenture;
	}
	
	public void ponerTrabajo(int id) {
		this.empleados.get(id).trabajar();
	}
	
}
