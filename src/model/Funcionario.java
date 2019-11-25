package model;

public class Funcionario extends Pessoa{
	
	private String rg;
	private String clt;
	private String funcao;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String sexo, String email, String cpf, Endereco endereco) {
		super(nome, sexo, email, cpf, endereco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [rg=").append(rg).append(", clt=").append(clt).append(", funcao=").append(funcao)
				.append("]");
		return builder.toString();
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
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}
