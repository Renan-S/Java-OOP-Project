package model;

public class Cliente {
	
	private String nome;
	private String sexo;
	private String cpf;
	private String email;
	private Endereco endereco;
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf + ", email=" + email + ", endereco="
				+ endereco + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
