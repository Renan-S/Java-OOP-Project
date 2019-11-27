package ui;



import control.Fachada;
import model.Endereco;
import model.Funcionario;
import exception.FuncionarioExcecao;

public class FuncionarioUI extends UI{
	@Override
    public void menu(){
       boolean continuar = true;
       do {
        println("Escolha das opções de Funcionario \n1 - Inserir \n2 - Remover \n3 - Pesquisar \n4 - Atualizar \n5 -Voltar ao menu principal");
 

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
            	println("op��o invalida");
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
		
		funcionarioUI.setEndereco(endereco);

        try {
            Fachada.getInstancia().createFuncionario(funcionarioUI);
            println("Funcionario criado");
        }catch (FuncionarioExcecao e){
        	e.printStackTrace();
            println(e.getMessage());
        }
    }
    
    private void deleteFuncionario() {
		println("Digite o Rg do funcionario");
		String rg = scanTxt();
		
		try {
			Fachada.getInstancia().deleteFuncionario(rg);
			println("Funcionario removido");
		} catch (FuncionarioExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}
    
    private void searchFuncionarioPorRg() {
		println("Insira o identificador único");
		String rg = scanTxt();
		
		try {
			Funcionario funcionarioUI = Fachada.getInstancia().searchFuncionarioPorRg(rg);
			if (funcionarioUI != null) {
				println(funcionarioUI.toString());
			} else {
				println("Funcionario inexistente, tente novamente");
			}
		} catch (FuncionarioExcecao e) {
			e.printStackTrace();
			println(e.getMessage());
		}
	}
    
    private void updateFuncionario() {
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
		
		funcionarioUI.setEndereco(endereco);
		
         try {
             Fachada.getInstancia().updateFuncionario(funcionarioUI);
             println("Funcionario modificado e atualizado");
         }catch (FuncionarioExcecao e){
         	e.printStackTrace();
             println(e.getMessage());
         }
	}
}
