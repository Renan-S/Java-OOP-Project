package ui;

import java.util.Scanner;

import control.Fachada;
import exception.ClienteExcecao;
import model.Cliente;
import model.Endereco;

public class UICliente {
	
	int opcao;
	Scanner s = new Scanner(System.in);
	
	public void showMenuCliente() {
		System.out.println("Escolha uma das opcoes\n1 Cadastrar Cliente\n2 Procurar Cliente\n3 Remover Cliente\n4 Pesquisar Cliente Endereco /n5 Voltar ao menu principal");
		
		opcao = s.nextInt();
		
		switch(opcao) {
		case 1:
			cadastrarCliente();
			break;
		case 2:
			procurarCliente();
			break;
		case 3:
			removerCliente();
			break;
		/*case 4:
			pesquisarClienteEndereco();
			break;*/
		case 4:
			atualizarCliente();
		case 5:
			break;
		default:
			System.out.println("Opcao invalida");
			break;
		}
	}

	private void atualizarCliente() {
		Cliente c = new Cliente();
		System.out.println("Informe o nome do cliente");
		c.setNome(s.nextLine());
		System.out.println("Informe o sexo do cliente");
		c.setSexo(s.nextLine());
		System.out.println("Informe o CPF do cliente");
		c.setCpf(s.nextLine());
		System.out.println("Informe o email do cliente");
		c.setEmail(s.nextLine());
		System.out.println("Informe qual será a forma de pagamento");
		c.setFormapagamento(s.nextLine());
		
		Endereco endereco = new Endereco();
		System.out.println("Endereco - Digite a rua");
		endereco.setRua(s.nextLine());
		System.out.println("Endereco - Digite o bairro");
		endereco.setBairro(s.nextLine());
		System.out.println("Endereco - Digite o numero");
		endereco.setNumero(s.nextInt());
		System.out.println("Endereco - Digite o complemento");
		endereco.setComplemento(s.next());
		System.out.println("Endereco - Digite o cep");
		endereco.setCep(s.nextLine());
		
		c.setEndereco(endereco);
		
		try {
			Fachada.getInstancia().implementarDesconto(c);
			Fachada.getInstancia().atualizarCliente(c);
			System.out.println("Cliente atualizado com Sucesso");
		}catch(ClienteExcecao e) {
			System.out.println(e.getMessage());
		}
		
	}

	/*private void pesquisarClienteEndereco() {	
		
	}*/

	private void removerCliente() {
		System.out.println("Informe o cpf");
		String cpf = s.nextLine();
		
		try {
			  Fachada.getInstancia().removerCliente(cpf);
			System.out.println("Cliente removido com sucesso");
		}catch(ClienteExcecao e) {
			System.out.println(e.getMessage());
		}
	}

	private void procurarCliente() {
		System.out.println("Informe o cpf");
		String cpf = s.nextLine();
		
		try {
			Cliente c = Fachada.getInstancia().procurarCliente(cpf);
			if(c!=null) {
				System.out.println(c.toString());
			}else {
				System.out.println("Cliente nao encontrado");
			}
		}catch(ClienteExcecao e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	private void cadastrarCliente() {
		Cliente c = new Cliente();
		System.out.println("Informe o nome do cliente");
		c.setNome(s.nextLine());
		System.out.println("Informe o sexo do cliente");
		c.setSexo(s.nextLine());
		System.out.println("Informe o CPF do cliente");
		c.setCpf(s.nextLine());
		System.out.println("Informe o email do cliente");
		c.setEmail(s.nextLine());
		System.out.println("Informe qual será a forma de pagamento");
		c.setFormapagamento(s.nextLine());
		
		Endereco endereco = new Endereco();
		System.out.println("Endereco - Digite a rua");
		endereco.setRua(s.nextLine());
		System.out.println("Endereco - Digite o bairro");
		endereco.setBairro(s.nextLine());
		System.out.println("Endereco - Digite o numero");
		endereco.setNumero(s.nextInt());
		System.out.println("Endereco - Digite o complemento");
		endereco.setComplemento(s.next());
		System.out.println("Endereco - Digite o cep");
		endereco.setCep(s.nextLine());
		
		c.setEndereco(endereco);
		
		try {
			Fachada.getInstancia().implementarDesconto(c);
			Fachada.getInstancia().cadastrarCliente(c);
			System.out.println("Cliente cadastrado com sucesso");
		}
			catch(ClienteExcecao e) {
				System.out.println(e.getMessage());
			}
		}
	
}
