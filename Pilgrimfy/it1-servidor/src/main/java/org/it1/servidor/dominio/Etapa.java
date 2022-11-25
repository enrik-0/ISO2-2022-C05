package org.it1.servidor.dominio;

public class Etapa {
	private String _origen;
	private String _destino;
	private String _imagen;
	/**
	 * valores{a pie, bicicleta}
	 */
	private int _tipo;
	private long _distancia;
	private int _dificultad;
	private int _id;
	private String _descripcion;
	/**
	 * valores{completado, por realizar}
	 */
	private int _estado;
	public Camino _unnamed_Camino_;

	public String getOrigen() {
		return this._origen;
	}

	public void setOrigen(String aOrigen) {
		this._origen = aOrigen;
	}

	public String getDestino() {
		return this._destino;
	}

	public void setDestino(String aDestino) {
		this._destino = aDestino;
	}

	public String getImagen() {
		return this._imagen;
	}

	public void setImagen(String aImagen) {
		this._imagen = aImagen;
	}

	public int getTipo() {
		return this._tipo;
	}

	public void setTipo(int aTipo) {
		this._tipo = aTipo;
	}

	public long getDistancia() {
		return this._distancia;
	}

	public void setDistancia(long aDistancia) {
		this._distancia = aDistancia;
	}

	public int getDificultad() {
		return this._dificultad;
	}

	public void setDificultad(int aDificultad) {
		this._dificultad = aDificultad;
	}

	public int getId() {
		return this._id;
	}

	public void setId(int aId) {
		this._id = aId;
	}

	public String getDescripcion() {
		return this._descripcion;
	}

	public void setDescripcion(String aDescripcion) {
		this._descripcion = aDescripcion;
	}

	public int getEstado() {
		return this._estado;
	}

	public void setEstado(int aEstado) {
		this._estado = aEstado;
	}
}