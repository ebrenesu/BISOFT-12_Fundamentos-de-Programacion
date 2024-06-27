package bisoft12.logic.interfaces;

import java.util.ArrayList;
import bisoft12.logic.objetos.Persona;

public interface IRepositorio_basico {
    public ArrayList<Persona> getAll();
    public Persona getById(int pID);
    public int insert(Persona pPersona);
    public boolean update(Persona pPersona);
    public boolean removeById(int pId);
}
