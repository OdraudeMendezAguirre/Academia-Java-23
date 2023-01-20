package zoo.cdmx.animales;

public class Tigre extends Animal {

	public Tigre(){
		sonido="GRAAAAAAAAARRRR";
	}
	@Override
	protected void hacerSonido() {
		System.out.println(sonido);
	}

	
	

}
