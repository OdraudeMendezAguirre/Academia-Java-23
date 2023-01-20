package zoo.cdmx;

import java.util.ArrayList;
import java.util.List;

import zoo.cdmx.animales.Animal;

public class Zoo {
	private String nombre="Buena Aventura";//nombre del zoologico
	private List<Animal>animales=new ArrayList<>();//Lista de animales registrados
	private static Zoo instancia;
	
	//Defino mi singleton para hacer referencia a un unico zoologico
	public static Zoo singleton() {
		if(instancia==null)
			instancia=new Zoo();
		return instancia;
	}
	
	//Metodo para agregar un animal al zoologico
	public void agregarAnimal(Animal animal) {
		animales.add(animal);
	}
	
	//Metodo para mostrar animales registrados
	public void mostrarAnimalitos() {
		System.out.println("Animales registrados: ");
		for (Animal animal : animales) {
			System.out.println(animal);
		}
	}

	//Metodo para saber la cantidad de animales registrados
	@Override
	public String toString() {
		return "El Zoo " + nombre + ", tiene " + animales.size() + " animales registrados";
	}
	
	

}
