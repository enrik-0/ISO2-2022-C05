package Client.ClientNegocios.GestionarComentarios.DominioServidor;

public class Comentario {

	private date fecha;
	private date horaEdicion;
	private string emisor;
	private string receptor;
	private int valoracion;
	private string cuerpo;
	private string[] recursos;

	public date getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(date fecha) {
		this.fecha = fecha;
	}

	public date getHoraEdicion() {
		return this.horaEdicion;
	}

	/**
	 * 
	 * @param horaEdicion
	 */
	public void setHoraEdicion(date horaEdicion) {
		this.horaEdicion = horaEdicion;
	}

	public string getEmisor() {
		return this.emisor;
	}

	/**
	 * 
	 * @param emisor
	 */
	public void setEmisor(string emisor) {
		this.emisor = emisor;
	}

	public string getReceptor() {
		return this.receptor;
	}

	/**
	 * 
	 * @param receptor
	 */
	public void setReceptor(string receptor) {
		this.receptor = receptor;
	}

	public int getValoracion() {
		return this.valoracion;
	}

	/**
	 * 
	 * @param valoracion
	 */
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public string getCuerpo() {
		return this.cuerpo;
	}

	/**
	 * 
	 * @param cuerpo
	 */
	public void setCuerpo(string cuerpo) {
		this.cuerpo = cuerpo;
	}

	public string[] getRecursos() {
		return this.recursos;
	}

	/**
	 * 
	 * @param recursos
	 */
	public void setRecursos(string[] recursos) {
		this.recursos = recursos;
	}

	public void añadirComentario() {
		// TODO - implement Comentario.añadirComentario
		throw new UnsupportedOperationException();
	}

	public string leerComentario() {
		// TODO - implement Comentario.leerComentario
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param texto
	 */
	public string responderComentario(string texto) {
		// TODO - implement Comentario.responderComentario
		throw new UnsupportedOperationException();
	}

}