package bloques.v2;

public class Principal {
	int contador;
	
	Principal(){
		System.out.println("Construido");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Holi");
		Principal p=new Principal();
	}
	
	static {
		System.out.println("Bloque estatico xd");
	}
	
	{
		System.out.println("Un bloque normal");
	}

}
