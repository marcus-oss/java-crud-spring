package com.treinamento.controller;

import org.springframework.web.bind.annotation.RestController;

import com.treinamento.Pessoa;
import com.treinamento.Repository.PessoaRepository;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@AllArgsConstructor
public class PessoaController {

	PessoaRepository repository;

	/*
	 * Metodo para listar todas as pessoas cadastradas na tabela
	 * */
	@GetMapping("/pessoa")
	public List<Pessoa> listarPessoas() {
		return repository.findAll();

	}

	/*
	 *Metodo para buscar pessoa já cadastrada pelo Id 
	 **/
	@GetMapping("/pessoa/{Id}")
	public Pessoa pessoaPorId(@PathVariable Long Id) {
		return repository.findById(Id).get();

	}

	/*
	 * Metodo para cadastrar pessoa na tabela
	 * 
	 * */
	@PostMapping("/pessoa")
	public Pessoa cadastrarPessoa(@RequestBody Pessoa pessoa) {
		return repository.save(pessoa);

	}

	/*
	 * metodo para deletar uma pessoa especifica pelo Id
	 * */
	@DeleteMapping("/pessoa/{Id}")
	public void deeletarPessoa(@PathVariable Long Id) {
		repository.deleteById(Id);

	}

}
