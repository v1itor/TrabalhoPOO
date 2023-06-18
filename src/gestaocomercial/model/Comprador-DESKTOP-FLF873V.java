package gestaocomercial.model;

import java.util.Date;
import java.util.List;

public class Comprador {
	private String nome;
	private String endereco;
	private Date dataCriacao;
	private List<Pedido> historicoDePedidos;

	public Comprador(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.dataCriacao = new Date();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public List<Pedido> getHistoricoDePedidos() {
		return historicoDePedidos;
	}
	public void setHistoricoDePedidos(List<Pedido> historicoDePedidos) {
		this.historicoDePedidos = historicoDePedidos;
	}
}
