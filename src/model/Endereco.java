package model;

public class Endereco {
	private String rua;
	private String cep;
	private String bairro;
	private String cidade;
	private int numero;
	private String complemento;
	
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cep=" + cep + ", bairro=" + 
	bairro + ", cidade=" + cidade + ", numero="+ numero + "]";
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
