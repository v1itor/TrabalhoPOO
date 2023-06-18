package gestaocomercial.model;

public class Produto {
	String nome;
	Float valorAtual;
	String tipoProduto;

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
}
