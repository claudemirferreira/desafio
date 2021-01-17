package com.claudemir.desafio;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.claudemir.desafio.service.ServicePrato;
import com.claudemir.desafio.view.ViewGourmet;

@SpringBootApplication
public class DesafioApplication extends JFrame {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	ServicePrato service;

	public DesafioApplication() {
	}

	public static void main(String[] args) {
		var ctx = new SpringApplicationBuilder(DesafioApplication.class).headless(false).run(args);
		EventQueue.invokeLater(() -> {
			var ex = ctx.getBean(DesafioApplication.class);
			ex.setVisible(true);
			JFrame principal = ctx.getBean(ViewGourmet.class);
			principal.setVisible(true);
		});
	}
}