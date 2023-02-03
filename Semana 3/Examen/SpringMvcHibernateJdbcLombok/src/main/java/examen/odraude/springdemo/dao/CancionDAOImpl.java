package examen.odraude.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import examen.odraude.springdemo.entity.Cancion;

@Repository
public class CancionDAOImpl implements CancionDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Cancion> getCanciones() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Cancion> theQuery = 
				currentSession.createQuery("from Cancion order by album",
											Cancion.class);
		
		// execute query and get result list
		List<Cancion> canciones = theQuery.getResultList();
				
		// return the results		
		return canciones;
	}

	@Override
	public void saveCancion(Cancion theCancion) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theCancion);
		
	}

	@Override
	public Cancion getCancion(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Cancion theCancion = currentSession.get(Cancion.class, theId);
		
		return theCancion;
	}

	@Override
	public void deleteCancion(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Cancion where id=:cancionId");
		theQuery.setParameter("cancionId", theId);
		
		theQuery.executeUpdate();		
	}

}











