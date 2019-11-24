package model;

public class Cliente extends Pessoa {
	
	private String formapagamento;
	private int desconto;
	
	//Herdando tudo de Pessoa; que tinha herdado de Endereco.
	public Cliente(String rua, String cep, String bairro, String cidade, int numero, String complemento, String nome,
			String sexo, String email, String cpf) {
		super(rua, cep, bairro, cidade, numero, complemento, nome, sexo, email, cpf);
	}
	
	public Cliente (){
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [formapagamento=").append(formapagamento).append(", desconto=").append(desconto)
				.append("]");
		return builder.toString();
	}

	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	public String getFormapagamento() {
		return formapagamento;
	}
	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}
}
