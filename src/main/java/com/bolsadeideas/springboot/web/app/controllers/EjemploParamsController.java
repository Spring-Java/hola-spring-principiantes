package com.bolsadeideas.springboot.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

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

		return "params/index";
	}

	@GetMapping("/string") // Mapeamos una ruta URL para poder acceder desde nuestro navegador
	public String ver(@RequestParam(value = "texto", defaultValue = "Valor predeterminado" + "") String texto,
			Model model) { // El objeto Model nos permite pasar
							// valores a nuestra vista
		model.addAttribute("titulo", "PASANDO PARAMETROS DESDE LA URL");

		// Pasamos a la vista nuestro valor que introduscan
		model.addAttribute("resultado", "El texto enviado es: ".concat(texto));

		return "params/ver";
	}

	@GetMapping("/mix-params")
	public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
		// Enviamos los datos a la vista
		model.addAttribute("titulo", "Enviando diferentes parametros con @RequestParam");

		model.addAttribute("resultado", "El saludo enviado es: ".concat(saludo).concat(" ")
				.concat("y el número es " + "").concat(numero.toString()));

		return "params/ver";
	}
	
	//Otra forma para pasar los parametros
	@GetMapping("/mix-params")
	public String param(HttpServletRequest request, Model model) {
		// Enviamos los datos a la vista
		model.addAttribute("titulo", "Enviando diferentes parametros con @RequestParam");
		
		//Obtenemos los valores
		String saludo=request.getParameter("saludo");
		Integer numero=Integer.parseInt(request.getParameter("numero"));
		
		model.addAttribute("resultado", "El saludo enviado es: ".concat(saludo).concat(" ")
				.concat("y el número es " + "").concat(numero.toString()));

		return "params/ver";
	}

}

//Video :