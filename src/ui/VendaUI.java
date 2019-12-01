package ui;



import control.Fachada;
import model.Fornecedor;
import model.Venda;
import model.Endereco;
import model.Produto;
import exception.VendaExcecao;

public class VendaUI extends UI {

	public void menu(){
		boolean continuar = true;
		do {
			println("Escolha das opções de Venda \n1 - Inserir \n2 - Remover \n3 - Pesquisar \n4 - Atualizar \n5 - Voltar ao menu principal");

			switch (scanInt()){
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
		}while(continuar);
	}

	private void createVenda(){
		Venda vendaUI = new Venda();
		Fornecedor fornecedor = new Fornecedor(); 
		Produto produto = new Produto();
		Endereco endereco = new Endereco();
		println("Crie um idenficador único para a venda");
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
		println("Endereço - Digite o bairro");
		endereco.setBairro(scanTxt());
		println("Endereço - Digite o numero");
		endereco.setNumero(scanInt());
		println("Endereço - Digite o complemento");
		endereco.setComplemento(scanTxt());
		println("Endereço - Digite o cep");
		endereco.setCep(scanTxt());

		println("Insira os valores para o Produto");
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

		println("Seu produto está ligado ao fornecedor cadastrado?  Se sim digite 1. Se não digite 2"); 
		switch(scanInt()) {
		case 1:
			fornecedor.setProduto(produto);
			break;
		case 2:
			vendaUI.setProduto(produto);
			break;
		default:
			println("opção inválida");
			break;
		}

		fornecedor.setEndereco(endereco);
		vendaUI.setFornecedor(fornecedor);

		try {
			Fachada.getInstancia().createVenda(vendaUI);
			println("Venda criada");
		}catch (VendaExcecao e){
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void deleteVenda() {
		println("Digite o identificador único da venda");
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
		println("Insira o identificador único (Id)");
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
		try {
			println("Por favor, digite o Id da venda que será atualizada");
			Venda vendaUI = Fachada.getInstancia().searchVendaPorId(scanInt());
			Endereco endereco = vendaUI.getFornecedor().getEndereco();
			
			println("Cadastrou o produto ligado ao fornecedor?  Se sim digite 1. Se não digite 2"); 
			Fornecedor fornecedor = vendaUI.getFornecedor();
			Produto produto = null;
			
			switch(scanInt()) {
			case 1:
				produto = fornecedor.getProduto();
				break;
			case 2:
				produto = vendaUI.getProduto();
				break;
			default:
				println("opção inválida");
				break;
			}

			println("Venda encontrada. Caso queira manter os valores antigos, é só deixar vazio");
			print("Nome(" + fornecedor.getNome() + "): ");
			String nome = scanTxt();
			if(!nome.isEmpty()) {
				fornecedor.setNome(nome);
			}
			print("Email(" + fornecedor.getEmail() + "): ");
			String email = scanTxt();
			if(!email.isEmpty()) {
				fornecedor.setEmail(email);
			}


			println("Insira os dados do Endereço");
			print("Cep(" + endereco.getCep() + "): ");
			String cep = scanTxt();
			if(!cep.isEmpty()) {
				endereco.setCep(cep);
			}
			print("Rua(" + endereco.getRua() + "): ");
			String rua = scanTxt();
			if(!rua.isEmpty()) {
				endereco.setRua(rua);
			}
			print("Bairro(" + endereco.getBairro() + "): ");
			String bairro = scanTxt();
			if(!bairro.isEmpty()) {
				endereco.setBairro(bairro);
			}
			print("Complemento(" + endereco.getComplemento() + "): ");
			String complemento = scanTxt();
			if(!complemento.isEmpty()) {
				endereco.setComplemento(complemento);
			}
			print("Numero(" + endereco.getNumero() + "): ");
			int numero = scanInt();
			if(numero > 0) {
				endereco.setNumero(numero);
			}
			print("Cidade(" + endereco.getCidade() + "): ");
			String cidade = scanTxt();
			if(!cidade.isEmpty()) {
				endereco.setCidade(cidade);
			}


			println("Insira os dados do produto");
			print("Nome(" + produto.getNomeproduto() + "): ");
			String nomeproduto = scanTxt();
			if(!nomeproduto.isEmpty()) {
				produto.setNomeProduto(nomeproduto);
			}
			print("Tipo(" + produto.getTipo() + "): ");
			String tipo = scanTxt();
			if(!tipo.isEmpty()) {
				produto.setTipo(tipo);
			}
			print("Valor(" + produto.getValor() + "): ");
			double valor = scanDouble();
			if(valor > 0) {
				produto.setValor(valor);
			}
			print("Quantidade(" + produto.getQuantidade() + "): ");
			int quantidade = scanInt();
			if(quantidade > 0) {
				produto.setQuantidade(quantidade);
			}

			Fachada.getInstancia().updateVenda(vendaUI);
			println("Venda modificada e atualizada");
			println("Sua venda ficou desse modo: ");
			print(vendaUI.toString());

		}catch (VendaExcecao e){
			e.printStackTrace();
			println(e.getMessage());
		}
	}

}