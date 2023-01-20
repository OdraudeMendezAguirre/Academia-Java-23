package inyeccion;

public class Clinica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente("Odraude");//Creo un paciente
		
		//Hago que un doctor inyecte a mi paciente con "CURATODO", y me regresa al paciente inyectado
		paciente1=Doctor.inyectar(paciente1, "CURATODO", 100);
		paciente1.mostrarInyeccion();//Muestro que inyeccion le fue aplicada
		
		
		Paciente paciente2 = new Paciente("Paquito");
		paciente2=Doctor.inyectar(paciente1, "PARACETAMOR", 30);
		paciente2.mostrarInyeccion();
	}

}
