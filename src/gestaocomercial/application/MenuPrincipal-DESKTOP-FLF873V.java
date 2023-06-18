package gestaocomercial.application;

import javax.swing.JOptionPane;

public class MenuPrincipal {
	public static void exibirMenuPrincipal() {
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
					+ "6 - Sair"));
			
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
				JOptionPane.showMessageDialog(null, "Goodbye ;)");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente");
				break;
			}
			
		} while(opcao != 6);
	}
}
