package Ejemplos.v3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Operacion> lista = new ArrayList<>();
		lista.add(new Resta(8,4));
		lista.add(new Suma(8,4));
		lista.add(new Divicion(8,4));
		lista.add(new Potencia(8, 4));
		lista.add(new Multiplicacion(8, 4));
		show(lista);
	}
	
	
	static void show(ArrayList<Operacion>lista) {
		for (int i = 0; i < lista.size(); i++) {
			Operacion ope=lista.get(i);
			System.out.println(ope);
			System.out.println(ope.ejecutar());
			
		}
	}

}
