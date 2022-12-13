package org.it6.servidor.dominio;

import org.it4.servidor.dominio.Comentario;

public class Estadistica {
	private int _numPeregrinos;
	private int _satisfaccion;
	private int _numNegocios;
	private String[] _resenas;

	public int getNumPeregrinos() {
		return this._numPeregrinos;
	}

	public int getSatisfaccion() {
		return this._satisfaccion;
	}

	public int getNumNegocios() {
		return this._numNegocios;
	}

	public Comentario[] getResenas() {
		throw new UnsupportedOperationException();
	}

	public void setNumPeregrinos(int aNumPeregrinos) {
		this._numPeregrinos = aNumPeregrinos;
	}

	public void setSatisfaccion(int aSatisfaccion) {
		this._satisfaccion = aSatisfaccion;
	}

	public void setNumNegocios(int aNumNegocios) {
		this._numNegocios = aNumNegocios;
	}

	public void setResenas(String[] aResenas) {
		this._resenas = aResenas;
	}
	
	public int verUsuariosSatisfechos() {
		throw new UnsupportedOperationException();
	}
	
	public int verUsoSistema() {
		throw new UnsupportedOperationException();
	}
	
	public int verNumeroNegocios() {
		throw new UnsupportedOperationException();
	}
	
	public String[] analisisResenas() {
		throw new UnsupportedOperationException();
	}
}
