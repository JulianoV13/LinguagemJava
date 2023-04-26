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

import com.projeto.spring.curso.TurmaRepository;
import com.projeto.spring.curso.domain.Turma;

@RestController
public class TurmaController {
	
	@Autowired
	private TurmaRepository dr;
	
	@GetMapping("/turma/listar")
	public List<Turma> listar(){
		return dr.findAll();
	}
	@GetMapping("/turma/listar/{id}")
	public Optional<Turma> listar(@PathVariable Long id) {
		return dr.findById(id);
	}
	
	@PostMapping("/turma/cadastrar")
	public String cadastrar(@RequestBody Turma turma) {
	
		dr.save(turma);
		return "Cadastrou";
	}
	
	@PutMapping("/turma/atualizar/{id}")
	public String atualizar(@PathVariable Long id,@RequestBody Turma turma) {
		String msg = "";
		Optional<Turma> c = dr.findById(id);
		
		if(c.isPresent()) {
			turma.setIdturma(id);
			dr.save(turma);
			msg = "turma atualizado";
		}
		else {
			msg = "turma não encontrado";
		}
		return msg;
	}
	@DeleteMapping("/turma/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		String msg = "";
		Optional<Turma> c = dr.findById(id);
		
		if(c.isPresent()) {
			dr.deleteById(id);
			msg = "turma apagado";
		}
		else {
			msg = "turma não localizado";
		}
		return msg;
		
	}

}
