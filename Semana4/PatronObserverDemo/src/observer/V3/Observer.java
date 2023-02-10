package observer.V3;

public abstract class Observer {
	Subject sb;
	
	public Observer(Subject sb) {
		this.sb = sb;
		this.sb.attach(this);
	}

	abstract void update();
}
