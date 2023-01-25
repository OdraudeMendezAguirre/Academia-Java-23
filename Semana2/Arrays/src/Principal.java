import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {4,6,8,2,3,1};
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 2));
		System.out.println("------------------------");
		
		//Multidimencional: iteraciones y Arrays
		int [][][] lista3D = { { {1,2},{3,4},{5,6} }, { {7,8},{9,10} } };
		
		for (int[][] lista2D : lista3D) {
			for (int[] lista1D : lista2D) {
				for (int numero : lista1D) {
					System.out.println(numero);
				}
			}
		}
		
		List<String>lista = new ArrayList<>();
		lista.add(2, "pepe");
		
		
	}

}
