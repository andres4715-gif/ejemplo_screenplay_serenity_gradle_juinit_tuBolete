package co.com.bancolombia.certificacion.tuboleta.models;

public class OrigenAndDestino {

	public OrigenAndDestino(String origen, String destino) {
		this.origen = origen;
		this.destino = destino;
	}

	private String origen;
	private String destino;

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

}
