package anonima.v2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		Operacion o2 = new Operacion() {

			@Override
			public int ejecuta(int x, int y) {
				// TODO Auto-generated method stub
				return x-y;
			}	
		};
		
		res=o2.ejecuta(8, 4);
		System.out.println(res);
	}

}
