package set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Estudiante> setEstudiantes = new HashSet<>();
		
		Estudiante e1 = new Estudiante("Odry",10);
		Estudiante e2 = new Estudiante("Odraude",8);
		Estudiante e3 = new Estudiante("Paco",6);
		Estudiante e4 = new Estudiante("Paco",6);
		
		setEstudiantes.add(e1);
		setEstudiantes.add(e2);
		setEstudiantes.add(e3);
		setEstudiantes.add(e4);
		
		System.out.println(e4.equals(e3));
		
		setEstudiantes.forEach(System.out::println);
		
		Map<String, String> map = new HashMap<>();
		map.put("Perro", "Hogar");
		map.put("pato", "lago");
		
		for (String key : map.keySet())
			System.out.println(key + " "+ map.get(key));
		
		Map<String, String> map2 = new HashMap<>();
		map.put("Perro", "Hogar");
		map.put("pato", "lago");
		
		
		
	}

}
