package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import br.impacta.model.ProgramadorJava;
import br.impacta.repository.RepositorioProgramadorJava;

public class TelaAlterarProgramadorJavaControle implements ActionListener {
	
	JTextField matriculaTextField;
	JTextField nomeTextField;
	JTextField horasTrabalhadasTextField;
	JTextField certificacaoOracleTextField;
	ProgramadorJava programadorJavaAtual;
	RepositorioProgramadorJava repositorioProgramadorJava;
	JFrame frameMenuInicialProgramadorJava;
	JFrame frameTelaAlterarProgramadorJava ;
	
	
	boolean salvo = false;
	
	public TelaAlterarProgramadorJavaControle( JTextField certificacaoOracleTextField, JTextField matriculaTextField, JTextField nomeTextField,
			JTextField horasTrabalhadasTextField, ProgramadorJava programadorJavaAtual, RepositorioProgramadorJava repositorioProgramadorJava, JFrame frameMenuInicialProgramadorJava,
			JFrame frameTelaAlterarProgramadorJava ) {
		super();
		this.matriculaTextField = matriculaTextField;
		this.nomeTextField = nomeTextField;
		this.horasTrabalhadasTextField = horasTrabalhadasTextField;
		this.certificacaoOracleTextField = certificacaoOracleTextField;
		this.repositorioProgramadorJava = repositorioProgramadorJava;
		this.frameMenuInicialProgramadorJava = frameMenuInicialProgramadorJava;
		this.frameTelaAlterarProgramadorJava  = frameTelaAlterarProgramadorJava;
		this.programadorJavaAtual = programadorJavaAtual;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		acionarAlterar();
		frameMenuInicialProgramadorJava.setVisible(true);
		frameTelaAlterarProgramadorJava.setVisible(false);
		
	}
	
	public void acionarAlterar() {
		ProgramadorJava programadorJavaNovo = new ProgramadorJava();
		programadorJavaNovo.setMatricula(programadorJavaAtual.getMatricula());
		programadorJavaNovo.setNome(nomeTextField.getText());
		programadorJavaNovo.setSalario(programadorJavaAtual.calcularSalario(Integer.parseInt(horasTrabalhadasTextField.getText())));
		programadorJavaNovo.setCertificacaoOracle(certificacaoOracleTextField.getText());
		
		
		
		salvo = repositorioProgramadorJava.alterarProgramadorJava(programadorJavaAtual, programadorJavaNovo);
		if(salvo) {
			
			JOptionPane.showMessageDialog(null, programadorJavaNovo.getNome()+ " Foi Alterado!!!" );
				
				
		}else {
			JOptionPane.showMessageDialog(null, "#ERRO# Programador Java Não Alterado!!");
		}
			
	}

}
