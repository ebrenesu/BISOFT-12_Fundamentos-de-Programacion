package logica.controladores;

import logica.objetos.Matrioska;

public class Controlador_Matrioska {
	private Matrioska _Doll;
	private int _Cantidad_Doll;
	
	public Controlador_Matrioska() {
		this._Doll = null;
		set_Cantidad_Doll(0);
	}
	
	public String agregar_Matrioska(int pId, int pPeso) {
		if(this._Doll == null)
			this.set_Doll(new Matrioska(pId, pPeso)) ;
		else
			this.get_Doll().agregar_Hija(new Matrioska(pId, pPeso));
		
		this.aumentar_Cantidad_Doll();
			
		return "La matrioska ["+this.get_Cantidad_Doll() +"] con el id: "+pId+ " y un peso de: "+pPeso+", fue agregada con exito.";
	}

	
	
	public String obtener_info_total() {
		return this.get_Doll().get_Info_Total() +"\nEsto para "+this.get_Cantidad_Doll()+" objetos.";
	}
	
	
	
	
	private void aumentar_Cantidad_Doll() {
		this.set_Cantidad_Doll(this.get_Cantidad_Doll()+1);
	}

	/**
	 * @return the _Doll
	 */
	private Matrioska get_Doll() {
		return _Doll;
	}

	/**
	 * @param _Doll the _Doll to set
	 */
	private void set_Doll(Matrioska pDoll) {
		this._Doll = pDoll;
	}

	/**
	 * @return the _Cantidad_Doll
	 */
	private int get_Cantidad_Doll() {
		return _Cantidad_Doll;
	}

	/**
	 * @param _Cantidad_Doll the _Cantidad_Doll to set
	 */
	private void set_Cantidad_Doll(int pCantidad_Doll) {
		this._Cantidad_Doll = pCantidad_Doll;
	}

}
