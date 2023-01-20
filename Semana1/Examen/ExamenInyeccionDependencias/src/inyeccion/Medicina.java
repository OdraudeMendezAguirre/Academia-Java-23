package inyeccion;

public class Medicina {
	private String tipo;
	private int mililitros;
	
	Medicina(String tipo, int mili){
		this.tipo=tipo;
		mililitros=mili;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getMililitros() {
		return mililitros;
	}

	public void setMililitros(int mililitros) {
		this.mililitros = mililitros;
	}

	@Override
	public String toString() {
		return "Medicina [tipo=" + tipo + ", mililitros=" + mililitros + "]";
	}
	
	
	
}
