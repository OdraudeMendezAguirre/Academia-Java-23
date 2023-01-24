package operadores;

public class Estudiante implements Comparable<Estudiante>{
	private String nombre;
	private int edad;
	private double promedio;
	
	public Estudiante(String nombre, int edad, double promedio) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.promedio = promedio;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}


	//@Override
	//public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		//return (int)((this.promedio*1000) - (o.promedio*1000));
	//}
	
	//@Override
	//public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		//return this.nombre.compareTo(o.nombre);
	//}
	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		return o.nombre.compareTo(this.nombre);
	}

	
}
