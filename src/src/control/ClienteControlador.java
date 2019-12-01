package control;

import exception.ClienteExcecao;
import model.Cliente;
import repository.ClienteRepositorio;
import repository.IClienteRepositorio;
import util.Util;

public class ClienteControlador implements IClienteControlador {
	private static IClienteRepositorio repositoriocliente;

	private static ClienteControlador instancia;

	protected static ClienteControlador getInstancia() {
		if (instancia == null) {
			instancia = new ClienteControlador();
		}
		return instancia;
	}

	private ClienteControlador() {
		this.repositoriocliente = ClienteRepositorio.getInstancia();
	}

	@Override
	public void cadastrarCliente(Cliente c) throws ClienteExcecao {
		if (c == null) {
			throw new ClienteExcecao("Cliente invalido");
		}
		if (repositoriocliente.existeCliente(c.getCpf())) {
			throw new ClienteExcecao("Cliente ja existe");
		}
//		if (!Util.isCPF(c.getCpf())) {
//			throw new ClienteExcecao("CPF invalido");
//		}
		repositoriocliente.cadastrarCliente(c);
	}

	@Override
	public Cliente procurarCliente(String cpf) throws ClienteExcecao {
		if (cpf == null || cpf.isEmpty()) {
			throw new ClienteExcecao("Cpf invalido");
		}
		return repositoriocliente.procurarCliente(cpf);
	}

	@Override
	public void removerCliente(String cpf) throws ClienteExcecao {
		if (cpf == null || cpf.isEmpty()) {
			throw new ClienteExcecao("Cpf invalido");
		}
		if (!repositoriocliente.existeCliente(cpf)) {
			throw new ClienteExcecao("Nao existe nenhum cliente com o cpf " + cpf);
		}
		repositoriocliente.removerCliente(cpf);
	}

	@Override
	public void atualizarCliente(Cliente c) throws ClienteExcecao {
		if (c == null) {
			throw new ClienteExcecao("Cliente invalido");
		}
		if (!repositoriocliente.existeCliente(c.getCpf())) {
			throw new ClienteExcecao("Nao existe nenhum cliente com o cpf " + c.getCpf());
		}
		
		Cliente c2 = Fachada.getInstancia().procurarCliente(c.getCpf());
		if(!c2.getCpf().equals(c.getCpf())) {
			throw new ClienteExcecao("N�o podemos alterar o cpf");
		}
		repositoriocliente.atualizarCliente(c2);

	}

	public void implementarDesconto(Cliente c) throws ClienteExcecao {

		if (c.getFormapagamento().equals("Dinheiro")) {
			c.setDesconto(10 / 100);

		} else if (c.getFormapagamento().equals("Debito")) {
			c.setDesconto(10 / 100);

		} else {
			c.setDesconto(0);
		}
	}
}
