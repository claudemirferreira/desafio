package com.claudemir.desafio.model;

public class Prato {
	
	private String nome;
    private Prato sim;
    private Prato nao;
    
    public Prato() {
    }
    
    public Prato(String nome, Prato sim, Prato nao) {
		this.nome = nome;
		this.sim = sim;
		this.nao = nao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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