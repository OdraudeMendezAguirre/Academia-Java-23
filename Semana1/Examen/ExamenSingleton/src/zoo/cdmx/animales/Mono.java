package zoo.cdmx.animales;

public class Mono extends Animal{

	public Mono(){
		sonido="Uhh Uhhh Ahhhh Ahhhh";
	}
	@Override
	protected void hacerSonido() {
		// TODO Auto-generated method stub
		System.out.println(sonido);
	}

}
