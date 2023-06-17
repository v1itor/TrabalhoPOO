package gestaocomercial.model;

import java.util.ArrayList;
import java.util.List;

import gestaocomercial.dto.ProdutoVendido;

public class Pedido {
	private List<ProdutoVendido> produtosVendidos = new ArrayList<ProdutoVendido>();
	private Comprador comprador;

	public Pedido(Comprador comprador, ProdutoVendido produtoVendido) {
		this.comprador = comprador;
		this.produtosVendidos.add(produtoVendido);
	}

	public Pedido(Comprador comprador, List<ProdutoVendido> produtoVendido) {
		this.comprador = comprador;
		this.produtosVendidos.addAll(produtoVendido);
	}

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
		this.produtosVendidos.add(new ProdutoVendido(produto));
	}

	public void adicionarProduto(ProdutoVendido produtoVendido) {
		this.produtosVendidos.add(produtoVendido);
	}

	public void adicionarKit(Kit kit) {
		for (ProdutoVendido produtoVendido : this.produtosVendidos) {
			for (Produto produtoKit : kit) {
				if (produtoVendido.getProduto() != null && produtoVendido.getProduto().equals(produtoKit)) {
					produtoVendido.setQuantidade(produtoVendido.getQuantidade() + 1);
				}
			}
		}
	}
}
