package model;

public class Produto extends Pessoa {
	private int id; //identificador único;
	private String nomeproduto;
	private String tipo;
	private String fabricacao;
	private String validade;
	private double valor;
	private int quantidade;
	
	public Produto(String rua, String cep, String bairro, String cidade, int numero, String complemento, String nome,
			String sexo, String email, String cpf, int id, String nomeproduto, String tipo, String fabricacao,
			String validade, double valor, int quantidade) {
		super(rua, cep, bairro, cidade, numero, complemento, nome, sexo, email, cpf);
		this.id = id;
		this.nomeproduto = nomeproduto;
		this.tipo = tipo;
		this.fabricacao = fabricacao;
		this.validade = validade;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Produto() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [codigo=").append(id).append(", nomeproduto=").append(nomeproduto).append(", tipo=").append(tipo)
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
	public String getNomeproduto() {
		return nomeproduto;
	}
	public void setNomeProduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
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
