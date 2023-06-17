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
	private HistoricoDeVendas historicoDeVendas;
	private KitsDisponiveis kitsDisponiveis;
	private ParametrizacoesDoSistema parametrizacoesDoSistema;
}
