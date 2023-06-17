package gestaocomercial.model;

import java.util.ArrayList;

public class Kit extends ArrayList<Produto> {

	private static final long serialVersionUID = 1L;
	private String kitName;

	public String getKitName() {
		return kitName;
	}
	public void setKitName(String kitName) {
		this.kitName = kitName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
