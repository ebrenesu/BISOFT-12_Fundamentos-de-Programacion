package backend;

import java.util.ArrayList;

public class CenfoDonalds extends aRestaurante{
	private ArrayList<aComida> _comidas;

	public CenfoDonalds() {
		this._Nombre = "CenfoDonalds";
		_comidas = new ArrayList<>();
	}
	
	@Override
	public String[] ObtenerMenuRestaurante() {
		String[] menu = new String[_comidas.size()];
        int i = 0;

        for (aComida meal : this._comidas) 
            menu[i++] = meal.ObtenerNombrePlatillo();
        

        return menu;
	}

	private void set_comidas(aComida pcomidas) {
		this._comidas.add(pcomidas);
	}


	@Override
	public aComida ObtenerComid(int pId) {
		return _comidas.get(pId);
	}


	@Override
	public void CrearComid(String pNombre, String pReceta, String pPrecio) {
		this.set_comidas(new Platillo( pNombre,  pReceta,  pPrecio));
	}

}
