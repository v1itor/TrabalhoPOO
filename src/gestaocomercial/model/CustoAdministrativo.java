package gestaocomercial.model;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;

public class CustoAdministrativo {
	int opcao = 0;
	
	private Float custoAtual = 0f;

	public void visualizarCustoAdministrativo(BancoDeDados bancoDeDados) {
		Float custoAdministrativoEsperado = Float.valueOf(bancoDeDados.getParametrizacoesDoSistema().getValorPelaChave(ParametrizacaoSistema.CUSTO_ADMINISTRATIVO_ESPERADO));
 		Integer quantidadeVendas = bancoDeDados.getHistoricoDeVendas().getListaDeVendas().size();
		
		JOptionPane.showConfirmDialog(null, ("Custo administrativo esperado: " + custoAdministrativoEsperado
				+ "\nO atual custo administrativo total é R$" + this.custoAtual
				+ "\nCom " + quantidadeVendas + " vendas, o custo administrativo unitário é R$" + (this.custoAtual / quantidadeVendas)
				+ "\nEste custo " + (this.custoAtual < custoAdministrativoEsperado ? "é considerado baixo, com saldo positivo de R$"
						+ (custoAdministrativoEsperado - this.custoAtual) + " (" + String.format("%.2f", (1 - (this.custoAtual / custoAdministrativoEsperado)) *100) + "%)" : "é considerado alto, com saldo negativo de R$"
								+ (Math.abs(this.custoAtual - custoAdministrativoEsperado)) + " (" + String.format("%.2f", (1 - (custoAdministrativoEsperado / this.custoAtual)) *100) + "%)")));
	}
	
	public void adicionarCustoAdministrativo(Float custo) {
		this.custoAtual = this.custoAtual + custo;
	}
}
