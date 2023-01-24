package operadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Estudiante> estudiantes=new ArrayList<>();
		// TODO Auto-generated method stub
		
		estudiantes.add(new Estudiante("paco",20,5.5));
		estudiantes.add(new Estudiante("pepe",30,10.0));
		estudiantes.add(new Estudiante("pablo",19,8.0));
		Collections.sort(estudiantes);
		
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre());
		}
	}

}
