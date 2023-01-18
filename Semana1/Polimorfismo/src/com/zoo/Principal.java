package com.zoo;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Gato();
		animal.soud();
		animal = new Perro();
		animal.soud();
		System.out.println("---------------");
		animal=getAnimal();
		animal.soud();
		
	}
	private static Animal getAnimal() {
		List<Animal>lista = Arrays.asList(new Gato(),new Perro(), new Pato());
		int random = (int)(Math.random()* lista.size());
		return lista.get(random);
	}
	

}

class Gato extends Animal{
	void soud() {
		System.out.println("miau");
	}
}
class Perro extends Animal{
	void soud() {
		System.out.println("Guau");
	}
}

class Animal{
	void soud() {
		System.out.println("si");
	}
}
class Pato extends Animal{
	void soud() {
		System.out.println("quak");
	}
}