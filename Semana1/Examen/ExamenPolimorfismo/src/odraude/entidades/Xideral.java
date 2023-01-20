package odraude.entidades;

import java.util.ArrayList;

import odraude.interfaz.Empleado;
import odraude.interfaz.Empresa;

public class Xideral implements Empresa<Empleado>{
	
	ArrayList<Empleado>empleados=new ArrayList<>();//Lista de empleados de Xideral
	public static Xideral xideral;
	
	//Metodo para contratar empleados en Xideral
	@Override
	public void contratar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleados.add(empleado);
		System.out.println(empleado+" contratado en Xideral\n");
	}

	//Metodo para mostrar empleados contratados en Xideral
	@Override
	public void mostrarEmpleados() {
		// TODO Auto-generated method stub
		System.out.println("Mostrando empleados de Xideral:\n");
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
		}
	}
	
	//Singleton para hacer referencia a una unica empresa Xideral
	public static Xideral getInstancia() {
		if(xideral==null)
			xideral=new Xideral();
		return xideral;
	}
	
	//Metodo para poner a trabajar a un empleado especifico
	public void ponerTrabajo(int id) {
		this.empleados.get(id).trabajar();
	}

}
