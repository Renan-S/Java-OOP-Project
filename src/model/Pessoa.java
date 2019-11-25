package model;

public abstract class Pessoa extends Endereco{
	
	private String nome;
	private String sexo;
	private String email;
	private String cpf;
	
	//Construtor de acesso para as classes filhas
	public Pessoa(String rua, String cep, String bairro, String cidade, int numero, String complemento, String nome,
			String sexo, String email, String cpf) {
		super(rua, cep, bairro, cidade, numero, complemento);
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.cpf = cpf;
	}
	
	//Segundo contrutor somente para filtrar atributos desnecessários à Fornecedor
	public Pessoa(String rua, String cep, String bairro, String cidade, int numero, String complemento, String nome,
			String email) {
		super(rua, cep, bairro, cidade, numero, complemento);
		this.nome = nome;
		this.email = email;
	}

	public Pessoa() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=").append(nome).append(", sexo=").append(sexo).append(", email=").append(email)
				.append(", cpf=").append(cpf).append("]");
		return builder.toString();
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
}
