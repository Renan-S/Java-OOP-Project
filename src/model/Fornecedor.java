package model;

public class Fornecedor extends Pessoa {
	//private String nome;
	private String responsavel; 
	private String cnpj;
	//private Endereco endereco;
	private Produto produto;
	//private String email;
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(String nome, String sexo, String email, String cpf, Endereco endereco) {
		super(nome, sexo, email, cpf, endereco);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fornecedor [responsavel=").append(responsavel).append(", cnpj=").append(cnpj)
				.append(", produto=").append(produto).append(", getNome()=").append(getNome()).append(", getSexo()=")
				.append(getSexo()).append(", getEmail()=").append(getEmail()).append(", getCpf()=").append(getCpf())
				.append(", getEndereco()=").append(getEndereco()).append("]");
		return builder.toString();
	}

	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
