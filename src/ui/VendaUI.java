package ui;

import java.util.Scanner;

import control.Fachada;
import model.Fornecedor;
import model.Venda;
import model.Endereco;
import model.Produto;
import exception.VendaExcecao;

public class VendaUI {
	
	static Scanner s = new Scanner(System.in);

    public void showMenuVenda(){

        int opcao;

        System.out.println("Escolha das opções de Venda \n1 - Inserir \n2 - Remover \n3 - Pesquisar \n4 - Atualizar \n5 - Voltar ao menu principal");
        opcao = s.nextInt();

        switch (opcao){
            case 1:
            	createVenda();
                break;
            case 2: 
            	deleteVenda();
            	break;
            case 3: 
            	searchVendaPorId();
            	break;
            case 4: 
            	updateVenda();
            	break;
            case 5:
            	break;
            default:
            	System.out.println("Opção inválida");
            	break;
        }
    }
    
    private void createVenda(){
        Venda vendaUI = new Venda();
        Fornecedor fornecedor = new Fornecedor(); 
        Produto produto = new Produto();
        Endereco endereco = new Endereco();
        System.out.println("Crie um idenficador único para o compra");
        vendaUI.setId(s.nextInt());
        
		System.out.println("Informe o nome do Fornecedor");
		fornecedor.setNome(s.nextLine());
		System.out.println("Informe o email do Fornecedor");
		fornecedor.setEmail(s.nextLine());
		System.out.println("Informe quem é o resposável");
		fornecedor.setResponsavel(s.nextLine());
		System.out.println("Qual o CNPJ do responsável");
		fornecedor.setCnpj(s.nextLine());
		
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
        
        fornecedor.setEndereco(endereco);
        vendaUI.setFornecedor(fornecedor);
        vendaUI.setProduto(produto);

        try {
            Fachada.getInstancia().createVenda(vendaUI);
            System.out.println("Venda criada");
        }catch (VendaExcecao e){
        	e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
    private void deleteVenda() {
		System.out.println("Digite o identificador único da compra");
		int id = s.nextInt();
		
		try {
			Fachada.getInstancia().deleteVenda(id);
			System.out.println("Venda removida");
		} catch (VendaExcecao e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
    
    private void searchVendaPorId() {
		System.out.println("Insira o identificador único");
		int id = s.nextInt();
		
		try {
			Venda vendaUI = Fachada.getInstancia().searchVendaPorId(id);
			if (vendaUI != null) {
				System.out.println(vendaUI.toString());
			} else {
				System.out.println("Venda inexistente, tente novamente");
			}
		} catch (VendaExcecao e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
    
    private void updateVenda() {
    	Venda vendaUI = new Venda();
        Fornecedor fornecedor = new Fornecedor(); 
        Produto produto = new Produto();
        Endereco endereco = new Endereco();
        System.out.println("Crie um idenficador único para o compra");
        vendaUI.setId(s.nextInt());
        
		System.out.println("Informe o nome do Fornecedor");
		fornecedor.setNome(s.nextLine());
		System.out.println("Informe o email do Fornecedor");
		fornecedor.setEmail(s.nextLine());
		System.out.println("Informe quem é o resposável");
		fornecedor.setResponsavel(s.nextLine());
		System.out.println("Qual o CNPJ do responsável");
		fornecedor.setCnpj(s.nextLine());
		
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
        
        fornecedor.setEndereco(endereco);
        vendaUI.setFornecedor(fornecedor);
        vendaUI.setProduto(produto);

         try {
             Fachada.getInstancia().updateVenda(vendaUI);
             System.out.println("Venda modificada e atualizada");
         }catch (VendaExcecao e){
         	e.printStackTrace();
             System.out.println(e.getMessage());
         }
	}

}
