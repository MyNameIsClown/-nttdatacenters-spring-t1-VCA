package com.nttdata.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.spring.models.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{
	
}
