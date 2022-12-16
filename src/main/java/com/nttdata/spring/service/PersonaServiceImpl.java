package com.nttdata.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.models.Persona;
import com.nttdata.spring.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaServiceI{
	@Autowired
	private PersonaRepository repository;
	
	@Override
	public Persona addPersona(String nombre, String dni) {
		Persona p = new Persona();
		p.setNombre(nombre);
		p.setDni(dni);
		repository.save(p);
		return p;
	}

	@Override
	public List<Persona> listAll() {
		return repository.findAll();
	}

}
