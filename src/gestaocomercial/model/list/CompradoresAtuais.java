package gestaocomercial.model.list;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import gestaocomercial.model.Comprador;

public class CompradoresAtuais {
	List<Comprador> listaDeCompradores = new ArrayList<Comprador>();

	public List<Comprador> getListaDeCompradores() {
		return listaDeCompradores;
	}

	public void setListaDeCompradores(List<Comprador> listaDeCompradores) {
		this.listaDeCompradores = listaDeCompradores;
	}

	public String gerarListaDeCompradores() {
		String mensagem = "Lista de Compradore:\n\n";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		for (Integer index = 0; index < listaDeCompradores.size(); index++) {
			Comprador comprador = listaDeCompradores.get(index);
			mensagem += index + "º Comprador:\n";
			mensagem += comprador.getNome() != null ? "Nome da pessoa: " + comprador.getNome() + "\n" : "";
			mensagem += comprador.getDataCriacao() != null ? "Data de criação da pessoa: " + dateFormat.format(comprador.getDataCriacao()) + "\n" : "";
			mensagem += "Email da pessoa: " + comprador.getEmail() + "\n";
			mensagem += comprador.getCpfCnpj() != null ? (comprador.getCpfCnpj().length() < 14 ? "CPF da Pessoa: " : "CNPJ da pessoa: ") + comprador.getCpfCnpj() + "\n" : "";
			if (comprador.getEndereco() != null) {
				mensagem += "O comprador mora na rua " + comprador.getEndereco().getRua() + ", na cidade " + comprador.getEndereco().getCidade() + " do estado " + comprador.getEndereco().getEstado() + " e o cep dele é " + comprador.getEndereco().getCodigoPostal() + "\n";
			}
			mensagem += "Telefone da pessoa: " + comprador.getTelefone() + "\n";
		}
		return mensagem;
	}
}
