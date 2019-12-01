  
package model;

public class Venda extends Impostos{
	private int id;
	private Produto produto;
	private Fornecedor fornecedor;
	
	public Venda() {
		
	}
	
	public Venda(double icms, double iss, double ipi) {
		super(icms, iss, ipi);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Venda [id=").append(id).append(", produto=").append(produto).append(", fornecedor=")
				.append(fornecedor).append(", getIcms()=").append(getIcms()).append(", getIss()=").append(getIss())
				.append(", getIpi()=").append(getIpi()).append("]");
		return builder.toString();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
}