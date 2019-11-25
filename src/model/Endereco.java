package model;

public abstract class Endereco {
	private String rua;
	private String cep;
	private String bairro;
	private String cidade;
	private int numero;
	private String complemento;
	
	public Endereco(String rua, String cep, String bairro, String cidade, int numero, String complemento) {
		this.rua = rua;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.numero = numero;
		this.complemento = complemento;
	}

	public Endereco() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [rua=").append(rua).append(", cep=").append(cep).append(", bairro=").append(bairro)
				.append(", cidade=").append(cidade).append(", numero=").append(numero).append(", complemento=")
				.append(complemento).append("]");
		return builder.toString();
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
