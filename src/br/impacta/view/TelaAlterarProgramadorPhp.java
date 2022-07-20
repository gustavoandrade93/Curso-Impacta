package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorPhp;
import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.controller.TelaAlterarProgramadorPhpControle;


public class TelaAlterarProgramadorPhp {

	
	public void abrirTelaAlterarProgramadorPhp(ProgramadorPhp programadorPhpAtual, RepositorioProgramadorPhp repositorioProgramadorPhp,JFrame frameMenuInicialProgramadorPhp) {
		
		String matriculaTexto = "Digite a matricula do Programador PHP:";
		String nomeTexto = "Digite o Nome do Programador PHP:";
		String horasTrabalhadasTexto = "Digite a carga horária mensal do Programador PHP:";
		String certificacaoOracleTexto = "Digite a Certficação do Programador PHP:";
		
		
		JFrame frameTelaAlterarProgramadorPhp = new JFrame();
		frameTelaAlterarProgramadorPhp.setSize(200, 400);
		frameTelaAlterarProgramadorPhp.setTitle("Alterar de ProgramadorPhpes");
		frameTelaAlterarProgramadorPhp.setLocation(300,300);
		
		JPanel panelTelaAlterarProgramadorPhp = new JPanel();
		
		
		// opcao1
		JLabel matriculaTextoLabel = new JLabel(matriculaTexto);
		panelTelaAlterarProgramadorPhp.add(matriculaTextoLabel);
		
		JTextField matriculaTextField = new JTextField(10);
		panelTelaAlterarProgramadorPhp.add(matriculaTextField);
		
		//opcao2
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaAlterarProgramadorPhp.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		panelTelaAlterarProgramadorPhp.add(nomeTextField);
		
		//opcao3
		JLabel certificacaoOracleTextLabel = new JLabel(certificacaoOracleTexto);
		panelTelaAlterarProgramadorPhp.add(certificacaoOracleTextLabel);
		
		JTextField certificacaoOracleTextField = new JTextField(10);
		panelTelaAlterarProgramadorPhp.add(certificacaoOracleTextField);
		
		
		//opcao4
		JLabel horasTrabalhadasTextLabel = new JLabel(horasTrabalhadasTexto);
		panelTelaAlterarProgramadorPhp.add(horasTrabalhadasTextLabel);
		
		JTextField horasTrabalhadasTextField = new JTextField(10);
		panelTelaAlterarProgramadorPhp.add(horasTrabalhadasTextField);
		
		
		
		JButton buttonAlterarProgramadorPhp = new JButton("Alterar ProgramadorPhp");
		panelTelaAlterarProgramadorPhp.add(buttonAlterarProgramadorPhp);
		
		frameTelaAlterarProgramadorPhp.add(panelTelaAlterarProgramadorPhp);
		
		frameTelaAlterarProgramadorPhp.setVisible(true);
		
		
		TelaAlterarProgramadorPhpControle telaAlterarProgramadorPhpControle = new TelaAlterarProgramadorPhpControle(
				certificacaoOracleTextField, matriculaTextField, nomeTextField, horasTrabalhadasTextField, programadorPhpAtual, repositorioProgramadorPhp,
				frameMenuInicialProgramadorPhp, frameTelaAlterarProgramadorPhp);
		
		buttonAlterarProgramadorPhp.addActionListener(telaAlterarProgramadorPhpControle);
		
	
	}
	
	
}
