package control;

import exception.FornecedorExcecao;
import model.Fornecedor;

public interface IFornecedorControlador {
	public void adicionar(Fornecedor fornecedor) throws FornecedorExcecao;
    public Fornecedor procurar(String cnpj) throws FornecedorExcecao;
    public void remover(String cnpj) throws FornecedorExcecao;
    public void atualizar(Fornecedor fornecedor) throws FornecedorExcecao;


}
