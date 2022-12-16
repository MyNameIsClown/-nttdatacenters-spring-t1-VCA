package com.nttdata.spring.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Apartamento {
	/** Id */
	private int idApartamento;
	
	/** Personas que viven en ese apartamento */
	private List<Persona> personas;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return idApartamento;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idApartamento = id;
	}

	/**
	 * @return the personas
	 */
	@OneToMany(mappedBy = "apartamento", cascade = CascadeType.ALL)
	public List<Persona> getPersonas() {
		return personas;
	}

	/**
	 * @param personas the personas to set
	 */
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	
}
