package gestaocomercial.model;

import java.util.Date;
import java.util.List;

public class Comprador {
	private String nome;
	private String email;
	private Endereco endereco;
	private String telefone;
	private String cpfCnpj;
	private String Obs;
	private Date dataCriacao;
	private List<Pedido> historicoDePedidos;

	public Comprador(String nome, String email, Endereco endereco, String telefone, String cpfCnpj, String obs) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpfCnpj = cpfCnpj;
		Obs = obs;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getObs() {
		return Obs;
	}
	public void setObs(String obs) {
		Obs = obs;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public List<Pedido> getHistoricoDePedidos() {
		return historicoDePedidos;
	}
	public void setHistoricoDePedidos(List<Pedido> historicoDePedidos) {
		this.historicoDePedidos = historicoDePedidos;
	}
}
