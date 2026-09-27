package com.sd.prj_petshop.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sd.prj_petshop.models.Pessoa;
import com.sd.prj_petshop.repositories.PessoaRepository;

@Service
public class PessoaService
{
	private final PessoaRepository pessoaRepository;

	public PessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	public List<Pessoa> getPessoas()
	{
		return pessoaRepository.findAll();
		//return List.of(new Pessoa(1, "Cícero", "011.222.159-50", "07/05/1989"));
	}
	
	public Pessoa savePessoas(Pessoa pessoa)
	{
		return pessoaRepository.save(pessoa);
	}
}