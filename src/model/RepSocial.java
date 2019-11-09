package model;

public class RepSocial {
	private String nome;
	private String servico;
	private double impostos;
	private String publicoalvo;
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public double getImpostos() {
		return impostos;
	}
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	public String getPublicoalvo() {
		return publicoalvo;
	}
	public void setPublicoalvo(String publicoalvo) {
		this.publicoalvo = publicoalvo;
	}
	public double getValorinvestido() {
		return valorinvestido;
	}
	public void setValorinvestido(double valorinvestido) {
		this.valorinvestido = valorinvestido;
	}
	private double valorinvestido;
}