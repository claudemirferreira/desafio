package com.claudemir.desafio;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.claudemir.desafio.view.JFrameGourmet;

@SpringBootApplication
public class DesafioApplication extends JFrame {
	private static final long serialVersionUID = 1L;

	public DesafioApplication() {
	}

	public static void main(String[] args) {
		var ctx = new SpringApplicationBuilder(DesafioApplication.class).headless(false).run(args);
		EventQueue.invokeLater(() -> {
			var ex = ctx.getBean(DesafioApplication.class);
			ex.setVisible(true);
			JFrame principal = ctx.getBean(JFrameGourmet.class);
			principal.setVisible(true);
		});
	}
}