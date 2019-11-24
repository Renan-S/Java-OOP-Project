package model;

public class Funcionario extends Pessoa{
	
	//Atributos comentados estão sendo herdados
	
	//private String nome;
	//private String sexo;
	//private String email;
	private String rg;
	private String clt;
	//private String cpf;
	private String funcao;
	//private Endereco endereco;
	
	
	public Funcionario(String rua, String cep, String bairro, String cidade, int numero, String complemento,
			String nome, String sexo, String email, String cpf) {
		super(rua, cep, bairro, cidade, numero, complemento, nome, sexo, email, cpf);
	}
	
	public Funcionario() {
		
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
