package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;

public class MenuEstoque {
	public static void exibirMenuEstoque(BancoDeDados bancoDeDados) {
		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("" + "----------- MENU ESTOQUE -----------\n" + "Insira a opção que deseja realizar:\n" + "1 - Cadastrar novo produto\n" + "2 - Adicionar novo produto\n" + "3 - Visualizar produtos\n" + "6 - Sair"));

			switch (opcao) {
			case 1:

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

		} while (opcao != 6);
	}

}
