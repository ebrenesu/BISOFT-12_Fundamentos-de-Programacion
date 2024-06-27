package bisoft12.logic.implementaciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import bisoft12.logic.interfaces.IRepositorio;
import bisoft12.logic.objetos.*;

public class SQL_Clientes implements IRepositorio{
	private Cliente _Cliente;
	
	private void ConvertObject(ModeloBase pModeloBase) {
		this._Cliente = (Cliente) pModeloBase;
	}
	
	public SQL_Clientes(Connection conexion) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<ModeloBase> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModeloBase getById(int pID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ModeloBase pModeloBase) {
		ConvertObject(pModeloBase);
		/*int pID=-1;
		boolean success = false;
		//Este query esta hecho de esta manera para prevenir SQL injection. Esta tecnica se le llama PreparedStatement 
		String Query = "INSERT INTO "+ _Table +" (`ID`,`Nombre`, `Apellido_1`, `Apellido_2`, `Puesto`) VALUES (NULL,?,?,?,?);";
	
		try {
			//Adjuntamos el query al statement
			_Stmt = _Conexion.prepareStatement(Query);
			//Agregamos las variables (para cambiar los ? del query)
			_Stmt.setString(1, this._Cliente.get_Nombre());
			_Stmt.setString(2, this._Cliente.get_Apellido1());
			_Stmt.setString(3, this._Cliente.get_Apellido2());
			_Stmt.setString(4, this._Cliente.get_Puesto());
			//Ejecutamos la sentencia
			_Stmt.execute();
			pID = getLastRecordId();
			if(pID >= 0)
				this._Persona.set_Id(pID);

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				_Stmt.close();
				_Conexion.close();
			} catch (SQLException e) {}
		}*/
		return 0;
	}

	@Override
	public boolean update(ModeloBase pModeloBase) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(int pId) {
		// TODO Auto-generated method stub
		return false;
	}

}
