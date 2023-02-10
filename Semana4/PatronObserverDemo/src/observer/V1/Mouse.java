package observer.V1;

//CLASE CON ALTO ACOPLAMIENTO
public class Mouse {
	Text txt = new Text("Texto que deberia aparecer dentro de un texto en formato tipo txt");
	SccrollBar sb = new SccrollBar();
	Image img = new Image("Imagen altamente relacionado con aquello a lo que se ha clickeado");
	void click() {
		txt.showText();
		sb.moveScrollBar();
		img.showImage();
	}
}
