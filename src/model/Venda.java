package model;

public class Venda extends Fornecedor {
	private Produto produto;
	private Fornecedor fornecedor;
	
	public Venda(String rua, String cep, String bairro, String cidade, int numero, String complemento, String nome,
			String sexo, String email, String cpf, int id, String nomeproduto, String tipo, String fabricacao,
			String validade, double valor, int quantidade, String responsavel, String cnpj, Produto produto) {
		super(rua, cep, bairro, cidade, numero, complemento, nome, sexo, email, cpf, id, nomeproduto, tipo, fabricacao,
				validade, valor, quantidade, responsavel, cnpj, produto);
	}
	
	public Venda() {
		
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
