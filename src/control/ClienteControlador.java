package control;

import exception.ClienteExcecao;
import model.Cliente;
import repository.IClienteRepositorio;

public class ClienteControlador implements IClienteControlador {
	private static IClienteRepositorio repositoriocliente;
	
	private static ClienteControlador instancia;

    protected static ClienteControlador getInstancia(){
        if (instancia == null) {
            instancia = new ClienteControlador();
        }
        return instancia;
    }
        
        private ClienteControlador() {
        	}

		@Override
		public void cadastrarCliente(Cliente c) throws ClienteExcecao {
			if(c==null) {
				throw new ClienteExcecao("Cliente Invaldo");
			}
			if(repositoriocliente.existeCliente(c.getCpf())) {
				throw new ClienteExcecao("Cliente já existe");
			}
			repositoriocliente.cadastrarCliente(c);		
	}

		@Override
		public Cliente procurarCliente(String cpf) throws ClienteExcecao {
			if(cpf==null || cpf.isEmpty()) {
			throw new ClienteExcecao("cpf invalido");
		}
return repositoriocliente.procurarCliente(cpf);	
}

		@Override
		public void removerCliente(String cpf) throws ClienteExcecao {
			if(cpf==null || cpf.isEmpty()) {
				throw new ClienteExcecao("cpf invalido");
			}
			if (!repositoriocliente.existeCliente(cpf)) {
	    		throw new ClienteExcecao("Não existe nenhum cliente com o cpf " + cpf);
	    	}
			 repositoriocliente.removerCliente(cpf);
		}

		@Override
		public Cliente[] pesquisarClienteEndereco(String endereco) throws ClienteExcecao {
			if(repositoriocliente.pesquisarClienteEndereco(endereco)==null){
				throw new ClienteExcecao("não existe nenhum cliente com esse endereco");
			}
			System.out.println("clientes com esse endereço são" + repositoriocliente.pesquisarClienteEndereco(endereco));
			return repositoriocliente.pesquisarClienteEndereco(endereco);
		}

		@Override
		public void atualizarCliente(Cliente c) throws ClienteExcecao {
			if(c==null) {
				throw new ClienteExcecao("Cliente invalido");
			}
			if (!repositoriocliente.existeCliente(c.getCpf())) {
				throw new ClienteExcecao("Não existe nenhum cliente com o cpf " + c.getCpf());	
			}
			repositoriocliente.atualizarCliente(c);
			
		}
		
		
        
	

}
