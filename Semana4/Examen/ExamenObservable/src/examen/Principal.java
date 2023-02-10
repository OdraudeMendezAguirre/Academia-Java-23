package examen;

import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Observer o1 = new Computadora();
		Observer o2 = new Tablet();
		Observer o3 = new Telefono();
		
		Administrador admin = new Administrador();
		
		admin.attach(o1);
		admin.attach(o2);
		admin.attach(o3);
		String mensaje = sc.next();
		admin.notificar(mensaje);
		
	}

}
