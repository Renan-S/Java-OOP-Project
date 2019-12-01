package control;

import exception.VendaExcecao;
import model.Venda;

public interface IVendaControlador {
	
	void createVenda(Venda venda) throws VendaExcecao;
	Venda searchVendaPorId(int id) throws VendaExcecao;
	void deleteVenda(int id) throws VendaExcecao;
	void updateVenda(Venda venda) throws VendaExcecao;

}