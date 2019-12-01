package control;

import exception.CompraExcecao;
import model.Compra;

public interface ICompraControlador {

	void createCompra(Compra compra) throws CompraExcecao;
	Compra searchCompraPorId(int id) throws CompraExcecao;
	void deleteCompra(int id) throws CompraExcecao;
	void updateCompra(Compra compra) throws CompraExcecao;

}