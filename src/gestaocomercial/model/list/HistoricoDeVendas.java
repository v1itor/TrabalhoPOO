package gestaocomercial.model.list;

import java.util.ArrayList;
import java.util.List;

import gestaocomercial.model.Venda;

public class HistoricoDeVendas {
	private List<Venda> listaDeVendas = new ArrayList<Venda>();

	public List<Venda> getListaDeVendas() {
		return listaDeVendas;
	}

	public void setListaDeVendas(List<Venda> listaDeVendas) {
		this.listaDeVendas = listaDeVendas;
	}
}
