package gestaocomercial.main;

import java.util.List;

import javax.swing.JOptionPane;

import gestaocomercial.model.ParametrizacaoSistema;

public class Main {
	private static String TEXTO_MENU_INICIAL = "Insira a opção desejada: \n"
			+ "1 - Cadastrar produto em estoque\n"
			+ "2 - Adicionar produto em estoque\n"
			+ "3 - Consultar produtos em estoque"
			+ "4 - Adicionar pedido\n"
			+ "4 - Consultar pedidos\n"
			+ "5 - Cadastrar venda\n"
			+ "6 - Consultar vendas\n"
			+ "7 - Cadastrar Kit\n"
			+ "8 - Consultar Kits\n"
			+ "9 - Cadastrar Comprador\n"
			+ "10 - Consultar compradores\n";
	
	
	public static void main(String[] args) {
		List<ParametrizacaoSistema> parametrizacoes;
		Integer opcaoSelecionada;
		
		
		do {
			try {
				opcaoSelecionada = Integer.valueOf(JOptionPane.showInputDialog(null, "Insira a opção desejada: "));
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "A opção selecionada é inválida, tente novamente.");
				continue;
			}
			switch (opcaoSelecionada) {
			case value: {
				
				yield type;
			}
			default:
				JOptionPane.showMessageDialog(null, "A opção selecionada é inválida, tente novamente.");
				continue;
			}
		} while (true);
	}
}
