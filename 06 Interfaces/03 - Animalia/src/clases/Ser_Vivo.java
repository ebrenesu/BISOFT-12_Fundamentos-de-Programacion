package clases;

import enums.TiposAnimales;
import interfaces.*;

public class Ser_Vivo implements Habitat, Tiempo{
	int edad;
	public String habitat;
	private int _Tiempo = 0;
	
	@Override
	public int pasar_tiempo() {
		if(_Tiempo == 0)
			return 1;
		else
			return _Tiempo;
	}

	@Override
	public String get_habitat() {
		if(habitat == null)
			return TiposAnimales.SERVIVO.get_Habitad();
		else
			return habitat;
	}


	public void set_Tiempo(int _Tiempo) {
		this._Tiempo = _Tiempo;
	}



}
