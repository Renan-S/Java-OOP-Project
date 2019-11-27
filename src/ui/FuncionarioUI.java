package ui;

import java.util.Scanner;

import control.Fachada;
import model.Endereco;
import model.Funcionario;
import exception.FuncionarioExcecao;

public class FuncionarioUI {
	
	static Scanner s = new Scanner(System.in);

    public void showMenuFuncionario(){

        int opcao;
        
        System.out.println("Escolha das opções de Funcionario \n1 - Inserir \n2 - Remover \n3 - Pesquisar \n4 - Atualizar \n5 - Voltar ao menu principal");
        opcao = s.nextInt();

        switch (opcao){
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
            	break;
            default:
            	System.out.println("Opção inválida");
            	break;
        }

    }
    
    private void createFuncionario(){
        Funcionario funcionarioUI = new Funcionario();
        System.out.println("Insira o nome");
        funcionarioUI.setNome(s.nextLine());
        System.out.println("Informe o sexo do cliente");
        funcionarioUI.setSexo(s.nextLine());
		System.out.println("Informe o CPF do cliente");
		funcionarioUI.setCpf(s.nextLine());
		System.out.println("Informe o email do cliente");
		funcionarioUI.setEmail(s.nextLine());
		System.out.println("Insira o Rg");
        funcionarioUI.setRg(s.nextLine());
        System.out.println("Insira registro da CLT");
        funcionarioUI.setClt(s.nextLine());
        System.out.println("Insira a função que deseja criar");
        funcionarioUI.setFuncao(s.nextLine());
        
        Endereco endereco = new Endereco();
        
		System.out.println("Endereco - Digite a rua");
		endereco.setRua(s.nextLine());
		System.out.println("Endereco - Digite o bairro");
		endereco.setBairro(s.nextLine());
		System.out.println("Endereco - Digite o numero");
		endereco.setNumero(s.nextInt());
		System.out.println("Endereco - Digite o complemento");
		endereco.setComplemento(s.next());
		System.out.println("Endereco - Digite o cep");
		endereco.setCep(s.nextLine());
		
		funcionarioUI.setEndereco(endereco);

        try {
            Fachada.getInstancia().createFuncionario(funcionarioUI);
            System.out.println("Funcionario criado");
        }catch (FuncionarioExcecao e){
        	e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
    private void deleteFuncionario() {
		System.out.println("Digite o Rg do funcionario");
		String rg = s.nextLine();
		
		try {
			Fachada.getInstancia().deleteFuncionario(rg);
			System.out.println("Funcionario removido");
		} catch (FuncionarioExcecao e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
    
    private void searchFuncionarioPorRg() {
		System.out.println("Insira o identificador único");
		String rg = s.nextLine();
		
		try {
			Funcionario funcionarioUI = Fachada.getInstancia().searchFuncionarioPorRg(rg);
			if (funcionarioUI != null) {
				System.out.println(funcionarioUI.toString());
			} else {
				System.out.println("Funcionario inexistente, tente novamente");
			}
		} catch (FuncionarioExcecao e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
    
    private void updateFuncionario() {
    	Funcionario funcionarioUI = new Funcionario();
        System.out.println("Insira o nome");
        funcionarioUI.setNome(s.nextLine());
        System.out.println("Informe o sexo do cliente");
        funcionarioUI.setSexo(s.nextLine());
		System.out.println("Informe o CPF do cliente");
		funcionarioUI.setCpf(s.nextLine());
		System.out.println("Informe o email do cliente");
		funcionarioUI.setEmail(s.nextLine());
		System.out.println("Insira o Rg");
        funcionarioUI.setRg(s.nextLine());
        System.out.println("Insira registro da CLT");
        funcionarioUI.setClt(s.nextLine());
        System.out.println("Insira a função que deseja criar");
        funcionarioUI.setFuncao(s.nextLine());
        
        Endereco endereco = new Endereco();
        
		System.out.println("Endereco - Digite a rua");
		endereco.setRua(s.nextLine());
		System.out.println("Endereco - Digite o bairro");
		endereco.setBairro(s.nextLine());
		System.out.println("Endereco - Digite o numero");
		endereco.setNumero(s.nextInt());
		System.out.println("Endereco - Digite o complemento");
		endereco.setComplemento(s.next());
		System.out.println("Endereco - Digite o cep");
		endereco.setCep(s.nextLine());
		
		funcionarioUI.setEndereco(endereco);
		
         try {
             Fachada.getInstancia().updateFuncionario(funcionarioUI);
             System.out.println("Funcionario modificado e atualizado");
         }catch (FuncionarioExcecao e){
         	e.printStackTrace();
             System.out.println(e.getMessage());
         }
	}
}
