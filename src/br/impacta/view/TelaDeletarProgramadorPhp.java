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
import br.impacta.view.controller.TelaDeletarProgramadorPhpControle;


public class TelaDeletarProgramadorPhp {
	
	
public void apresentarDeletarProgramadorPhp(RepositorioProgramadorPhp repositorioProgramadorPhp, JFrame frameMenuInicialProgramadorPhp) {
		
		
		
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
		
		String colunasTitulos[] = {"Matricula","Nome","Salario", "Certificacao PHP"}; 
		
		
		JFrame frameDeletarProgramadorPhp = new JFrame();
		frameDeletarProgramadorPhp.setSize(500,600);
		
		
		
		
		JTable tabelaProgramadorPhp = new JTable(tabelaString, colunasTitulos);
		tabelaProgramadorPhp.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneDeletarrProgramadorPhp = new JScrollPane(tabelaProgramadorPhp);
		JPanel panelDeletarProgramadorPhp = new JPanel();
		
		JLabel matriculaLabel = new JLabel("Digite a Matricula para deletar:");
		panelDeletarProgramadorPhp.add(matriculaLabel);
		
		JTextField matriculaField = new JTextField(10);
		panelDeletarProgramadorPhp.add(matriculaField);
		
		
		panelDeletarProgramadorPhp.add(scrollPaneDeletarrProgramadorPhp);
		
		JButton buttonDeletarProgramadorPhp = new JButton("Deletar Programador PHP");
		panelDeletarProgramadorPhp.add(buttonDeletarProgramadorPhp);
	
		frameDeletarProgramadorPhp.add(panelDeletarProgramadorPhp);
		frameDeletarProgramadorPhp.setVisible(true);
		
		TelaDeletarProgramadorPhpControle telaDeletarProgramadorPhpControle = new TelaDeletarProgramadorPhpControle(repositorioProgramadorPhp, frameMenuInicialProgramadorPhp, frameDeletarProgramadorPhp, matriculaField);
		buttonDeletarProgramadorPhp.addActionListener(telaDeletarProgramadorPhpControle);
	}
}
