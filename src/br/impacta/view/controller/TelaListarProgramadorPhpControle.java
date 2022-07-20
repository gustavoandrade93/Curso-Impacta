package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TelaListarProgramadorPhpControle implements ActionListener {
	JFrame frameMenuInicialProgramadorPhp;
	JFrame frameListarProgramadorPhp;

	

	public TelaListarProgramadorPhpControle(JFrame frameMenuInicialProgramadorPhp, JFrame frameListarProgramadorPhp) {
		super();
		this.frameMenuInicialProgramadorPhp = frameMenuInicialProgramadorPhp;
		this.frameListarProgramadorPhp = frameListarProgramadorPhp;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		frameMenuInicialProgramadorPhp.setVisible(true);
		frameListarProgramadorPhp.setVisible(false);
		
	}
	
	
	
	
}
