package backend;

public abstract class aRestaurante {
	protected String _Nombre;
	public abstract String[] ObtenerMenuRestaurante();
	public abstract aComida ObtenerComid(int pId);
	public abstract void CrearComid(String pNombre, String pReceta, String pPrecio);
}
