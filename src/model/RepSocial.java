package model;

public class RepSocial extends Fornecedor{
	private double impostos;
	private double valorinvestido;
	
	public RepSocial() {
		super();
	}
	
	public double getImpostos() {
		return impostos;
	}
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	
	public double getValorinvestido() {
		return valorinvestido;
	}
	public void setValorinvestido(double valorinvestido) {
		this.valorinvestido = valorinvestido;
	}
}