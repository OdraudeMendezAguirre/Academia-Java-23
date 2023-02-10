package observer.V1;

public class Image {
	private String image;
	
	public Image(String i) {
		this.image=i;
	}
	
	void showImage() {
		System.out.println(image);
	}
}
