package repository;

import java.util.ArrayList;
import java.util.List;

import model.Fornecedor;

public class FornecedorRepositorio implements IFornecedorRepositorio {

	private static FornecedorRepositorio instancia;

	public static FornecedorRepositorio getInstancia() {
		if (instancia == null) {
			instancia = new FornecedorRepositorio();
		}
		return instancia;
	}

	private List<Fornecedor> fornecedores = new ArrayList<>();

	@Override
	public void adicionar(Fornecedor fornecedor) {
		fornecedores.add(fornecedor);
	}

	@Override
	public void remover(String cnpj) {
		
		Fornecedor f = null;
		for (int i = 0; i < fornecedores.size(); i++) {
			f = fornecedores.get(i);
			if(f == null) {
				continue;
			}
			if (f.getCnpj().equals(cnpj)) {
				fornecedores.remove(f);
			}
		}

	}

	@Override
	public Fornecedor procurar(String cnpj) {
		for (Fornecedor f : fornecedores) {
			if (f.getCnpj().equals(cnpj)) {
				return f;
			}
		}
		return null;
	}

	@Override
	public void atulalizar(Fornecedor fornecedor) {
		Fornecedor f = null;
		for (int i = 0; i < fornecedores.size(); i++) {
			f = fornecedores.get(i);
			if (f == null) {
				continue;
			}

			if (f.getCnpj().equals(fornecedor.getCnpj())) {
				fornecedores.set(i, fornecedor);
			}
		}
	}

}
