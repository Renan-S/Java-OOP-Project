package control;

import exception.ProdutoExcecao;
import model.Produto;
import repository.IProdutoRepositorio;

public class ProdutoControlador implements IProdutoControlador {
	private static IProdutoRepositorio produtoRepositorio;
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
    		throw new ProdutoExcecao("Id inválido");
    	}
        return produtoRepositorio.searchProdutoPorId(id);
    }

	@Override
	public void deleteProduto(int id) throws ProdutoExcecao {
		if (id <= 0) {
    		throw new ProdutoExcecao("Produto inválida");
    	}
    	
    	if (!produtoRepositorio.errorProduto(id)) {
    		throw new ProdutoExcecao("Não existe nenhum produto com o código " + id);
    	}
    	
    	produtoRepositorio.deleteProduto(id);

    }

	@Override
	public void updateProduto(Produto produto) throws ProdutoExcecao {
		if (produto == null) {
    		throw new ProdutoExcecao("Produto inválido");
    	}

        if (!produtoRepositorio.errorProduto(produto.getId())){
            throw new ProdutoExcecao("Nenhum carro com a placa " + produto.getId());
        }
        
        produtoRepositorio.updateProduto(produto);
	}

}
