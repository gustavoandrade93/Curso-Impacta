package br.impacta.repository;

import java.util.List;

import br.impacta.model.ProgramadorJava;


public interface InterfaceProgramadorJava {

	//metodos obrigatorios
	public boolean salvarProgramadorJava(ProgramadorJava programadorJava);
	public List<ProgramadorJava> listarProgramadorJava();
	public boolean deletarProgramadorJava(String matricula);
	public ProgramadorJava buscarProgramadorJava(String matricula);
	public boolean alterarProgramadorJava(ProgramadorJava ProgramadorJavaNovo, ProgramadorJava ProgramadorJavaAtual);
	
	
}
