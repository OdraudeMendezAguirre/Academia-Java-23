package inyeccion.v2;

public class Windows extends Computadora{
	String version;
	
	public Windows(String version) {
		this.version=version;
	}
	
	@Override
	void iniciar() {
		// TODO Auto-generated method stub
		System.out.println("Windows "+version+" encendida");
	}

}
