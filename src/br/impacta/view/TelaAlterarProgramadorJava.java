package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorJava;
import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.view.controller.TelaAlterarProgramadorJavaControle;


public class TelaAlterarProgramadorJava {

	
	public void abrirTelaAlterarProgramadorJava(ProgramadorJava programadorJavaAtual, RepositorioProgramadorJava repositorioProgramadorJava,JFrame frameMenuInicialProgramadorJava) {
		
		String matriculaTexto = "Digite a matricula do Programador Java:";
		String nomeTexto = "Digite o Nome do Programador Java:";
		String horasTrabalhadasTexto = "Digite a carga horária mensal do Programador Java:";
		String certificacaoOracleTexto = "Digite a Certficação do Programador Java:";
		
		
		JFrame frameTelaAlterarProgramadorJava = new JFrame();
		frameTelaAlterarProgramadorJava.setSize(200, 400);
		frameTelaAlterarProgramadorJava.setTitle("Alterar de ProgramadorJavaes");
		frameTelaAlterarProgramadorJava.setLocation(300,300);
		
		JPanel panelTelaAlterarProgramadorJava = new JPanel();
		
		
		// opcao1
		JLabel matriculaTextoLabel = new JLabel(matriculaTexto);
		panelTelaAlterarProgramadorJava.add(matriculaTextoLabel);
		
		JTextField matriculaTextField = new JTextField(10);
		panelTelaAlterarProgramadorJava.add(matriculaTextField);
		
		//opcao2
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaAlterarProgramadorJava.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		panelTelaAlterarProgramadorJava.add(nomeTextField);
		
		//opcao3
		JLabel certificacaoOracleTextLabel = new JLabel(certificacaoOracleTexto);
		panelTelaAlterarProgramadorJava.add(certificacaoOracleTextLabel);
		
		JTextField certificacaoOracleTextField = new JTextField(10);
		panelTelaAlterarProgramadorJava.add(certificacaoOracleTextField);
		
		
		//opcao4
		JLabel horasTrabalhadasTextLabel = new JLabel(horasTrabalhadasTexto);
		panelTelaAlterarProgramadorJava.add(horasTrabalhadasTextLabel);
		
		JTextField horasTrabalhadasTextField = new JTextField(10);
		panelTelaAlterarProgramadorJava.add(horasTrabalhadasTextField);
		
		
		
		JButton buttonAlterarProgramadorJava = new JButton("Alterar ProgramadorJava");
		panelTelaAlterarProgramadorJava.add(buttonAlterarProgramadorJava);
		
		frameTelaAlterarProgramadorJava.add(panelTelaAlterarProgramadorJava);
		
		frameTelaAlterarProgramadorJava.setVisible(true);
		
		
		TelaAlterarProgramadorJavaControle telaAlterarProgramadorJavaControle = new TelaAlterarProgramadorJavaControle(
				certificacaoOracleTextField, matriculaTextField, nomeTextField, horasTrabalhadasTextField, programadorJavaAtual, repositorioProgramadorJava,
				frameMenuInicialProgramadorJava, frameTelaAlterarProgramadorJava);
		
		buttonAlterarProgramadorJava.addActionListener(telaAlterarProgramadorJavaControle);
		
	
	}
	
	
}
