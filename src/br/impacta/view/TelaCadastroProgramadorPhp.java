package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.controller.TelaCadastroProgramadorPhpControle;

public class TelaCadastroProgramadorPhp {
	
public void abrirTelaCadastroProgramadorPhp(RepositorioProgramadorPhp repositorioProgramadorPhp,JFrame frameMenuInicialProgramadorPhp) {
		
		
		String nomeTexto = "Digite o Nome do Programador PHP:";
		String horasTrabalhadasTexto = "Digite a carga horária mensal do Programador PHP:";
		String certificacaoPhpTexto = "Digite a Certficação do Programador PHP:";
		
		JFrame frameTelaCadastroProgramadorPhp = new JFrame();
		frameTelaCadastroProgramadorPhp.setSize(400, 500);
		frameTelaCadastroProgramadorPhp.setTitle("Cadastro de Programadores PHP");
		frameTelaCadastroProgramadorPhp.setLocation(400,300);
		
		JPanel panelTelaCadastroProgramadorPhp = new JPanel();
		
		
		//opcao2
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaCadastroProgramadorPhp.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		panelTelaCadastroProgramadorPhp.add(nomeTextField);
		
		//opcao3
		JLabel certificacaoPhpTextLabel = new JLabel(certificacaoPhpTexto);
		panelTelaCadastroProgramadorPhp.add(certificacaoPhpTextLabel);
		
		JTextField certificacaoPhpTextField = new JTextField(10);
		panelTelaCadastroProgramadorPhp.add(certificacaoPhpTextField);
		
		
		//opcao4
		JLabel horasTrabalhadasTextLabel = new JLabel(horasTrabalhadasTexto);
		panelTelaCadastroProgramadorPhp.add(horasTrabalhadasTextLabel);
		
		JTextField horasTrabalhadasTextField = new JTextField(10);
		panelTelaCadastroProgramadorPhp.add(horasTrabalhadasTextField);
		
		
		JButton buttonCadastroProgramadorPhp = new JButton("Registrar");
		panelTelaCadastroProgramadorPhp.add(buttonCadastroProgramadorPhp);
		
		frameTelaCadastroProgramadorPhp.add(panelTelaCadastroProgramadorPhp);
		
		frameTelaCadastroProgramadorPhp.setVisible(true);
		
		TelaCadastroProgramadorPhpControle telaCadastroProgramadorPhpControle = new TelaCadastroProgramadorPhpControle(
			 nomeTextField, horasTrabalhadasTextField, certificacaoPhpTextField, repositorioProgramadorPhp,
				frameMenuInicialProgramadorPhp, frameTelaCadastroProgramadorPhp);
		
		buttonCadastroProgramadorPhp.addActionListener(telaCadastroProgramadorPhpControle);
		
		
		
		
	}

}