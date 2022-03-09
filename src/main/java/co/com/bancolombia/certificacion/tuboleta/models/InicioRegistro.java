package co.com.bancolombia.certificacion.tuboleta.models;

public class InicioRegistro {

	public InicioRegistro(String correo, String contrasenia, String conficontrasenia, String numeroidentificacion,
			String saludo) {

		this.correo = correo;
		this.contrasenia = contrasenia;
		this.conficontrasenia = conficontrasenia;
		this.numeroidentificacion = numeroidentificacion;
		this.saludo = saludo;
	}

	private String correo;
	private String contrasenia;
	private String conficontrasenia;
	private String numeroidentificacion;
	private String saludo;

	public String getCorreo() {
		return correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public String getConficontrasenia() {
		return conficontrasenia;
	}

	public String getNumeroidentificacion() {
		return numeroidentificacion;
	}

	public String getSaludo() {
		return saludo;
	}

}
