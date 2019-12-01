package control;

import exception.VendaExcecao;
import model.Venda;
import repository.IVendaRepositorio;
import repository.VendaRepositorio;

public class VendaControlador  implements IVendaControlador {
	private static IVendaRepositorio vendaRepositorio;
	private static VendaControlador instancia = new VendaControlador();
	
	protected static VendaControlador getInstancia() {
		return instancia;
	}
	
	private VendaControlador() {
		vendaRepositorio = VendaRepositorio.getInstancia();
	}
	
	@Override
	public void createVenda(Venda venda) throws VendaExcecao {
		if( venda == null) {
			throw new VendaExcecao("Venda invalida");
		}
		if(vendaRepositorio.errorVenda(venda.getId())) {
			throw new VendaExcecao("Venda ja existe");
		}
		vendaRepositorio.createVenda(venda);		
	}

	@Override
	public Venda searchVendaPorId(int id) throws VendaExcecao {
		if (id <= 0) {
    		throw new VendaExcecao("Id inválido");
    	}
        return vendaRepositorio.searchVendaPorId(id);
    }

	@Override
	public void deleteVenda(int id) throws VendaExcecao {
		if (id <= 0) {
    		throw new VendaExcecao("Venda inválida");
    	}
    	
    	if (!vendaRepositorio.errorVenda(id)) {
    		throw new VendaExcecao("Não existe nenhum venda com o código " + id);
    	}
    	
    	vendaRepositorio.deleteVenda(id);

    }

	@Override
	public void updateVenda(Venda venda) throws VendaExcecao {
		if (venda == null) {
    		throw new VendaExcecao("Venda inválida");
    	}

        if (!vendaRepositorio.errorVenda(venda.getId())){
            throw new VendaExcecao("Nenhuma venda com o Id " + venda.getId());
        }
        
        vendaRepositorio.updateVenda(venda);
	}

}