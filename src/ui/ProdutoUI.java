package ui;

import java.util.Scanner;

import control.Fachada;
import model.Produto;
import exception.ProdutoExcecao;

public class ProdutoUI {
	
	static Scanner s = new Scanner(System.in);

    public void showMenuProduto(){

        int opcao;

        System.out.println("Escolha das opções de Produto \n1 - Inserir \n2 - Remover \n3 - Pesquisar \n4 - Atualizar \n5 - Voltar ao menu principal");
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
        Produto produtoUI = new Produto();
        System.out.println("Crie um idenficador único para o produto");
        produtoUI.setId(s.nextInt());
        System.out.println("Insira o nome");
        produtoUI.setNomeProduto(s.nextLine());
        System.out.println("Defina o tipo");
        produtoUI.setTipo(s.nextLine());
        System.out.println("Insira a data de fabricação");
        produtoUI.setFabricacao(s.nextLine());
        System.out.println("Digite a data de validade");
        produtoUI.setValidade(s.nextLine());
        System.out.println("Defina o valor em reais");
        produtoUI.setValor(s.nextDouble());
        System.out.println("Digite a quantidade");
        produtoUI.setQuantidade(s.nextInt());

        try {
            Fachada.getInstancia().createProduto(produtoUI);
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
			Produto produtoUI = Fachada.getInstancia().searchProdutoPorId(id);
			if (produtoUI != null) {
				System.out.println(produtoUI.toString());
			} else {
				System.out.println("Produto inexistente, tente novamente");
			}
		} catch (ProdutoExcecao e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
    
    private void updateProduto() {
    	 Produto produtoUI = new Produto();
         System.out.println("Crie um idenficador único para o produto");
         produtoUI.setId(s.nextInt());
         System.out.println("Insira o nome");
         produtoUI.setNomeProduto(s.nextLine());
         System.out.println("Defina o tipo");
         produtoUI.setTipo(s.nextLine());
         System.out.println("Insira a data de fabricação");
         produtoUI.setFabricacao(s.nextLine());
         System.out.println("Digite a data de validade");
         produtoUI.setValidade(s.nextLine());
         System.out.println("Defina o valor em reais");
         produtoUI.setValor(s.nextDouble());
         System.out.println("Digite a quantidade");
         produtoUI.setQuantidade(s.nextInt());

         try {
             Fachada.getInstancia().updateProduto(produtoUI);
             System.out.println("Produto modificado e atualizado");
         }catch (ProdutoExcecao e){
         	e.printStackTrace();
             System.out.println(e.getMessage());
         }
	}
    
    
}
