package ui;

import util.Constante;

public class Principal extends UI {
	
	public static void main(String[] args) {
		new Principal().menu();
	}

	@Override
	public void menu() {
		int opcao = 0;
		do {
			println(Constante.NOME_PROGRAMA + "|" +Constante.VERSAO+"\nEscolha um dos cadastros \n1 * Clientes \n2 * Funcionarios \n3 * Fornecedores"
					+ "\n4 * Produtos \n5 * Vendas \n6 * Compras \n0 * Sair");
			UI ui  = null;
			opcao = scanInt();
			switch(opcao) {
				case 1:
					ui = new UICliente();
					break;
				case 2: 
					ui = new FuncionarioUI();
					break;
				case 3: 
					ui = new FornecedorUI();
					break;
				case 4:
					ui = new ProdutoUI();
					break;
				case 5: 
					ui = new VendaUI();
					break;
				case 6: 
					ui = new CompraUI();
					break;
				case 0:
					println("Obrigado por utilizar o Sistema");
					break;
				default:
					println("Opcao invalida");
					break;				
			}
			
			if (ui != null) {
				ui.menu();
			}
		} while(opcao != 0);
		
	}
	
}
