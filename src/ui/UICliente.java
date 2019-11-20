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
		System.out.println("escolha uma da opcao\n1 Cadastrar Cliente\n2 Procurar Cliente\n3 Remover Cliente\n4 Pesquisar Cliente Endereco ");
		
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
		default:
			System.out.println("opcao invalida");
			break;
		}
	}

	private void atualizarCliente() {
		Cliente c = new Cliente();
		System.out.println("informe o nome do cliente");
		c.setNome(s.nextLine());
		System.out.println("informe o sexo do cliente");
		c.setSexo(s.nextLine());
		System.out.println("informe o CPF do cliente");
		c.setCpf(s.nextLine());
		System.out.println("informe o email do cliente");
		c.setEmail(s.nextLine());
		
		Endereco end = new Endereco();
		System.out.println("Endereço - Digite a rua");
		end.setRua(s.nextLine());
		System.out.println("Endereço - Digite o bairro");
		end.setBairro(s.nextLine());
		System.out.println("Endereço - Digite o numero");
		end.setNumero(s.nextInt());
		System.out.println("Endereço - Digite o complemento");
		end.setComplemento(s.next());
		System.out.println("Endereço - Digite o cep");
		end.setCep(s.nextLine());
		
		c.setEndereco(end);
		
		try {
			Fachada.getInstancia().atualizarCliente(c);
			System.out.println("Cliente atualizado com Sucesso");
		}catch(ClienteExcecao e) {
			System.out.println(e.getMessage());
		}
		
	}

	private void pesquisarClienteEndereco() {	
		
	}

	private void removerCliente() {
		System.out.println("informe o cpf");
		String cpf = s.nextLine();
		
		try {
			  Fachada.getInstancia().removerCliente(cpf);
			System.out.println("Cliente Removido com Sucesso");
		}catch(ClienteExcecao e) {
			System.out.println(e.getMessage());
		}
		
	}

	private void procurarCliente() {
		System.out.println("informe o cpf");
		String cpf = s.nextLine();
		
		try {
			Cliente c = Fachada.getInstancia().procurarCliente(cpf);
			if(c!=null) {
				System.out.println(c.toString());
			}else {
				System.out.println("Cliente não encontrado");
			}
		}catch(ClienteExcecao e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	private void cadastrarCliente() {
		Cliente c = new Cliente();
		System.out.println("informe o nome do cliente");
		c.setNome(s.nextLine());
		System.out.println("informe o sexo do cliente");
		c.setSexo(s.nextLine());
		System.out.println("informe o CPF do cliente");
		c.setCpf(s.nextLine());
		System.out.println("informe o email do cliente");
		c.setEmail(s.nextLine());
		
		Endereco end = new Endereco();
		System.out.println("Endereço - Digite a rua");
		end.setRua(s.nextLine());
		System.out.println("Endereço - Digite o bairro");
		end.setBairro(s.nextLine());
		System.out.println("Endereço - Digite o numero");
		end.setNumero(s.nextInt());
		System.out.println("Endereço - Digite o complemento");
		end.setComplemento(s.next());
		System.out.println("Endereço - Digite o cep");
		end.setCep(s.nextLine());
		
		c.setEndereco(end);
		
		try {
			Fachada.getInstancia().cadastrarCliente(c);
			System.out.println("Cliente cadastrado com sucesso");
		}
			catch(ClienteExcecao e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	

}
