package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;

public class MenuPrincipal {

	BancoDeDados bancoDeDados = new BancoDeDados();

	public static void exibirMenuPrincipal() {
		BancoDeDados bancoDeDados = new BancoDeDados();
		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------- MENU -----------\n"
					+ "Insira a opção que deseja realizar:\n"
					+ "1 - Acessar menu de vendas\n"
					+ "2 - Acessar menu de compras\n"
					+ "3 - Acessar menu de estoque\n"
					+ "4 - Acessar menu de compradores"
					+ "5 - Emitir relatórios"
					+ "6 - Cálculo de custo administrativo"
					+ "7 - Sair"));

			switch(opcao) {
			case 1:
				MenuVendas.exibirMenuVendas(bancoDeDados);
				break;
			case 2:
				MenuCompras.exibirMenuCompras(bancoDeDados);
				break;
			case 3:
				MenuEstoque.exibirMenuEstoque(bancoDeDados);
				break;
			case 4:
				MenuComprador.exibirMenuCompradores(bancoDeDados);
				break;
			case 5:
				MenuRelatorios.exibirMenuRelatorios(bancoDeDados);
				break;
			case 6:
				MenuCustoAdministrativo.exibirMenuCustoAdministrativo(bancoDeDados);
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Goodbye ;)");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente");
				break;
			}

		} while(opcao != 6);
	}
}
