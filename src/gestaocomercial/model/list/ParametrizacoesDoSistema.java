package gestaocomercial.model.list;

import java.util.ArrayList;
import java.util.List;

import gestaocomercial.model.ParametrizacaoSistema;

public class ParametrizacoesDoSistema {
	private List<ParametrizacaoSistema> list = new ArrayList<ParametrizacaoSistema>();

	public List<ParametrizacaoSistema> getList() {
		return list;
	}

	public void setList(List<ParametrizacaoSistema> list) {
		this.list = list;
	}

}
