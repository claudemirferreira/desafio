package com.claudemir.desafio.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.claudemir.desafio.service.ServicePrato;

/**
 *
 * @author Marcos Felipe
 */
@Component
public class ViewGourmet extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	ServicePrato service;
	
	public ViewGourmet() {

		JLabel startLabel = new JLabel("Pense em um prato que você gosta.");
		startLabel.setBounds(55, 50, 280, 50);
		JButton startButton = new JButton("OK");
		startButton.setBounds(110, 100, 95, 30);

		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				service.iniciarRecursao();
			}
		});

		this.setTitle("Jogo Gourmet");
		this.add(startButton);
		this.add(startLabel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(330, 220);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
	}

	public static void showAcertei() {
		JOptionPane.showMessageDialog(null, "Acertei!", "Jogo Gourmet", JOptionPane.INFORMATION_MESSAGE);
	}

	public static int showPerguntaPrato(String descricao) {
		return JOptionPane.showConfirmDialog(null, "O prato que você pensou é " + descricao + "?", "Jogo Gourmet",
				JOptionPane.YES_NO_OPTION);
	}

	public static String showPerguntaNewPrato() {
		return JOptionPane.showInputDialog(null, "Qual prato você pensou?", "Jogo Gourmet",
				JOptionPane.QUESTION_MESSAGE);
	}

	public static String showPerguntaDiferenca(String newNome, String atualNome) {
		return JOptionPane.showInputDialog(null, newNome + " é ________ mas " + atualNome + " não.", "Jogo Gourmet",
				JOptionPane.QUESTION_MESSAGE);
	}

}