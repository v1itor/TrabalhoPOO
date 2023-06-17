package gestaocomercial.model;

public class ParametrizacaoSistema {
	private String chave;
	private String valor;
	
	public final static String DIAS_IDEAIS_ESTOQUE = "diasIdeaisEstoque";
	public final static String MARGEM_DE_LUCRO_IDEAL = "margemDeLucroIdeal";
	public final static String CUSTO_ADMINISTRATIVO_ESPERADO = "custoAdministrativoEsperado";
	
	
	ParametrizacaoSistema(String chave, String valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
