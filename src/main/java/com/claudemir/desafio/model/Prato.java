package com.claudemir.desafio.model;

public class Prato extends GenericModel {

	private static final long serialVersionUID = 1L;

	private Prato sim;

	private Prato nao;

	public Prato() {
	}

	public Prato(String nome) {
		super(nome);
	}

	public Prato(Prato sim, Prato nao) {
		this.sim = sim;
		this.nao = nao;
	}

	public Prato(String nome, Prato sim, Prato nao) {
		super(nome);
		this.sim = sim;
		this.nao = nao;
	}

	public Prato getSim() {
		return sim;
	}

	public void setSim(Prato sim) {
		this.sim = sim;
	}

	public Prato getNao() {
		return nao;
	}

	public void setNao(Prato nao) {
		this.nao = nao;
	}

}