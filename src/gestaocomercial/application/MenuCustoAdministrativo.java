package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.model.CustoAdministrativo;

public class MenuCustoAdministrativo {
	public static void exibirMenuCustoAdministrativo(BancoDeDados bancoDeDados) {
		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------- CUSTO ADMINISTRATIVO -----------\n"
					+ "Insira a opção que deseja realizar:\n"
					+ "1 - Visualizar custo administrativo atual"
					+ "2 - Registrar novo custo"
					+ "3 - Voltar"));

			switch(opcao) {
			case 1:
				CustoAdministrativo.visualizarCustoAdministrativo();
				break;
			case 2:
				exibirMenuCompras();
				break;
			case 3:
				exibirMenuEstoque();
				break;
			case 4:
				exibirMenuCompradores();
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente");
				break;
			}

		} while(opcao != 4);
	}
}
