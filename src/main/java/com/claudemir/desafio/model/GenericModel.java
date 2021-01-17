package com.claudemir.desafio.model;

import java.io.Serializable;

public class GenericModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;

	public GenericModel() {
	}

	public GenericModel(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
