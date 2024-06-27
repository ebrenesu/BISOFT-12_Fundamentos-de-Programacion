package clases;

import enums.TiposAnimales;
import interfaces.Sonido;

public class Perro extends Animal implements Sonido{
	private String _Raza;
	
	public Perro(){
		set_Raza("Campeche");
		super.set_Tiempo(2);
	}
	
	public Perro(String pRaza){
		set_Raza(pRaza);
		super.setEdad(3);
		super.set_Tiempo(2);
		super.habitat = TiposAnimales.PERRO.get_Habitad();
	}
	
	public Perro(String pRaza, String pHabitat){
		set_Raza(pRaza);
		super.habitat = pHabitat;
		super.setEdad(5);
		super.set_Tiempo(2);
	}
	
	public String get_Raza() {
		return _Raza;
	}

	public void set_Raza(String _Raza) {
		this._Raza = _Raza;
	}
	
	@Override
	public String emitir_sonido() {
		return "ladrar";
	}
	
	@Override
	public int pasar_tiempo() {
		return (super.pasar_tiempo() * 5);
	}
	

}
