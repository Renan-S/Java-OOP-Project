  
package repository;

import java.util.ArrayList;
import java.util.List;

import exception.VendaExcecao;
import model.Venda;

public class VendaRepositorio implements IVendaRepositorio {
	private List<Venda> listaVenda;
	private static VendaRepositorio instancia = new VendaRepositorio();
	
	public static VendaRepositorio getInstancia() {
		return instancia;
	}
	
	private VendaRepositorio() {
		listaVenda = new ArrayList<Venda>();
	}
	
	@Override
	public void createVenda(Venda venda) throws VendaExcecao {
		listaVenda.add(venda);
	}

	@Override
	public Venda searchVendaPorId(int id) throws VendaExcecao {
		for (Venda venda : listaVenda) {
			if (venda != null && venda.getId() == (id)) {
				return venda;
			}
			
		}
		return null;
	}

	//vendaUi aqui é um objeto que vem da UI, e foi assim definido para não ficar duplicado com o objeto do repositório
	@Override
	public void updateVenda(Venda vendaUI) throws VendaExcecao {
		for (Venda venda : listaVenda) {
			if (vendaUI.getId() == venda.getId()) {
				venda = vendaUI;
				return;
			}
		}
	}
	
	@Override
	public void deleteVenda(int id) throws VendaExcecao {
		for (Venda venda : listaVenda){
            if (venda !=null && venda.getId() == id){
                listaVenda.remove(venda);
                return;
            }
        }
	}
	
	@Override
    public boolean errorVenda(int id) throws VendaExcecao  {
        for (Venda venda: listaVenda){
            if (venda != null && venda.getId() == id){
                return true;
            }
        }
        return false;
    }
	
}