package ui;



import control.Fachada;
import exception.ClienteExcecao;
import model.Cliente;
import model.Endereco;

public class UICliente extends UI {
	@Override
	public void menu() {
		boolean continuar = true;
		do {
			println("Escolha uma das opcoes\n1 Cadastrar Cliente\n2 Procurar Cliente\n3 Remover Cliente\n4 Atualizar Cliente\n5 Voltar ao menu principal ");
		switch(scanInt()) {
		case 1:
			cadastrarCliente();
			break;
		case 2:
			procurarCliente();
			break;
		case 3:
			removerCliente();
			break;
		case 4:
			atualizarCliente();
		case 5:
			continuar = false;
			break;
		default:
			println("Opcao invalida");
			break;
		}
	}while(continuar);
	}
		

	private void atualizarCliente() {
		Cliente c = new Cliente();
		println("Informe o nome do cliente");
		c.setNome(scanTxt());
		println("Informe o sexo do cliente");
		c.setSexo(scanTxt());
		println("Informe o CPF do cliente");
		c.setCpf(scanTxt());
		println("Informe o email do cliente");
		c.setEmail(scanTxt());
		println("Informe qual será a forma de pagamento");
		c.setFormapagamento(scanTxt());
		
		Endereco endereco = new Endereco();
		println("Endereco - Digite a rua");
		endereco.setRua(scanTxt());
		println("Endereco - Digite o bairro");
		endereco.setBairro(scanTxt());
		println("Endereco - Digite o numero");
		endereco.setNumero(scanInt());
		println("Endereco - Digite o complemento");
		endereco.setComplemento(scanTxt());
		println("Endereco - Digite o cep");
		endereco.setCep(scanTxt());
		
		c.setEndereco(endereco);
		
		try {
			Fachada.getInstancia().implementarDesconto(c);
			Fachada.getInstancia().atualizarCliente(c);
			println("Cliente atualizado com Sucesso");
		}catch(ClienteExcecao e) {
			println(e.getMessage());
		}
		
	}

	
	private void removerCliente() {
		println("Informe o cpf");
		String cpf = scanTxt();
		
		try {
			  Fachada.getInstancia().removerCliente(cpf);
			println("Cliente removido com sucesso");
		}catch(ClienteExcecao e) {
			println(e.getMessage());
		}
	}

	private void procurarCliente() {
		println("Informe o cpf");
		String cpf = scanTxt();
		
		try {
			Cliente c = Fachada.getInstancia().procurarCliente(cpf);
			if(c!=null) {
				println(c.toString());
			}else {
				println("Cliente nao encontrado");
			}
		}catch(ClienteExcecao e) {
			println(e.getMessage());
		}
		
		
	}

	private void cadastrarCliente() {
		Cliente c = new Cliente();
		println("Informe o nome do cliente");
		c.setNome(scanTxt());
		println("Informe o sexo do cliente");
		c.setSexo(scanTxt());
		println("Informe o CPF do cliente");
		c.setCpf(scanTxt());
		println("Informe o email do cliente");
		c.setEmail(scanTxt());
		println("Informe qual será a forma de pagamento");
		c.setFormapagamento(scanTxt());
		
		Endereco endereco = new Endereco();
		println("Endereco - Digite a rua");
		endereco.setRua(scanTxt());
		println("Endereco - Digite o bairro");
		endereco.setBairro(scanTxt());
		println("Endereco - Digite o numero");
		endereco.setNumero(scanInt());
		println("Endereco - Digite o complemento");
		endereco.setComplemento(scanTxt());
		println("Endereco - Digite o cep");
		endereco.setCep(scanTxt());
		
		c.setEndereco(endereco);
		
		try {
			Fachada.getInstancia().implementarDesconto(c);
			Fachada.getInstancia().cadastrarCliente(c);
			println("Cliente cadastrado com sucesso");
		}
			catch(ClienteExcecao e) {
				println(e.getMessage());
			}
		}
	
}
