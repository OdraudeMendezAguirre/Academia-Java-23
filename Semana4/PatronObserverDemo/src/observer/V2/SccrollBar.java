package observer.V2;

public class SccrollBar extends Observer{

	void moveScrollBar(){
		System.out.println("Moving");
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		moveScrollBar();
	}
}
