package scope;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one,two;
		one = new String("a");
		two = new String("b");
		
		one=two;
		//Objetos = no sabemos, puede ser 1 o 2
		
		String three = one;
		one = null;
		//deberiamos tener solo 1 objeto
	}

}
