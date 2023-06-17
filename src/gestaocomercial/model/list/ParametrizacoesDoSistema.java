package gestaocomercial.model.list;

import java.util.List;

import gestaocomercial.model.ParametrizacaoSistema;

public class ParametrizacoesDoSistema {
   private List<ParametrizacaoSistema> list;

	public String getValorPelaChave (String chave) {
		for (ParametrizacaoSistema parametrizacaoSistema : list) {
			if (parametrizacaoSistema.getChave().equals(chave)) {
				return parametrizacaoSistema.getValor();
			}
		}
		return null;
	}
}
