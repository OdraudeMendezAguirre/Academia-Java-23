package Ejemplos;

public class Divicion extends Operacion {
	public Divicion(int x, int y) {
		super(x,y);
	}
	
	int ejecuta() {
		return x/y;
	}

	@Override
	public String toString() {
		return "Divicion [x=" + x + ", y=" + y + "]";
	}
	
}
