package com.odraude.prueba.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Controller {
	
	@GetMapping("/welcome")
	public String saludo() {
		return "Hola, bienvenido";
	}
}
