package logica.objetos;

public class Matrioska {
//region VARIABLES
	private int _Peso;
	private int _ID;
	private Matrioska _Hija;
//endregion
	
//region CONSTRUCTORES
	/**********************************************************************
	 * Funcion: Constructor
	 * Descripcion:
	 * 		Recibe los valores de ID y Peso para ser almacenados en memoria. 
	 * 		Esta funcion inicializa las variables en valores validos.
	 * Parametros:
	 * 		pPeso 	[int]	peso asignado del objeto
	 * 		pID		[int]	identificador del objeto
	 * Return:
	 * 		N/A
	 **********************************************************************/
	public Matrioska() {
		this._Peso = -1;
		this._ID = -1;
		this._Hija = null;
	}
	
	/**********************************************************************
	 * Funcion: Constructor
	 * Descripcion:
	 * 		Recibe los valores de ID y Peso para ser almacenados en memoria. 
	 * 		Esta funcion inicializa las variables en valores validos.
	 * Parametros:
	 * 		pPeso 	[int]	peso asignado del objeto
	 * 		pID		[int]	identificador del objeto
	 * Return:
	 * 		N/A
	 **********************************************************************/
	public Matrioska(int pID, int pPeso) {
		this._Peso = pPeso;
		this._ID = pID;
		this._Hija = null;
	}
	
	/**********************************************************************
	 * Funcion: Constructor
	 * Descripcion:
	 * 		Recibe los valores de ID y Peso para ser almacenados en memoria. 
	 * 		Esta funcion inicializa las variables en valores validos.
	 * Parametros:
	 * 		pPeso 	[int]	peso asignado del objeto
	 * 		pID		[int]	identificador del objeto
	 * Return:
	 * 		N/A
	 **********************************************************************/
	public Matrioska(int pID, int pPeso, Matrioska pHija) {
		this._Peso = pPeso;
		this._ID = pID;
		this._Hija = pHija;
	}
//endregion
	
//region SETTERS
	/**********************************************************************
	 * Funcion: set_ID
	 * Descripcion:
	 * 		Recibe los valores de ID para ser almacenados en memoria. 
	 * Parametros:
	 * 		pID [int] identificador del objeto.
	 * Return:
	 * 		N/A
	 **********************************************************************/
	public void set_ID(int pID) {
		this._ID = pID;
	}
	
	/**********************************************************************
	 * Funcion: set_PESO
	 * Descripcion:
	 * 		Recibe los valores de PESO para ser almacenados en memoria. 
	 * Parametros:
	 * 		pPeso [int] peso asignado del objeto.
	 * Return:
	 * 		N/A
	 **********************************************************************/
	public void set_Peso(int pPeso) {
		this._Peso = pPeso;
	}

	/**********************************************************************
	 * Funcion: set_Hija
	 * Descripcion:
	 * 		Recibe un objeto Matrioska para ser almacenados en memoria como 
	 * 		su _Hija 
	 * Parametros:
	 * 		pHija [Matrioska] objeto.
	 * Return:
	 * 		N/A
	 **********************************************************************/
	public void set_Hija(Matrioska pHija) {
		this._Hija = pHija;
	}
//endregion
	
//region GETTERS
	/**********************************************************************
	 * Funcion: get_ID
	 * Descripcion:
	 * 		Devuelve los valores de ID del objeto. 
	 * Parametros:
	 * 		N/A
	 * Return:
	 * 		_ID [int] identificador del objeto
	 **********************************************************************/
	public int get_ID() {
		return _ID;
	}
	
	/**********************************************************************
	 * Funcion: get_PESO
	 * Descripcion:
	 * 		Devuelve los valores de PESO del objeto. 
	 * Parametros:
	 * 		N/A
	 * Return:
	 * 		_Peso [int] peso asignado del objeto.
	 **********************************************************************/
	public int get_Peso() {
		return _Peso;
	}
	
	/**********************************************************************
	 * Funcion: get_Hija
	 * Descripcion:
	 * 		Devuelve la referencia al objeto matrioska. 
	 * Parametros:
	 * 		N/A
	 * Return:
	 * 		_Hija [Matrioska] puntero asignado del objeto.
	 **********************************************************************/
	public Matrioska get_Hija() {
		return _Hija;
	}
//endregion
	
//region FUNCIONES NORMALES
	/**********************************************************************
	 * Funcion: get_Info
	 * Descripcion:
	 * 		Nos devuelve una descripcion del objeto unitario, sin contar 
	 * 		hijos 
	 * Parametros:
	 * 		N/A
	 * Return:
	 * 		[String] Informacion del objeto
	 **********************************************************************/
	public String get_Info() {
		return "La matrioska con el id: " + this.get_ID() + ", tiene un peso unitario de: " + this.get_Peso();
	}
	
	/**********************************************************************
	 * Funcion: tiene_Hijos
	 * Descripcion:
	 * 		Nos informa si el objeto tiene una hija asiganda.
	 * Parametros:
	 * 		N/A
	 * Return:
	 * 		[Boolean] True si tiene una hija.
	 **********************************************************************/
	private boolean tiene_Hijos() {
		if(this._Hija!= null)
			return true;
		return false;	
	}
//endregion
	
//region FUNCIONES RECURSIVAS
	/**********************************************************************
	 * Funcion: get_Peso_total
	 * Descripcion:
	 * 		Devuelve los valores de PESO total de los objetos y sus hijos. 
	 * Parametros:
	 * 		N/A
	 * Return:
	 * 		_Peso [int] peso asignado del objeto y sus hijos.
	 **********************************************************************/
	private int get_Peso_total() {
		if (this.tiene_Hijos())
			return this.get_Hija().get_Peso_total() + this.get_Peso();
		else
			return this.get_Peso();
	}
	
	/**********************************************************************
	 * Funcion: get_Info
	 * Descripcion:
	 * 		Nos devuelve una descripcion del objeto unitario, sin contar 
	 * 		hijos 
	 * Parametros:
	 * 		N/A
	 * Return:
	 * 		[String] Informacion del objeto
	 **********************************************************************/
	public String get_Info_Total() {
		return "La matrioska tiene un peso total de: " + this.get_Peso_total();
	}
	
	/**********************************************************************
	 * Funcion: agregar_Hija
	 * Descripcion:
	 * 		Permite asignar una hija al objeto actual. Usa la recursividad
	 * 		para encontrar el espacio, correcto. 
	 * Parametros:
	 * 		N/A
	 * Return:
	 * 		[String] Informacion del objeto
	 **********************************************************************/
	public void agregar_Hija(Matrioska pHija) {
		if(this.tiene_Hijos())
			this.get_Hija().agregar_Hija(pHija);
		else
			this.set_Hija(pHija) ;
		
	}
	
//endregion
	
	
	

	
	
	
	
	
	





	
	/**********************************************************************
	 * Funcion: get_PESO
	 * Descripcion:
	 * 		Devuelve los valores de PESO del objeto. 
	 * Parametros:
	 * 		N/A
	 * Return:
	 * 		_Peso [int] peso asignado del objeto.
	 **********************************************************************/
	public int get_Peso_Total() {
		return _Peso;
	}

}
