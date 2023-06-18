package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.model.list.ParametrizacoesDoSistema;

public class MenuCustoAdministrativo {
	public static void exibirMenuCustoAdministrativo(BancoDeDados bancoDeDados) {
		int opcao = 0;

		do {
			if (bancoDeDados.getParametrizacoesDoSistema().getListaDeParametrizacoes().get(ParametrizacoesDoSistema.DIAS_IDEAIS_ESTOQUE) == null) {
				bancoDeDados.getParametrizacoesDoSistema().getListaDeParametrizacoes().put(ParametrizacoesDoSistema.DIAS_IDEAIS_ESTOQUE, JOptionPane.showInputDialog("Antes, insira quantos dias seu produto pode ficar em estoque antes que seja vendido, idealmente."));
			}
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------- CUSTO ADMINISTRATIVO -----------\n"
					+ "Insira a opção que deseja realizar:\n"
					+ "1 - Visualizar custo administrativo atual\n"
					+ "2 - Adicionar custo ao \n"
					+ "3 - Voltar"));

			switch(opcao) {
			case 1:
				bancoDeDados.getCustoAdministrativo().visualizarCustoAdministrativo(bancoDeDados);
				break;
			case 2:
				Float custo = Float.valueOf(JOptionPane.showInputDialog("Insira o valor do novo custo:"));
				bancoDeDados.getCustoAdministrativo().adicionarCustoAdministrativo(custo);
				break;
			case 3:
				MenuPrincipal.exibirMenuPrincipal(bancoDeDados);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente");
				exibirMenuCustoAdministrativo(bancoDeDados);
				break;
			}

		} while(opcao != 3);
	}
}
