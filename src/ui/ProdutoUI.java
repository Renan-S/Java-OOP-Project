package ui;

import control.Fachada;
import model.Produto;
import exception.ProdutoExcecao;

public class ProdutoUI extends UI {

	@Override
	public void menu(){
		boolean continuar = true;
		do {
			println("Escolha das opções de Produto \n1 - Inserir \n2 - Remover \n3 - Pesquisar \n4 - Atualizar \n5 -Voltar ao menu principal");

			switch (scanInt()){
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
				continuar = false;
				break;
			default:
				println("opção invalida");
				break;
			}
		}while(continuar);
	}

	private void createProduto(){
		Produto produtoUI = new Produto();
		println("Crie um idenficador único para o produto");
		produtoUI.setIdProduto(scanInt());
		println("Insira o nome");
		produtoUI.setNomeProduto(scanTxt());
		println("Defina o tipo");
		produtoUI.setTipo(scanTxt());
		println("Insira a data de fabricação");
		produtoUI.setFabricacao(scanTxt());
		println("Digite a data de validade");
		produtoUI.setValidade(scanTxt());
		println("Defina o valor em reais");
		produtoUI.setValor(scanDouble());
		println("Digite a quantidade");
		produtoUI.setQuantidade(scanInt());

		try {
			Fachada.getInstancia().createProduto(produtoUI);
			println("Produto criado");
		}catch (ProdutoExcecao e){
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void deleteProduto() {
		println("Digite o identificador único do produto");
		int id = scanInt();

		try {
			Fachada.getInstancia().deleteProduto(id);
			println("Produto removido");
		} catch (ProdutoExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void searchProdutoPorId() {
		println("Insira o identificador único (Id)");
		int id = scanInt();

		try {
			Produto produtoUI = Fachada.getInstancia().searchProdutoPorId(id);
			if (produtoUI != null) {
				println(produtoUI.toString());
			} else {
				println("Produto inexistente, tente novamente");
			}
		} catch (ProdutoExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void updateProduto() {
		try {
			println("Por favor, digite o Id do produto que será atualizada");
			Produto produtoUI = Fachada.getInstancia().searchProdutoPorId(scanInt());

			println("Insira os dados do produto");
			print("Nome(" + produtoUI.getNomeproduto() + "): ");
			String nomeproduto = scanTxt();
			if(!nomeproduto.isEmpty()) {
				produtoUI.setNomeProduto(nomeproduto);
			}
			print("Tipo(" + produtoUI.getTipo() + "): ");
			String tipo = scanTxt();
			if(!tipo.isEmpty()) {
				produtoUI.setTipo(tipo);
			}
			print("Valor(" + produtoUI.getValor() + "): ");
			double valor = scanDouble();
			if(valor > 0) {
				produtoUI.setValor(valor);
			}
			print("Quantidade(" + produtoUI.getQuantidade() + "): ");
			int quantidade = scanInt();
			if(quantidade > 0) {
				produtoUI.setQuantidade(quantidade);
			}

			Fachada.getInstancia().updateProduto(produtoUI);
			println("Produto modificado e atualizado");
			println("Seu produto ficou desse modo: ");
			print(produtoUI.toString());
			
		}catch (ProdutoExcecao e){
			e.printStackTrace();
			println(e.getMessage());
		}
	}


}
