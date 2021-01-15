package com.claudemir.desafio;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.claudemir.desafio.service.ServicePrato;
import com.claudemir.desafio.view.ViewGourmet;

@SpringBootApplication
public class DesafioApplication extends JFrame {
	private static final long serialVersionUID = 1L;

	public DesafioApplication() {
		initUI();
	}

	private void initUI() {
		ServicePrato control = new ServicePrato();
		JFrame principal = ViewGourmet.getFramePrincipal(control);
		principal.setVisible(true);
	}

	public static void main(String[] args) {
		var ctx = new SpringApplicationBuilder(DesafioApplication.class).headless(false).run(args);
		EventQueue.invokeLater(() -> {
			var ex = ctx.getBean(DesafioApplication.class);
			ex.setVisible(true);
		});
	}
}