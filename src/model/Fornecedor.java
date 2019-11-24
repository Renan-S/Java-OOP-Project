package model;

public class Fornecedor extends Pessoa {
	//private String nome;
	private String responsavel; 
	private String cnpj;
	//private Endereco endereco;
	private Produto produto;
	//private String email;
	
	//(Cadastrará produto) - Atributos comentados estão sendo herdados
	
	
	public Fornecedor(String rua, String cep, String bairro, String cidade, int numero, String complemento, String nome,
			String sexo, String email, String cpf) {
		super(rua, cep, bairro, cidade, numero, complemento, nome, sexo, email, cpf);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fornecedor [responsavel=").append(responsavel).append(", cnpj=").append(cnpj)
				.append(", produto=").append(produto).append("]");
		return builder.toString();
	}
	
	public Fornecedor() {
		
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
