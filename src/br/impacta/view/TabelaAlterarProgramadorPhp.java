package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorPhp;
import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.controller.TabelaAlterarProgramadorPhpControle;


public class TabelaAlterarProgramadorPhp {

	public void apresentarAlterarProgramadorPhp(RepositorioProgramadorPhp repositorioProgramadorPhp, JFrame frameMenuInicialProgramadorPhp) {
		
		
		
		int quantidadeDeLinhas = repositorioProgramadorPhp.listarProgramadorPhp().size();
		
		String [][] tabelaString = new String[quantidadeDeLinhas][7];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(ProgramadorPhp programadorJava:repositorioProgramadorPhp.listarProgramadorPhp()) {
			
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorJava.getMatricula();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorJava.getNome();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = String.valueOf(programadorJava.getSalario());
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorJava.getCertificacaoPhp();
			posicaoColuna++;
			
			
			posicaoColuna = 0;
			posicaoLinha++;
		}
		
		String colunasTitulos[] = {"Matricula","Nome","Salario","Certificacao Oracle"}; 
		
		
		JFrame frameAlterarProgramadorPhp = new JFrame();
		frameAlterarProgramadorPhp.setSize(500,600);
		
		
		
		
		JTable tabelaProgramadorPhp = new JTable(tabelaString, colunasTitulos);
		tabelaProgramadorPhp.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneAlterarProgramadorPhp = new JScrollPane(tabelaProgramadorPhp);
		JPanel panelAlterarProgramadorPhp = new JPanel();
		
		JLabel matriculaLabel = new JLabel("Digite a Matricula para Alterar:");
		panelAlterarProgramadorPhp.add(matriculaLabel);
		
		JTextField matriculaField = new JTextField(10);
		panelAlterarProgramadorPhp.add(matriculaField);
		
		
		panelAlterarProgramadorPhp.add(scrollPaneAlterarProgramadorPhp);
		
		JButton buttonAlterarProgramadorPhp = new JButton("Buscar Programador Java");
		panelAlterarProgramadorPhp.add(buttonAlterarProgramadorPhp);
	
		frameAlterarProgramadorPhp.add(panelAlterarProgramadorPhp);
		frameAlterarProgramadorPhp.setVisible(true);
		
		TabelaAlterarProgramadorPhpControle telaAlterarProgramadorPhpControle = new TabelaAlterarProgramadorPhpControle(repositorioProgramadorPhp, frameMenuInicialProgramadorPhp, frameAlterarProgramadorPhp, matriculaField);
		buttonAlterarProgramadorPhp.addActionListener(telaAlterarProgramadorPhpControle);
	}
	
	
	
}
