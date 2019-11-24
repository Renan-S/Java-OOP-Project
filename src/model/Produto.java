package model;

public class Produto {
	private int id; //identificador único;
	private String nome;
	private String tipo;
	private String fabricacao;
	private String validade;
	private double valor;
	private int quantidade;
	
	/*public Produto(int id, String nome, String tipo, String fabricacao, double valor, int quantidade, String validade) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.fabricacao = fabricacao;
		this.valor = valor;
		this.quantidade = quantidade;
		this.validade = validade;
	} */
	
	public Produto () {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [codigo=").append(id).append(", nome=").append(nome).append(", tipo=").append(tipo)
				.append(", fabricacao=").append(fabricacao).append(", validade=").append(validade).append(", valor=")
				.append(valor).append(", quantidade=").append(quantidade).append("]");
		return builder.toString();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
