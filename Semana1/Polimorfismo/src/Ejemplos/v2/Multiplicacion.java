package Ejemplos.v2;

public class Multiplicacion extends Operacion {
	
	public Multiplicacion(int x, int y) {
		super(x,y);
	}
	
	@Override
	int ejecuta() {
		return x*y;
	}
	

}
