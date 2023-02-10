package observer.V2;

public class Gift extends Observer {

	void showGift() {
		System.out.println("gift chistoson");
	}
	
	@Override
	void update() {
		// TODO Auto-generated method stub
		showGift();
	}

}
