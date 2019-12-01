
package repository;

import exception.CompraExcecao;
import model.Compra;

public interface ICompraRepositorio {

	void createCompra(Compra compra) throws CompraExcecao ;
	Compra searchCompraPorId(int id) throws CompraExcecao;
	void updateCompra(Compra compraUI) throws CompraExcecao;
	void deleteCompra(int id) throws CompraExcecao;
	boolean errorCompra(int id) throws CompraExcecao;

}