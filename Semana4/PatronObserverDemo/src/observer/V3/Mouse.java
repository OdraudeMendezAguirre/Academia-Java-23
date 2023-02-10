package observer.V3;

//CLASE CON ALTO ACOPLAMIENTO
public class Mouse extends Subject{

	void click() {
		notificar();
	}
}
