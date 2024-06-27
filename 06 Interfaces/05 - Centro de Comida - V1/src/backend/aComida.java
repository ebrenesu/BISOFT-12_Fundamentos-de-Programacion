package backend;

public abstract class aComida {
	protected String _Nombre, _Receta, _Precio;
	
	public aComida(String pNombre, String pReceta, String pPrecio) {
		this._Nombre = pNombre;
		this._Precio = pPrecio;
		this._Receta = pReceta;
	}
	
	public abstract String ObtenerNombrePlatillo();
	public abstract String ObtenerReceta();
	public abstract String ObtenerPrecio();
	public abstract aComida ObtenerComida();
}
