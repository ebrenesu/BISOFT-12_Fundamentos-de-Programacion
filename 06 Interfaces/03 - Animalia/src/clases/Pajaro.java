package clases;

import interfaces.*;

public class Pajaro extends Animal implements Sonido {
	String nombre;
	
	public Pajaro() {setNombre("piolin");}
	
	public Pajaro(String pNombre){
		setNombre(pNombre);
		super.set_Tiempo(3);
	}
	
	public Pajaro(String pNombre, String pHabitat){
		setNombre(pNombre);
		super.habitat = pHabitat;
		super.set_Tiempo(3);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void aumentar_edad() {
		super.setEdad(super.pasar_tiempo() + super.getEdad());
	}
	
	public int get_edad() {
		return super.getEdad();
	}
	
	@Override
	public String emitir_sonido() {
		return "trina";
	}
}
