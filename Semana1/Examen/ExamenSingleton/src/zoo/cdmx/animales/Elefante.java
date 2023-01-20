package zoo.cdmx.animales;

public class Elefante extends Animal{
	
	public Elefante(){
		sonido="Pfrrrrrrrrrrrr";
	}

	@Override
	protected void hacerSonido() {
		// TODO Auto-generated method stub
		System.out.println(sonido);
	}


}
