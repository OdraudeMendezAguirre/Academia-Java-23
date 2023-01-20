package inyeccion.v0;

public class Computadora {
	//has-a
	String version;
	
	
	
	public Computadora(String version) {
		this.version = version;
	}

	public void iniciar() {
		System.out.println("Iniciando windows "+version);
	}


}
