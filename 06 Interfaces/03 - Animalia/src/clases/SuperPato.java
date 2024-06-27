package clases;

import interfaces.*;

public abstract class SuperPato implements Habitat, Tiempo{
	public int edad = 0;
	public String nombre;
	
	public void nombra(String pNombre) {
		nombre = pNombre;
	}
	
	public abstract String getNombre();
	
	@Override
	public int pasar_tiempo() {
		edad = (int) Math.random();
		return edad + 1;
	}

}
