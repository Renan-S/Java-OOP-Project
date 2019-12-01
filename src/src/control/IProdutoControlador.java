package control;

import exception.ProdutoExcecao;
import model.Produto;

public interface IProdutoControlador {
	public void createProduto(Produto produto) throws ProdutoExcecao;
	public Produto searchProdutoPorId (int id) throws ProdutoExcecao;
	public void deleteProduto (int id) throws ProdutoExcecao;
	public void updateProduto (Produto produto) throws ProdutoExcecao;
}