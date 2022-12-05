public class Recurso {
	private String _nombre;
	private String _descripcion;
	private String _horario;
	private String _direccion;
	private String _contacto;
	private String _disponibilidad;
	private String _localizacion;

	public Recurso(String aNombre, String aDesc, String aHorario, String aDireccion, String aContacto, String aDisponibilidad) {
		throw new UnsupportedOperationException();
	}

	public void obtenerLocalizacion(GoogleMaps aGps) {
		throw new UnsupportedOperationException();
	}

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

	public String getDireccion() {
		return this._direccion;
	}

	public void setDireccion(String aDireccion) {
		this._direccion = aDireccion;
	}

	public String getContacto() {
		return this._contacto;
	}

	public void setContacto(String aContacto) {
		this._contacto = aContacto;
	}

	public String getDisponibilidad() {
		return this._disponibilidad;
	}

	public void setDisponibilidad(String aDisponibilidad) {
		this._disponibilidad = aDisponibilidad;
	}
}