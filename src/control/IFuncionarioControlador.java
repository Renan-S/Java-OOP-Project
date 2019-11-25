package control;

import exception.FuncionarioExcecao;
import model.Funcionario;

public interface IFuncionarioControlador {
	public void createFuncionario(Funcionario funcionario) throws FuncionarioExcecao;
	public Funcionario searchFuncionarioPorRg (String rg) throws FuncionarioExcecao;
	public void deleteFuncionario (String rg) throws FuncionarioExcecao;
	public void updateFuncionario (Funcionario funcionario) throws FuncionarioExcecao;
}
