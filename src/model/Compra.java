package model;

public class Compra extends Cliente {
	private Produto produto;
	private Cliente cliente;
	
	//Produto será instanciado na UI
	
	public Compra(String rua, String cep, String bairro, String cidade, int numero, String complemento, String nome,
			String sexo, String email, String cpf) {
		super(rua, cep, bairro, cidade, numero, complemento, nome, sexo, email, cpf);
	}
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
