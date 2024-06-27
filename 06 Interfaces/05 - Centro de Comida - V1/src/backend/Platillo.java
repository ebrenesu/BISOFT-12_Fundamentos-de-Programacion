package backend;

public class Platillo extends aComida{
	
	public Platillo(String pNombre, String pReceta, String pPrecio) {
		super(pNombre, pReceta, pPrecio);
	}

	@Override
	public String ObtenerNombrePlatillo() {
		return this._Nombre;
	}

	@Override
	public String ObtenerReceta() {
		return this._Receta;
	}

	@Override
	public String ObtenerPrecio() {
		return this._Precio;
	}

	@Override
	public aComida ObtenerComida() {
		return this;
	}

}
