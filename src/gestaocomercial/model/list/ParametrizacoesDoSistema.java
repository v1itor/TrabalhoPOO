package gestaocomercial.model.list;

import java.util.ArrayList;
import java.util.List;

import gestaocomercial.model.ParametrizacaoSistema;

public class ParametrizacoesDoSistema {
	private List<ParametrizacaoSistema> listaDeParametrizacoes = new ArrayList<ParametrizacaoSistema>();

	public List<ParametrizacaoSistema> getListaDeParametrizacoes() {
		return listaDeParametrizacoes;
	}

	public void setListaDeParametrizacoes(List<ParametrizacaoSistema> listaDeParametrizacoes) {
		this.listaDeParametrizacoes = listaDeParametrizacoes;
	}

	public String getValorPelaChave (String chave) {
		for (ParametrizacaoSistema parametrizacaoSistema : list) {
			if (parametrizacaoSistema.getChave().equals(chave)) {
				return parametrizacaoSistema.getValor();
			}
		}
		return null;
	}
}
