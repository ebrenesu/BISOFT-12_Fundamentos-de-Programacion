package bisoft12.ui;

import java.sql.SQLException;

import bisoft12.logic.Gestor;
import bisoft12.ui.utilitarios.*;

public class Main05 {
	private static int _Salir = Menu.getSalida();
	private static Gestor _G;
	
	public static void main(String[] args) {
		crearGestor();
		int opcion = 0;
		Menu.Instrucciones();
		
		while (opcion!=_Salir) {
			Menu.MenuPrincipal();
			opcion = I_O.leerInt();
			try {
				evaluarOpcion(opcion);
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		I_O.print("\nMuchas gracias por usar el sistema.");
		I_O.print("Cenfotec® - 2023");
	}
	
	private static void crearGestor() {
		try {
			_G = new Gestor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void evaluarOpcion(int pOpc) throws SQLException, ClassNotFoundException {
		if (pOpc != _Salir)
			switch(pOpc) {
				case 1:
					crearPersona();
				break;
				case 2:
					I_O.print(_G.getAllPersonas());
				break;
				default:
					I_O.print("Opcion invalida.");
				break;
			}
		
	}
	
	private static void crearPersona() throws SQLException, ClassNotFoundException {
		String Nombre =  I_O.leerTexto("Escriba el nombre de la Persona:");
		String Ape1 =  I_O.leerTexto("\nEscriba el primer apellido de la Persona:");
		String Ape2 =  I_O.leerTexto("\nEscriba el segundo apellido de la Persona:");
		String Puesto =  I_O.leerTexto("\nEscriba el puesto que ocupa la Persona:");
		
		int id = _G.insertPersona(Nombre,Ape1,Ape2,Puesto);
		if(id>=0) 
			I_O.print("\nSe agrego la persona satisfactoriamente con el ID> "+id);
		else
			I_O.print("\nNo se puedo agregar a ["+Nombre+"] a la base de datos");
		
	}

}
