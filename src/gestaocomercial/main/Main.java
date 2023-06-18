package gestaocomercial.main;

import javax.swing.JOptionPane;

import gestaocomercial.application.MenuPrincipal;
import gestaocomercial.dto.BancoDeDados;

public class Main {
	public static void main(String[] args) {
		BancoDeDados bancoDeDados = new BancoDeDados();
		MenuPrincipal.exibirMenuPrincipal(bancoDeDados);
		JOptionPane.getRootFrame().dispose(); // fecha todos os JOptionPane abertos
	}
}
