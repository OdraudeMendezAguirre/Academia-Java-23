package examen.odraude.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import examen.odraude.springdemo.entity.Cancion;
import examen.odraude.springdemo.service.CancionService;

@Controller
@RequestMapping("/cancion")
public class CancionController {

	// need to inject our customer service
	@Autowired
	private CancionService cancionService;
	
	@GetMapping("/list")
	public String listCanciones(Model theModel) {
		
		// get customers from the service
		List<Cancion> theCanciones = cancionService.getCanciones();
				
		// add the customers to the model
		theModel.addAttribute("canciones", theCanciones);
		
		return "list-canciones";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Cancion theCancion = new Cancion();
		
		theModel.addAttribute("cancion", theCancion);
		
		return "canciones-form";
	}
	
	@PostMapping("/saveCancion")
	public String saveCancion(@ModelAttribute("cancion") Cancion theCancion) {
		
		// save the customer using our service
		cancionService.saveCancion(theCancion);	
		
		return "redirect:/cancion/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("cancionId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Cancion theCancion = cancionService.getCancion(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("cancion", theCancion);
		
		// send over to our form		
		return "canciones-form";
	}
	
	@GetMapping("/delete")
	public String deleteCancion(@RequestParam("cancionId") int theId) {
		
		// delete the customer
		cancionService.deleteCancion(theId);
		
		return "redirect:/cancion/list";
	}
}










