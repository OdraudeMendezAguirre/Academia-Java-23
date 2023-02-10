package observer.V3;

public class Image extends Observer{
	private String image;
	
	public Image(String i,Subject sb) {
		super(sb);
		this.image=i;
	}
	
	void showImage() {
		System.out.println(image);
	}

	@Override
	void update() {
		showImage();
	}
}
