package observer.V1;

public class Text {
	private String label;

	public Text(String label) {
		this.label = label;
	}
	
	void showText(){
		System.out.println(label);
	}
}
