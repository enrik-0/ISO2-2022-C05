package Client.Autenticar.ServidorDominio;

public class Persona {

	private string usuario;
	private string contrasena;
	private string tipo;

	/**
	 * 
	 * @param usuario
	 * @param contrase�a
	 */
	public boolean login(string usuario, string contrasena) {
		// TODO - implement Persona.login
		throw new UnsupportedOperationException();
	}

	public string getUsuario() {
		return this.usuario;
	}

	public string getTipo() {
		return this.tipo;
	}

	public string getContrasena() {
		return this.contrasena;
	}

	/**
	 * 
	 * @param usuario
	 */
	public void setUsuario(string usuario) {
		this.usuario = usuario;
	}

	/**
	 * 
	 * @param contrase�a
	 */
	public void setContrasena(string contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(string tipo) {
		this.tipo = tipo;
	}

}