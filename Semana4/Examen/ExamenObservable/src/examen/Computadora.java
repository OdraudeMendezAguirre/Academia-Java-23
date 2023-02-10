package examen;

public class Computadora extends Observer{

	private String mensaje="";
	
	@Override
	void update(String x) {
		// TODO Auto-generated method stub
		this.mensaje=x;
		alerta();
	}
	
	void alerta() {
		System.out.println("Tienes un mensaje en la computadora: " +mensaje);
	}

}
