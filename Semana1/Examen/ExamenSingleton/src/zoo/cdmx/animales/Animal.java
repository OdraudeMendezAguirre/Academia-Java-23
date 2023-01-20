package zoo.cdmx.animales;

public abstract class Animal {
	protected String sonido;
	
	//Cada animal debe hacer un sonido
	protected abstract void hacerSonido();

	@Override
	public String toString() {
		return "El "+this.getClass().getSimpleName()+" hace " + sonido;
	}
	
	

}
