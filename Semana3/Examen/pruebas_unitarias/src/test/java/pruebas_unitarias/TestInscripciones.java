package pruebas_unitarias;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import inscripciones.Alumnos;
import inscripciones.Escuela;

public class TestInscripciones {
	Escuela escuela;
	Alumnos alumno;
	
	@Before
	public void init() {
		escuela = new Escuela();
		alumno = new Alumnos("Odraude", 22, 10);
		escuela.agregarAlumno(alumno);
	}

	@Test
	public void testSise() {
		assertEquals(1, escuela.getCantAlumn());
	}
	
	@Test
	public void testInsertar() {
		Alumnos alumnoCopia = alumno;
		assertEquals(alumnoCopia, escuela.getAlumno(0));
	}
	
	@Test
	public void testLista() {
		List<Alumnos> lista = escuela.getLista();	
		assertEquals(lista, escuela.getLista());
	}
	
	@Test
	public void testEliminar() {
		assertEquals(alumno,escuela.eliminarAlumno(0));
	}
	
	@Test
	public void testMostrarAlumno() {
		assertEquals(alumno.toString(),escuela.getAlumno(0).toString());
	}
	
	@Test
	public void testEqualsAlumno() {
		Alumnos alumnoCopia=alumno;
		assertEquals(alumno,alumnoCopia);
	}
	
	@Test
	public void setLista() {
		Escuela transferencia = new Escuela();
		transferencia.setLista(escuela.getLista());
		assertEquals(transferencia.getLista(), escuela.getLista());
	}

	@Test
	public void alumno() {
		alumno.setEdad(21);
		alumno.setNombre("paco");
		alumno.setPromedioAnterior(8);
		
		assertEquals(21,alumno.getEdad());
		assertEquals("paco",alumno.getNombre());
		assertEquals(8,(int)alumno.getPromedioAnterior());
	}

}
