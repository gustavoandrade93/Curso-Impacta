package br.impacta.model;

public class ProgramadorPhp extends Programador{
	
	private String certificacaoPhp;


	public String getCertificacaoPhp() {
		return certificacaoPhp;
	}

	public void setCertificacaoPhp(String certificacaoPhp) {
		this.certificacaoPhp = certificacaoPhp;
	}
	
	@Override
	public double calcularSalario(int horasTrabalhadas) {
		
		return super.calcularSalario(horasTrabalhadas * 80);
	}
	
	

}
