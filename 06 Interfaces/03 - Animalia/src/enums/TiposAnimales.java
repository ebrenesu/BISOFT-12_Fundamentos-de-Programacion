package enums;

public enum TiposAnimales {
	SERVIVO ("El planeta Tierra"),
	ANIMAL ("El continente"),
	PAJARO ("El cielo"),
	PERRO  ("El sofa de casa");
	
	private String _Habitad;

	private TiposAnimales(String pH){
		this._Habitad = pH;	
	}
	public String get_Habitad() {
		return _Habitad;
	}
}
