package gestaocomercial.application;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.dto.ProdutoVendido;
import gestaocomercial.model.Comprador;
import gestaocomercial.model.Endereco;
import gestaocomercial.model.Pedido;
import gestaocomercial.model.Produto;

public class MenuPrincipal {

	BancoDeDados bancoDeDados = new BancoDeDados();

	public static void exibirMenuPrincipal() {
		BancoDeDados bancoDeDados = new BancoDeDados();

		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "----------- MENU -----------\n"
					+ "Insira a opção que deseja realizar:\n"
					+ "1 - Acessar menu de vendas\n"
					+ "2 - Acessar menu de compradores\n"
					+ "3 - Acessar menu de estoque\n"
					+ "4 - Emitir relatórios"
					+ "5 - Cálculo de custo administrativo"
					+ "6 - Sair"));

			switch(opcao) {
			case 1:
				MenuVendas.exibirMenuVendas(bancoDeDados);
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
				JOptionPane.showMessageDialog(null, "Goodbye ;)");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente");
				break;
			}

		} while(opcao != 6);
	}

	private void inicializaValores(BancoDeDados bancoDeDados) {
		bancoDeDados.getCustoAdministrativo().adicionarCustoAdministrativo(10f);

		Produto rtx4060 = new Produto("RTX4060,", 2400f, "Placa de vídeo");
		Produto rtx3060 = new Produto("RTX3060,", 3100f, "Placa de vídeo");
		Produto rtx2070 = new Produto("RTX2070,", 2500f, "Placa de vídeo");

		bancoDeDados.getEstoque().getListaDeprodutos().add(rtx4060);
		bancoDeDados.getEstoque().getListaDeprodutos().add(rtx3060);
		bancoDeDados.getEstoque().getListaDeprodutos().add(new Produto("RTX2070,", 2500f, "Placa de vídeo"));
		bancoDeDados.getEstoque().getListaDeprodutos().add(new Produto("I7-7700K,", 1200f, "Processador"));

		Comprador comprador = new Comprador("Vitor", "vitor@gmail.com", new Endereco("Rua Joao Meneghetti", "Joinville", "Santa Catarina", "8925105" ), "47991999999", "12345678901", "Comprador chatao");
		bancoDeDados.getListaDeCompradores().getListaDeCompradores().add(comprador);

		bancoDeDados.getHistoricoDePedidos().addPedido(new Pedido(comprador, new ProdutoVendido(rtx4060)));
		bancoDeDados.getHistoricoDePedidos().addPedido(new Pedido(comprador, new ProdutoVendido(rtx3060)));
		bancoDeDados.getHistoricoDePedidos().addPedido(new Pedido(comprador, new ProdutoVendido(rtx2070)));
	}
}
