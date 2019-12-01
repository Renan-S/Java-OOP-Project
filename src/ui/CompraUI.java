package ui;



import control.Fachada;
import model.Cliente;
import model.Compra;
import model.Endereco;
import model.Produto;
import exception.CompraExcecao;

public class CompraUI extends UI {

	public void menu(){
		boolean continuar = true;
		do {
			println("Escolha das opções de Compra \n1 - Inserir \n2 - Remover \n3 - Pesquisar \n4 - Atualizar \n5 - Voltar ao menu principal");

			switch (scanInt()){
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
				continuar = false;
				break;
			default:
				println("Opção inválida");
				break;
			}
		}while(continuar);
	}

	private void createCompra(){
		Compra compraUI = new Compra();
		Cliente cliente = new Cliente(); 
		Produto produto = new Produto();
		Endereco endereco = new Endereco();
		println("Crie um idenficador único para o compra");
		compraUI.setId(scanInt());

		println("Informe o nome do cliente");
		cliente.setNome(scanTxt());
		println("Informe o sexo do cliente");
		cliente.setSexo(scanTxt());
		println("Informe o CPF do cliente");
		cliente.setCpf(scanTxt());
		println("Informe o email do cliente");
		cliente.setEmail(scanTxt());
		println("Informe qual será a forma de pagamento");
		cliente.setFormapagamento(scanTxt());

		println("Por favor, insira agora os dados referentes ao Endereço");
		println("Endereço - Digite a rua");
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
		println("Insira a data de fabrição");
		produto.setFabricacao(scanTxt());
		println("Digite a data de validade");
		produto.setValidade(scanTxt());
		println("Defina o valor em reais");
		produto.setValor(scanDouble());
		println("Digite a quantidade");
		produto.setQuantidade(scanInt());

		cliente.setEndereco(endereco);
		compraUI.setCliente(cliente);
		compraUI.setProduto(produto);

		try {
			Fachada.getInstancia().createCompra(compraUI);
			println("Compra criada");
		}catch (CompraExcecao e){
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void deleteCompra() {
		println("Digite o identificador único da compra (Id)");
		int id = scanInt();

		try {
			Fachada.getInstancia().deleteCompra(id);
			println("Compra removida");
		} catch (CompraExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void searchCompraPorId() {
		println("Insira o identificador único (Id)");
		int id = scanInt();

		try {
			Compra compraUI = Fachada.getInstancia().searchCompraPorId(id);
			if (compraUI != null) {
				println(compraUI.toString());
			} else {
				println("Compra inexistente, tente novamente");
			}
		} catch (CompraExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void updateCompra() {
		try {
			println("Por favor, digite o Id da compra que será atualizada");
			Compra compraUI = Fachada.getInstancia().searchCompraPorId(scanInt());
			Endereco endereco = compraUI.getCliente().getEndereco();
			Cliente cliente = compraUI.getCliente();
			Produto produto = compraUI.getProduto();

			println("Compra encontrada. Caso queira manter os valores antigos, é só deixar vazio");
			print("Nome(" + cliente.getNome() + "): ");
			String nome = scanTxt();
			if(!nome.isEmpty()) {
				cliente.setNome(nome);
			}
			print("Sexo(" + cliente.getSexo() + "): ");
			String sexo = scanTxt();
			if(!sexo.isEmpty()) {
				cliente.setSexo(sexo);
			}
			print("Cpf(" + cliente.getCpf() + "): ");
			String cpf = scanTxt();
			if(!cpf.isEmpty()) {
				cliente.setCpf(cpf);
			}
			print("Email(" + cliente.getEmail() + "): ");
			String email = scanTxt();
			if(!email.isEmpty()) {
				cliente.setEmail(email);
			}
			print("Forma de pagamento(" + cliente.getFormapagamento() + "): ");
			String formapagamento = scanTxt();
			if(!formapagamento.isEmpty()) {
				cliente.setFormapagamento(formapagamento);
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

			Fachada.getInstancia().updateCompra(compraUI);
			println("Compra modificada e atualizada");
			println("Sua compra ficou desse modo: ");
			print(compraUI.toString());

		}catch (CompraExcecao e){
			e.printStackTrace();
			println(e.getMessage());
		}
	}

}