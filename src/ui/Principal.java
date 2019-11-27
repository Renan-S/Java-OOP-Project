package ui;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int opcao=0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Escolha um dos cadastros \n1 * Clientes \n2 * Funcionarios \n3 * Fornecedores"
					+ "\n4 * Produtos \n5 * Vendas \n6 * Compras \n0 * Sair"); //continuar
			opcao = s.nextInt();
					switch(opcao) {
					case 1:
						UICliente uiCliente = new UICliente();
						uiCliente.showMenuCliente();
						break;
					case 2: 
						FuncionarioUI funcionarioUI = new FuncionarioUI();
						funcionarioUI.showMenuFuncionario(); 
					//case 3: "Fornecedores";
					case 4:
						ProdutoUI produtoUI = new ProdutoUI();
						produtoUI.showMenuProduto(); 
					case 5:
						VendaUI vendaUI = new VendaUI();
						vendaUI.showMenuVenda(); 
					case 6: 
						CompraUI compraUI = new CompraUI();
						compraUI.showMenuCompra();
					case 0:
						System.out.println("Obrigado por utilizar o Sistema");
					default:
						System.out.println("Opcao invalida");
						break;
					}
		}while(opcao != 0);
		s.close();
	
	}
	
}
