package Ejemplos.v3;

public class Multiplicacion implements Operacion {
	
	int x;
	int y;
	
	public Multiplicacion(int x, int y) {
		this.x=x;
		this.y=y;
	}
	

	@Override
	public int ejecutar() {
		// TODO Auto-generated method stub
		return x*y;
	}


	@Override
	public String toString() {
		return "Multiplicacion [x=" + x + ", y=" + y + "]";
	}
	
}
