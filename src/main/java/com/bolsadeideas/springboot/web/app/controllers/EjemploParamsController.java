package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	// La anotación @RequestParam nos permite enviar valores por la URL
	
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("titulo", "Enviar parametros del Request HTTP GET- URL");
		
		return"params/index";
	}
	

	@GetMapping("/string") // Mapeamos una ruta URL para poder acceder desde nuestro navegador
	public String ver(@RequestParam(value = "texto", defaultValue = "Valor predeterminado"
			+ "") String texto, Model model) { // El objeto Model nos permite pasar
																					// valores a nuestra vista
		model.addAttribute("titulo", "PASANDO PARAMETROS DESDE LA URL");
		
		//Pasamos a la vista nuestro valor que introduscan
		model.addAttribute("resultado", "El texto enviado es: ".concat(texto));
		
		return "params/ver";
	}

}

//Video : 19 - 12:03