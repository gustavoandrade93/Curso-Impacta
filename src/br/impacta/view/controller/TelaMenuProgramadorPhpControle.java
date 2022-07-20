package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.TabelaAlterarProgramadorPhp;
import br.impacta.view.TelaCadastroProgramadorPhp;
import br.impacta.view.TelaDeletarProgramadorPhp;
import br.impacta.view.TelaListarProgramadorPhp;
import br.impacta.view.service.GerarPDF;

public class TelaMenuProgramadorPhpControle implements ActionListener {
	//recebe do construtor
	JFrame frameMenuInicial;
	JFrame frameMenuInicialProgramadorPhp;
	JTextField opcaoMenuProgramadorPhpJTextField;
	TelaCadastroProgramadorPhp telaCadastroProgramadorPhp = new TelaCadastroProgramadorPhp();
	RepositorioProgramadorPhp repositorioProgramadorPhp;
	TelaListarProgramadorPhp telaListarProgramadorPhp = new TelaListarProgramadorPhp();
	TelaDeletarProgramadorPhp telaDeletarProgramadorPhp = new TelaDeletarProgramadorPhp();
	TabelaAlterarProgramadorPhp tabelaAlterarProgramadorPhp = new TabelaAlterarProgramadorPhp();  
	
	GerarPDF gerarPdf = new GerarPDF();
	
	public TelaMenuProgramadorPhpControle(JFrame frameMenuInicial, JFrame frameMenuInicialProgramadorPhp, JTextField opcaoMenuProgramadorPhpJTextField,RepositorioProgramadorPhp repositorioProgramadorPhp) {
		super();
		this.frameMenuInicial = frameMenuInicial;
		this.frameMenuInicialProgramadorPhp = frameMenuInicialProgramadorPhp;
		this.opcaoMenuProgramadorPhpJTextField = opcaoMenuProgramadorPhpJTextField;
		this.repositorioProgramadorPhp = repositorioProgramadorPhp;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(opcaoMenuProgramadorPhpJTextField.getText().equals("1") || opcaoMenuProgramadorPhpJTextField.getText().equals("2") || opcaoMenuProgramadorPhpJTextField.getText().equals("3")
				|| opcaoMenuProgramadorPhpJTextField.getText().equals("4")||opcaoMenuProgramadorPhpJTextField.getText().equals("5")||opcaoMenuProgramadorPhpJTextField.getText().equals("6")||opcaoMenuProgramadorPhpJTextField.getText().equals("7")){
			
			frameMenuInicialProgramadorPhp.setVisible(false);
			
			switch (opcaoMenuProgramadorPhpJTextField.getText()) {
				case "1":
					telaCadastroProgramadorPhp.abrirTelaCadastroProgramadorPhp(repositorioProgramadorPhp,frameMenuInicialProgramadorPhp);
				break;
					
				case "2":
					telaListarProgramadorPhp.apresentarListaProgramadorPhp(repositorioProgramadorPhp.listarProgramadorPhp(), frameMenuInicialProgramadorPhp);
				break;
				
				case "3":
					telaDeletarProgramadorPhp.apresentarDeletarProgramadorPhp(repositorioProgramadorPhp, frameMenuInicialProgramadorPhp);
					
				break;
				
				case "4":
					tabelaAlterarProgramadorPhp.apresentarAlterarProgramadorPhp(repositorioProgramadorPhp, frameMenuInicialProgramadorPhp);
				break;
				
				case "5":
					frameMenuInicial.setVisible(true);
				break;
				
				case "6":
					frameMenuInicial.setVisible(true);
					GerarPDF.gerarPdfProgramadorPhp();
				break;
				
				case "7":
					System.exit(0);
				break;
				
			}
				
		}else {
			
			JOptionPane.showMessageDialog(null, "Digite uma Opcão Valida!!!");
		}
		
	}

}
