package bisoft12.logic.objetos;

public class Persona extends ModeloBase{
	private String _Nombre, _Apellido1, _Apellido2, _Puesto;
	
	public Persona() {
		super();
		set_Nombre("");
		set_Apellido1("");
		set_Apellido2("");
		set_Puesto("No es empleado");
	}

	/**
	 * @param _Nombre
	 * @param _Apellido1
	 * @param _Apellido2
	 * @param _Puesto
	 */
	public Persona(String _Nombre, String _Apellido1, String _Apellido2, String _Puesto) {
		super();
		set_Nombre(_Nombre);
		set_Apellido1(_Apellido1);
		set_Apellido2(_Apellido2);
		set_Puesto(_Puesto);
	}

	/**
	 * @param _Nombre
	 * @param _Apellido1
	 * @param _Apellido2
	 * @param _Puesto
	 */
	public Persona(int pid, String _Nombre, String _Apellido1, String _Apellido2, String _Puesto) {
		super.set_Id(pid);
		set_Nombre(_Nombre);
		set_Apellido1(_Apellido1);
		set_Apellido2(_Apellido2);
		set_Puesto(_Puesto);
	}
	
	/**
	 * @return the _Nombre
	 */
	public String get_Nombre() {
		return _Nombre;
	}

	/**
	 * @return the _Apellido1
	 */
	public String get_Apellido1() {
		return _Apellido1;
	}

	/**
	 * @return the _Apellido2
	 */
	public String get_Apellido2() {
		return _Apellido2;
	}

	/**
	 * @return the _Puesto
	 */
	public String get_Puesto() {
		return _Puesto;
	}

	/**
	 * @param _Nombre the _Nombre to set
	 */
	public void set_Nombre(String _Nombre) {
		this._Nombre = _Nombre;
	}

	/**
	 * @param _Apellido1 the _Apellido1 to set
	 */
	public void set_Apellido1(String _Apellido1) {
		this._Apellido1 = _Apellido1;
	}

	/**
	 * @param _Apellido2 the _Apellido2 to set
	 */
	public void set_Apellido2(String _Apellido2) {
		this._Apellido2 = _Apellido2;
	}

	/**
	 * @param _Puesto the _Puesto to set
	 */
	public void set_Puesto(String _Puesto) {
		this._Puesto = _Puesto;
	}

	

}
