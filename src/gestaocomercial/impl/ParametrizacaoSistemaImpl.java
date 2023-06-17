package gestaocomercial.impl;

import java.util.List;

import gestaocomercial.model.ParametrizacaoSistema;

public class ParametrizacaoSistemaImpl {

	public static String getValorPelaChave (List<ParametrizacaoSistema> parametrizacoesSistema, String chave) {
		for (ParametrizacaoSistema parametrizacaoSistema : parametrizacoesSistema) {
			if (parametrizacaoSistema.getChave().equals(chave)) {
				return parametrizacaoSistema.getValor();
			}
		}
		return null;
	}
}
