package gestaocomercial.application;

import javax.swing.JOptionPane;

public class MenuVendas {
	public static void exibirMenuComprador() {
	int opcao = 0;
	
	do {
		opcao = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "----------- MENU COMPRADOR -----------\n"
				+ "Insira a opção que deseja realizar:\n"
				+ "1 - Cadastrar novo comprador\n"
				+ "2 - \n"
				+ "6 - Sair"));
		
		switch(opcao) {
		case 1:
			Comprador(endereci nomne );
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
