package model;

public class Compra {
	private Produto produto;
	private Cliente cliente;
	
	//Produto será instanciado na UI
	
	public Compra() {
		
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
