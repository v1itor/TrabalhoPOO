package gestaocomercial.dto;

import java.util.Date;

import gestaocomercial.model.Produto;

public class ProdutoEmEstoque {
	Produto produto;
	Date dataDeEntrada;
	Date dataDeSaida;
	
	public ProdutoEmEstoque (Produto produto) {
		this.produto = produto;
		this.dataDeEntrada = new Date();
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
}
