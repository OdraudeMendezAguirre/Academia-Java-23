package examen;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	private static Operacion[] arrayOperaciones = {
		new Operacion(5,7),
		new Operacion(10,5),
		new Operacion(7,3),
		new Operacion(20,4),
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Operacion> listaOperaciones = Stream.of(arrayOperaciones);
		List<Operacion> lista = listaOperaciones.peek(x->x.r=x.x+x.y)
				.filter(x -> x.getR()>10)
				.collect(Collectors.toList());
		lista.forEach(x->System.out.println(x.getR()));
	}

}
