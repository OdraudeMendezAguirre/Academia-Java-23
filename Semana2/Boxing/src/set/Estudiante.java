package set;

import java.util.Objects;

public class Estudiante {
	private String nombre;
	private int cal;
	
	public Estudiante(String nombre, int cal) {
		super();
		this.nombre = nombre;
		this.cal = cal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cal, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return cal == other.cal && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
