package org.it2.servidor.persistencia;

import java.sql.Connection;
import java.util.Vector;

public class Agente {
	private Agente _agente;
	private Connection _mBD;
	private String _uRL;
	private String _driver;

	public Agente getAgente() {
		return this._agente;
	}

	public void conectar() {
		throw new UnsupportedOperationException();
	}

	public void desconectar() {
		throw new UnsupportedOperationException();
	}

	public int insert(String aSQL) {
		throw new UnsupportedOperationException();
	}

	public int delete(String aSQL) {
		throw new UnsupportedOperationException();
	}

	public int update(String aSQL) {
		throw new UnsupportedOperationException();
	}

	public Vector<Object> select(String aSQL) {
		throw new UnsupportedOperationException();
	}
}