package observer.V3;

public class SccrollBar extends Observer{

	public SccrollBar(Subject sb) {
		super(sb);
		// TODO Auto-generated constructor stub
	}

	void moveScrollBar(){
		System.out.println("Moving");
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		moveScrollBar();
	}
}
