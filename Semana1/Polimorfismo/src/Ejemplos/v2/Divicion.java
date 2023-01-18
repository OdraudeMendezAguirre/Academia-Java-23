package Ejemplos.v2;

public class Divicion extends Operacion {
	public Divicion(int x, int y) {
		super(x,y);
	}
	
	@Override
	int ejecuta() {
		return x/y;
	}

	
}
