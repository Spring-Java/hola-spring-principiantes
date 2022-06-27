package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Notacion para indicar que es un controlador
@RequestMapping("/variables") // Notacion para mapear una ruta raiz del controlador
public class EjemploVariablesRutaController {

	// EJEMPLOS PASANDO PARAMETROS CON LA ANOTACIÓN @PathVariable

	@GetMapping("/string/{texto}") // {}= Se indica la parte dinamica(valor) que deseamos agregar
	public String variables(@PathVariable(name = "texto") String texto, Model model) { // name= especificar el nombre
																						// de nustro valor dinamico
																						// en nuestra ruta
		// Pasamos los valores a la vista
		model.addAttribute("titulo", "Recibiendo parametros de la RUTA- utilizando-> @PathVariable");

		model.addAttribute("resultado", "El texto enviado es: ".concat(texto));
		return "variables/ver";
	}

}
