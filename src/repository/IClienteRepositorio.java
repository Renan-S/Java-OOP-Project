package repository;

import exception.ClienteExcecao;
import model.Cliente;

public interface IClienteRepositorio {
	public boolean existeCliente(String cpf) throws ClienteExcecao;
	public void cadastrarCliente(Cliente c) throws ClienteExcecao;
	public Cliente procurarCliente(String cpf) throws ClienteExcecao;
	public void removerCliente(String cpf)throws ClienteExcecao;
	public void atualizarCliente(Cliente c) throws ClienteExcecao;

}
