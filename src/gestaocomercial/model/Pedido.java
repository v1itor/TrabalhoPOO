package gestaocomercial.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import gestaocomercial.dto.ProdutoVendido;
import gestaocomercial.enumeration.CanalDeVenda;
import gestaocomercial.enumeration.MetodoDePagamento;

public class Pedido {
	private List<ProdutoVendido> produtosVendidos = new ArrayList<ProdutoVendido>();
	private Comprador comprador;
	private Date dataVenda;
	private CanalDeVenda canalDeVenda;
	private MetodoDePagamento metodoDePagamento;

	public Pedido(Comprador comprador, ProdutoVendido produtoVendido) {
		this.comprador = comprador;
		this.produtosVendidos.add(produtoVendido);
	}

	public Pedido(Comprador comprador, List<ProdutoVendido> produtoVendido) {
		this.comprador = comprador;
		this.produtosVendidos.addAll(produtoVendido);
	}

	public Pedido(List<ProdutoVendido> produtosVendidos, Comprador comprador, CanalDeVenda canalDeVenda, MetodoDePagamento metodoDePagamento) {
		super();
		this.produtosVendidos.addAll(produtosVendidos);
		this.comprador = comprador;
		this.canalDeVenda = canalDeVenda;
		this.metodoDePagamento = metodoDePagamento;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public CanalDeVenda getCanalDeVenda() {
		return canalDeVenda;
	}

	public void setCanalDeVenda(CanalDeVenda canalDeVenda) {
		this.canalDeVenda = canalDeVenda;
	}

	public MetodoDePagamento getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
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
