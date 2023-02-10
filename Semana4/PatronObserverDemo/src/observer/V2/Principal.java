package observer.V2;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Observer o1 = new Text("Hola");
		Observer o2 = new Image("imagen");
		Observer o3 = new SccrollBar();
		
		Mouse mouse = new Mouse();
		
		
		mouse.attach(o1);
		mouse.attach(o2);
		mouse.attach(o3);
		mouse.click();
		
		System.out.println("----------------");
		Observer o4 = new Gift();
		mouse.detach(o2);
		mouse.attach(o4);
		mouse.attach(o1);
		mouse.click();
	}

}
