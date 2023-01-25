package error.v5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Auto closable
		try (Pato pato = new Pato()){
			System.out.println(pato);
			getExcption();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void getExcption() throws Exception{
		throw new Exception("Genere una exception");
	}

}
