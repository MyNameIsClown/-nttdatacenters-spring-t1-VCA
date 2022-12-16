package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.service.ApartamentoServiceI;
import com.nttdata.spring.service.PersonaServiceI;

@SpringBootApplication
public class NTTDataMain implements CommandLineRunner{
	@Autowired
	ApartamentoServiceI apartamentoService;
	
	@Autowired
	PersonaServiceI personaService;
	
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(personaService.listAll());
	}
}
