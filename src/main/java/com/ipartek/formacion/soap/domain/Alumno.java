package com.ipartek.formacion.soap.domain;

public class Alumno {
	
	
	private String nif;
	private String nombre;
	private String apellidos;
	private String email;
	
	public Alumno() {
		super();
		this.nif = "";
		this.nombre = "";
		this.apellidos = "";
		this.email = "";
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Alumno [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + "]";
	}
	
	
	
	
	

}
