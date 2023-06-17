package gestaocomercial.model;

public class Produto {
	String nome;
	Float valorAtual;
	String tipoProduto;

	public Produto() {

	}

	public Produto(String nome, Float valorAtual, String tipoDeProduto) {
		this.nome = nome;
		this.valorAtual = valorAtual;
		this.tipoProduto = tipoDeProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getValorAtual() {
		return valorAtual;
	}

	public void setValorAtual(Float valorAtual) {
		this.valorAtual = valorAtual;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
}
