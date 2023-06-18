package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.dto.ProdutoEmEstoque;
import gestaocomercial.model.Comprador;
import gestaocomercial.model.Pedido;

public class MenuRelatorios {
	public static void exibirMenuRelatorios(BancoDeDados bancoDeDados) {
		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------- CUSTO ADMINISTRATIVO -----------\n"
					+ "Insira a opção que deseja realizar:\n"
					+ "1 - Visualizar custo administrativo atual\n"
					+ "2 - Visualizar comprador que mais comprou \n"
					+ "3 - Visualizar produto com mais itens em estoque\n"
					+ "4 - Visualizar maior pedido já feito\n"
					+ "5 - Voltar"));

			switch(opcao) {
			case 1:
				bancoDeDados.getCustoAdministrativo().visualizarCustoAdministrativo(bancoDeDados);
				break;
			case 2:
				if (bancoDeDados.getListaDeCompradores().getListaDeCompradores().size() < 1) {
					JOptionPane.showMessageDialog(null, "Não há compradores cadastrados");
					MenuPrincipal.exibirMenuPrincipal(bancoDeDados);
				}
				Comprador compradorQueMaisComprou = bancoDeDados.getListaDeCompradores().getListaDeCompradores().get(0);
				for (Comprador comprador : bancoDeDados.getListaDeCompradores().getListaDeCompradores()) {
					if (comprador.getHistoricoDePedidos().size() > compradorQueMaisComprou.getHistoricoDePedidos().size()) {
						compradorQueMaisComprou = comprador;
					}
				}
				JOptionPane.showMessageDialog(null, "O comprador que mais comprou foi o " + compradorQueMaisComprou.getNome());
				break;
			case 3:
				if (bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().size() < 1) {
					JOptionPane.showMessageDialog(null, "Não há produtos em estoque");
					MenuPrincipal.exibirMenuPrincipal(bancoDeDados);
				}
				ProdutoEmEstoque produtoEmEstoqueMaisItens = bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().get(0);
				for (ProdutoEmEstoque produtoEmEstoque : bancoDeDados.getEstoque().getListaDeProdutosEmEstoque()) {
					if (produtoEmEstoque.getQuantidade() > produtoEmEstoqueMaisItens.getQuantidade()) {
						produtoEmEstoqueMaisItens = produtoEmEstoque;
					}
				}
				JOptionPane.showMessageDialog(null, "O produto com mais itens em estoque é " + produtoEmEstoqueMaisItens.getProduto().getNome());
				break;
			case 4:
				if (bancoDeDados.getHistoricoDePedidos().getListaDePedidos().size() < 1) {
					JOptionPane.showMessageDialog(null, "Não há pedidos realizados");
					MenuPrincipal.exibirMenuPrincipal(bancoDeDados);
				}
				Pedido pedidoComMaisItens = bancoDeDados.getHistoricoDePedidos().getListaDePedidos().get(0);
				for (Pedido pedido : bancoDeDados.getHistoricoDePedidos().getListaDePedidos()) {
					if (pedidoComMaisItens.getProdutosVendidos().size() < pedido.getProdutosVendidos().size()) {
						pedidoComMaisItens = pedido;
					}
				}
				JOptionPane.showMessageDialog(null, "O pedido com mais itens foi feito por " + pedidoComMaisItens.getComprador().getNome() + " e tem " + pedidoComMaisItens.getProdutosVendidos().size() + " itens.");
				break;
			case 5:
				MenuPrincipal.exibirMenuPrincipal(bancoDeDados);
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente");
				exibirMenuRelatorios(bancoDeDados);
				break;
			}

		} while(opcao != 3);
	}

}
