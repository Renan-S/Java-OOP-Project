package model;

public class EmpTerceirizadas {
  private String nome;
	private String cnpj;
	private String servico;
	private Endereco endereco;
	
	public EmpTerceirizadas(String nome, String cnpj, String servico, Endereco endereco) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.servico = servico;
		this.endereco = endereco;
	}
	
	public EmpTerceirizadas() {
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
