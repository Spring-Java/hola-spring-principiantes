package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller // Para especificar que es nuestra clase controlador
@RequestMapping("/app") // Anotacion de ruta raiz
public class IndexController {
	
	
	//Vamos a inyectar valores desde nuestro archivo properties- se indica donde se encuentra el valor con la notacion @Value
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	
	

	@GetMapping({ "/index", "", "/", "/home" })
	public String index(Model model) { // Utilizamos un MAP(llave,valor) para inyectar valores
		model.addAttribute("titulo", textoIndex);
		model.addAttribute("descripcion",
				"El método GET  solicita una representación de un recurso específico. Las peticiones que ");
		return "index";
	}

	// 2.-Método handler
	@GetMapping("/perfil")
	public String perfil(Model model) {
		model.addAttribute("titulo", "MI PRIMER PROGRAMA");
		// Creamos un objeto de tipo Usuario
		Usuario u = new Usuario("Luis Carlos", "Rendon Aparicio", null);

		// Pasamos nuestro objeto a la vista
		model.addAttribute("usuario", u);
		model.addAttribute("titulo", "Perfil del usuario ".concat(u.getNombre()));
		return "perfil";
	}

	// 3.-Método handler
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "LISTA DE USUARIOS");

		List<Usuario> lista = Arrays.asList(
				new Usuario("Luis", "Rendon", "Luis@gmail.com"),
				new Usuario("Jesus", "Lopez", "Jesu@gmail.com"),
				new Usuario("Miguel", "Fernando", "migedferf@gmail.com"),
				new Usuario("Alejandra", "Ayala", "aleayala@gmail.com"),
				new Usuario("Tornado","Roe","tornadoroa@gmail.com"));


		// Pasamos la lista a la vista
		model.addAttribute("usuarios", lista);

		return "listar";
	}
	// Video: 24
}
