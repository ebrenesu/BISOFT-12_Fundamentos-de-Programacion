package bisoft12.logic.interfaces;

import java.util.ArrayList;
import bisoft12.logic.objetos.ModeloBase;

public interface IRepositorio {
    public ArrayList<ModeloBase> getAll();
    public ModeloBase getById(int pID);
    public int insert(ModeloBase pModeloBase);
    public boolean update(ModeloBase pModeloBase);
    public boolean removeById(int pId);
}
