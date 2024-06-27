package clases;
import interfaces.*;

public class Pato extends Pajaro{

	public Pato() {
		super("Ricky");
		//this.nombra("Ricky");
	}

	@Override
	public String getNombre() {
		return "Yo soy "+ this.nombre +" con "+this.pasar_tiempo()+" annos.";
	}
	


	


}
