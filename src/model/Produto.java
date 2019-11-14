package model;

public class Produto {
  private int id;
	private String tipo;
	private String nome;
	private double valor;
	private int quant;
	
	public Produto(String tipo, String nome, double valor, int quant) {
		this.tipo = tipo;
		this.nome = nome;
		this.valor = valor;
		this.quant = quant;
	}
	
	public Produto() {
		super();
	}

	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}

}
