package com.projeto.spring.curso;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.spring.curso.domain.Sala;

public interface SalaRepository extends JpaRepository<Sala,Long>{

}