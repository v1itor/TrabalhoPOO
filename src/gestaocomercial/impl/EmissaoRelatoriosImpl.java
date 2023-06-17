package gestaocomercial.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import gestaocomercial.model.ParametrizacaoSistema;

import javax.swing.JOptionPane;

import gestaocomercial.dto.ProdutoEmEstoque;

public class EmissaoRelatoriosImpl {
	
	private List<ParametrizacaoSistema> parametrizacaoSistema;
	
	public EmissaoRelatoriosImpl(List<ParametrizacaoSistema> parametrizacaoSistema) {
		this.parametrizacaoSistema = parametrizacaoSistema;
	}
	
	public void diasProdutosEmEstoque(List<ProdutoEmEstoque> estoque) {
		Integer diasIdeais = Integer.valueOf(ParametrizacaoSistemaImpl.getValorPelaChave(this.parametrizacaoSistema, ParametrizacaoSistema.DIAS_IDEAIS_ESTOQUE));
		String textoASerExibido = "";
		
		for (ProdutoEmEstoque produto : estoque) {
			if (produto.getDataDeEntrada() != null) {
				textoASerExibido += "O produto "+(produto.getProduto().getNome())+" não tem data de entrada cadastrada.";
				textoASerExibido += '\n';
				continue;
			}
			Long diferencaEntreDatas = produto.getDataDeEntrada().getTime() - new Date().getTime();
			diferencaEntreDatas = TimeUnit.DAYS.convert(diferencaEntreDatas, TimeUnit.DAYS);

			if (diferencaEntreDatas > diasIdeais) {
				textoASerExibido += "O produto " + (produto.getProduto().getNome()) +
				" está a " +(diasIdeais - diferencaEntreDatas) + " dias acima do ideal.";
				textoASerExibido += '\n';
			}
		}
		JOptionPane.showMessageDialog(null, textoASerExibido);
	}
	
	public void 
}
