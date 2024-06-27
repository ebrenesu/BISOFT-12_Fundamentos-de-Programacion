package bisoft12.logic.objetos;

import java.time.LocalDate;

public abstract class ModeloBase {
	private int _Id;
	private String _UpdateBy, _UpdateOn;
	/**
	 * @param _Id
	 * @param _UpdateBy
	 * @param _UpdateOn
	 */
	public ModeloBase(int pId, String pUpdateBy, String pUpdateOn) {
		set_Id(pId);
		set_UpdateBy(pUpdateBy);
		set_UpdateOn( pUpdateOn);
	}
	public ModeloBase() {
		LocalDate date = LocalDate.now();
		set_Id(-1);
		set_UpdateBy("BISOFT-12");
		set_UpdateOn(date.toString());
	}
	/**
	 * @param _Id the _Id to set
	 */
	public void set_Id(int _Id) {
		this._Id = _Id;
	}
	/**
	 * @param _UpdateBy the _UpdateBy to set
	 */
	public void set_UpdateBy(String _UpdateBy) {
		this._UpdateBy = _UpdateBy;
	}
	/**
	 * @param _UpdateOn the _UpdateOn to set
	 */
	public void set_UpdateOn(String _UpdateOn) {
		this._UpdateOn = _UpdateOn;
	}
	/**
	 * @return the _Id
	 */
	public int get_Id() {
		return _Id;
	}
	/**
	 * @return the _UpdateBy
	 */
	public String get_UpdateBy() {
		return _UpdateBy;
	}
	/**
	 * @return the _UpdateOn
	 */
	public String get_UpdateOn() {
		return _UpdateOn;
	}
	

}
