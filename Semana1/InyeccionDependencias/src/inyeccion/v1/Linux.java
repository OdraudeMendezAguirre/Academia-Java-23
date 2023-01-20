package inyeccion.v1;

public class Linux extends Computadora{
	String version;
	
	public Linux(String version) {
		this.version=version;
	}
	@Override
	void iniciar() {
		// TODO Auto-generated method stub
		System.out.println("Linux "+version+" encendida");

	}

}
