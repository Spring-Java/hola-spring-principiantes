package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "forward:/app/index"; 
		//redirect: rediriga a una ruta que especifiquemos
		//forward: Se utiliza para rutas propias de nuestro proyecto
	}

}
