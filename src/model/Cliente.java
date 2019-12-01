package model;

public class Cliente extends Pessoa {
	
	private String formapagamento;
	private double desconto;
	
	public Cliente(String nome, String sexo, String email, String cpf, Endereco endereco) {
		super(nome, sexo, email, cpf, endereco);
	}

	public Cliente (){
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cliente nome=").append(getNome()).append(", sexo=").append(getSexo()).append(", email=").append(getEmail()).append(", cpf=").append(getCpf()).append(", endere�o=").append(getEndereco()).append("Cliente [formapagamento=").append(formapagamento).append(", desconto=").append(desconto)
		.append("]");
		
		return builder.toString();
	}

	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double d) {
		this.desconto = d;
	}
	public String getFormapagamento() {
		return formapagamento;
	}
	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}
	
}
