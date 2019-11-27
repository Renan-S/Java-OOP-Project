package control;

import exception.ClienteExcecao;
import exception.FuncionarioExcecao;
import exception.ProdutoExcecao;
import exception.CompraExcecao;
import exception.VendaExcecao;
import model.Cliente;
import model.Funcionario;
import model.Produto;
import model.Compra;
import model.Venda;

public class Fachada implements IClienteControlador, IProdutoControlador, IFuncionarioControlador, ICompraControlador, IVendaControlador {
	private IClienteControlador controladorCliente;
	private IFuncionarioControlador controladorFuncionario;
	private IProdutoControlador controladorProduto;
	private ICompraControlador controladorCompra;
	private IVendaControlador controladorVenda;
	
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
		controladorCompra= CompraControlador.getInstancia();
		controladorVenda = VendaControlador.getInstancia();
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
	
	//FACHADA VENDA
	@Override
	public void createVenda(Venda venda) throws VendaExcecao {
		
	}
	@Override
	public Venda searchVendaPorId(int id) throws VendaExcecao {
		return controladorVenda.searchVendaPorId(id);
	}
	@Override
	public void deleteVenda(int id) throws VendaExcecao {
		controladorVenda.deleteVenda(id);
	}
	@Override
	public void updateVenda(Venda venda) throws VendaExcecao {
		controladorVenda.updateVenda(venda);
	}
	
	
	//FACHADA COMPRA
	@Override
	public void createCompra(Compra compra) throws CompraExcecao {
		
	}
	@Override
	public Compra searchCompraPorId(int id) throws CompraExcecao {
		return controladorCompra.searchCompraPorId(id);
	}
	@Override
	public void deleteCompra(int id) throws CompraExcecao {
		controladorCompra.deleteCompra(id);
	}
	@Override
	public void updateCompra(Compra compra) throws CompraExcecao {
		controladorCompra.updateCompra(compra);
	}
	
	
	
	//PROXIMAS FACHADAS/ATUALIZAR
}
