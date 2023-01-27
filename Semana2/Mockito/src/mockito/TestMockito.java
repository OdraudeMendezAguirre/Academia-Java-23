package mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//Crear un objeto que implemente cloudSuma
class TestMockito {

	@Test
	void test() {
		int x=4;
		int y=5;
		Suma s = new Suma(x,y);
		assertEquals(x+y, s.ejecuta());
	}

}
