package ui;

import objetos.*;

public class Controlador {
	
	public int realizarOperacion(int opc, int num1, int num2 ) {
		int resultado = 0;
		switch (opc) {
			case 1:
			default:
				resultado = new Sumar().operacion(num1, num2);
			break;
			
			case 2:
				resultado = new Restar().operacion(num1, num2);
			break;
			
			case 3:
				resultado = new Dividir().operacion(num1, num2);
			break;
			
			case 4:
				resultado = new Multiplicar().operacion(num1, num2);
			break;
				
		}
		return resultado;
	}
	
	public String obtenerOpciones() {
		String menu =  "1) " + new Sumar().tipoCalculo()+"\n"+
					   "2) " + new Restar().tipoCalculo()+"\n"+
					   "3) " + new Dividir().tipoCalculo()+"\n"+
					   "4) " + new Multiplicar().tipoCalculo()+"\n";
				
		return menu;
	}
}
