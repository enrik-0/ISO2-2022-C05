package Client.Autenticar.ServidorDominio;

public class Persona {

	private string usuario;
	private string contrase�a;
	private string tipo;

	/**
	 * 
	 * @param usuario
	 * @param contrase�a
	 */
	public boolean login(string usuario, string contrase�a) {
		// TODO - implement Persona.login
		throw new UnsupportedOperationException();
	}

	public string getUsuario() {
		return this.usuario;
	}

	public string getTipo() {
		return this.tipo;
	}

	public string getContrase�a() {
		return this.contrase�a;
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
	public void setContrase�a(string contrase�a) {
		this.contrase�a = contrase�a;
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(string tipo) {
		this.tipo = tipo;
	}

}