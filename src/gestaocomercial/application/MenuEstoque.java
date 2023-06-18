package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.dto.ProdutoEmEstoque;
import gestaocomercial.model.Produto;

public class MenuEstoque {
	public static void exibirMenuEstoque(BancoDeDados bancoDeDados) {
			int opcao = 0;
			do {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(""
						+ "----------- MENU ESTOQUE -----------\n"
						+ "Insira a opção que deseja realizar:\n"
						+ "1 - Visualizar produtos em estoque\n"
						+ "2 - Cadastrar novo produto\n"
						+ "3 - Adicionar nova unidade ao produto atual\n"
						+ "4 - Voltar\n"));

				switch(opcao) {
				case 1:
					JOptionPane.showMessageDialog(null, bancoDeDados.getEstoque().gerarListaDeEstoque());
					break;
				case 2:
					try {
						Produto produto = new Produto(JOptionPane.showInputDialog("Insira o nome do produto: "), Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do produto: ")), JOptionPane.showInputDialog("Insira o tipo do produto: "));
						bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().add(new ProdutoEmEstoque(produto));
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "O valor informado é inválido, retornando ao menu anterior...");
						exibirMenuEstoque(bancoDeDados);
					}
					break;
				case 3:
					Integer indexProduto = Integer.valueOf(JOptionPane.showInputDialog(null, "Insira o produto que deseja adicionar\n" + bancoDeDados.getEstoque().gerarListaDeEstoque()));
					Integer qtdProduto = Integer.valueOf(JOptionPane.showInputDialog(null, "Insira quantos produtos deseja adicionar:"));
					bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().get(indexProduto).setQuantidade(bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().get(indexProduto).getQuantidade() + qtdProduto);
				case 4:
					MenuPrincipal.exibirMenuPrincipal(bancoDeDados);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente\n");
					exibirMenuEstoque(bancoDeDados);
					break;
				}

			} while (opcao != 4);
		}
}