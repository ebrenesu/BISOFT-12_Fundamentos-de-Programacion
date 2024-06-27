package objetos;

import interfaces.OperacionMatematica;

public class Restar implements OperacionMatematica{

	@Override
	public int operacion(int a, int b) {
		return a-b;
	}

	@Override
	public String tipoCalculo() {
		return "Restar";
	}

}
