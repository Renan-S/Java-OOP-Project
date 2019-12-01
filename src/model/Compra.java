  
package model;

public class Compra {
	private int id;
	private Produto produto;
	private Cliente cliente;
	
	public Compra() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compra [id=").append(id).append(", produto=").append(produto).append(", cliente=")
				.append(cliente).append("]");
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
