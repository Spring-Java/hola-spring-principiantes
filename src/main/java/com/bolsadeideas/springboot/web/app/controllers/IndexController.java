package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller // Para especificar que es nuestra clase controlador
@RequestMapping("/app") // Anotacion de ruta raiz
public class IndexController {

	@GetMapping({ "/index", "", "/", "/home" })
	public String index(Model model) { // Utilizamos un MAP(llave,valor) para inyectar valores
		model.addAttribute("titulo", "HOLA SPRING FRAMEWORK");
		model.addAttribute("descripcion",
				"El método GET  solicita una representación de un recurso específico. Las peticiones que ");
		return "index";
	}

	// 2.-Método handler
	@GetMapping("/perfil")
	public String perfil(Model model) {
		model.addAttribute("titulo", "MI PRIMER PROGRAMA");
		// Creamos un objeto de tipo Usuario
		Usuario u = new Usuario("Luis Carlos", "Rendon Aparicio","LuisCRendon131@gmail.com");

		// Pasamos nuestro objeto a la vista
		model.addAttribute("usuario", u);
		model.addAttribute("titulo", "Perfil del usuario ".concat(u.getNombre()));
		return "perfil";
	}
	//Video 18
}
