package inscripciones;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Alumnos {
	private String nombre;
	private int Edad;
	private double PromedioAnterior;
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", Edad=" + Edad + ", PromedioAnterior=" + PromedioAnterior + "]";
	}
	
	
}
