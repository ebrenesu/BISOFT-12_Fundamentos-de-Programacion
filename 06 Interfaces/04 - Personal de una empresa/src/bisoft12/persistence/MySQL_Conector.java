package bisoft12.persistence;

import java.sql.*;

public class MySQL_Conector {
	private String _Driver,_Url,_IP,_DB,_DB_User,_DB_Pass;
	private Connection conexion;
	
	public MySQL_Conector(){}
	
	/**
	 * @param ip
	 * @param bd
	 * @param usr
	 * @param pass
	 * @throws Exception 
	 */
	public MySQL_Conector(String ip, String bd, String usr, String pass) throws Exception {
		setDriver("com.mysql.cj.jdbc.Driver");
		setUrl("jdbc:mysql://"+ip+"/"+bd);
		setIP(ip);
		setBd(bd);
		setUser(usr);
		setPass(pass);
		try{ 
			AbrirConexion();
		}catch (Exception exc){ 
			throw new Exception ("Error al tratar de abrir la base de Datos"+bd+" : "+exc);
		}
	}
	public Connection AbrirConexion() throws SQLException, ClassNotFoundException	{
		Class.forName(_Driver);
		conexion = DriverManager.getConnection(this.getUrl(),this.getUsr(),this.getPass());
		return conexion;
	}
	
	public Connection CerrarConexion() throws SQLException	{ 
		conexion.close(); 
		conexion = null;
		return conexion;
	}
	
	
	
	/**
	 * @return the driver
	 */
	public String getDriver() {
		return _Driver;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return _Url;
	}
	/**
	 * @return the ip
	 */
	private String getIP() {
		return _IP;
	}
	/**
	 * @return the bd
	 */
	public String getBd() {
		return _DB;
	}
	/**
	 * @return the usr
	 */
	private String getUsr() {
		return _DB_User;
	}
	/**
	 * @return the pass
	 */
	private String getPass() {
		return _DB_Pass;
	}
	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}
	/**
	 * @param driver the driver to set
	 */
	private void setDriver(String driver) {
		this._Driver = driver;
	}
	/**
	 * @param url the url to set
	 */
	private void setUrl(String url) {
		this._Url = url;
	}
	/**
	 * @param ip the ip to set
	 */
	private void setIP(String ip) {
		this._IP = ip;
	}
	/**
	 * @param bd the bd to set
	 */
	private void setBd(String bd) {
		this._DB = bd;
	}
	/**
	 * @param usr the usr to set
	 */
	private void setUser(String usr) {
		this._DB_User = usr;
	}
	/**
	 * @param pass the pass to set
	 */
	private void setPass(String pass) {
		this._DB_Pass = pass;
	}

	

}
