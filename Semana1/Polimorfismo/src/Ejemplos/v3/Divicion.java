package Ejemplos.v3;

public class Divicion implements Operacion {
	
	int x;
	int y;
	
	public Divicion(int x, int y) {
		this.x=x;
		this.y=y;
	}
	

	@Override
	public int ejecutar() {
		// TODO Auto-generated method stub
		return x/y;
	}


	@Override
	public String toString() {
		return "Divicion [x=" + x + ", y=" + y + "]";
	}
	
}
