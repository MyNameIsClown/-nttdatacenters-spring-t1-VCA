package com.nttdata.spring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Persona {
	/** ID */
	private int idPersona;
	
	/** Nombre */
	private String nombre;
	
	/** Dni */
	private String dni;
	
	/** Numero de Telfono */
	private int numTelefono;
	
	/** Apartamento donde vive */
	private Apartamento apartamento;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return idPersona;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idPersona = id;
	}

	/**
	 * @return the nombre
	 */
	@Column
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the dni
	 */
	@Column(nullable = false, unique = true)
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the numTelefono
	 */
	@Column
	public int getNumTelefono() {
		return numTelefono;
	}

	/**
	 * @param numTelefono the numTelefono to set
	 */
	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}

	/**
	 * @return the apartamento
	 */
	@ManyToOne
	@JoinColumn(name = "idApartamento_fk")
	public Apartamento getApartamento() {
		return apartamento;
	}

	/**
	 * @param apartamento the apartamento to set
	 */
	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}
	
	/**
	 * To Sttring
	 * 
	 */
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", dni=" + dni + ", numTelefono="
				+ numTelefono + "]";
	}
	
	
}
