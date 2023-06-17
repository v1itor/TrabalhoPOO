package gestaocomercial.model.list;

import java.util.ArrayList;
import java.util.List;

import gestaocomercial.dto.ProdutoEmEstoque;

public class Estoque {
	private List<ProdutoEmEstoque> listaDeProdutosEmEstoque = new ArrayList<ProdutoEmEstoque>();

	public List<ProdutoEmEstoque> getListaDeProdutosEmEstoque() {
		return listaDeProdutosEmEstoque;
	}

	public void setListaDeProdutosEmEstoque(List<ProdutoEmEstoque> listaDeProdutosEmEstoque) {
		this.listaDeProdutosEmEstoque = listaDeProdutosEmEstoque;
	}
}
