package com.sd.prj_petshop.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Pet implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idpet;

	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String raca;
	
	@Column(nullable = false)
	private String data_nasc;
	
	@Column(nullable = false)
	private String cor;
	
	@Column(nullable = false)
	private String porte;
	
	@ManyToOne
	@JoinColumn(name="idpessoa")
	private Pessoa pessoa;
	
	public long getIdpet() {
		return idpet;
	}
	
	public void setIdpet(long idpet) {
		this.idpet = idpet;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
