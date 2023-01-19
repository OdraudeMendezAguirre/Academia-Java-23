import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f= 5.5f;
		long l= 3123456789l;
		long ll= 1_234_567_890; //castea un numero entero y lo convierte en long
		long ll2= 2_147_483_648L;
		
		int int1= (int)ll2;
		
		long ll3=2_147_483_647;
		int int2 = (int)ll3;
		
		short short1 = 8;
		short short9 = 9;
		System.out.println(short1+=short9);
		
		
		double a = 0.02;
		double b = 0.03;
		double c = b-a;
		System.out.println(c);
		
		BigDecimal a2 = new BigDecimal("0.02");
		BigDecimal b2 = new BigDecimal("0.03");
		BigDecimal c2 = b2.subtract(a2);
		System.out.println(c2);
		// Esta es una solucion sucia, almenos para mi, pero tambien funciona
		double res= ((b*1000)-(a*1000))/1000;
		System.out.println(res);
		
		
	}

}
