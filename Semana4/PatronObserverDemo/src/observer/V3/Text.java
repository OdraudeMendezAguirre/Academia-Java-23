package observer.V3;

public class Text extends Observer {
	private String label;

	public Text(String label, Subject sb) {
		super(sb);
		this.label = label;
	}
	
	void showText(){
		System.out.println(label);
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		showText();
	}
}
