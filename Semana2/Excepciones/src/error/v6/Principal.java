package error.v6;

public class Principal {
	public static void main(String[] args) {
		int x=2500000;
		int y=20;
		int res=0;
		
		
		
		
		//Multi catch
		try {
			res = calcularDiv(x,y);
		}catch(CeroException |NegativoException|UnsupportedOperationException e) {
			e.printStackTrace();
		}
		
		System.out.println(res);
	}
	private static int calcularDiv(int x, int y)throws CeroException, NegativoException {
		if(y==0) {
			throw new CeroException("No puedes dividir entre cero");
		}
		if(y<0)
			throw new NegativoException("No puedes dividir entre negativos");
		if(x>100)
			throw new UnsupportedOperationException("No esta soportado");
		return x/y;
	}
}
