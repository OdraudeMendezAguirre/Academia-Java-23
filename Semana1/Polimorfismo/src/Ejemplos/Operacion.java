package Ejemplos;

public abstract class Operacion {
	 int x;
	 int y;
	
	public Operacion(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	abstract int  ejecuta();
	
}
