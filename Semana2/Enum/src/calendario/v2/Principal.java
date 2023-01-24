package calendario.v2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estacion e = Estacion.INVIERNO;
		
		for(Estacion est: Estacion.values()) {
			System.out.println(est);
			
			switch(est) {
			case PRIMAVERA:
				System.out.println("Primavera");
				break;
			case VERANO:
				System.out.println("Verano");
				break;
			case OTOÑO:
				System.out.println("Otoño");
				break;
			case INVIERNO:
				System.out.println("Invierno");
				break;
				
			}
		}
	}

}
