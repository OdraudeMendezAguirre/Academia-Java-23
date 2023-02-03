package examen.odraude.springdemo.dao;

import java.util.List;

import examen.odraude.springdemo.entity.Cancion;

public interface CancionDAO {

	public List<Cancion> getCanciones();

	public void saveCancion(Cancion theCancion);

	public Cancion getCancion(int theId);

	public void deleteCancion(int theId);
	
}
