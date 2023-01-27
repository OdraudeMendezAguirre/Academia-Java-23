package com.luv2code.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/VocalistaControllerServlet")
public class VocalistaControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private VocalistaDbUtil vocalistaDbUtil;
	
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		// create our student db util ... and pass in the conn pool / datasource
		try {
			vocalistaDbUtil = new VocalistaDbUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");
			
			// if the command is missing, then default to listing students
			if (theCommand == null) {
				theCommand = "LIST";
			}
			
			// route to the appropriate method
			switch (theCommand) {
			
			case "LIST":
				listVocalista(request, response);
				break;
				
			case "ADD":
				addVocalista(request, response);
				break;
				
			case "LOAD":
				loadVocalista(request, response);
				break;
				
			case "UPDATE":
				updateVocalista(request, response);
				break;
			
			case "DELETE":
				deleteVocalista(request, response);
				break;
				
			default:
				listVocalista(request, response);
			}
				
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
		
	}

	private void deleteVocalista(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read student id from form data
		String idVocalista = request.getParameter("VocalistaId");
		
		// delete student from database
		vocalistaDbUtil.deleteVocalista(idVocalista);
		
		// send them back to "list students" page
		listVocalista(request, response);
	}

	private void updateVocalista(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read student info from form data
		String idVocalista = request.getParameter("vocalistaId");
		int id = Integer.parseInt(idVocalista);
		String nombre = request.getParameter("nombre");
		
		// create a new student object
		Vocalista theVocalista = new Vocalista(id, nombre);
		
		// perform update on database
		vocalistaDbUtil.updateVocalista(theVocalista);
		
		// send them back to the "list students" page
		listVocalista(request, response);
		
	}

	private void loadVocalista(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// read student id from form data
		String theVocalistaId = request.getParameter("VocalistaId");
		
		// get student from database (db util)
		Vocalista theVocalista = vocalistaDbUtil.getVocalista(Integer.parseInt(theVocalistaId));
		
		// place student in the request attribute
		request.setAttribute("THE_VOCALISTA", theVocalista);
		
		// send to jsp page: update-student-form.jsp
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/update-vocalista-form.jsp");
		dispatcher.forward(request, response);		
	}

	private void addVocalista(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student info from form data
		String nombre = request.getParameter("nombre");	
		
		// create a new student object
		Vocalista theVocalista = new Vocalista(nombre);
		
		// add the student to the database
		vocalistaDbUtil.addVocalista(theVocalista);
				
		// send back to main page (the student list)
		listVocalista(request, response);
	}

	private void listVocalista(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// get students from db util
		List<Vocalista> vocalistas = vocalistaDbUtil.getVocalistas();
		
		// add students to the request
		request.setAttribute("VOCALISTA_LIST", vocalistas);
				
		// send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-vocalista.jsp");
		dispatcher.forward(request, response);
	}

}













