package model;

public class Produto {
	private String nome;
	private String tipo;
	private String fabricacao;
	private String validade;
	private double valor;
	private int quantidade;
	
	public Produto(String nome, String tipo, String fabricacao, double valor, int quantidade, String validade) {
		this.nome = nome;
		this.tipo = tipo;
		this.fabricacao = fabricacao;
		this.valor = valor;
		this.quantidade = quantidade;
		this.validade = validade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [nome=").append(nome).append(", tipo=").append(tipo).append(", fabricacao=")
				.append(fabricacao).append(", valor=").append(valor).append(", quantidade=").append(quantidade)
				.append(", validade=").append(validade).append("]");
		return builder.toString();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(String fabricacao) {
		this.fabricacao = fabricacao;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
