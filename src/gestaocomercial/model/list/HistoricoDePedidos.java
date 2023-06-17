package gestaocomercial.model.list;

import java.util.ArrayList;
import java.util.List;

import gestaocomercial.model.Pedido;

public class HistoricoDePedidos {
	List<Pedido> listaDePedidos = new ArrayList<Pedido>();

	public List<Pedido> getListaDePedidos() {
		return listaDePedidos;
	}

	public void setListaDePedidos(List<Pedido> listaDePedidos) {
		this.listaDePedidos = listaDePedidos;
	}

	public void addPedido(Pedido pedido) {
		this.listaDePedidos.add(pedido);
	}

}
