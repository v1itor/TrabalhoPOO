package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.model.Comprador;
import gestaocomercial.model.Endereco;


public class MenuComprador {
	public static void exibirMenuCompradores(BancoDeDados bancoDeDados) {
		int opcao = 0;


			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------- MENU COMPRADOR -----------\n"
					+ "Insira a opções que deseja realizar:\n"
					+ "1 - Cadastrar novo comprador\n"
					+ "2 - Consultar um comprador\n"
					+ "3 - Voltar\n"));

			switch(opcao) {
			case 1:
				Comprador comprador = new Comprador();
				comprador.setNome(JOptionPane.showInputDialog("Insira o Nome do comprador: "));
				comprador.setEmail(JOptionPane.showInputDialog("Insira o Email do comprador:"));
				comprador.setTelefone(JOptionPane.showInputDialog("Insira o Telefone do comprador:"));
				comprador.setCpfCnpj(JOptionPane.showInputDialog("Insira o CPF/CNPJ do comprador:"));
				comprador.setObs(JOptionPane.showInputDialog("Insira uma Observação sobre o comprador:"));

				if (JOptionPane.showConfirmDialog(null, "Você deseja cadastrar o endereço do comprador?", "Comprador", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					Endereco endereco = new Endereco();
					endereco.setRua(JOptionPane.showInputDialog("Insira a Rua do comprador:"));
					endereco.setCodigoPostal(JOptionPane.showInputDialog("Insira o Código Postal do comprador:"));
					endereco.setCidade(JOptionPane.showInputDialog("Insira a cidade do comprador:"));
					endereco.setEstado(JOptionPane.showInputDialog("Insira o Estado do comprador:"));
					comprador.setEndereco(endereco);
				}

				bancoDeDados.getListaDeCompradores().getListaDeCompradores().add(comprador);
				break;

			case 2:
				JOptionPane.showMessageDialog(null, bancoDeDados.getListaDeCompradores().gerarListaDeCompradores());
				break;
			case 3:
				MenuPrincipal.exibirMenuPrincipal(bancoDeDados);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente\n");
				MenuComprador.exibirMenuCompradores(bancoDeDados);
				break;
			}
	}
}
