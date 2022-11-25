package org.it1.servidor.dominio;

import java.util.Vector;

public class Camino {
	private String _nombre;
	/**
	 * valores{a pie,bicicleta,mixto}
	 */
	private int _tipo;
	private String _descripcion;
	private String[] _imagenes;
	private String _ubicacionOrigen;
	private String _ubicacionDestino;
	/**
	 * fecha y hora
	 */
	private Date _fechaInicio;
	/**
	 * fecha y hora
	 */
	private Date _fechaFin;
	private Etapa[] _etapas;
	private Long _distancia;
	private String _recomendacionesEquipamiento;
	public Vector<Etapa> _unnamed_Etapa_ = new Vector<Etapa>();
	
	public void verCamino(Camino aCamino) {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public int getTipo() {
		return this._tipo;
	}

	public void setTipo(Object aTipo) {
		throw new UnsupportedOperationException();
	}

	public String[] getImagenes() {
		return this._imagenes;
	}

	public void setImagenes(Object aImagenes) {
		throw new UnsupportedOperationException();
	}

	public String getUbicacionOrigen() {
		return this._ubicacionOrigen;
	}

	public void setUbicacionOrigen(String aUbicacionOrigen) {
		this._ubicacionOrigen = aUbicacionOrigen;
	}

	public String getUbicacionDestino() {
		return this._ubicacionDestino;
	}

	public void setUbicacionDestino(String aUbicacionDestino) {
		this._ubicacionDestino = aUbicacionDestino;
	}

	public Date getFechaInicio() {
		return this._fechaInicio;
	}

	public void setFechaInicio(Date aFechaInicio) {
		this._fechaInicio = aFechaInicio;
	}

	public Date getFechaFin() {
		return this._fechaFin;
	}

	public void setFechaFin(Date aFechaFin) {
		this._fechaFin = aFechaFin;
	}

	public Long getDistancia() {
		return this._distancia;
	}

	public void setDistancia(Long aDistancia) {
		this._distancia = aDistancia;
	}

	public String getRecomendacionesEquipamiento() {
		return this._recomendacionesEquipamiento;
	}

	public void setRecomendacionesEquipamiento(String aRecomendacionesEquipamiento) {
		this._recomendacionesEquipamiento = aRecomendacionesEquipamiento;
	}

	public void setTipo(int aTipo) {
		this._tipo = aTipo;
	}
}