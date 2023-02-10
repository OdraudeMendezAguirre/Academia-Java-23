package examen;

public class Tablet extends Observer{

	private String mensaje="";
	
	@Override
	void update(String x) {
		// TODO Auto-generated method stub
		this.mensaje=x;
		alerta();
	}
	
	void alerta() {
		System.out.println("Tienes un mensaje en la Tablet: " +mensaje);
	}

}
