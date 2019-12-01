package ui;

import control.Fachada;
import exception.FuncionarioExcecao;
import model.Endereco;
import model.Funcionario;

public class FuncionarioUI extends UI{
	@Override
	public void menu(){
		boolean continuar = true;
		do {
			println("Escolha das opções de Funcionário \n1 - Inserir \n2 - Remover \n3 - Pesquisar \n4 - Atualizar \n5 -Voltar ao menu principal");


			switch (scanInt()){
			case 1:
				createFuncionario();
				break;
			case 2: 
				deleteFuncionario();
				break;
			case 3: 
				searchFuncionarioPorRg();
				break;
			case 4: 
				updateFuncionario();
				break;
			case 5:
				continuar= false;
				break;
			default:
				println("opção invalida");
				break;
			}
		}while(continuar);
	}

	private void createFuncionario(){
		Funcionario funcionarioUI = new Funcionario();
		println("Insira o nome");
		funcionarioUI.setNome(scanTxt());
		println("Informe o sexo do cliente");
		funcionarioUI.setSexo(scanTxt());
		println("Informe o CPF do cliente");
		funcionarioUI.setCpf(scanTxt());
		println("Informe o email do cliente");
		funcionarioUI.setEmail(scanTxt());
		println("Insira o Rg");
		funcionarioUI.setRg(scanTxt());
		println("Insira registro da CLT");
		funcionarioUI.setClt(scanTxt());
		println("Insira a função que deseja criar");
		funcionarioUI.setFuncao(scanTxt());

		Endereco endereco = new Endereco();

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

		funcionarioUI.setEndereco(endereco);

		try {
			Fachada.getInstancia().createFuncionario(funcionarioUI);
			println("Funcionário criado");
		}catch (FuncionarioExcecao e){
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void deleteFuncionario() {
		println("Digite o Rg do funcionário");
		String rg = scanTxt();

		try {
			Fachada.getInstancia().deleteFuncionario(rg);
			println("Funcionário removido");
		} catch (FuncionarioExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void searchFuncionarioPorRg() {
		println("Insira o Rg");
		String rg = scanTxt();

		try {
			Funcionario funcionarioUI = Fachada.getInstancia().searchFuncionarioPorRg(rg);
			if (funcionarioUI != null) {
				println(funcionarioUI.toString());
			} else {
				println("Funcionário inexistente, tente novamente");
			}
		} catch (FuncionarioExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}

	private void updateFuncionario() {
		try {
			println("Por favor, digite o Rg que será atualizado");
			Funcionario funcionarioUI = Fachada.getInstancia().searchFuncionarioPorRg(scanTxt());
			Endereco endereco = funcionarioUI.getEndereco();

			println("Compra encontrada. Caso queira manter os valores antigos, é só deixar vazio");
			print("Nome(" + funcionarioUI.getNome() + "): ");
			String nome = scanTxt();
			if(!nome.isEmpty()) {
				funcionarioUI.setNome(nome);
			}
			print("Sexo(" + funcionarioUI.getSexo() + "): ");
			String sexo = scanTxt();
			if(!sexo.isEmpty()) {
				funcionarioUI.setSexo(sexo);
			}
			print("Email(" + funcionarioUI.getEmail() + "): ");
			String email = scanTxt();
			if(!email.isEmpty()) {
				funcionarioUI.setEmail(email);
			}
			print("CLT(" + funcionarioUI.getClt() + "): ");
			String clt = scanTxt();
			if(!clt.isEmpty()) {
				funcionarioUI.setClt(clt);
			}
			print("Função(" + funcionarioUI.getFuncao() + "): ");
			String funcao = scanTxt();
			if(!funcao.isEmpty()) {
				funcionarioUI.setFuncao(funcao);
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

			Fachada.getInstancia().updateFuncionario(funcionarioUI);
			println("Funcionário modificado e atualizado");
			println("Seu funcionário ficou desse modo: ");
			print(funcionarioUI.toString());
			
		}catch (FuncionarioExcecao e){
			e.printStackTrace();
			println(e.getMessage());
		}
	}
}
