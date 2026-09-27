package com.sd.prj_petshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sd.prj_petshop.models.Pessoa;
import com.sd.prj_petshop.services.PessoaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping
	public List<Pessoa> getAllBooks() {
		return pessoaService.getPessoas();
	}
	
	@PutMapping
	public Pessoa savePessoa(@RequestBody Pessoa pessoa)
	{
		return pessoaService.savePessoas(pessoa);
	}
	
}