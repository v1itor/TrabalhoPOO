package gestaocomercial.application;

import javax.swing.JOptionPane;

public class MenuCustoAdministrativo {
	public static void exibirMenuCustoAdministrativo() {
		int opcao = 0;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------- CUSTO ADMINISTRATIVO -----------\n"
					+ "Insira a opção que deseja realizar:\n"
					+ "1 - Visualizar custo administrativo atual"
					+ "2 - Registrar novo custo"
					+ "3 - Remover registro"
					+ "4 - Voltar"));
			
			switch(opcao) {
			case 1:
				exibirMenuVendas();
				break;
			case 2:
				exibirMenuCompras();
				break;
			case 3:
				exibirMenuEstoque();
				break;
			case 4:
				exibirMenuCompradores();
				break;
			case 5:
				exibirMenuRelatorios();
				break;
			case 6:
				exibirMenuCustoAdministrativo();
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
