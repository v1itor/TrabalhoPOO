package gestaocomercial.model;

public class ParametrizacaoSistema {
	private String chave;
	private String valor;
	
	public static String DIAS_IDEAIS_ESTOQUE = "diasIdeaisEstoque";
	
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
