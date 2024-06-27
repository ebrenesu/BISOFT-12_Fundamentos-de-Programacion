package principal;

import clases.*;
import enums.TiposAnimales;
import interfaces.Habitat;

public class Inicial {

	public static void main(String[] args) {	
		
		description();
		imprimir("-> Declaramos varias variables Animal [ani01,ani02, ani03]. Pajaro [paj]. Perro [per].");
		Animal ani01, ani02, ani03;
		Pajaro paj;
		Perro per;

		imprimir("-> Iniciamos las variables con valores vacios: ani01, paj, per. Luego mandamos a imprimir.\n");
		ani01 = new Animal();
		paj = new Pajaro("Albatros", "Atlantico Sur");
		per = new Perro("Labrador");
		imprimirDatosAnimal(ani01);
		imprimirDatosAnimal(paj);
		imprimirDatosAnimal(per);
		
		imprimir("-> Iniciamos las variables con valores:  ani02, ani03. Luego mandamos a imprimir.\n\n");
		ani02 = new Perro ("San Bernardo");
		ani03 = new Pajaro ("Colibri", "El patio trasero");
		imprimirDatosAnimal(ani01);
		imprimirDatosAnimal(ani02);
		imprimirDatosAnimal(ani03);
		paj = new Pato();
		imprimirDatosAnimal(paj);
		
		imprimir("-> Ahora pasamos el tiempo con cada variable: ani01, ani02, ani03.\n\n");
		pasarElTiempo(ani01);
		pasarElTiempo(ani02);
		pasarElTiempo(ani03);
		
		xoxo(TiposAnimales.ANIMAL);
		
		Ser_Vivo mutante;
		mutante = new Animal();
		mutante = new Pato();
		mutante = new Perro();
		mutante = new Pajaro();
		mutante = new Ser_Vivo();
		
	}
	
	/********************************************************
	 * Function: Pasar El Tiempo
	 * @see: Esta funcion recibe un aniaml y segÃºn su clase
	 * 		 hace el paso del tiempo en su forma unica. Luego 
	 * 		 lo imprime. 
	 * @param pAn [Animal]
	 * @return n/a
	 ********************************************************/	
	public static void pasarElTiempo(Animal pAn) {
		if (pAn.getClass() == Pajaro.class) {
			Pajaro temp = toPajaro(pAn);
			temp.aumentar_edad();
			imprimir("Para el pajaro pasaron "+ temp.pasar_tiempo()+ " annos");
		}
					
		if (pAn.getClass() == Perro.class)
			imprimir("Para el perro pasaron "+ toPerro(pAn).pasar_tiempo()+ " annos");
		
		if (pAn.getClass() == Animal.class)
			imprimir("Para el animal paso "+ pAn.pasar_tiempo()+ " annos");
	}
	
	public static void xoxo(TiposAnimales pEnum) {
		if(pEnum == TiposAnimales.ANIMAL)
			imprimir("Bienvenidos al mundo Animal");
	}
	
	
	
	/********************************************************
	 * Function: Imprimir Datos Animal
	 * @see: Esta funcion recibe un aniaml y segÃºn su clase
	 * 		 se hace el llamado a la funcion especifica 
	 * 		 de impresiÃ³n
	 * @param pAn [Animal]
	 * @return n/a
	 ********************************************************/	
	public static void imprimirDatosAnimal(Animal pAn) {
			
		if (pAn.getClass() == Pajaro.class)
			imprimirPajaro(toPajaro(pAn));
					
		else if (pAn.getClass() == Perro.class)
			imprimirPerro(toPerro(pAn));
		
		else 
			imprimirAnimal(pAn);

			
	}
	
	/********************************************************
	 * Function: Imprimir Animal
	 * @see: Funcion que permite imprimir los datos de un 
	 * 		 objeto animal
	 * @param pAn [Animal]
	 * @return n/a
	 ********************************************************/	
	public static void imprimirAnimal(Animal pAn) {
		imprimir("Los datos del animal son:");
		imprimir("==========================");
		imprimir("Descripcion: " + pAn.getDescripcionAnimal());
		imprimir("Edad: "+ pAn.getEdad());
		imprimir("Habitat: "+ pAn.get_habitat()+"\n");
	}
	
	/********************************************************
	 * Function: Imprimir Perro
	 * @see: Funcion que permite imprimir los datos de un 
	 * 		 objeto perro
	 * @param pP [Perro]
	 * @return n/a
	 ********************************************************/
	private static void imprimirPerro(Perro pP) {
		imprimir("Los datos del perro son:");
		imprimir("==========================");
		imprimir("Raza: " + pP.get_Raza());
		imprimir("Edad: "+ pP.getEdad());
		imprimir("Habitat: "+ pP.get_habitat()+"\n");
	}
	
	/********************************************************
	 * Function: Imprimir Pajaro
	 * @see: Funcion que permite imprimir los datos de un 
	 * 		 objeto pajaro
	 * @param pj [Pajaro]
	 * @return n/a
	 ********************************************************/
	private static void imprimirPajaro(Pajaro pj) {
		imprimir("Los datos del pajaro son:");
		imprimir("==========================");
		imprimir("Nombre: " + pj.getNombre());
		imprimir("Edad: "+ pj.get_edad());
		imprimir("Habitat: "+ pj.get_habitat()+"\n");
	}
	
	/********************************************************
	 * Function: Imprimir 
	 * @see: Funcion que permite imprimir a pantalla un mensaje
	 * @param message [String]
	 * @return n/a
	 ********************************************************/
	public static void imprimir(String message) {
		System.out.println(message);
	}
		
	/********************************************************
	 * Function: Convertir 
	 * @see: Funcion que permite convertir un objeto animal a
	 * 		 un objeto tipo perro
	 * @param a [Animal]
	 * @return objP [Perro]
	 ********************************************************/
	public static Perro toPerro(Animal a) {
		return (Perro)a;
	}
	
	
	/********************************************************
	 * Function: Convertir 
	 * @see: Funcion que permite convertir un objeto anima a
	 * 		 un objeto tipo pajaro
	 * @param a [Animal]
	 * @return objP [Pajaro]
	 ********************************************************/
	public static Pajaro toPajaro(Animal a) {
		return (Pajaro)a;
	}
	
	/********************************************************
	 * Function: Inicial Description 
	 * @see: Nos muestra que hace este ejercicio.
	 * @param N/A
	 * @return N/A
	 ********************************************************/
	public static void description() {
		imprimir("Este programa nos permite demostrar el uso de:");
		imprimir("- Herencia");
		imprimir("- Interfaces");
		imprimir("- Sobrecarga de metodos.");
		imprimir("- Uso de ENUM - SWITCH CASE.");
		imprimir("- Obtener y comparar la clase de un objeto.");
		imprimir("\nEn el primer nivel tenemos dos interfaces (Habitat y Tiempo). ");
		imprimir("En el segundo tenemos una clase (Ser Vivo) que implementa las interfaces del primer nivel.");
		imprimir("En el tercer nivel tenemos una clase (Animal) que hereda de (Ser Vivo). Aca tambien declaramos la interfaz (Sonido) ");
		imprimir("El cuarto nivel tiene la clase (Pajaro), que hereda de (Animal) e implementa (Sonido)");
		imprimir("Empecemos!!\n\n");
		imprimir("☺----------------------------------------------------------------------------------------------☺");
	}
}
