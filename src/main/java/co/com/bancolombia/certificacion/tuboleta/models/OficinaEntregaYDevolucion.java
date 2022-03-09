package co.com.bancolombia.certificacion.tuboleta.models;

public class OficinaEntregaYDevolucion {

	public OficinaEntregaYDevolucion(String oficinaentrega, String oficinadevolucion) {
		this.oficinaentrega = oficinaentrega;
		this.oficinadevolucion = oficinadevolucion;
	}

	private String oficinaentrega;
	private String oficinadevolucion;

	public String getOficinaentrega() {
		return oficinaentrega;
	}

	public String getOficinadevolucion() {
		return oficinadevolucion;
	}

}
