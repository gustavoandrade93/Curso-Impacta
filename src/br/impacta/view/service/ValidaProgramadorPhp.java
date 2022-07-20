package br.impacta.view.service;



import javax.swing.JTextField;

import br.impacta.model.ProgramadorPhp;
import br.impacta.repository.RepositorioProgramadorPhp;




public class ValidaProgramadorPhp {
	
	public String validarProgramadorPhp(ProgramadorPhp programadorPhp, RepositorioProgramadorPhp repositorio,JTextField horaTrabalhadaTextField) {
		String mensagemErro = null;
		
		//Matricula
		if((repositorio.buscarProgramadorPhp(programadorPhp.getMatricula()) != null)){
			mensagemErro = "Matricula de Programador Php Repetida";
			return mensagemErro;
		}
		
		//Nome
		if(!verificaAlfabeto(programadorPhp.getNome())) {
			mensagemErro = "Nome Invalido - Verifique o Alfabeto!!";
			return mensagemErro;
		}
		
		
		if(programadorPhp.getNome().length() > 20){
			mensagemErro = "Maximo de 20 caracteres para o nome do Programador Php!";
			return mensagemErro;
	
		}
		
		// Certificação Oracle
		if(!verificaAlfabeto(programadorPhp.getCertificacaoPhp())) {
			mensagemErro = "Certificação Invalida - Verifique o Alfabeto!!";
			return mensagemErro;
		}
		if(programadorPhp.getCertificacaoPhp().length() > 30){
			mensagemErro = "Maximo de 15 caracteres para a Certificação do Programador Php!";
			return mensagemErro;
		}

		if(!validaInteiro(horaTrabalhadaTextField.getText())) {
			mensagemErro = "A hora trabalhada deve ser um Inteiro!!";
			return mensagemErro;
			
		}

		
		return mensagemErro;
		
	}
	
	
	public boolean validaInteiro(String stringInt) {
	
		 int quantidadeDecimal = 10;
		 
		 if(stringInt.isEmpty()) {
			return false;
		 }
		
		 int i;
		 int quantidadeDeCaracteres = stringInt.length();
		 
		 for(i = 0; i < quantidadeDeCaracteres; i++){
			 if(i == 0 && stringInt.charAt(i) == '-' ) {
				 return false;
			 }
			 
			 if(((Character.digit(stringInt.charAt(i), quantidadeDecimal)) < 0)) {
				 return false;
			 }
			
			 
		 }
		
		return true;
		
	}
	
	public boolean verificaAlfabeto(String stringAlfabeto) {
		boolean alfabeto = false;
		
		int i;
		int quantidadeDeCaracteres = stringAlfabeto.length();
		
		for(i = 0; i < quantidadeDeCaracteres; i++) {
			
			if(Character.isAlphabetic(stringAlfabeto.charAt(i))) {
				alfabeto = true;
			}else {
				alfabeto = false;
			}
			
			
		}
		
		
		return alfabeto;
	}
	
	
}
