package com.claudemir.desafio.service.impl;

import org.springframework.stereotype.Service;

import com.claudemir.desafio.model.Prato;
import com.claudemir.desafio.service.ServicePrato;
import com.claudemir.desafio.view.JFrameGourmet;

@Service
public class ServicePratoImpl implements ServicePrato {

	private Prato inicio;
	private final int SIM = 0;
	private final int NAO = 1;

	public ServicePratoImpl() {
		Prato lasanha = new Prato("Lasanha");
		Prato bolo = new Prato("Bolo de Chocolate");
		this.inicio = new Prato("Massa", lasanha, bolo);
	}

	public void iniciarRecursao() {
		System.out.println("INICIO DE RECURSAO");
		proximo(inicio);
		System.out.println("FIM DE RECURSAO");
	}

	private Prato proximo(Prato atual) {
		System.out.println("Método proximo INÍCIO, atual = " + atual.getNome());
		int escolha = JFrameGourmet.showPerguntaPrato(atual.getNome());
		System.out.println(escolha);
		Prato novoRamo;
		switch (escolha) {
		case SIM:
			if (atual.getSim() == null) {
				JFrameGourmet.showAcertei();
				novoRamo = null;
			} else {
				novoRamo = proximo(atual.getSim());
				if (novoRamo != null) {
					atual.setSim(novoRamo);
					novoRamo = null;
				}
			}
			break;
		case NAO:
			if (atual.getNao() == null) {
				novoRamo = newPrato(atual);
			} else {
				novoRamo = proximo(atual.getNao());
				if (novoRamo != null) {
					atual.setNao(novoRamo);
					novoRamo = null;
				}
			}
			break;
		default:
			novoRamo = null;
			break;
		}
		return novoRamo;
	}

	private Prato newPrato(Prato atual) {
		String nome = JFrameGourmet.showPerguntaNewPrato();
		System.out.println(nome);

		if (nome != null) {
			nome = nome.trim();
			if (!nome.equals("")) {
				System.out.println("CRIAR NOVO PRATO");
				Prato novo = new Prato();
				novo.setNome(nome);
				novo.setSim(null);
				novo.setNao(null);

				String difEntreNovoEAtualDescricao = JFrameGourmet.showPerguntaDiferenca(nome, atual.getNome());
				System.out.println(difEntreNovoEAtualDescricao);

				Prato difEntreNovoEAtual = new Prato();
				difEntreNovoEAtual.setNome(difEntreNovoEAtualDescricao);
				difEntreNovoEAtual.setSim(novo);
				difEntreNovoEAtual.setNao(atual);

				return difEntreNovoEAtual;
			}
		}
		return null;
	}

}