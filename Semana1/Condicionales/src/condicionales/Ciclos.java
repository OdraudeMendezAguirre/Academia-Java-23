package condicionales;

import java.util.ArrayList;

import java.util.List;

public class Ciclos {
	public static void main(String[] args) {
		List<String>palabras = new ArrayList<>();
		palabras.add("hola");
		palabras.add("Mundo");
		for (String string : palabras) {
			System.out.println(string);
		}
		
		int [][] arrOfArr = {{5,2,1},{1,2,3}};
		
		LOOP_EXTERIOR:for (int[] is : arrOfArr) {
			LOOP_INTERNO:for (int numero : is) {
				System.out.println(numero);
				continue;//para seguir recorriendo el ciclo aun despues de haber encontrado un resultado
				
			}
		}
		
		
		
	}
}
