/*****************************************************************
 * File: 			I_O.java
 * @version:		1.0
 * @author: 		eBrenes | 05/01/2023
 * Last Modify:		eBrenes | 25/01/2023 
 ****************************************************************/
package bisoft12.ui.utilitarios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class I_O {
	private static Scanner reader = new Scanner(System.in);
	
	/*****************************************************************
	 * Función que permite escribir en consola un mensaje con salto
	 * de linea.
	 * @param: String pMensaje (Texto a imprimir)
	 *****************************************************************
	 * @author eBrenes
	 *****************************************************************/
    public static void print(String pMensaje) {
		System.out.println(pMensaje);
    }
	
    /*****************************************************************
	 * Función que permite escribir en consola un mensaje sin salto
	 * de linea.
	 * @param:  String pMensaje (Texto a imprimir)
	 * 			boolean pMismaLinea (Bandera que si va activa imprime
	 * 								en la misma linea, sino hace salto)
	 *****************************************************************
	 * @author eBrenes
	 *****************************************************************/
    public static void print(String pMensaje, boolean pMismaLinea) {
    	if(pMismaLinea)
    		print( pMensaje); 
		else
			System.out.print(pMensaje);
    }
	
    /*****************************************************************
	 * Función que permite leer un número entero desde el teclado.
	 * @return Int numero (escrito por el usuario)
	 *****************************************************************
	 * @author eBrenes
	 *****************************************************************/
    public static int leerInt() {
		int numero = 0 ;
		boolean leido = false;
		do {			
			try {
				numero = reader.nextInt();
				leido = true;
			} catch (InputMismatchException ime){
				System.out.println("Caracter invalido, solo se permiten números enteros. ");
				reader.next();
			}
		} while (!leido);
		
		return numero;
    }
    
    /*****************************************************************
	 * Función que permite leer un número con decimales desde el 
	 * teclado.
	 * @return Double numero (escrito por el usuario)
	 *****************************************************************
	 * @author eBrenes
	 *****************************************************************/
    public static double leerDouble() {
		double numero = 0;
		boolean leido = false;
		do {			
			try {
				numero = reader.nextDouble();
				leido = true;
			} catch (InputMismatchException ime){
				System.out.println("Caracter invalid, solo se permiten números. ");
				reader.next();
			}
		} while (!leido);
		
		return numero;
    }
    
	/*****************************************************************
	 * Función que permite leer un texto desde el teclado.
	 * @return String data (escrito por el usuario)
	 *****************************************************************
	 * @author eBrenes
	 *****************************************************************/
	public static String leerTexto() {	
		return obtenerTexto();
	}
	
	/*****************************************************************
	 * Función que permite leer un texto desde el teclado. Imprime 
	 * la instruccion antes
	 * @param String Texto
	 * @return String data (escrito por el usuario)
	 *****************************************************************
	 * @author eBrenes
	 *****************************************************************/
	public static String leerTexto(String pTexto) {	
		print(pTexto);
		return obtenerTexto();
	}
    
    private static String obtenerTexto() {
    	String data = "";
		do {			
			try {
				data = reader.nextLine();
			} catch (InputMismatchException ime){
				System.out.println("Caracter invalid. ");
				reader.nextLine();
			}
		} while (data.length() == 0);
		
		return data;
    }
    

}
