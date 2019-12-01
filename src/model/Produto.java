package model;

public class Produto extends Item {
	private int idproduto; //identificador único;
	private String nomeproduto;
	private String tipo;
	private double valor;
	private int quantidade;

	public Produto() {
		
	}
	
	public Produto(String validade, String fabricacao) {
		super(validade, fabricacao);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [idproduto=").append(idproduto).append(", nomeproduto=").append(nomeproduto)
				.append(", tipo=").append(tipo).append(", valor=").append(valor).append(", quantidade=")
				.append(quantidade).append(", getFabricacao()=").append(getFabricacao()).append(", getValidade()=")
				.append(getValidade()).append("]");
		return builder.toString();
	}

	public int getIdProduto() {
		return idproduto;
	}

	public void setIdProduto(int idproduto) {
		this.idproduto = idproduto;
	}
	public String getNomeproduto() {
		return nomeproduto;
	}
	public void setNomeProduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
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
