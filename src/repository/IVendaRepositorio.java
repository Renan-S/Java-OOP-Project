package repository;

import exception.VendaExcecao;
import model.Venda;

public interface IVendaRepositorio {
	
	void createVenda(Venda venda) throws VendaExcecao ;
	Venda searchVendaPorId(int id) throws VendaExcecao;
	void updateVenda(Venda vendaUI) throws VendaExcecao;
	void deleteVenda(int id) throws VendaExcecao;
	boolean errorVenda(int id) throws VendaExcecao;

}