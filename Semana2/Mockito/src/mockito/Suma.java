package mockito;

public class Suma {
	
	//Inyectar servicio
	CloudSuma cs;
	
	int x;
	int y;
	
	public Suma(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int ejecuta() {
		return cs.ejecutarSuma(x, y);
	}
	
	
}
