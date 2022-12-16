package com.nttdata.spring.service;

import java.util.List;

import com.nttdata.spring.models.Apartamento;

public interface ApartamentoServiceI {
	public Apartamento createApartamento();
	public List<Apartamento> listAll();
}
