package observer.V2;

public class Image extends Observer{
	private String image;
	
	public Image(String i) {
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
