package model;

public class Fornecedor {
	private String nome;
	private String responsavel; 
	private String cnpj;
	private Endereco endereco;
	private Produto produto;
	private String email;
	
	//(Cadastrará produto)
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fornecedor [nome=").append(nome).append(", responsavel=").append(responsavel).append(", cnpj=")
				.append(cnpj).append(", endereco=").append(endereco).append(", produto=").append(produto)
				.append(", email=").append(email).append("]");
		return builder.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
