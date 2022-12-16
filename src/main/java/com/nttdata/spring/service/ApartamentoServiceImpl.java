package com.nttdata.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.models.Apartamento;
import com.nttdata.spring.repository.ApartamentoRepository;

@Service
public class ApartamentoServiceImpl implements ApartamentoServiceI{
	@Autowired
	ApartamentoRepository repository;

	@Override
	public Apartamento createApartamento() {
		Apartamento a = new Apartamento();
		a.setPersonas(new ArrayList<>());
		return a;
	}

	@Override
	public List<Apartamento> listAll() {
		return repository.findAll();
	}
	
	
}
