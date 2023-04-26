package com.projeto.spring.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.spring.curso.SalaRepository;
import com.projeto.spring.curso.domain.Sala;

@RestController
public class SalaController {
	
	@Autowired
	private SalaRepository sr;
	
	@GetMapping("/sala/listar")
	public List<Sala> listar(){
		return sr.findAll();
	}
	@GetMapping("/sala/listar/{id}")
	public Optional<Sala> listar(@PathVariable Long id) {
		return sr.findById(id);
	}
	
	@PostMapping("/sala/cadastrar")
	public String cadastrar(@RequestBody Sala sala) {
	
		sr.save(sala);
		return "Cadastrou";
	}
	
	@PutMapping("/sala/atualizar/{id}")
	public String atualizar(@PathVariable Long id,@RequestBody Sala sala) {
		String msg = "";
		Optional<Sala> c = sr.findById(id);
		
		if(c.isPresent()) {
			sala.setIdsala(id);
			sr.save(sala);
			msg = "Sala atualizado";
		}
		else {
			msg = "Sala não encontrado";
		}
		return msg;
	}
	@DeleteMapping("/sala/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		String msg = "";
		Optional<Sala> c = sr.findById(id);
		
		if(c.isPresent()) {
			sr.deleteById(id);
			msg = "sala apagado";
		}
		else {
			msg = "sala não localizado";
		}
		return msg;
		
	}

}
