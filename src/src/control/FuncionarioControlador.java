package control;

import exception.FuncionarioExcecao;
import model.Funcionario;
import repository.FuncionarioRepositorio;
import repository.IFuncionarioRepositorio;
import util.Util;

public class FuncionarioControlador implements IFuncionarioControlador {
	
	private IFuncionarioRepositorio funcionarioRepositorio = FuncionarioRepositorio.getInstancia();
	private static FuncionarioControlador instancia = new FuncionarioControlador();
	
	protected static FuncionarioControlador getInstancia() {
		return instancia;
	}
	
	private FuncionarioControlador() {
		
	}

	@Override
	public void createFuncionario(Funcionario funcionario) throws FuncionarioExcecao{
		if( funcionario == null) {
			throw new FuncionarioExcecao("funcionario invalido");
		}
		if(funcionarioRepositorio.errorFuncionario(funcionario.getRg())) {
			throw new FuncionarioExcecao("funcionario ja existe");
		}
//		if (!Util.isCPF(funcionario.getCpf())) {
//			throw new FuncionarioExcecao("CPF invalido");
//		}
		funcionarioRepositorio.createFuncionario(funcionario);
	}

	@Override
	public Funcionario searchFuncionarioPorRg(String rg) throws FuncionarioExcecao {
		if (rg.equals(null) || rg.isEmpty()) {
    		throw new FuncionarioExcecao("Rg inv�lido");
    	}
        return funcionarioRepositorio.searchFuncionarioPorRg(rg);
	}

	@Override
	public void deleteFuncionario(String rg) throws FuncionarioExcecao {
		if (rg.equals(null) || rg.isEmpty()) {
    		throw new FuncionarioExcecao("funcionario inv�lida");
    	}
    	
    	if (!funcionarioRepositorio.errorFuncionario(rg)) {
    		throw new FuncionarioExcecao("N�o existe nenhum funcionario com o Rg " + rg);
    	}
    	
    	funcionarioRepositorio.deleteFuncionario(rg);
	}

	@Override
	public void updateFuncionario(Funcionario funcionario) throws FuncionarioExcecao {
		if (funcionario == null) {
    		throw new FuncionarioExcecao("funcionario inv�lido");
    	}

        if (!funcionarioRepositorio.errorFuncionario(funcionario.getRg())){
            throw new FuncionarioExcecao("Nenhum funcionario com o Rg " + funcionario.getRg());
        }
        
        funcionarioRepositorio.updateFuncionario(funcionario);
	}
		
}