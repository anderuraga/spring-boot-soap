package com.ipartek.formacion.soap.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.ipartek.formacion.soap.domain.Alumno;

@Component
public class AlumnoRepository {
	
	private static final Map<String, Alumno> alumnos = new HashMap<>();

	@PostConstruct
	public void initData() {
		Alumno a = new Alumno();
		a.setNif("1111111H");
		a.setNombre("pepa");
		a.setApellidos("Hermnegilda Gomez");
		a.setEmail("pepa@jmail.com");
		
		Alumno b = new Alumno();
		b.setNif("2222222H");
		b.setNombre("pepe");
		b.setApellidos("Dolores Fuertes");
		b.setEmail("pepe@hoxmail.com");

		alumnos.put(a.getNif(), a);
		alumnos.put(b.getNif(), b);

		
	}

	public Alumno findAlumno(String nif) {		
		return alumnos.get(nif);
	}
	
	
}
