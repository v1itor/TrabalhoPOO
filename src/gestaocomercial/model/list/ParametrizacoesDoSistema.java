package gestaocomercial.model.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ParametrizacoesDoSistema {
	// Opções disponíveis
	public final static String DIAS_IDEAIS_ESTOQUE = "diasIdeaisEstoque";
	public final static String MARGEM_DE_LUCRO_IDEAL = "margemDeLucroIdeal";
	public final static String CUSTO_ADMINISTRATIVO_ESPERADO = "custoAdministrativoEsperado";

	private HashMap<String, String> listaDeParametrizacoes = new HashMap<String, String>();
	public final static List<String> sugestoes = new ArrayList<String>(Arrays.asList(DIAS_IDEAIS_ESTOQUE, MARGEM_DE_LUCRO_IDEAL, CUSTO_ADMINISTRATIVO_ESPERADO));

	public static String listarSugestoes() {
		String mensagem = "Aqui estão as opções disponíveis: \n";
		for (int i = 0; i < ParametrizacoesDoSistema.sugestoes.size(); i++) {
			mensagem += "Sugestão " + i + ": " + ParametrizacoesDoSistema.sugestoes.get(i) + "\n";
		}
		return mensagem;
	}

	public HashMap<String, String> getListaDeParametrizacoes() {
		return listaDeParametrizacoes;
	}

	public void setListaDeParametrizacoes(HashMap<String, String> listaDeParametrizacoes) {
		this.listaDeParametrizacoes = listaDeParametrizacoes;
	}
}
