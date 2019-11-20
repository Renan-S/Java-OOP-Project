package control;

import exception.ClienteExcecao;
import model.Cliente;

public class Fachada implements IClienteControlador {
	
	private IClienteControlador controladorCliente;
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
	}

	@Override
	public void cadastrarCliente(Cliente c) throws ClienteExcecao {
		controladorCliente.cadastrarCliente(c);
		
	}

	@Override
	public Cliente procurarCliente(String cpf) throws ClienteExcecao {
		return controladorCliente.procurarCliente(cpf);
	}

	@Override
	public void removerCliente(String cpf) throws ClienteExcecao {
		controladorCliente.removerCliente(cpf);
		
	}

	@Override
	public Cliente[] pesquisarClienteEndereco(String endereco) throws ClienteExcecao {
		return controladorCliente.pesquisarClienteEndereco(endereco);
	}

	@Override
	public void atualizarCliente(Cliente c) throws ClienteExcecao {
		controladorCliente.atualizarCliente(c);
		
		//PROXIMAS FACHADAS/ATUALIZAR
	}
}
