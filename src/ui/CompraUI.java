package ui;

import java.util.Scanner;

import control.Fachada;
import model.Cliente;
import model.Compra;
import model.Endereco;
import model.Produto;
import exception.CompraExcecao;

public class CompraUI {
	
	static Scanner s = new Scanner(System.in);

    public void showMenuCompra(){

        int opcao;

        System.out.println("Escolha das opções de Compra \n1 - Inserir \n2 - Remover \n3 - Pesquisar \n4 - Atualizar \n5 - Voltar ao menu principal");
        opcao = s.nextInt();

        switch (opcao){
            case 1:
            	createCompra();
                break;
            case 2: 
            	deleteCompra();
            	break;
            case 3: 
            	searchCompraPorId();
            	break;
            case 4: 
            	updateCompra();
            	break;
            case 5:
            	break;
            default:
            	System.out.println("Opção inválida");
            	break;
        }
    }
    
    private void createCompra(){
        Compra compraUI = new Compra();
        Cliente cliente = new Cliente(); 
        Produto produto = new Produto();
        Endereco endereco = new Endereco();
        System.out.println("Crie um idenficador único para o compra");
        compraUI.setId(s.nextInt());
        
		System.out.println("Informe o nome do cliente");
		cliente.setNome(s.nextLine());
		System.out.println("Informe o sexo do cliente");
		cliente.setSexo(s.nextLine());
		System.out.println("Informe o CPF do cliente");
		cliente.setCpf(s.nextLine());
		System.out.println("Informe o email do cliente");
		cliente.setEmail(s.nextLine());
		System.out.println("Informe qual será a forma de pagamento");
		cliente.setFormapagamento(s.nextLine());
		
		System.out.println("Por favor, insira agora os dados referentes ao Endereço");
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
		
        System.out.println("O cliente foi cadastrado, agora insira os valores para o Produto");
        System.out.println("Insira o nome");
        produto.setNomeProduto(s.nextLine());
        System.out.println("Defina o tipo");
        produto.setTipo(s.nextLine());
        System.out.println("Insira a data de fabricação");
        produto.setFabricacao(s.nextLine());
        System.out.println("Digite a data de validade");
        produto.setValidade(s.nextLine());
        System.out.println("Defina o valor em reais");
        produto.setValor(s.nextDouble());
        System.out.println("Digite a quantidade");
        produto.setQuantidade(s.nextInt());
        
        cliente.setEndereco(endereco);
        compraUI.setCliente(cliente);
        compraUI.setProduto(produto);

        try {
            Fachada.getInstancia().createCompra(compraUI);
            System.out.println("Compra criada");
        }catch (CompraExcecao e){
        	e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
    private void deleteCompra() {
		System.out.println("Digite o identificador único da compra");
		int id = s.nextInt();
		
		try {
			Fachada.getInstancia().deleteCompra(id);
			System.out.println("Compra removida");
		} catch (CompraExcecao e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
    
    private void searchCompraPorId() {
		System.out.println("Insira o identificador único");
		int id = s.nextInt();
		
		try {
			Compra compraUI = Fachada.getInstancia().searchCompraPorId(id);
			if (compraUI != null) {
				System.out.println(compraUI.toString());
			} else {
				System.out.println("Compra inexistente, tente novamente");
			}
		} catch (CompraExcecao e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
    
    private void updateCompra() {
    	Compra compraUI = new Compra();
        Cliente cliente = new Cliente(); 
        Produto produto = new Produto();
        Endereco endereco = new Endereco();
        System.out.println("Crie um idenficador único para a compra");
        compraUI.setId(s.nextInt());
        
		System.out.println("Informe o nome do cliente");
		cliente.setNome(s.nextLine());
		System.out.println("Informe o sexo do cliente");
		cliente.setSexo(s.nextLine());
		System.out.println("Informe o CPF do cliente");
		cliente.setCpf(s.nextLine());
		System.out.println("Informe o email do cliente");
		cliente.setEmail(s.nextLine());
		System.out.println("Informe qual será a forma de pagamento");
		cliente.setFormapagamento(s.nextLine());
		
		System.out.println("Por favor, insira agora os dados referentes ao Endereço");
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
		
        System.out.println("O cliente foi cadastrado, agora insira os valores para o Produto");
        System.out.println("Insira o nome");
        produto.setNomeProduto(s.nextLine());
        System.out.println("Defina o tipo");
        produto.setTipo(s.nextLine());
        System.out.println("Insira a data de fabricação");
        produto.setFabricacao(s.nextLine());
        System.out.println("Digite a data de validade");
        produto.setValidade(s.nextLine());
        System.out.println("Defina o valor em reais");
        produto.setValor(s.nextDouble());
        System.out.println("Digite a quantidade");
        produto.setQuantidade(s.nextInt());
        
        cliente.setEndereco(endereco);
        compraUI.setCliente(cliente);
        compraUI.setProduto(produto);

         try {
             Fachada.getInstancia().updateCompra(compraUI);
             System.out.println("Compra modificada e atualizada");
         }catch (CompraExcecao e){
         	e.printStackTrace();
             System.out.println(e.getMessage());
         }
	}

}
