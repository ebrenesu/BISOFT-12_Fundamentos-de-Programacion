package bisoft12.logic;

import java.sql.SQLException;

import bisoft12.logic.implementaciones.*;
import bisoft12.logic.interfaces.*;
import bisoft12.logic.objetos.*;
import bisoft12.persistence.*;
import bisoft12.ui.utilitarios.I_O;

public class Gestor {
	private ConfigLoader _Config = new ConfigLoader();
	private IRepositorio _SQL;
	private MySQL_Conector _MySQL;
	
	public Gestor() throws Exception {
		NewConection();
	}
	
	public void insertClient() throws ClassNotFoundException, SQLException {
		updateRepositoryType(2);
		_SQL.insert(new Cliente());
	}

	public int insertPersona(String pNombre, String pApellido, String pApellido2, String pPuesto) throws SQLException, ClassNotFoundException {
		updateRepositoryType(1);
		Persona p = new Persona(pNombre,pApellido,pApellido2,pPuesto);
		return _SQL.insert(p);
	}
	
	public String getAllPersonas() throws SQLException, ClassNotFoundException{
		updateRepositoryType(1);
		String PersonList="";
		
		for (ModeloBase mb : _SQL.getAll() ) {
			Persona p = (Persona)mb;
			PersonList += "\nID = "+p.get_Id()+"\n"+
						  "NOMBRE = "+ p.get_Nombre()+"\n"+
						  "APELLIDO 1 = "+ p.get_Apellido1()+"\n"+
						  "APELLIDO 2 = "+ p.get_Apellido2()+"\n"+
						  "PUESTO = " + p.get_Puesto() +"\n"; 
		}
		
		return PersonList;
	}
	
	private void NewConection() throws Exception {
		_MySQL = new MySQL_Conector(_Config.getValue("DB_HOST")+":"+_Config.getValue("DB_PORT"),
									_Config.getValue("DB_NAME"),_Config.getValue("DB_USER"),
									_Config.getValue("DB_PASS"));
			
	}
	
	private void updateRepositoryType(int pType) throws SQLException, ClassNotFoundException {
		if(_MySQL.getConexion().isClosed())
			_MySQL.AbrirConexion();
		
		switch(pType) {
			case 1:
				_SQL = new SQL_Personas(_MySQL.getConexion());
			break;
			case 2:
				_SQL = new SQL_Clientes(_MySQL.getConexion());
			break;
			
		}
		
	}
	
	
	
	
}
