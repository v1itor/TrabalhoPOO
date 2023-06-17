package gestaocomercial.model;

public class Endereco {
	private String rua;
	private String cidade;
	private String estado;
	private String codigoPostal;

	public Endereco(String rua, String cidade, String estado, String codigoPostal) {
		super();
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.codigoPostal = codigoPostal;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
}
