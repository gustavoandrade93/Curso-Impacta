package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.TelaListarProgramadorPhp;

public class TelaDeletarProgramadorPhpControle implements ActionListener {

	RepositorioProgramadorPhp repositorioProgramadorPhp;
	JFrame frameMenuInicialProgramadorPhp;
	JFrame frameDeletarrProgramadorPhp;
	JTextField matriculaField;
	
	TelaListarProgramadorPhp telaListarProgramadorPhp = new TelaListarProgramadorPhp();
	
	boolean deletado;
	
	
	public TelaDeletarProgramadorPhpControle(RepositorioProgramadorPhp repositorioProgramadorPhp, JFrame frameMenuInicialProgramadorPhp,
			JFrame frameDeletarrProgramadorPhp, JTextField matriculaField) {
		super();
		this.repositorioProgramadorPhp = repositorioProgramadorPhp;
		this.frameMenuInicialProgramadorPhp = frameMenuInicialProgramadorPhp;
		this.frameDeletarrProgramadorPhp = frameDeletarrProgramadorPhp;
		this.matriculaField = matriculaField;
	}






	@Override
	public void actionPerformed(ActionEvent e) {
		deletado = repositorioProgramadorPhp.deletarProgramadorPhp(matriculaField.getText());
		frameDeletarrProgramadorPhp.setVisible(false);
		telaListarProgramadorPhp.apresentarListaProgramadorPhp(repositorioProgramadorPhp.listarProgramadorPhp(), frameMenuInicialProgramadorPhp);
		
		if(deletado) {
			JOptionPane.showMessageDialog(null, "ProgramadorPhp Deletado");
		
		}else {
			JOptionPane.showMessageDialog(null, "ProgramadorPhp Não Encontrado");
			
		}
		
	}

}
