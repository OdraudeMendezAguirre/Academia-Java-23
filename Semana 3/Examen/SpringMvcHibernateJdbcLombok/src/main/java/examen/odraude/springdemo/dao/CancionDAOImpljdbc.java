package examen.odraude.springdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import examen.odraude.springdemo.entity.Cancion;

@Repository
public class CancionDAOImpljdbc implements CancionDAO {

	@Autowired
	DataSource dataSource;
	
	@Override
	public List<Cancion> getCanciones() {
		List<Cancion> allCanciones = new ArrayList<>();
		String sql = "select * from canciones order by album";
		
		try (Connection myConn = dataSource.getConnection();
				Statement myStmt = myConn.createStatement();
				ResultSet myRs = myStmt.executeQuery(sql)) {
			
			while (myRs.next()) {
				int id = myRs.getInt("id");
				String nombre = myRs.getString("nombre");
				String album = myRs.getString("album");
				// create new student object
				Cancion tempCancion= new Cancion(id, nombre, album);
				allCanciones.add(tempCancion);				
			}
			
			return allCanciones;		
		}catch (Exception e) {
			e.printStackTrace();
			return allCanciones;
		}
	}

	@Override
	public void saveCancion(Cancion theCancion) {
		// TODO Auto-generated method stub

		String sql = "insert into canciones (nombre,album) values (?,?)";
		try (Connection myConn = dataSource.getConnection();
				PreparedStatement myStmt = myConn.prepareStatement(sql)) {
			
			myStmt.setString(1, theCancion.getNombre());
			myStmt.setString(2, theCancion.getAlbum());
			
			myStmt.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Cancion getCancion(int theId) {
		Cancion cancion =null;
		String sql = "select * form canciones where id=?";
		try (Connection myConn = dataSource.getConnection();
				PreparedStatement myStmt = myConn.prepareStatement(sql)) {
			myStmt.setInt(1, theId);
			ResultSet myRs = myStmt.executeQuery(sql);
			if (myRs.next()) {
				String nombre = myRs.getString("nombre");
				String album = myRs.getString("album");
				
				// use the studentId during construction
				cancion = new Cancion(theId, nombre,album);
			}
			else {
				throw new Exception("No se encontro al vocalista con id: " + theId);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return cancion;
	}

	@Override
	public void deleteCancion(int theId) {
		// TODO Auto-generated method stub
		String sql = "delete from canciones where id=?";
		try (Connection myConn = dataSource.getConnection();
				PreparedStatement myStmt = myConn.prepareStatement(sql)){
			myStmt.setInt(1, theId);
			myStmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	


}











