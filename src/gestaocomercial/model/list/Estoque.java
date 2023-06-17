package gestaocomercial.model.list;

import java.util.List;

import gestaocomercial.model.Produto;

public class Estoque {
	List<Produto> listaDeprodutos;

	public List<Produto> getListaDeprodutos() {
		return listaDeprodutos;
	}

	public void setListaDeprodutos(List<Produto> listaDeprodutos) {
		this.listaDeprodutos = listaDeprodutos;
	}
}
