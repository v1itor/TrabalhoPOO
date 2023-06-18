package gestaocomercial.model.list;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import gestaocomercial.dto.ProdutoVendido;
import gestaocomercial.model.Pedido;

public class HistoricoDePedidos {
	List<Pedido> listaDePedidos = new ArrayList<Pedido>();

	public List<Pedido> getListaDePedidos() {
		return listaDePedidos;
	}

	public void setListaDePedidos(List<Pedido> listaDePedidos) {
		this.listaDePedidos = listaDePedidos;
	}

	public String gerarHistoricoDePedidos() {
		String mensagem = "A lista de vendas é essa:\n\n";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		for (Integer i = 0; i < this.listaDePedidos.size(); i++) {
			Pedido venda = this.listaDePedidos.get(i);
			mensagem += i + "ª venda:\n";
			mensagem += "Comprador: " + venda.getComprador().getNome() + "\n";
			mensagem += venda.getDataVenda() != null ? "Data da venda: " + dateFormat.format(venda.getDataVenda()) + "\n" : "";
			mensagem += "Canal de Venda: " + venda.getCanalDeVenda() + "\n";
			mensagem += "Método de Pagamento: " + venda.getMetodoDePagamento() + "\n";
			mensagem += "Produtos vendidos: \n";
			for (ProdutoVendido produtoVendido : venda.getProdutosVendidos()) {
				mensagem += "\n\n";
				mensagem += "- Nome do produto: " + produtoVendido.getProduto().getNome() + "\n";
				mensagem += "  Quantidade vendida: " + produtoVendido.getQuantidade() + "\n";
				mensagem += "  Valor unitário: " + produtoVendido.getValor() + "\n\n";
			}
		}
		return mensagem;

	}

}
