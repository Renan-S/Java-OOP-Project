package repository;

import model.Produto;
import exception.ProdutoExcecao;

import java.util.List;
import java.util.ArrayList;

public class ProdutoRepositorio implements IProdutoRepositorio {
	private List<Produto> listaProduto;
	private static ProdutoRepositorio instancia = new ProdutoRepositorio();
	
	public static ProdutoRepositorio getInstancia() {
		return instancia;
	}
	
	private ProdutoRepositorio() {
		listaProduto = new ArrayList<Produto>();
	}
	
	@Override
	public void createProduto(Produto produto) throws ProdutoExcecao {
		listaProduto.add(produto);
	}

	@Override
	public Produto searchProdutoPorId(int id) throws ProdutoExcecao {
		for (Produto produto : listaProduto) {
			if (produto != null && produto.getId() == (id)) {
				return produto;
			}
			
		}
		return null;
	}

	//produtoUi aqui é um objeto que vem da UI, e foi assim definido para não ficar duplicado com o objeto do repositório
	@Override
	public void updateProduto(Produto produtoUI) throws ProdutoExcecao {
		for (Produto produto : listaProduto) {
			if (produtoUI.getId() == produto.getId()) {
				produto = produtoUI;
			}
		}
	}
	
	@Override
	public void deleteProduto(int id) throws ProdutoExcecao {
		for (Produto produto : listaProduto){
            if (produto !=null && produto.getId() == id){
                listaProduto.remove(produto);
            }
        }
	}
	
	@Override
    public boolean errorProduto(int id) throws ProdutoExcecao  {
        for (Produto produto: listaProduto){
            if (produto != null && produto.getId() == id){
                return true;
            }
        }
        return false;
    }
	
	

}
