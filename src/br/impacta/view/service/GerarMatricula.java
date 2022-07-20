package br.impacta.view.service;

import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.repository.RepositorioProgramadorPhp;


public class GerarMatricula {

	RepositorioProgramadorPhp repositorioProgramadorPhp = new RepositorioProgramadorPhp();
	RepositorioProgramadorJava repositorioProgramadorJava = new RepositorioProgramadorJava();
	
	
	public String gerarMatriculaProgramadorJava() {
		String matriculaGerada = null;
		int quantidadeProgramadoresJava = repositorioProgramadorJava.listarProgramadorJava().size();
		quantidadeProgramadoresJava++;
		
		matriculaGerada = ("IMPGE00" +quantidadeProgramadoresJava++);
		
		return matriculaGerada;
	}
	
	public String gerarMatriculaProgramadorPhp() {
		String matriculaGerada = null;
		int quantidadeProgramadoresPhp = repositorioProgramadorPhp.listarProgramadorPhp().size();
		quantidadeProgramadoresPhp++;
		
		matriculaGerada = ("IMPCO00" +quantidadeProgramadoresPhp++);
		
		return matriculaGerada;
	}
}

