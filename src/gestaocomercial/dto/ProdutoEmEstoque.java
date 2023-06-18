package gestaocomercial.dto;

import java.util.Date;

import gestaocomercial.model.Produto;

public class ProdutoEmEstoque {
	private Produto produto;
	private Date dataDeEntrada;
	private String canalDeVenda;
	private String metodoDePagamento;
	private Integer quantidade;
	private Float custoBase;
	private Float custoAdicional;
	private String obs;

	private Date dataDeSaida;

	public ProdutoEmEstoque (Produto produto) {
		this.produto = produto;
		this.dataDeEntrada = new Date();
		this.quantidade = 1;
	}

	public ProdutoEmEstoque() {}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(Date dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}

	public Date getDataDeSaida() {
		return dataDeSaida;
	}

	public void setDataDeSaida(Date dataDeSaida) {
		this.dataDeSaida = dataDeSaida;
	}

	public String getCanalDeVenda() {
		return canalDeVenda;
	}

	public void setCanalDeVenda(String canalDeVenda) {
		this.canalDeVenda = canalDeVenda;
	}

	public String getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(String metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Float getCustoBase() {
		return custoBase;
	}

	public void setCustoBase(Float custoBase) {
		this.custoBase = custoBase;
	}

	public Float getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(Float custoAdicional) {
		this.custoAdicional = custoAdicional;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
}
