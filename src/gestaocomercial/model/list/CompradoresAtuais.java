package gestaocomercial.model.list;

import java.text.SimpleDateFormat;
import java.util.List;

import gestaocomercial.model.Comprador;

public class CompradoresAtuais {
	List<Comprador> listaDeCompradores;

	public String mostrarListaDeCompradores() {
		String mensagem = "Lista de Compradore:\n\n";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		for (Integer index = 0; index < listaDeCompradores.size(); index++) {
			Comprador comprador = listaDeCompradores.get(index);
			mensagem += index + "º comprador:\n";
			mensagem += "Nome do comprador: "+comprador.getNome() + "\n";
			mensagem += "Data de criação do comprador: " + dateFormat.format(comprador.getDataCriacao()) + "\n";
		}
		return mensagem;
	}
}
