package model;

public abstract class Item {
private String validade;
private String fabricacao;

public Item() {
	
}

public Item(String validade, String fabricacao) {
	super();
	this.validade = validade;
	this.fabricacao = fabricacao;
}
public String getFabricacao() {
	return fabricacao;
}
public void setFabricacao(String fabricacao) {
	this.fabricacao = fabricacao;
}
public String getValidade() {
	return validade;
}
public void setValidade(String validade) {
	this.validade = validade;
}


}