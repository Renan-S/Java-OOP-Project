package repository;

import java.util.ArrayList;
import java.util.List;

import exception.FuncionarioExcecao;
import model.Funcionario;


public class FuncionarioRepositorio implements IFuncionarioRepositorio {
	
	private List<Funcionario> listaFuncionario;
	private static FuncionarioRepositorio instancia = new FuncionarioRepositorio();
	
	public static FuncionarioRepositorio getInstancia() {
		return instancia;
	}
	
	private FuncionarioRepositorio() {
		listaFuncionario = new ArrayList<Funcionario>();
	}
	
	@Override
	public void createFuncionario(Funcionario funcionario) throws FuncionarioExcecao {
		listaFuncionario.add(funcionario);
	}

	@Override
	public Funcionario searchFuncionarioPorRg(String rg) throws FuncionarioExcecao {
		for (Funcionario funcionario : listaFuncionario) {
			if (funcionario != null && funcionario.getRg().equals(rg)) {
				return funcionario;
			}
			
		}
		return null;
	}

	//fornecedorUI aqui é um objeto que vem da UI, e foi assim definido para não ficar duplicado com o objeto do repositório
	@Override
	public void updateFuncionario(Funcionario funcionarioUI) throws FuncionarioExcecao {
		for (Funcionario funcionario : listaFuncionario) {
			if (funcionarioUI.getRg().equals(funcionario.getRg())) {
				funcionario = funcionarioUI;
				return;
			}
		}
	}
	
	@Override
	public void deleteFuncionario(String rg) throws FuncionarioExcecao {
		for (Funcionario funcionario : listaFuncionario){
            if (funcionario !=null && funcionario.getRg().equals(rg)){
            	listaFuncionario.remove(funcionario);
            	return;
            }
        }
	}
	
	@Override
    public boolean errorFuncionario(String rg) throws FuncionarioExcecao  {
        for (Funcionario funcionario: listaFuncionario){
            if (funcionario != null && funcionario.getRg().equals(rg)){
                return true;
            }
        }
        return false;
    }
	
}
