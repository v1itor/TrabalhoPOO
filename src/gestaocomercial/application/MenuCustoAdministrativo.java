package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.model.ParametrizacaoSistema;

public class MenuCustoAdministrativo {
	public static void exibirMenuCustoAdministrativo(BancoDeDados bancoDeDados) {
		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------- CUSTO ADMINISTRATIVO -----------\n"
					+ "Insira a opção que deseja realizar:\n"
					+ "1 - Visualizar custo administrativo atual\n"
					+ "2 - Registrar novo custo\n"
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
				MenuPrincipal.exibirMenuPrincipal();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente");
				break;
			}

		} while(opcao != 3);
	}
}
