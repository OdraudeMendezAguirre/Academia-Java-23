package inyeccion.v2;

public class Inyector {
	static Windows w = new Windows("Vista");
	static Linux l = new Linux("Ubuntu");
	
	static Becario inyectarPc(String nb,String type) {
		if(type=="Windows")
			return new Becario(nb,w);
		else
			return new Becario(nb,l);
	}
}
