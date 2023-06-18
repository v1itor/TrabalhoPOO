package gestaocomercial.model;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.model.list.ParametrizacoesDoSistema;

public class CustoAdministrativo {
	private Float custoAtual = 0f;

	public void visualizarCustoAdministrativo(BancoDeDados bancoDeDados) {
		if (bancoDeDados.getParametrizacoesDoSistema().getListaDeParametrizacoes().get(ParametrizacoesDoSistema.CUSTO_ADMINISTRATIVO_ESPERADO) == null) {
			bancoDeDados.getParametrizacoesDoSistema().getListaDeParametrizacoes().put(ParametrizacoesDoSistema.CUSTO_ADMINISTRATIVO_ESPERADO, JOptionPane.showInputDialog("Antes, insira o custo administrativo esperado:"));
		}
		Float custoAdministrativoEsperado = Float.valueOf(bancoDeDados.getParametrizacoesDoSistema().getListaDeParametrizacoes().get(ParametrizacoesDoSistema.CUSTO_ADMINISTRATIVO_ESPERADO));
		Integer quantidadeVendas = bancoDeDados.getHistoricoDePedidos().getListaDePedidos().size();

		JOptionPane.showMessageDialog(null, ("Custo administrativo esperado: " + custoAdministrativoEsperado
				+ "\nO atual custo administrativo total é R$" + this.custoAtual
				+ "\nCom " + quantidadeVendas + " pedidos, o custo administrativo unitário é R$" + (this.custoAtual / quantidadeVendas)
				+ "\nEste custo " + (this.custoAtual < custoAdministrativoEsperado ? "é considerado baixo, com saldo positivo de R$"
						+ (custoAdministrativoEsperado - this.custoAtual) + " (" + String.format("%.2f", (1 - (this.custoAtual / custoAdministrativoEsperado)) *100) + "%)" : "é considerado alto, com saldo negativo de R$"
								+ (Math.abs(this.custoAtual - custoAdministrativoEsperado)) + " (" + String.format("%.2f", (1 - (custoAdministrativoEsperado / this.custoAtual)) *100) + "%)")));
	}

	public void adicionarCustoAdministrativo(Float custo) {
		this.custoAtual = this.custoAtual + custo;
	}
}
