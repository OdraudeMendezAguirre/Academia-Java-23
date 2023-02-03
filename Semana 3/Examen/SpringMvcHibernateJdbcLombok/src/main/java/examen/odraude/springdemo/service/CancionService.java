package examen.odraude.springdemo.service;

import java.util.List;

import examen.odraude.springdemo.entity.Cancion;

public interface CancionService {

	public List<Cancion> getCanciones();

	public void saveCancion(Cancion theCancion);

	public Cancion getCancion(int theId);

	public void deleteCancion(int theId);
	
}
