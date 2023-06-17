package gestaocomercial.model.list;

import java.text.SimpleDateFormat;
import java.util.List;

import gestaocomercial.model.Comprador;

public class CompradoresAtuais {
	List<Comprador> listaDeCompradores;

	public List<Comprador> getListaDeCompradores() {
		return listaDeCompradores;
	}

	public void setListaDeCompradores(List<Comprador> listaDeCompradores) {
		this.listaDeCompradores = listaDeCompradores;
	}

	public String mostrarListaDeCompradores() {
		String mensagem = "Lista de Compradore:\n\n";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		for (Integer index = 0; index < listaDeCompradores.size(); index++) {
			Comprador comprador = listaDeCompradores.get(index);
			mensagem += index + "º comprador:\n";
			mensagem += comprador.getNome() != null ? "Nome do comprador: "+comprador.getNome() + "\n" : "";
			mensagem += comprador.getDataCriacao() != null ? "Data de criação do comprador: " + dateFormat.format(comprador.getDataCriacao()) + "\n" : "";
			mensagem += "Email do comprador: " + comprador.getEmail() + "\n";
			mensagem += comprador.getCpfCnpj() != null ? (comprador.getCpfCnpj().length() < 14 ? "CPF do Comprador: " : "CNPJ do comprador: ") + comprador.getCpfCnpj() : "";
			// TODO = aa;
		}
		return mensagem;
	}
}
