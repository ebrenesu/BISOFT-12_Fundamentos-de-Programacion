/*****************************************************************
 * File: 			Menu.java
 * @version:		1.0
 * @author: 		eBrenes | 05/01/2023
 * Last Modify:		eBrenes | 25/01/2023 
 ****************************************************************/
package bisoft12.ui.utilitarios;

public class Menu {
	private static String _Nombre = "Sistema de planilla"; 
	private static int _IdxSalida = -1;
	public static int _CantOpciones = 2;
	
	/*****************************************************************
	 * Función que imprime el menu principal de la aplicación.
	 *****************************************************************
	 * @author eBrenes
	 *****************************************************************/
	public static void MenuPrincipal() {
		I_O.print("");
		I_O.print("Bienvenidos al sistema: \n"+_Nombre);
		I_O.print("------------------------");
		I_O.print("1) Agregar Persona.");
		I_O.print("2) Listar Personas.");
		I_O.print(_IdxSalida+") Salir.");
	}
	

	/*****************************************************************
	 * Función que imprime las intrucciones del ejercicio.
	 *****************************************************************
	 * @author eBrenes
	 *****************************************************************/
	public static void Instrucciones() {
		I_O.print(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		I_O.print("| Este programa permitira al usuario ver   |");
		I_O.print("| el uso de interfaces y herencia       |");
		I_O.print(" ------------------------------------------");
	}
	
	/*****************************************************************
	 * Funcion que devuelve el id de salida
	 *****************************************************************
	 * @author eBrenes
	 *****************************************************************/
	public static int getSalida() {
		return _IdxSalida;
	}
	
}
