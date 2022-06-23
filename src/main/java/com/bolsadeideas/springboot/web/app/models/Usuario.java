package com.bolsadeideas.springboot.web.app.models;

public class Usuario { // Clase POJO: clase simple para sus datos con métodos GET y SET

	private String nombre;
	private String apellido;

	public Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Usuario() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
