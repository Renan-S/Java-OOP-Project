package repository;

import java.util.ArrayList;
import java.util.List;

import exception.ClienteExcecao;
import model.Cliente;

public class ClienteRepositorio implements IClienteRepositorio {

	private List<Cliente> listacliente;
	private static ClienteRepositorio instancia;

	public static ClienteRepositorio getInstancia() {
		if (instancia == null) {
			instancia = new ClienteRepositorio();
		}
		return instancia;
	}

	private ClienteRepositorio() {
		listacliente = new ArrayList<Cliente>();
	}

	@Override
	public boolean existeCliente(String cpf) throws ClienteExcecao {
		for (Cliente c : listacliente) {
			if (c != null && c.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void cadastrarCliente(Cliente cliente) throws ClienteExcecao {
		listacliente.add(cliente);

	}

	@Override
	public Cliente procurarCliente(String cpf) throws ClienteExcecao {
		for (Cliente c : listacliente) {
			if (c != null && c.getCpf().equals(cpf)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void removerCliente(String cpf) throws ClienteExcecao {
		for (Cliente c : listacliente) {
			if (c != null && c.getCpf().equals(cpf)) {
				listacliente.remove(c);
				return;
			}
		}
	}

	@Override
	public void atualizarCliente(Cliente c) throws ClienteExcecao {
		for (Cliente cliente : listacliente) {
			if (c.getCpf().equals(cliente.getCpf())) {
				cliente = c;
				return;
			}

		}

	}

}
