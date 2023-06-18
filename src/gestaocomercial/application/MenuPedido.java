package gestaocomercial.application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.dto.ProdutoEmEstoque;
import gestaocomercial.dto.ProdutoVendido;
import gestaocomercial.enumeration.CanalDeVenda;
import gestaocomercial.enumeration.MetodoDePagamento;
import gestaocomercial.model.Comprador;
import gestaocomercial.model.Pedido;
import gestaocomercial.model.list.ParametrizacoesDoSistema;

public class MenuPedido {

	public static void exibirMenuPedido(BancoDeDados bancoDeDados) {
		int opcao = 0;
		opcao = Integer.parseInt(JOptionPane.showInputDialog("" + "----------- MENU PEDIDO -----------\n" + "Insira a opção que deseja realizar:\n" + "1 - Cadastrar novo pedido\n" + "2 - Visualizar pedidos realizados\n" + "4 - Voltar\n"));

		switch (opcao) {
		case 1:
			try {
				Comprador comprador = null;
				if (JOptionPane.showConfirmDialog(null, "Você deseja cadastrar um novo comprador?", "Comprador", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					comprador = new Comprador();
					comprador.setNome(JOptionPane.showInputDialog("Insira o nome do novo comprador:"));
					comprador.setEmail(JOptionPane.showInputDialog("Insira o email do novo comprador:"));
					comprador.setTelefone(JOptionPane.showInputDialog("Insira o telefone do novo comprador:"));
					comprador.setCpfCnpj(JOptionPane.showInputDialog("Insira o cpf do novo comprador:"));
					comprador.setObs(JOptionPane.showInputDialog("Insira uma onservação relacionada ao novo comprador:"));
				} else {
					Integer indexComprador = Integer.valueOf(JOptionPane.showInputDialog("Insira o comprador que deseja atribuir a compra: " + bancoDeDados.getListaDeCompradores().gerarListaDeCompradores() + "\n\n-1 - Não quero cadastrar um comprador."));
					if (indexComprador != -1) {
						comprador = bancoDeDados.getListaDeCompradores().getListaDeCompradores().get(indexComprador);
					}
				}

				Integer qtdProduto = Integer.valueOf(JOptionPane.showInputDialog(null, "Você deseja atribuir quantos produtos à esse pedido?"));
				while (qtdProduto > bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().size()) {
					JOptionPane.showMessageDialog(null, "Infelizmente só temos " + bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().size() + " produtos em estoque, tente novamente...");
					qtdProduto = Integer.valueOf(JOptionPane.showInputDialog(null, "Você deseja atribuir quantos produtos à esse pedido?"));
				}
				List<ProdutoVendido> listaDeProdutos = new ArrayList<ProdutoVendido>();
				Float lucro = 0f;
				Float lucroIdeal = 0f;
				if (bancoDeDados.getParametrizacoesDoSistema().getListaDeParametrizacoes().get(ParametrizacoesDoSistema.MARGEM_DE_LUCRO_IDEAL) == null) {
					bancoDeDados.getParametrizacoesDoSistema().getListaDeParametrizacoes().put(ParametrizacoesDoSistema.MARGEM_DE_LUCRO_IDEAL, JOptionPane.showInputDialog("Antes, insira a % de lucro ideal").replaceAll(",", "."));
				}
				Float porcentagemLucroIdeal = Float.valueOf(bancoDeDados.getParametrizacoesDoSistema().getListaDeParametrizacoes().get(ParametrizacoesDoSistema.MARGEM_DE_LUCRO_IDEAL)) / 100 + 1;
				for (int i = 0; i < qtdProduto; i++) {
					ProdutoEmEstoque produtoASerAdicionado = bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().get(Integer.valueOf(JOptionPane.showInputDialog("Insira o produto que deseja ser adicionado: " + bancoDeDados.getEstoque().gerarListaDeEstoque())));
					Float valorDeVenda = Float.valueOf(JOptionPane.showInputDialog("Por qual valor você vendeu o produto?").replaceAll(",", "."));
					lucro += valorDeVenda - produtoASerAdicionado.getProduto().getValorAtual();
					lucroIdeal += valorDeVenda * porcentagemLucroIdeal;

					produtoASerAdicionado.setQuantidade(produtoASerAdicionado.getQuantidade() - 1);
					listaDeProdutos.add(new ProdutoVendido(produtoASerAdicionado.getProduto(), valorDeVenda));
				}

				CanalDeVenda canalDeVenda = (CanalDeVenda.values()[Integer.valueOf(JOptionPane.showInputDialog("Insira qual o canal da venda feita:\n" + "1 - Mercado Livre\n" + "2 - OLX\n" + "3 - MarketPlace\n" + "4 - Shopee\n" + "5 - Pessoalmente")) - 1]);

				MetodoDePagamento metodoDePagamento = (MetodoDePagamento.values()[Integer.valueOf(JOptionPane.showInputDialog("Insira qual o método de pagamento realizado na venda:\n" + "1 - PIX\n" + "2 - Débito\n" + "3 - Crédito\n" + "4 - Shopee\n" + "5 - Outros")) - 1]);

				Pedido pedidoRealizado = new Pedido(listaDeProdutos, comprador, canalDeVenda, metodoDePagamento);
				bancoDeDados.getHistoricoDePedidos().getListaDePedidos().add(pedidoRealizado);
				if (comprador != null) {
					comprador.getHistoricoDePedidos().add(pedidoRealizado);
				}
				JOptionPane.showMessageDialog(null, "O lucro ideal nesse pedido é " + lucroIdeal + " e o lucro real desse pedido foi " + lucro);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "O valor informado é inválido, retornando ao menu anterior...");
				exibirMenuPedido(bancoDeDados);
			}
			break;

		case 2:
			JOptionPane.showMessageDialog(null, bancoDeDados.getHistoricoDePedidos().gerarHistoricoDePedidos());
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Função não disponivel no momento");
			// TODO = alterarComprador();
			break;
		case 4:
			MenuPrincipal.exibirMenuPrincipal(bancoDeDados);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente\n");
			exibirMenuPedido(bancoDeDados);
			break;
		}

	}
}
