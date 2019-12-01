package repository;

import exception.FuncionarioExcecao;
import model.Funcionario;

public interface IFuncionarioRepositorio {
	
	void createFuncionario(Funcionario funcionario) throws FuncionarioExcecao;
	Funcionario searchFuncionarioPorRg(String rg) throws FuncionarioExcecao;
	void updateFuncionario(Funcionario funcionarioUI) throws FuncionarioExcecao;
	void deleteFuncionario(String rg) throws FuncionarioExcecao;
	boolean errorFuncionario(String rg) throws FuncionarioExcecao;

}
