package control;

import exception.ClienteExcecao;
import model.Cliente;


public interface IClienteControlador {

	public void cadastrarCliente(Cliente c) throws ClienteExcecao;
	public Cliente procurarCliente(String cpf) throws ClienteExcecao;
	public void removerCliente(String cpf)throws ClienteExcecao;
	public void atualizarCliente(Cliente c) throws ClienteExcecao;
	public void implementarDesconto(Cliente c) throws ClienteExcecao;
}
