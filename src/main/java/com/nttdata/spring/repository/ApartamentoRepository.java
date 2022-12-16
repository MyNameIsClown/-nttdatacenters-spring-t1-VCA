package com.nttdata.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.spring.models.Apartamento;

@Repository
public interface ApartamentoRepository extends JpaRepository<Apartamento, Integer>{

}
