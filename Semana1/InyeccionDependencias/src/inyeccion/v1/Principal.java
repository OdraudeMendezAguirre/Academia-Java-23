package inyeccion.v1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Becario beca1 = new Becario("Odraude");
		Inyector.inyectarPc(beca1, "Windows");
		beca1.encenderCompu();
		
		Becario beca2 = new Becario("Odry");
		Inyector.inyectarPc(beca2, "Linux");
		beca2.encenderCompu();
		
	}

}
