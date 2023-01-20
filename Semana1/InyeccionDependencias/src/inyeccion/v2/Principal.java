package inyeccion.v2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Becario beca1 = Inyector.inyectarPc("Odraude", "Windows");
		beca1.encenderCompu();
		
		Becario beca2 = Inyector.inyectarPc("Odry", "Linux");
		beca2.encenderCompu();
		
	}

}
