package model;

public class Funcionario {
	
	private String nome;
	private String sexo;
	private String email;
	private String rg;
	private String clt;
	private String cnpj;
	private String funcao;
	private Endereco endereco;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [nome=").append(nome).append(", sexo=").append(sexo).append(", email=")
				.append(email).append(", rg=").append(rg).append(", clt=").append(clt).append(", cnpj=").append(cnpj)
				.append(", funcao=").append(funcao).append(", endereco=").append(endereco).append("]");
		return builder.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getClt() {
		return clt;
	}
	public void setClt(String clt) {
		this.clt = clt;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}
