package observer.V3;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		
		Observer o1 = new Text("Hola",mouse);
		Observer o2 = new Image("imagen",mouse);
		Observer o3 = new SccrollBar(mouse);
		
		mouse.click();
		
		System.out.println("----------------");
		Observer o4 = new Gift(mouse);
		mouse.click();
	}

}
