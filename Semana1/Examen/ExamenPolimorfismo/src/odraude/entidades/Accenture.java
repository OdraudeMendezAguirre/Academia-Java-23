package odraude.entidades;

import java.util.ArrayList;

import odraude.interfaz.Empleado;
import odraude.interfaz.Empresa;
//Al implementar la interfaz Empresa, envio mi tipo de dato generico, el cual es Empleado
public class Accenture implements Empresa<Empleado>{
	
	ArrayList<Empleado>empleados=new ArrayList<>();//lista de empleados en accenture
	public static Accenture accenture;

	//Metodo para contratar empleados
	@Override
	public void contratar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleados.add(empleado);
		System.out.println(empleado+" contratado en Accenture \n");
	}

	//Metodo que muestra todos los empleados en accenture
	@Override
	public void mostrarEmpleados() {
		// TODO Auto-generated method stub
		System.out.println("Mostrando empleados de Accenture:\n");
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
		}
	}
	
	//Singleton para que siempre se haga referencia a una sola empresa
	public static Accenture getInstancia() {
		if(accenture==null)
			accenture=new Accenture();
		return accenture;
	}
	
	//Poner a trabajar a un empleado por id
	public void ponerTrabajo(int id) {
		this.empleados.get(id).trabajar();
	}
	
}
