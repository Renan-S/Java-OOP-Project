package model;

public abstract class Pessoa{
	
	private String nome;
	private String sexo;
	private String email;
	private String cpf;
	private Endereco endereco;
	
	public Pessoa(String nome, String sexo, String email, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Pessoa() {
		
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
