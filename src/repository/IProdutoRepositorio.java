package repository;

import exception.ProdutoExcecao;
import model.Produto;

public interface IProdutoRepositorio {
	public void createProduto(Produto produto) throws ProdutoExcecao;
	public Produto searchProdutoPorId (int idproduto) throws ProdutoExcecao;
	public void deleteProduto (int idproduto) throws ProdutoExcecao;
	public void updateProduto (Produto produto) throws ProdutoExcecao;
	public boolean errorProduto(int idproduto) throws ProdutoExcecao;
}