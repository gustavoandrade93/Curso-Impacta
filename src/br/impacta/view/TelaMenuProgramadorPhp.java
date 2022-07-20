package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.controller.TelaMenuProgramadorPhpControle;

public class TelaMenuProgramadorPhp {

public void apresentarMenuProgramadorPhp(JFrame frameMenuInicial, RepositorioProgramadorPhp repositorioProgramadorPhp) {
		
	String menuInicialTexto = "##Menu Inicial Programador Php##";
	String opcaoUmMenuTexto = "[1] Cadastrar Programador Php";
	String opcaoDoisMenuTexto = "[2] Listar Programador Php";
	String opcaoTresMenuTexto = "[3] Deletar";
	String opcaoQuatroMenuTexto = "[4] Alterar Programador Php ";
	String opcaoCincoMenuTexto = "[5] Voltar Menu Inicial ";
	String opcaoSeisMenuTexto = "[6] Gerar PDF";
	String opcaoSeteMenuTexto = "[7] Encerrar";
	
	JFrame frameMenuInicialProgramadorPhp = new JFrame();
	frameMenuInicialProgramadorPhp.setSize(200, 350);
	frameMenuInicialProgramadorPhp.setTitle("Cadastro de Programadores Php");
	frameMenuInicialProgramadorPhp.setLocation(300,300);
	
	JPanel panelMenuInicial = new JPanel();
	
	JLabel menuInicialLabel = new JLabel(menuInicialTexto);
	panelMenuInicial.add(menuInicialLabel);
	
	JLabel opcaoUmMenuLabel = new JLabel(opcaoUmMenuTexto);
	panelMenuInicial.add(opcaoUmMenuLabel);
	
	JLabel opcaoDoisMenuLabel = new JLabel(opcaoDoisMenuTexto);
	panelMenuInicial.add(opcaoDoisMenuLabel);
	
	JLabel opcaoTresMenuLabel = new JLabel(opcaoTresMenuTexto);
	panelMenuInicial.add(opcaoTresMenuLabel);
	
	JLabel opcaoQuatroMenuLabel = new JLabel(opcaoQuatroMenuTexto);
	panelMenuInicial.add(opcaoQuatroMenuLabel);
	
	JLabel opcaoCincoMenuLabel = new JLabel(opcaoCincoMenuTexto);
	panelMenuInicial.add(opcaoCincoMenuLabel);
	
	JLabel opcaoSeisMenuLabel = new JLabel(opcaoSeisMenuTexto);
	panelMenuInicial.add(opcaoSeisMenuLabel);
	
	JLabel opcaoSeteMenuLabel = new JLabel(opcaoSeteMenuTexto);
	panelMenuInicial.add(opcaoSeteMenuLabel);
		
		JTextField opcaoMenuProgramadorPhpJTextField  = new JTextField(10);
		
		panelMenuInicial.add(opcaoMenuProgramadorPhpJTextField);
		
		JButton buttonMenu = new JButton("Enviar");
		
		panelMenuInicial.add(buttonMenu);
		
		frameMenuInicialProgramadorPhp.add(panelMenuInicial);
		
		frameMenuInicialProgramadorPhp.setVisible(true);

		TelaMenuProgramadorPhpControle telaMenuProgramadorPhpControle = new TelaMenuProgramadorPhpControle(frameMenuInicial,frameMenuInicialProgramadorPhp,opcaoMenuProgramadorPhpJTextField, repositorioProgramadorPhp);
		buttonMenu.addActionListener(telaMenuProgramadorPhpControle);
		
		
		
	
	}
	
}
