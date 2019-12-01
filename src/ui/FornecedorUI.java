package ui;

import control.Fachada;
import exception.FornecedorExcecao;
import model.Endereco;
import model.Fornecedor;
import model.Produto;

public class FornecedorUI extends UI {

	
	private static void adicionar() {
		Fornecedor f = new Fornecedor();
		Endereco end = new Endereco();
		Produto produto = new Produto();

		print("Nome: ");
		f.setNome(scanTxt());
		print("CNPJ: ");
		f.setCnpj(scanTxt());
		print("Email: ");
		f.setEmail(scanTxt());
		print("Responsavel: ");
		f.setResponsavel(scanTxt());
		print("Cep: ");
		end.setCep(scanTxt());
		print("Rua: ");
		end.setRua(scanTxt());
		print("Bairro: ");
		end.setBairro(scanTxt());
		print("Complemento: ");
		end.setComplemento(scanTxt());
		print("Numero: ");
		end.setNumero(scanInt());
		print("Cidade: ");
		end.setCidade(scanTxt());
		print("ID do produto: ");
		produto.setIdProduto(scanInt());
		print("Nome do Produto: ");
		produto.setNomeProduto(scanTxt());
		print("Tipo: ");
		produto.setTipo(scanTxt());
		print("Valor: ");
		produto.setValor(scanDouble());
		print("Quantidade: ");
		produto.setQuantidade(scanInt());
		print("Data de Validade: ");
		produto.setValidade(scanTxt());
		print("Data de Fabricação: ");
		produto.setFabricacao(scanTxt());
		
		f.setProduto(produto);
		f.setEndereco(end);

		try {
			Fachada.getInstancia().adicionar(f);
			println("Fornecedor adicionado com sucesso");
		} catch (FornecedorExcecao e) {
			println(e.getMessage());
		}

	}

	private static void procurar() {
		try {
			print("Digite o CNPJ: ");
			println(Fachada.getInstancia().procurar(scanTxt()).toString());
		} catch (FornecedorExcecao e) {
			println(e.getMessage());
		}

	}

	private static void remover() {
		try {
			print("Digite o CNPJ: ");
			Fachada.getInstancia().remover(scanTxt());
			println("Fonecedor removido com sucesso");
		} catch (FornecedorExcecao e) {
			println(e.getMessage());
		}

	}

	private static void atualizar() {
		try {
			print("Digite o CNPJ: ");
			Fornecedor f = Fachada.getInstancia().procurar(scanTxt());
			Endereco end = f.getEndereco();
			Produto produto = f.getProduto();

			print("Nome(" + f.getNome() + "): ");
			String nome = scanTxt();
			if (!nome.isEmpty()) {
				f.setNome(nome);
			}
			print("Email(" + f.getEmail() + "): ");
			String email = scanTxt();
			if (!email.isEmpty()) {
				f.setEmail(email);
			}
			print("Responsavel(" + f.getResponsavel() + "): ");
			String responsavel = scanTxt();
			if (!responsavel.isEmpty()) {
				f.setResponsavel(responsavel);
			}
			print("Cep(" + end.getCep() + "): ");
			String cep = scanTxt();
			if (!cep.isEmpty()) {
				end.setCep(cep);
			}
			print("Rua(" + end.getRua() + "): ");
			String rua = scanTxt();
			if (!rua.isEmpty()) {
				end.setRua(rua);
			}
			print("Bairro(" + end.getBairro() + "): ");
			String bairro = scanTxt();
			if (!bairro.isEmpty()) {
				end.setBairro(bairro);
			}
			print("Complemento(" + end.getComplemento() + "): ");
			String complemento = scanTxt();
			if (!complemento.isEmpty()) {
				end.setComplemento(complemento);
			}
			print("Numero(" + end.getNumero() + "): ");
			int numero = scanInt();
			if (numero > 0) {
				end.setNumero(numero);
			}
			print("Cidade(" + end.getCidade() + "): ");
			String cidade = scanTxt();
			if (!cidade.isEmpty()) {
				end.setCidade(cidade);
			}
			print("Nome do Produto(" + produto.getNomeproduto() + "): ");
			String nomeProduto = scanTxt();
			if (!nomeProduto.isEmpty()) {
				produto.setNomeProduto(nomeProduto);
			}
			print("Tipo(" + produto.getTipo() + "):");
			String tipo = scanTxt();
			if (!tipo.isEmpty()) {
				produto.setTipo(tipo);
			}
			print("Valor(" + produto.getValor() + "):");
			double valor = scanDouble();
			if (valor > 0) {
				produto.setValor(valor);
			}
			print("Quantidade(" + produto.getQuantidade() + "):");
			int quantidade = scanInt();
			if (quantidade > 0) {
				produto.setQuantidade(quantidade);
			}
		
			Fachada.getInstancia().atualizar(f);
			println("Fornecedor Atualizado");
		} catch (FornecedorExcecao e) {
			println(e.getMessage());
		}

	}

	public void menu() {
		boolean continuar = true;

		do {
			println("1-Adicionar Fornecedor");
			println("2-Procurar Fornecedor");
			println("3-Remover Fornecedor");
			println("4-Atualizar Fornecedor");
			println("5-Voltar menu principal");

			switch (scanInt()) {
			case 1:
				adicionar();
				break;
			case 2:
				procurar();
				break;
			case 3:
				remover();
				break;
			case 4:
				atualizar();
				break;
			case 5:
				continuar = false;
				break;
			default:
				println("Opção Inválida");
			}

		} while (continuar);
	}

}