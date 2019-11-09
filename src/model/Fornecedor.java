package model;

public class Fornecedor {
	
	private String cnpj;
	private int id;
	private String nome;
	private String produto;
	private String email;

	public Fornecedor(String cnpj, String nome, String produto, String email) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.produto = produto;
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
