package control;

import exception.ClienteExcecao;
import exception.ProdutoExcecao;
import model.Cliente;
import model.Produto;

public class Fachada implements IClienteControlador, IProdutoControlador {
	private IClienteControlador controladorCliente;
	private IProdutoControlador controladorProduto;
	private static Fachada instancia;
	
	public static Fachada getInstancia() {
		if(instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}
//FACHADA CLIENTE
	private Fachada() {
		controladorCliente = ClienteControlador.getInstancia();
		controladorProduto = ProdutoControlador.getInstancia();
	}

	@Override
	public void cadastrarCliente(Cliente c) throws ClienteExcecao {
		
	}

	@Override
	public Cliente procurarCliente(String cpf) throws ClienteExcecao {
		return controladorCliente.procurarCliente(cpf);
	}

	@Override
	public void removerCliente(String cpf) throws ClienteExcecao {
		controladorCliente.removerCliente(cpf);
		
	}

	/*@Override
	public Cliente[] pesquisarClienteEndereco(String endereco) throws ClienteExcecao {
		return controladorCliente.pesquisarClienteEndereco(endereco);
	}*/

	@Override
	public void atualizarCliente(Cliente c) throws ClienteExcecao {
		controladorCliente.atualizarCliente(c);
		
	}
	@Override
	public void implementarDesconto(Cliente c) throws ClienteExcecao {
		controladorCliente.implementarDesconto(c);
	}
	
	//FACHADA PRODUTO
	@Override
	public void createProduto(Produto produto) throws ProdutoExcecao {
		
	}
	@Override
	public Produto searchProdutoPorId(int id) throws ProdutoExcecao {
		return controladorProduto.searchProdutoPorId(id);
	}
	@Override
	public void deleteProduto(int id) throws ProdutoExcecao {
		controladorProduto.deleteProduto(id);
	}
	@Override
	public void updateProduto(Produto produto) throws ProdutoExcecao {
		controladorProduto.updateProduto(produto);
	}
	//PROXIMAS FACHADAS/ATUALIZAR
}
