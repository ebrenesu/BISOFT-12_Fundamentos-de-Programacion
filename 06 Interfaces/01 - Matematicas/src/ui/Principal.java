package ui;

import java.util.Scanner;

public class Principal {
	private static Controlador _calculadora;
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		_calculadora = new Controlador();
		int opc=-1;
		
		print("Bienvenido a este pequenno programa:");
		do {
			 print("\nEscoja una opcion:");
			 print(_calculadora.obtenerOpciones());
			 print("0) Salir");
			 opc = scanner.nextInt();
			 print(ejecutarAccion(opc));
		}while (opc != 0);

	}
	
	private static void print(String mensaje) {
		System.out.println(mensaje);
	}
	
	private static String ejecutarAccion(int opc) {
		String mens = (opc == 0) ? "\nGracias por usar esta calculadora con interfaces":"Opcion Invalida, vuelvalo a intentar";
		
		if(opc >=1 && opc <= 4)
				mens = "El resultado es: "+_calculadora.realizarOperacion(opc, pedirNumero("primer"), pedirNumero("segundo"))+"\n";
		
		return mens;
	}
	
	private static int pedirNumero(String idNum) {
		print ("Digite el " +idNum+" numero:");
		return scanner.nextInt();
	}

}
