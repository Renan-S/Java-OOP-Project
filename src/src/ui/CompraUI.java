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
		println("Digite o identificador único da compra");
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
		println("Insira o identificador único");
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
    	Compra compraUI = new Compra();
        Cliente cliente = new Cliente(); 
        Produto produto = new Produto();
        Endereco endereco = new Endereco();
        println("Crie um idenficador único para a compra");
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
        
        cliente.setEndereco(endereco);
        compraUI.setCliente(cliente);
        compraUI.setProduto(produto);

         try {
             Fachada.getInstancia().updateCompra(compraUI);
             println("Compra modificada e atualizada");
         }catch (CompraExcecao e){
         	e.printStackTrace();
             println(e.getMessage());
         }
	}

}