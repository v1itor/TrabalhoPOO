package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.model.Comprador;

public class MenuComprador {
	public static void exibirMenuCompradores(BancoDeDados bancoDeDados) {
		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------- MENU COMPRADOR -----------\n"
					+ "Insira a opção que deseja realizar:\n"
					+ "1 - Cadastrar novo comprador\n"
					+ "2 - Consultar um comprador\n"
					+ "3 - Alterar cadastro\n"
					+ "4 - Voltar\n"));

			switch(opcao) {
			case 1:
				Comprador comprador = new Comprador();
				comprador.setNome(JOptionPane.showInputDialog("Insira o Nome do comprador: "));
				comprador.setEmail(JOptionPane.showInputDialog("Insira o Email do comprador:"));
				comprador.setTelefone(JOptionPane.showInputDialog("Insira o Telefone do comprador:"));
				comprador.setCpfCnpj(JOptionPane.showInputDialog("Insira o CPF/CNPJ do comprador:"));
				comprador.setObs(JOptionPane.showInputDialog("Insira uma Observação sobre o comprador:"));
				
				
				bancoDeDados.getListaDeCompradores().getListaDeCompradores().add(comprador);
				break;
			case 2:
				exibirComprador();
				break;
			case 3:
				alterarComprador();
				break;
			case 4:
				MenuPrincipal.exibirMenuPrincipal();
				JOptionPane.showMessageDialog(null, "Voltando para o menu principal...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente\n");
				exibirMenuPrincipal();
			}

		} while(opcao != 4);
	}
}
