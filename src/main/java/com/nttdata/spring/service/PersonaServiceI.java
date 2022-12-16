package com.nttdata.spring.service;

import java.util.List;

import com.nttdata.spring.models.Persona;

public interface PersonaServiceI {
	public Persona addPersona(String nombre, String dni);
	public List<Persona> listAll();
}
