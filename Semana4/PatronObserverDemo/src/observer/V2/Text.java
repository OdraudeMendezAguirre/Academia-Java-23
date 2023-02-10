package observer.V2;

public class Text extends Observer {
	private String label;

	public Text(String label) {
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
