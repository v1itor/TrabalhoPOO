package gestaocomercial.model;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;

public class CustoAdministrativo {
	int opcao = 0;
	private Float custoAtual = 0f;
	
	
	public void visualizarCustoAdministrativo() {
		JOptionPane.showConfirmDialog(null, "Custo administrativo atual: " + this.custoAtual + "\n"
				+ "" );
	}
	
	public void adicionarCustoAdministrativo(Float custo) {
		custoAtual = custoAtual + custo;
	}
}
