package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.view.controller.TelaCadastroProgramadorJavaControle;

public class TelaCadastroProgramadorJava {
	
public void abrirTelaCadastroProgramadorJava(RepositorioProgramadorJava repositorioProgramadorJava,JFrame frameMenuInicialProgramadorJava) {
		
		
		String nomeTexto = "Digite o Nome do Programador Java:";
		String horasTrabalhadasTexto = "Digite a carga horária mensal do Programador Java:";
		String certificacaoOracleTexto = "Digite a Certficação do Programador Java:";
		
		JFrame frameTelaCadastroProgramadorJava = new JFrame();
		frameTelaCadastroProgramadorJava.setSize(400, 500);
		frameTelaCadastroProgramadorJava.setTitle("Cadastro de Programadores Java");
		frameTelaCadastroProgramadorJava.setLocation(400,300);
		
		JPanel panelTelaCadastroProgramadorJava = new JPanel();
		
		
		//opcao2
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaCadastroProgramadorJava.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		panelTelaCadastroProgramadorJava.add(nomeTextField);
		
		//opcao3
		JLabel certificacaoOracleTextLabel = new JLabel(certificacaoOracleTexto);
		panelTelaCadastroProgramadorJava.add(certificacaoOracleTextLabel);
		
		JTextField certificacaoOracleTextField = new JTextField(10);
		panelTelaCadastroProgramadorJava.add(certificacaoOracleTextField);
		
		
		//opcao4
		JLabel horasTrabalhadasTextLabel = new JLabel(horasTrabalhadasTexto);
		panelTelaCadastroProgramadorJava.add(horasTrabalhadasTextLabel);
		
		JTextField horasTrabalhadasTextField = new JTextField(10);
		panelTelaCadastroProgramadorJava.add(horasTrabalhadasTextField);
		
		
		JButton buttonCadastroProgramadorJava = new JButton("Registrar");
		panelTelaCadastroProgramadorJava.add(buttonCadastroProgramadorJava);
		
		frameTelaCadastroProgramadorJava.add(panelTelaCadastroProgramadorJava);
		
		frameTelaCadastroProgramadorJava.setVisible(true);
		
		TelaCadastroProgramadorJavaControle telaCadastroProgramadorJavaControle = new TelaCadastroProgramadorJavaControle(
			 nomeTextField, horasTrabalhadasTextField, certificacaoOracleTextField, repositorioProgramadorJava,
				frameMenuInicialProgramadorJava, frameTelaCadastroProgramadorJava);
		
		buttonCadastroProgramadorJava.addActionListener(telaCadastroProgramadorJavaControle);
		
		
		
		
	}

}