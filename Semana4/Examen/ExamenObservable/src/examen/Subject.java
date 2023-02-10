package examen;

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
	
	void notificar (String x) {
		for (Observer o : listaObserver) {
			o.update(x);
		}
	}
}
