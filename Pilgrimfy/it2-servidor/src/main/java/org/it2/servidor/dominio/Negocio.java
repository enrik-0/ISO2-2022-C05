package org.it2.servidor.dominio;

public class Negocio {
	private String _nombre;
	private String _descripcion;
	private String _horario;
	private String _localizacion;
	private Boolean _abierto;
	private String _contacto;

	public String getNombre() {
		return this._nombre;
	}

	
	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	
	public String getDescripcion() {
		return this._descripcion;
	}

	
	public void setDescripcion(String aDescripcion) {
		this._descripcion = aDescripcion;
	}

	
	public String getHorario() {
		return this._horario;
	}

	
	public void setHorario(String aHorario) {
		this._horario = aHorario;
	}

	public String getLocalizacion() {
		return this._localizacion;
	}

	
	public void setLocalizacion(String aLocalizacion) {
		this._localizacion = aLocalizacion;
	}

	
	public Boolean getAbierto() {
		return this._abierto;
	}

	
	public void setAbierto(Boolean aAbierto) {
		this._abierto = aAbierto;
	}

	
	public String getContacto() {
		return this._contacto;
	}

	public void setContacto(String aContacto) {
		this._contacto = aContacto;
	}

	
	public void anadirInformacion(Negocio aNegocio, String aNombre, String aDescripcion, String aHorario, String aLocalizacion, Boolean aAbierto, String aContacto) {
		throw new UnsupportedOperationException();
	}

	
	public void borrarInformacion(Negocio aNegocio, String aNombre, String aDescripcion, String aHorario, String aLocalizacion, Boolean aAbierto, String aContacto) {
		throw new UnsupportedOperationException();
	}

	
	public void editarInformacion(Negocio aNegocio, String aNombre, String aDescripcion, String aHorario, String aLocalizacion, Boolean aAbierto, String aContacto) {
		throw new UnsupportedOperationException();
	}

	
	public Negocio mostrarInformacion(String aNombre) {
		throw new UnsupportedOperationException();
	}
}