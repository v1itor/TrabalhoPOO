package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.model.list.ParametrizacoesDoSistema;

public class MenuParametrizacaoDoSistema {
	public static void exibirMenuParametrizacao(BancoDeDados bancoDeDados) {


		int opcao = 0;
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------- MENU PARAMETRIZAÇÃO -----------\n"
					+ "Insira a opções que deseja realizar:\n"
					+ "1 - Cadastrar ou sobrescrever uma parametrização\n" + "2 - Voltar\n"));

			switch(opcao) {
			case 1:
				Integer indexChave = Integer.getInteger(JOptionPane.showInputDialog("Insira a opção disponível para a parametrização: \n" + ParametrizacoesDoSistema.listarSugestoes()));
				bancoDeDados.getParametrizacoesDoSistema().getListaDeParametrizacoes().put(ParametrizacoesDoSistema.sugestoes.get(indexChave), JOptionPane.showInputDialog("Insira o valor da parametrização: "));
				JOptionPane.showMessageDialog(null, "Parametrização cadastrada com sucesso!");
				break;

			case 2:
				MenuPrincipal.exibirMenuPrincipal(bancoDeDados);
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente\n");
				exibirMenuParametrizacao(bancoDeDados);
				break;

		}
		}
	}
