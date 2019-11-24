package ui;

import java.util.Scanner;

import control.Fachada;
import model.Produto;
import exception.ProdutoExcecao;

public class ProdutoUI {
	
	static Scanner s = new Scanner(System.in);

    public void showMenuProduto(){

        int opcao;

        System.out.println("Escolha das opções de Produto \n1 - Inserir \n2 - Remover \n3 - Pesquisar \n4 - Atualizar \n5 -Voltar");
        opcao = s.nextInt();

        switch (opcao){
            case 1:
            	createProduto();
                break;
            case 2: 
            	deleteProduto();
            	break;
            case 3: 
            	searchProdutoPorId();
            	break;
            case 4: 
            	updateProduto();
            	break;
            case 5:
            	break;
            default:
            	System.out.println("Opção inválida");
            	break;
        }

    }
    
    private void createProduto(){
        Produto produtoui = new Produto();
        System.out.println("Crie um idenficador único para o produto");
        produtoui.setId(s.nextInt());
        System.out.println("Insira o nome");
        produtoui.setNome(s.nextLine());
        System.out.println("Defina o tipo");
        produtoui.setTipo(s.nextLine());
        System.out.println("Insira a data de fabricação");
        produtoui.setFabricacao(s.nextLine());
        System.out.println("Digite a data de validade");
        produtoui.setValidade(s.nextLine());
        System.out.println("Defina o valor em reais");
        produtoui.setValor(s.nextDouble());
        System.out.println("Digite a quantidade");
        produtoui.setQuantidade(s.nextInt());

        try {
            Fachada.getInstancia().createProduto(produtoui);
            System.out.println("Produto criado");
        }catch (ProdutoExcecao e){
        	e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
    private void deleteProduto() {
		System.out.println("Digite o identificador único do produto");
		int id = s.nextInt();
		
		try {
			Fachada.getInstancia().deleteProduto(id);
			System.out.println("Produto removido");
		} catch (ProdutoExcecao e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
    
    private void searchProdutoPorId() {
		System.out.println("Insira o identificador único");
		int id = s.nextInt();
		
		try {
			Produto produtoui = Fachada.getInstancia().searchProdutoPorId(id);
			if (produtoui != null) {
				System.out.println(produtoui.toString());
			} else {
				System.out.println("Produto inexistente, tente novamente");
			}
		} catch (ProdutoExcecao e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
    
    private void updateProduto() {
    	 Produto produtoui = new Produto();
         System.out.println("Crie um idenficador único para o produto");
         produtoui.setId(s.nextInt());
         System.out.println("Insira o nome");
         produtoui.setNome(s.nextLine());
         System.out.println("Defina o tipo");
         produtoui.setTipo(s.nextLine());
         System.out.println("Insira a data de fabricação");
         produtoui.setFabricacao(s.nextLine());
         System.out.println("Digite a data de validade");
         produtoui.setValidade(s.nextLine());
         System.out.println("Defina o valor em reais");
         produtoui.setValor(s.nextDouble());
         System.out.println("Digite a quantidade");
         produtoui.setQuantidade(s.nextInt());

         try {
             Fachada.getInstancia().updateProduto(produtoui);
             System.out.println("Produto modificado e atualizado");
         }catch (ProdutoExcecao e){
         	e.printStackTrace();
             System.out.println(e.getMessage());
         }
	}
    
    
}
