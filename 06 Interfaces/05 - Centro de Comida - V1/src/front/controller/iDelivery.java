/******************************************************************************
 * Universidad Cenfotec 2024
 * Profesor: 	Erick Brenes
 * Objetivo:	Interface para opciones de restaurante. Proporciona m�todos 
 * 				para obtener el men� de un restaurante, seleccionar una comida 
 * 				espec�fica y obtener la informaci�n del restaurante.
 ******************************************************************************/

package front.controller;

import java.util.ArrayList;

public interface iDelivery {

    /******************************************************************************
     * Funcion:		ObtenerMenuRestaurante
     * Descripcion:	Obtiene el men� del restaurante.
     * Parametros:	N/A
     *
     * @return:		[ArrayList String]  {arreglo con el men� del restaurante}
     ******************************************************************************/
    public ArrayList<String> ObtenerMenuRestaurante(int pIdRest);

    /******************************************************************************
     * Funcion:		ObtenerComida
     * Descripcion:	Obtiene una comida espec�fica de un restaurante basado en una 
     * 				opci�n dada.
     * Parametros:	
     * 				@param pRest el restaurante del cual obtener la comida.
     * 				@param pOpcion la opci�n de comida seleccionada.
     * 
     * @return:		[ArrayList String] {datos de la comida seleccionada}
     ******************************************************************************/
    public ArrayList<String> ObtenerInfoComida(int pIdRest, int pOpcion);

    /******************************************************************************
     * Funcion:		ObtenerRestaurante
     * Descripcion:	Obtiene la informaci�n del restaurante.
     * Parametros:	N/A
     *
     * @return:		[String] Informacion de un Restaurante.
     ******************************************************************************/
    public String ObtenerInfoRestaurante(int pIdRest);
    
    /******************************************************************************
     * Funcion:		CrearComida
     * Descripcion:	Recibe el id de un restaurante y los valores para agregar 
     * 				un platillo nuevo.
     * Parametros:	
     * 				@param [int] 	pIdRest, Identificador del restaurante 
     * 				@param [String] pNombre, Nombre del platillo
     * 				@param [String]	pReceta, Receta para el platillo
     * 				@param [String] pPrecio, Precio sugerido del platillo
     *
     * @return:		aRestaurante {instancia de un Restaurante}.
     ******************************************************************************/
    public void CrearComida(int pIdRest, String pNombre, String pReceta, String pPrecio);
    
    /******************************************************************************
     * Funcion:		CrearRestaurante
     * Descripcion:	Recibe la informacion de restaurante para agregarlo 
     * 				
     * Parametros:	
     * 				@param [int] 	pIdRest, Identificador del restaurante 
     * 				@param [String] pNombre, Nombre del restaurante
     *
     * @return:		N/A 
     ******************************************************************************/
    public void CrearRestaurante(int pIdRest, String pNombre);
    
    /******************************************************************************
     * Funcion:		CrearRestaurante
     * Descripcion:	Recibe la informacion de restaurante para agregarlo 
     * 				
     * Parametros:	
     * 				@param [int] 	pIdRest, Identificador del restaurante 
     *
     * @return:		N/A 
     ******************************************************************************/
    public void CrearRestaurante(String pNombre);
}

/******************************************************************************
* Update:  	30-05-2024 | Nuevas funciones para CrearRestaurante
* 		  	Cambio de parametros de objetos a String ObtenerInfoRestaurante.
* 			Cambio de retornos de tipo array a arrayList
******************************************************************************/


