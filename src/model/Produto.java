package model;

public class Produto extends Item {
	private int id; //identificador único;
	private String nomeproduto;
	private String tipo;
	private double valor;
	private int quantidade;

	public Produto() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [codigo=").append(id).append(", nomeproduto=").append(nomeproduto).append(", tipo=").append(tipo)
				.append(", fabricacao=").append(this.getFabricacao()).append(", validade=").append(this.getValidade()).append(", valor=")
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
