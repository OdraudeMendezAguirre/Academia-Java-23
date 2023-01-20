package odraude.interfaz;

//Empresa recibe un Generico T, en este caso se planea recibir Empleados
public interface Empresa <T>{
	void contratar (T empleado);
	void mostrarEmpleados();
}
