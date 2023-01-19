package Ejemplos.v4;

public class Suma extends OperacionAbstracta {
	
	public Suma(int x, int y) {
		super(x,y);
	}
	

	@Override
	public int ejecutar() {
		// TODO Auto-generated method stub
		return x+y;
	}

	
}
