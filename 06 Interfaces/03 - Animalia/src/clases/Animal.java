package clases;
import enums.TiposAnimales;
public class Animal extends Ser_Vivo {
	int edad;

	public Animal() {
		//super.habitat = TiposAnimales.ANIMAL.get_Habitad();
	}
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDescripcionAnimal() {
		return "Este animal tiene una edad de: "+getEdad()+" y vive en "+ this.get_habitat();
	}


}
