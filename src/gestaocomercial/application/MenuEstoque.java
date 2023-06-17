package gestaocomercial.application;

import java.util.Date;

import javax.swing.JOptionPane;

import gestaocomercial.dto.BancoDeDados;
import gestaocomercial.dto.ProdutoEmEstoque;
import gestaocomercial.model.Comprador;
import gestaocomercial.model.Endereco;
import gestaocomercial.model.list.Estoque;

public class MenuEstoque {
	public static void exibirMenuEstoque(BancoDeDados bancoDeDados) {
			int opcao = 0;

			do {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(""
						+ "----------- MENU ESTOQUE -----------\n"
						+ "Insira a opção que deseja realizar:\n"
						+ "1 - Visualizar produtos em estoque\n"
						+ "2 - Consultar compra específica\n"
						+ "3 - Cadastrar produto\n"
						+ "4 - Voltar\n"));

				switch(opcao) {
				case 1:
					
					ProdutoEmEstoque.
					
					comprador.setNome(JOptionPane.showInputDialog("Insira o Nome do comprador: "));
					comprador.setEmail(JOptionPane.showInputDialog("Insira o Email do comprador:"));
					comprador.setTelefone(JOptionPane.showInputDialog("Insira o Telefone do comprador:"));
					comprador.setCpfCnpj(JOptionPane.showInputDialog("Insira o CPF/CNPJ do comprador:"));
					comprador.setObs(JOptionPane.showInputDialog("Insira uma Observação sobre o comprador:"));
					comprador.setDataCriacao(new Date());
					
					Endereco endereco = new Endereco();
					endereco.setRua(JOptionPane.showInputDialog("Insira a Rua do comprador:"));
					endereco.setCodigoPostal(JOptionPane.showInputDialog("Insira o Código Postal do comprador:"));
					endereco.setEstado(JOptionPane.showInputDialog("Insira o Estado do comprador:"));
					
					bancoDeDados.getListaDeCompradores().getListaDeCompradores().add(comprador);
					comprador.setEndereco(endereco); 
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, bancoDeDados.getListaDeCompradores().mostrarListaDeCompradores());
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Função não disponivel no momento");
					// TODO = alterarComprador();
					break;
				case 4:
					MenuPrincipal.exibirMenuPrincipal();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida inserida, tente novamente\n");
					MenuPrincipal.exibirMenuPrincipal();
					break;
				}

			} while(opcao != 4);
		}