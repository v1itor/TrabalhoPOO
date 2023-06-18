package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.dto.ProdutoEmEstoque;
import gestaocomercial.dto.ProdutoVendido;
import gestaocomercial.model.Comprador;
import gestaocomercial.model.Endereco;
import gestaocomercial.model.Pedido;
import gestaocomercial.model.Produto;
import gestaocomercial.model.list.ParametrizacoesDoSistema;

public class MenuPrincipal {

	public static void exibirMenuPrincipal(BancoDeDados bancoDeDados) {
		if (bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().size() < 1) { // caso não tenha dados em "banco"...
			inicializaValores(bancoDeDados);
		}
		int opcao = 0;

		do {
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(""
						+ "----------- MENU -----------\n"
						+ "Insira a opção que deseja realizar:\n"
						+ "1 - Acessar menu de pedidos\n"
						+ "2 - Acessar menu de compradores\n"
						+ "3 - Acessar menu de estoque\n"
						+ "4 - Acessar menu de relatórios\n"
						+ "5 - Cálculo de custo administrativo\n"
						+ "6 - Sair"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente");
				MenuPrincipal.exibirMenuPrincipal(bancoDeDados);
				break;
			}
			switch(opcao) {
			case 1:
				MenuPedido.exibirMenuPedido(bancoDeDados);
				break;
			case 2:
				MenuComprador.exibirMenuCompradores(bancoDeDados);
				break;
			case 3:
				MenuEstoque.exibirMenuEstoque(bancoDeDados);
				break;
			case 4:
				MenuRelatorios.exibirMenuRelatorios(bancoDeDados);
				break;
			case 5:
				MenuCustoAdministrativo.exibirMenuCustoAdministrativo(bancoDeDados);
				break;
			case 6:
				return;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente");
				break;
			}

		} while(opcao != 6);
	}

	private static void inicializaValores(BancoDeDados bancoDeDados) {
		bancoDeDados.getCustoAdministrativo().adicionarCustoAdministrativo(10f);

		Produto rtx4060 = new Produto("RTX4060,", 2400f, "Placa de vídeo");
		Produto rtx3060 = new Produto("RTX3060,", 3100f, "Placa de vídeo");
		Produto rtx2070 = new Produto("RTX2070,", 2500f, "Placa de vídeo");

		bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().add(new ProdutoEmEstoque(rtx4060));
		bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().add(new ProdutoEmEstoque(rtx3060));
		bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().add(new ProdutoEmEstoque(new Produto("RTX2070,", 2500f, "Placa de vídeo")));
		bancoDeDados.getEstoque().getListaDeProdutosEmEstoque().add(new ProdutoEmEstoque(new Produto("I7-7700K,", 1200f, "Processador")));

		Comprador comprador = new Comprador("Vitor", "vitor@gmail.com", new Endereco("Rua Joao Meneghetti", "Joinville", "Santa Catarina", "8925105" ), "47991999999", "12345678901", "Comprador chatao");
		bancoDeDados.getListaDeCompradores().getListaDeCompradores().add(comprador);

		bancoDeDados.getHistoricoDePedidos().getListaDePedidos().add(new Pedido(comprador, new ProdutoVendido(rtx4060, 2400f)));
		bancoDeDados.getHistoricoDePedidos().getListaDePedidos().add(new Pedido(comprador, new ProdutoVendido(rtx3060, 3500f)));
		bancoDeDados.getHistoricoDePedidos().getListaDePedidos().add(new Pedido(comprador, new ProdutoVendido(rtx2070, 2800f)));

		bancoDeDados.getParametrizacoesDoSistema().getListaDeParametrizacoes().put(ParametrizacoesDoSistema.DIAS_IDEAIS_ESTOQUE, "5");
	}
}
