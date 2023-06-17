package gestaocomercial.model;

import java.util.ArrayList;
import java.util.List;

import gestaocomercial.dto.ProdutoVendido;

public class Pedido {
	private List<ProdutoVendido> produtosVendidos;
	private Comprador comprador;

	public List<ProdutoVendido> getProdutosVendidos() {
		return produtosVendidos;
	}

	public void setProdutosVendidos(List<ProdutoVendido> produtosVendidos) {
		this.produtosVendidos = produtosVendidos;
	}
	public Comprador getComprador() {
		return comprador;
	}
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public void adicionarProduto(Produto produto) {
		this.verificaListaNula();
		this.produtosVendidos.add(new ProdutoVendido(produto));
	}

	public void adicionarProduto(ProdutoVendido produtoVendido) {
		this.verificaListaNula();
		this.produtosVendidos.add(produtoVendido);
	}

	public void adicionarKit(Kit kit) {
		this.verificaListaNula();
		for (ProdutoVendido produtoVendido : this.produtosVendidos) {
			for (Produto produtoKit : kit) {
				if (produtoVendido.getProduto() != null && produtoVendido.getProduto().equals(produtoKit)) {
					produtoVendido.setQuantidade(produtoVendido.getQuantidade() + 1);
				}
			}
		}
	}

	private void verificaListaNula() {
		if (this.produtosVendidos != null) {
			this.produtosVendidos = new ArrayList<ProdutoVendido>();
		}
	}
}
