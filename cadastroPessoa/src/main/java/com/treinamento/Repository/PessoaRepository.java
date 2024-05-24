package com.treinamento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento.Pessoa;

/*
 * 
 * classe de pessoa repository  extendendo os metodos jpa
 */

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	

}
