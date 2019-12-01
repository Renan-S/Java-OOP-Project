package control;

import model.Compra;
import repository.CompraRepositorio;
import repository.ICompraRepositorio;
import exception.CompraExcecao;

public class CompraControlador implements ICompraControlador {
	private ICompraRepositorio compraRepositorio = CompraRepositorio.getInstancia();
	private static CompraControlador instancia = new CompraControlador();
	
	protected static CompraControlador getInstancia() {
		return instancia;
	}
	
	private CompraControlador() {
		
	}
	
	@Override
	public void createCompra(Compra compra) throws CompraExcecao {
		if( compra == null) {
			throw new CompraExcecao("Compra invalida");
		}
		if(compraRepositorio.errorCompra(compra.getId())) {
			throw new CompraExcecao("Compra ja existe");
		}
		compraRepositorio.createCompra(compra);		
	}

	@Override
	public Compra searchCompraPorId(int id) throws CompraExcecao {
		if (id <= 0) {
    		throw new CompraExcecao("Id inv�lido");
    	}
        return compraRepositorio.searchCompraPorId(id);
    }

	@Override
	public void deleteCompra(int id) throws CompraExcecao {
		if (id <= 0) {
    		throw new CompraExcecao("Compra inv�lida");
    	}
    	
    	if (!compraRepositorio.errorCompra(id)) {
    		throw new CompraExcecao("N�o existe nenhuma compra com o c�digo " + id);
    	}
    	
    	compraRepositorio.deleteCompra(id);

    }

	@Override
	public void updateCompra(Compra compra) throws CompraExcecao {
		if (compra == null) {
    		throw new CompraExcecao("Compra inv�lida");
    	}

        if (!compraRepositorio.errorCompra(compra.getId())){
            throw new CompraExcecao("Nenhuma compra com o Id " + compra.getId());
        }
        
        compraRepositorio.updateCompra(compra);
	}

}