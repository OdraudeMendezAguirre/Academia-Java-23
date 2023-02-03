package inscripciones;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Escuela {
	List<Alumnos>lista;
	
	public Escuela() {
		lista = new ArrayList<Alumnos>();
	}

	public void agregarAlumno(Alumnos alumno) {
		lista.add(alumno);
	}

	public Object getCantAlumn() {
		return lista.size();
	}

	public Alumnos getAlumno(int i) {
		// TODO Auto-generated method stub
		return lista.get(i);
	}

	public Alumnos eliminarAlumno(int i) {
		// TODO Auto-generated method stub
		return lista.remove(i);
	}
}
