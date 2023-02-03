package examen.odraude.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import examen.odraude.springdemo.dao.CancionDAO;
import examen.odraude.springdemo.entity.Cancion;

@Service
public class CancionServiceImpl implements CancionService {

	// need to inject customer dao
	@Autowired
	@Qualifier("cancionDAOImpljdbc")
	private CancionDAO cancionDAO;
	
	@Override
	@Transactional
	public List<Cancion> getCanciones() {
		return cancionDAO.getCanciones();
	}

	@Override
	@Transactional
	public void saveCancion(Cancion theCancion) {

		cancionDAO.saveCancion(theCancion);
	}

	@Override
	@Transactional
	public Cancion getCancion(int theId) {
		
		return cancionDAO.getCancion(theId);
	}

	@Override
	@Transactional
	public void deleteCancion(int theId) {
		
		cancionDAO.deleteCancion(theId);
	}
}





