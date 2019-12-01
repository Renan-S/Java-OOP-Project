package ui;

import control.Fachada;
import model.Fornecedor;
import model.Venda;
import model.Endereco;
import model.Produto;
import exception.VendaExcecao;

public class VendaUI extends UI {

	public void menu() {
		boolean continuar = true;
		do {
			println("Escolha das opções de Venda \n1 - Inserir \n2 - Remover \n3 - Pesquisar \n4 - Atualizar \n5 - Voltar ao menu principal");

			switch (scanInt()) {
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
				continuar = false;
				break;
			default:
				println("Opção inválida");
				break;
			}
		} while (continuar);
	}

	private void createVenda() {
		Venda vendaUI = new Venda();
		Fornecedor fornecedor = new Fornecedor();
		Produto produto = new Produto();
		Endereco endereco = new Endereco();
		println("Crie um idenficador único para o compra");
		vendaUI.setId(scanInt());

		println("Informe o nome do Fornecedor");
		fornecedor.setNome(scanTxt());
		println("Informe o email do Fornecedor");
		fornecedor.setEmail(scanTxt());
		println("Informe quem é o resposável");
		fornecedor.setResponsavel(scanTxt());
		println("Qual o CNPJ do responsável");
		fornecedor.setCnpj(scanTxt());

		println("Por favor, insira agora os dados referentes ao Endereço");
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

		println("O cliente foi cadastrado, agora insira os valores para o Produto");
		println("Insira o nome");
		produto.setNomeProduto(scanTxt());
		println("Defina o tipo");
		produto.setTipo(scanTxt());
		println("Insira a data de fabricação");
		produto.setFabricacao(scanTxt());
		println("Digite a data de validade");
		produto.setValidade(scanTxt());
		println("Defina o valor em reais");
		produto.setValor(scanInt());
		println("Digite a quantidade");
		produto.setQuantidade(scanInt());

		fornecedor.setEndereco(endereco);
		vendaUI.setFornecedor(fornecedor);
		vendaUI.setProduto(produto);

		try {
			Fachada.getInstancia().createVenda(vendaUI);
			println("Venda criada");
		} catch (VendaExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void deleteVenda() {
		println("Digite o identificador único da compra");
		int id = scanInt();

		try {
			Fachada.getInstancia().deleteVenda(id);
			println("Venda removida");
		} catch (VendaExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void searchVendaPorId() {
		println("Insira o identificador único");
		int id = scanInt();

		try {
			Venda vendaUI = Fachada.getInstancia().searchVendaPorId(id);
			if (vendaUI != null) {
				println(vendaUI.toString());
			} else {
				println("Venda inexistente, tente novamente");
			}
		} catch (VendaExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void updateVenda() {
		Venda vendaUI = new Venda();
		Fornecedor fornecedor = new Fornecedor();
		Produto produto = new Produto();
		Endereco endereco = new Endereco();
		println("Crie um idenficador único para o compra");
		vendaUI.setId(scanInt());

		println("Informe o nome do Fornecedor");
		fornecedor.setNome(scanTxt());
		println("Informe o email do Fornecedor");
		fornecedor.setEmail(scanTxt());
		println("Informe quem é o resposável");
		fornecedor.setResponsavel(scanTxt());
		println("Qual o CNPJ do responsável");
		fornecedor.setCnpj(scanTxt());

		println("Por favor, insira agora os dados referentes ao Endereço");
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

		println("O cliente foi cadastrado, agora insira os valores para o Produto");
		println("Insira o nome");
		produto.setNomeProduto(scanTxt());
		println("Defina o tipo");
		produto.setTipo(scanTxt());
		println("Insira a data de fabricação");
		produto.setFabricacao(scanTxt());
		println("Digite a data de validade");
		produto.setValidade(scanTxt());
		println("Defina o valor em reais");
		produto.setValor(scanDouble());
		println("Digite a quantidade");
		produto.setQuantidade(scanInt());

		fornecedor.setEndereco(endereco);
		vendaUI.setFornecedor(fornecedor);
		vendaUI.setProduto(produto);

		try {
			Fachada.getInstancia().updateVenda(vendaUI);
			println("Venda modificada e atualizada");
		} catch (VendaExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}

}