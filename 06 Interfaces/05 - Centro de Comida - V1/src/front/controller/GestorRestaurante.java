package front.controller;

import backend.*;

public class GestorRestaurante implements iDelivery {
	private aRestaurante _Restaurante;


	public GestorRestaurante() {
		_Restaurante = new CenfoDonalds();
	}
	
	@Override
	public String[] ObtenerMenuRestaurante() {
		return _Restaurante.ObtenerMenuRestaurante();
	}

	@Override
	public aComida ObtenerComida(aRestaurante pRest, int pOpcion) {
		return _Restaurante.ObtenerComid(pOpcion);
	}

	@Override
	public aRestaurante ObtenerRestaurante() {
		return this._Restaurante;
	}

	@Override
	public void CrearComida(aRestaurante pRest, String pNombre, String pReceta, String pPrecio) {
		this._Restaurante.CrearComid(pNombre, pReceta, pPrecio);
	}

}

/**********************************************************************************************
 * Opcion nueva CrearComida
 * Cambios:
 * - Todo parametro aRestaurante pRest deberia ser un id o el nombre del restaurante.
 * - private aRestaurante _Restaurante; deberia de ser un arraylist
 * - Crear funciones para el manejo y creacion de restaurantes.
 * - public aRestaurante ObtenerRestaurante() cambiaria el Return a un string. 
 * Para que me devuelva el nombre
 **********************************************************************************************/
