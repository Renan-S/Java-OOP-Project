package control;

import exception.ClienteExcecao;
import exception.FuncionarioExcecao;
import exception.ProdutoExcecao;
import model.Cliente;
import model.Funcionario;
import model.Produto;

public class Fachada implements IClienteControlador, IProdutoControlador, IFuncionarioControlador {
	private IClienteControlador controladorCliente;
	private IFuncionarioControlador controladorFuncionario;
	private IProdutoControlador controladorProduto;
	
	private static Fachada instancia;
	
	public static Fachada getInstancia() {
		if(instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}
	private Fachada() {
		controladorCliente = ClienteControlador.getInstancia();
		controladorFuncionario = FuncionarioControlador.getInstancia();
		controladorProduto = ProdutoControlador.getInstancia();
	}

//FACHADA CLIENTE
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
	
	//FACHADA FUNCIONARIO
	@Override
	public void createFuncionario(Funcionario funcionario) throws FuncionarioExcecao {
		
	}

	@Override
	public Funcionario searchFuncionarioPorRg(String rg) throws FuncionarioExcecao {
		return controladorFuncionario.searchFuncionarioPorRg(rg);
	}

	@Override
	public void deleteFuncionario(String rg) throws FuncionarioExcecao {
		controladorFuncionario.deleteFuncionario(rg);
		
	}

	@Override
	public void updateFuncionario(Funcionario funcionario) throws FuncionarioExcecao {
		controladorFuncionario.updateFuncionario(funcionario);
		
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
