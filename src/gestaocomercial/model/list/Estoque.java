package gestaocomercial.model.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import gestaocomercial.dto.ProdutoEmEstoque;

public class Estoque {
	private List<ProdutoEmEstoque> listaDeProdutosEmEstoque = new ArrayList<ProdutoEmEstoque>();

	public List<ProdutoEmEstoque> getListaDeProdutosEmEstoque() {
		Iterator<ProdutoEmEstoque> iter = listaDeProdutosEmEstoque.iterator();
		while (iter.hasNext()) {
			ProdutoEmEstoque produtoEmEstoque = iter.next();
			if (produtoEmEstoque.getQuantidade() <= 0) {
				iter.remove();
			}
		}
		return listaDeProdutosEmEstoque;
	}

	public void setListaDeProdutosEmEstoque(List<ProdutoEmEstoque> listaDeProdutosEmEstoque) {
		this.listaDeProdutosEmEstoque = listaDeProdutosEmEstoque;
	}

	public String gerarListaDeEstoque() {
		String mensagem = "A lista de produtos está abaixo:\n\n";
		for (Integer index = 0; index< listaDeProdutosEmEstoque.size(); index++) {
			ProdutoEmEstoque produto = listaDeProdutosEmEstoque.get(index);
			mensagem += "Produto nº" + index + ":\n";
			mensagem += "Nome: " + produto.getProduto().getNome() + "\n";
			mensagem += "Valor atual: " + produto.getProduto().getValorAtual() + "\n";
			mensagem += "Tipo de produto: " + produto.getProduto().getTipoProduto() + "\n";
			mensagem += "Data de entrada: " + produto.getDataDeEntrada() + "\n";
			mensagem += "Canal de venda: " + produto.getCanalDeVenda() + "\n";
			mensagem += "Método de pagamento: " + produto.getMetodoDePagamento() + "\n";
			mensagem += "Quantidade: " + produto.getQuantidade() + "\n";
			mensagem += "Custo base: " + produto.getCustoBase() + "\n";
			mensagem += "Custo adicional: " + produto.getCustoAdicional() + "\n";
			mensagem += "Observações: " + produto.getObs() + "\n\n";
		}
		return mensagem;
	}

	public String gerarAviso(ParametrizacoesDoSistema parametrizacoesDoSistema) {
		String mensagem = "Atenção! Esses produtos estão a muito tempo em estoque: \n\n";
		for (ProdutoEmEstoque produtoEmEstoque : listaDeProdutosEmEstoque) {
			Long difHojeEDataDeEntrada = (new Date()).getTime() - produtoEmEstoque.getDataDeEntrada().getTime();
			if (difHojeEDataDeEntrada > Integer.valueOf(parametrizacoesDoSistema.getListaDeParametrizacoes().get(ParametrizacoesDoSistema.DIAS_IDEAIS_ESTOQUE))) {
				mensagem += produtoEmEstoque.getProduto().getNome() + " - " + difHojeEDataDeEntrada + " dias.\n";
			}
		}
		if (mensagem.length() > 50) {
			return mensagem;
		}
		return "";
	}

	public Integer calculaTotalProdutos() {
		Integer qtd = 0;
		for (ProdutoEmEstoque produtoEmEstoque : listaDeProdutosEmEstoque) {
			qtd += produtoEmEstoque.getQuantidade();
		}
		return qtd;
	}
}
