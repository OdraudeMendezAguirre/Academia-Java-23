package error.v1;

public class Principal {
	public static void main(String[] args) {
		int x=15;
		int y=0;
		int res=0;
		
		try {
			res = calcularDiv(x,y);
		}catch(ArithmeticException ax) {
			System.out.println(ax);
		}
		
		System.out.println(res);
	}
	private static int calcularDiv(int x, int y) {
		return x/y;
	}
}
