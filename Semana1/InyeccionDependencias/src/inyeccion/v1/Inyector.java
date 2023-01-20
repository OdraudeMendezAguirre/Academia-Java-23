package inyeccion.v1;

public class Inyector {
	static Windows w = new Windows("Vista");
	static Linux l = new Linux("Ubuntu");
	
	static void inyectarPc(Becario b,String type) {
		if(type=="Windows")
			b.computadora=w;
		else
			b.computadora=l;
	}
}
