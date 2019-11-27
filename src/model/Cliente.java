package model;

public class Cliente extends Pessoa {
	
	private String formapagamento;
	private int desconto;
	
	public Cliente(String nome, String sexo, String email, String cpf, Endereco endereco) {
		super(nome, sexo, email, cpf, endereco);
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
