package Client.Autenticar.ServidorDominio;

public class Persona {

	private string usuario;
	private string contraseña;
	private string tipo;

	/**
	 * 
	 * @param usuario
	 * @param contraseña
	 */
	public boolean login(string usuario, string contraseña) {
		// TODO - implement Persona.login
		throw new UnsupportedOperationException();
	}

	public string getUsuario() {
		return this.usuario;
	}

	public string getTipo() {
		return this.tipo;
	}

	public string getContraseña() {
		return this.contraseña;
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
	 * @param contraseña
	 */
	public void setContraseña(string contraseña) {
		this.contraseña = contraseña;
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(string tipo) {
		this.tipo = tipo;
	}

}