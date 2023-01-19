
public class Pato {
	String nombre; //estas variables son globales, por lo que viviran hasta que muera la clase
	int edad;
	static boolean vuela;
	
	void makeSound() {
		String sound = "Quak";
		System.out.println(sound);
	}
	void eat(boolean debecomer) {
		if(debecomer) {
			String alimento = "pan";//la variable solo vivira si es que entra en el if
			System.out.println(alimento);
		}
		
	}
}
