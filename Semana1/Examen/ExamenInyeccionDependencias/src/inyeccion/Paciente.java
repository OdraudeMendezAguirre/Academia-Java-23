package inyeccion;

public class Paciente {
	private String nombre;
	private Medicina medicina;
	
	Paciente(String nombre){
		this.nombre=nombre;
	}
	
	//Metodo para saber cuando hayan inyectado al paciente
	public void gritar() {
		System.out.println("¡Auch!");
	}
	
	//Mostrar medicina inyectada
	public void mostrarInyeccion() {
		System.out.println(medicina);
	}

	//Getter and setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Medicina getMedicina() {
		return medicina;
	}

	public void setMedicina(Medicina medicina) {
		this.medicina = medicina;
	}
	
	

}
