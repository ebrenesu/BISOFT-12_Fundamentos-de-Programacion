package ui;

import logica.controladores.Controlador_Matrioska;

public class Inicial {
	private static Controlador_Matrioska _Gestor;
	
	
	public static void main(String[] args) {
		_Gestor = new Controlador_Matrioska();
		Print(_Gestor.agregar_Matrioska(1, 8));
		Print(_Gestor.agregar_Matrioska(2, 7));
		Print(_Gestor.agregar_Matrioska(3, 5));
		Print(_Gestor.agregar_Matrioska(4, 3));
		Print(_Gestor.agregar_Matrioska(5, 1));
		
		
		Print("\n"+_Gestor.obtener_info_total());

	}
	
	
	public static void Print(String pMessage) {
		System.out.println(pMessage);
	}

}
