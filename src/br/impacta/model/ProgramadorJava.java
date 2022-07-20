package br.impacta.model;

public class ProgramadorJava extends Programador {
	private String certificacaoOracle;

	
	public String getCertificacaoOracle() {
		return certificacaoOracle;
	}


	public void setCertificacaoOracle(String certificacaoOracle) {
		this.certificacaoOracle = certificacaoOracle;
	}



	@Override
	public double calcularSalario(int horasTrabalhadas) {
		
		return super.calcularSalario(horasTrabalhadas * 120);
	}
	
}
