package gestaocomercial.dto;

import gestaocomercial.model.list.CompradoresAtuais;
import gestaocomercial.model.list.Estoque;
import gestaocomercial.model.list.HistoricoDePedidos;
import gestaocomercial.model.list.HistoricoDeVendas;
import gestaocomercial.model.list.KitsDisponiveis;
import gestaocomercial.model.list.ParametrizacoesDoSistema;

public class BancoDeDados {
	private CompradoresAtuais listaDeCompradores = new CompradoresAtuais();
	private Estoque estoque = new Estoque();
	private HistoricoDePedidos historicoDePedidos = new HistoricoDePedidos();
	private HistoricoDeVendas historicoDeVendas = new HistoricoDeVendas();
	private KitsDisponiveis kitsDisponiveis = new KitsDisponiveis();
	private ParametrizacoesDoSistema parametrizacoesDoSistema = new ParametrizacoesDoSistema();

	public CompradoresAtuais getListaDeCompradores() {
		return listaDeCompradores;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public HistoricoDePedidos getHistoricoDePedidos() {
		return historicoDePedidos;
	}

	public HistoricoDeVendas getHistoricoDeVendas() {
		return historicoDeVendas;
	}

	public KitsDisponiveis getKitsDisponiveis() {
		return kitsDisponiveis;
	}

	public ParametrizacoesDoSistema getParametrizacoesDoSistema() {
		return parametrizacoesDoSistema;
	}
}
