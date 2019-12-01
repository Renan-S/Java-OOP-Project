package repository;

import java.util.ArrayList;
import java.util.List;

import exception.CompraExcecao;
import model.Compra;

public class CompraRepositorio implements ICompraRepositorio {
	private List<Compra> listaCompra;
	private static CompraRepositorio instancia = new CompraRepositorio();
	
	public static CompraRepositorio getInstancia() {
		return instancia;
	}
	
	private CompraRepositorio() {
		listaCompra = new ArrayList<Compra>();
	}
	
	@Override
	public void createCompra(Compra compra) throws CompraExcecao {
		listaCompra.add(compra);
	}

	@Override
	public Compra searchCompraPorId(int id) throws CompraExcecao {
		for (Compra compra : listaCompra) {
			if (compra != null && compra.getId() == id) {
				return compra;
			}
			
		}
		return null;
	}

	//compraUi aqui é um objeto que vem da UI, e foi assim definido para não ficar duplicado com o objeto do repositório
	@Override
	public void updateCompra(Compra compraUI) throws CompraExcecao {
		for (Compra compra : listaCompra) {
			if (compraUI.getId() == compra.getId()) {
				compra = compraUI;
				return;
			}
		}
	}
	
	@Override
	public void deleteCompra(int id) throws CompraExcecao {
		for (Compra compra : listaCompra){
            if (compra !=null && compra.getId() == id){
                listaCompra.remove(compra);
                return;
            }
        }
	}
	
	@Override
    public boolean errorCompra(int id) throws CompraExcecao  {
        for (Compra compra: listaCompra){
            if (compra != null && compra.getId() == id){
                return true;
            }
        }
        return false;
    }

}