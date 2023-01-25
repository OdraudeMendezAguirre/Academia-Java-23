package operadores.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Estudiante> estudiantes=new ArrayList<>();
		// TODO Auto-generated method stub
		
		estudiantes.add(new Estudiante("paco",20,5.5));
		estudiantes.add(new Estudiante("pepe",30,10.0));
		estudiantes.add(new Estudiante("pablo",19,8.0));
		
		//LAMBDAS
		Comparator<Estudiante> compEdad = (o1,o2) -> o2.getEdad() - o1.getEdad();
		
		//CLASE ANONIMA
		Comparator<Estudiante> compNombre = new Comparator<Estudiante>() {

			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				// TODO Auto-generated method stub
				return o1.getNombre().compareTo(o1.getNombre());
			}
			
		};
		//LAMBDA COMO PARAMETRO
		Collections.sort(estudiantes, 
				(o1,o2) -> (int)((o2.getPromedio()*1000) - (o1.getPromedio()*10000)));
		estudiantes.forEach(System.out::println);
		
		System.out.println("------------------------");
		Collections.sort(estudiantes, compNombre);
		estudiantes.forEach(System.out::println);
		
		
		System.out.println("------------------------");
		

		Collections.sort(estudiantes, compEdad);
		estudiantes.forEach(System.out::println);
	}

}
