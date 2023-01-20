package zoo.cdmx;

import zoo.cdmx.animales.Animal;
import zoo.cdmx.animales.Elefante;
import zoo.cdmx.animales.Mono;
import zoo.cdmx.animales.Tigre;

public class Principal {
	public static void main(String[] args) {
		Zoo zoologico = Zoo.singleton();//Utilizo mi singleton y creo mi zoologico
		Zoo admin = Zoo.singleton();//Contrato a un admin para gestionar el zoo via remoto
		
		Animal animal = new Tigre();//Utilizo conceptos de herencia y creo una variable que apunta a tigre
		
		zoologico.agregarAnimal(animal);//agrego un animal de manera presencial
		
		animal = new Elefante();
		admin.agregarAnimal(animal);//Ahora agrego a un animal de manera remota
		
		animal=new Mono();
		zoologico.agregarAnimal(animal);
		
		//Ahora mi administrador Observara la lista de animales en el zoologico
		admin.mostrarAnimalitos();
		
		System.out.println(zoologico);
	}
}
