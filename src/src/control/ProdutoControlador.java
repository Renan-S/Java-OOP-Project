package control;

import exception.ProdutoExcecao;
import model.Produto;
import repository.IProdutoRepositorio;
import repository.ProdutoRepositorio;

public class ProdutoControlador implements IProdutoControlador {
	private IProdutoRepositorio produtoRepositorio = ProdutoRepositorio.getInstancia();
	private static ProdutoControlador instancia = new ProdutoControlador();
	
	protected static ProdutoControlador getInstancia() {
		return instancia;
	}
	
	private ProdutoControlador() {
		
	}
	
	@Override
	public void createProduto(Produto produto) throws ProdutoExcecao {
		if( produto == null) {
			throw new ProdutoExcecao("Produto invalido");
		}
		if(produtoRepositorio.errorProduto(produto.getId())) {
			throw new ProdutoExcecao("Produto ja existe");
		}
		produtoRepositorio.createProduto(produto);		
	}

	@Override
	public Produto searchProdutoPorId(int id) throws ProdutoExcecao {
		if (id <= 0) {
    		throw new ProdutoExcecao("Id inv�lido");
    	}
        return produtoRepositorio.searchProdutoPorId(id);
    }

	@Override
	public void deleteProduto(int id) throws ProdutoExcecao {
		if (id <= 0) {
    		throw new ProdutoExcecao("Produto inv�lida");
    	}
    	
    	if (!produtoRepositorio.errorProduto(id)) {
    		throw new ProdutoExcecao("N�o existe nenhum produto com o c�digo " + id);
    	}
    	
    	produtoRepositorio.deleteProduto(id);

    }

	@Override
	public void updateProduto(Produto produto) throws ProdutoExcecao {
		if (produto == null) {
    		throw new ProdutoExcecao("Produto inv�lido");
    	}

        if (!produtoRepositorio.errorProduto(produto.getId())){
            throw new ProdutoExcecao("Nenhum produto com o Id " + produto.getId());
        }
        
        produtoRepositorio.updateProduto(produto);
	}

}