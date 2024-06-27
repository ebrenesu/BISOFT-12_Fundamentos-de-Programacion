package bisoft12.logic.implementaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bisoft12.logic.interfaces.IRepositorio;
import bisoft12.logic.objetos.*;

public class SQL_Personas implements IRepositorio {
	private String _Table = "`Persona`";
	private Persona _Persona;
	private Connection _Conexion;
	private PreparedStatement _Stmt = null;
	private ResultSet _RS;

	public SQL_Personas() {
		CleanInstance();
	}
	
	public SQL_Personas(Connection pC) {
		CleanInstance();
		SaveConection(pC);
	}
	
	@Override
	public ArrayList<ModeloBase> getAll() {
		ArrayList<ModeloBase> Personas = new ArrayList();
		try {
			_Stmt = _Conexion.prepareStatement("SELECT * FROM "+ _Table );
			_RS = _Stmt.executeQuery();
			
			while (_RS.next())
				Personas.add(new Persona(_RS.getInt(1),_RS.getString(2),_RS.getString(3),_RS.getString(4),_RS.getString(5)));
				    
			_RS.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				_Stmt.close();
				_Conexion.close();
			} catch (SQLException e) {}
		}

		return Personas;
	}

	@Override
	public ModeloBase getById(int pID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ModeloBase pModeloBase) {
		ConvertObject(pModeloBase);
		int pID=-1;
		boolean success = false;
		//Este query esta hecho de esta manera para prevenir SQL injection. Esta tecnica se le llama PreparedStatement 
		String Query = "INSERT INTO "+ _Table +" (`ID`,`Nombre`, `Apellido_1`, `Apellido_2`, `Puesto`) VALUES (NULL,?,?,?,?);";
	
		try {
			//Adjuntamos el query al statement
			_Stmt = _Conexion.prepareStatement(Query);
			//Agregamos las variables (para cambiar los ? del query)
			_Stmt.setString(1, this._Persona.get_Nombre());
			_Stmt.setString(2, this._Persona.get_Apellido1());
			_Stmt.setString(3, this._Persona.get_Apellido2());
			_Stmt.setString(4, this._Persona.get_Puesto());
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
		}

		return _Persona.get_Id();
	}

	@Override
	public boolean update(ModeloBase pModeloBase) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(int pId) {
		return false;
	}
	
	public int getLastRecordId() {
		int perId = -1;
		
		try {
			_Stmt = _Conexion.prepareStatement("SELECT MAX(`ID`) FROM "+ _Table );
			_RS = _Stmt.executeQuery();
			
			if (_RS.next())				
				perId=_RS.getInt(1);
				    
			_RS.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return perId;
	}
	
	private void ConvertObject(ModeloBase pModeloBase) {
		this._Persona = (Persona) pModeloBase;
	}
	
	private void CleanInstance() {
		this._Persona = null;
		this._Persona = new Persona();
	}

	private void SaveConection(Connection pC) {
		_Conexion = pC;
	}
}
