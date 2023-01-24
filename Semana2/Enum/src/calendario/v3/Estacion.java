package calendario.v3;

public enum Estacion {
	INVIERNO("Baja"),
	PRIMAVERA("Media"),
	VERANO("Alta"),
	OTOÑO("Nula");
	
	private String visitantes;
	
	Estacion(String visitantes){
		this.visitantes=visitantes;
	}
	
	public String mostrarVisitantes() {
		return visitantes;
	}
}
