package inyeccion;

public class Doctor {
	
	static Paciente inyectar(Paciente paciente,String medicina,int mililitros) {
		
		switch(medicina) {
		case "CURATODO":
			paciente.setMedicina(new Medicina("CURATODO",mililitros));
			paciente.gritar();
			break;
		case "PARACETAMOR":
			paciente.setMedicina(new Medicina("PARACETAMOR",mililitros));
			paciente.gritar();
			break;
			default :
				System.out.println("Te equivocaste en algo");
		}
		return paciente;
		
	}

}
