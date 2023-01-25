package error.v2;

public class Principal {
	public static void main(String[] args) {
		int x=15;
		int y=0;
		int res=0;
		
		
		
		
		
		try {
			res = calcularDiv(x,y);
		}catch(CeroException ax) {
			System.out.println(ax);
		}finally {
			System.out.println("Siempre paso por el finally");
		}
		
		System.out.println(res);
	}
	private static int calcularDiv(int x, int y)throws CeroException {
		if(y==0) {
			throw new CeroException("No puedes dividir entre cero");
		}
		return x/y;
	}
}
