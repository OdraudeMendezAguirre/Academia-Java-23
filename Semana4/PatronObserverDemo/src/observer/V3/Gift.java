package observer.V3;

public class Gift extends Observer {

	public Gift(Subject sb) {
		super(sb);
	}

	void showGift() {
		System.out.println("gift chistoson");
	}
	
	@Override
	void update() {
		// TODO Auto-generated method stub
		showGift();
	}

}
