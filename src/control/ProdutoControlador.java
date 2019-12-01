package control;

import exception.ProdutoExcecao;
import model.Produto;
import repository.IProdutoRepositorio;
import repository.ProdutoRepositorio;

public class ProdutoControlador implements IProdutoControlador {
	private static IProdutoRepositorio produtoRepositorio;
	private static ProdutoControlador instancia = new ProdutoControlador();
	
	protected static ProdutoControlador getInstancia() {
		return instancia;
	}
	
	private ProdutoControlador() {
		produtoRepositorio = ProdutoRepositorio.getInstancia();
	}
	
	@Override
	public void createProduto(Produto produto) throws ProdutoExcecao {
		if( produto == null) {
			throw new ProdutoExcecao("Produto invalido");
		}
		if(produtoRepositorio.errorProduto(produto.getIdProduto())) {
			throw new ProdutoExcecao("Produto ja existe");
		}
		produtoRepositorio.createProduto(produto);		
	}

	@Override
	public Produto searchProdutoPorId(int idproduto) throws ProdutoExcecao {
		if (idproduto <= 0) {
    		throw new ProdutoExcecao("Id inválido");
    	}
        return produtoRepositorio.searchProdutoPorId(idproduto);
    }

	@Override
	public void deleteProduto(int idproduto) throws ProdutoExcecao {
		if (idproduto <= 0) {
    		throw new ProdutoExcecao("Produto inválida");
    	}
    	
    	if (!produtoRepositorio.errorProduto(idproduto)) {
    		throw new ProdutoExcecao("Não existe nenhum produto com o código " + idproduto);
    	}
    	
    	produtoRepositorio.deleteProduto(idproduto);

    }

	@Override
	public void updateProduto(Produto produto) throws ProdutoExcecao {
		if (produto == null) {
    		throw new ProdutoExcecao("Produto inválido");
    	}

        if (!produtoRepositorio.errorProduto(produto.getIdProduto())){
            throw new ProdutoExcecao("Nenhum produto com o Id " + produto.getIdProduto());
        }
        
        produtoRepositorio.updateProduto(produto);
	}

}
