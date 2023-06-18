package gestaocomercial.dto;

import gestaocomercial.model.CustoAdministrativo;
import gestaocomercial.model.list.CompradoresAtuais;
import gestaocomercial.model.list.Estoque;
import gestaocomercial.model.list.HistoricoDePedidos;
import gestaocomercial.model.list.ParametrizacoesDoSistema;

//classe criada para transitar dados sem precisar passar muitos parâmetros para
// os menus, ela é o que seria equivalente a um banco de dados, com tabelas e
// etc...
public class BancoDeDados {
	private CompradoresAtuais listaDeCompradores = new CompradoresAtuais();
	private Estoque estoque = new Estoque();
	private HistoricoDePedidos historicoDePedidos = new HistoricoDePedidos();
	private ParametrizacoesDoSistema parametrizacoesDoSistema = new ParametrizacoesDoSistema();
	private CustoAdministrativo custoAdministrativo = new CustoAdministrativo();

	public CustoAdministrativo getCustoAdministrativo() {
		return custoAdministrativo;
	}

	public CompradoresAtuais getListaDeCompradores() {
		return listaDeCompradores;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public HistoricoDePedidos getHistoricoDePedidos() {
		return historicoDePedidos;
	}

	public ParametrizacoesDoSistema getParametrizacoesDoSistema() {
		return parametrizacoesDoSistema;
	}
}
