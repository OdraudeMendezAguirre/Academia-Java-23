package com.zoo.v2;

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

class Gato implements Animal{
	public void soud() {
		System.out.println("miau");
	}
}
class Perro implements Animal{
	public void soud() {
		System.out.println("Guau");
	}
}

interface Animal{
	void soud();
}

class Pato implements Animal{
	public void soud() {
		System.out.println("quak");
	}
}