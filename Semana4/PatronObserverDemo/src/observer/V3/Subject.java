package observer.V3;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	List<Observer> listaObserver = new ArrayList<>();
	
	void attach(Observer o) {
		listaObserver.add(o);
	}
	
	void detach(Observer o) {
		listaObserver.remove(o);
	}
	
	void notificar () {
		for (Observer o : listaObserver) {
			o.update();
		}
	}
}
