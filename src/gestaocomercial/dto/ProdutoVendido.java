package gestaocomercial.dto;

import gestaocomercial.model.Produto;

public class ProdutoVendido {
	private Produto produto;
	private Integer quantidade;
	private Float valor; // unitario

	public ProdutoVendido(Produto produto, Float valor) {
		this.produto = produto;
		this.valor = valor;
		this.quantidade = 1;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public void adicionarQuantidade(Integer quantidade) {
		this.quantidade += quantidade;
	}
}
