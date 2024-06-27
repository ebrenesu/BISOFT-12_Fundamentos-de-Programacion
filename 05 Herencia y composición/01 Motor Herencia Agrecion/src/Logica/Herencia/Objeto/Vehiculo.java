package Logica.Herencia.Objeto;

import Logica.General.Objetos.Motor;


/**************************************************************
 * Clase que representa un vehículo que hereda características 
 * de un motor.
 **************************************************************/
public class Vehiculo extends Motor {
    // Atributos específicos de Vehiculo
    private int _Peso1;
    private int _Precio1;

    /**************************************************************
     * Constructor para crear un nuevo vehículo con características 
     * de motor.
     *
     * @param potencia   La potencia del motor del vehículo.
     * @param cilindraje El cilindraje del motor del vehículo.
     * @param peso       El peso del motor del vehículo.
     * @param precio     El precio del motor del vehículo.
     **************************************************************/
    public Vehiculo(int potencia, String cilindraje, int peso, int precio) {
        super(potencia, cilindraje, peso, precio); // Llama al constructor de la clase base (Motor)
        _Peso1 = 0;
        _Precio1 = 0;
    }

    /**************************************************************
     * Agrega un valor de peso adicional al vehículo.
     *
     * @param peso El valor de peso a agregar.
     **************************************************************/
    public void AgregarPeso(int peso) {
        _Peso1 = peso;
    }

    /**************************************************************
     * Agrega un valor de precio adicional al vehículo.
     *
     * @param precio El valor de precio a agregar.
     **************************************************************/
    public void AgregarPrecio(int precio) {
        _Precio1 = precio;
    }

    /**************************************************************
     * Obtiene el peso total del vehículo, incluyendo el peso.
     *
     * @param bTotal Indica si se debe incluir el peso del motor.
     * @return El peso total del vehículo.
     **************************************************************/
    public int ObtenerPeso(boolean bTotal) {
        if (bTotal)
            return super.getPeso() + _Peso1; // Suma el peso del motor y el peso adicional.
        else
            return _Peso1; // Solo devuelve el peso adicional.
    }

    /**************************************************************
     * Obtiene el precio total del vehículo, incluyendo el precio.
     *
     * @param bTotal Indica si se debe incluir el precio del motor.
     * @return El precio total del vehículo.
     **************************************************************/
    public int ObtenerPrecio(boolean bTotal) {
        if (bTotal)
            return super.getPrecio() + _Precio1; // Suma el precio del motor y el precio adicional.
        else
            return _Precio1; // Solo devuelve el precio adicional.
    }
}




/****************************************************************************************************
 * Problemas 
 ****************************************************************************************************
 * 1) Herencia: Esta herencia parece indicar que un vehículo es un tipo de motor.  Sin embargo, esto
 *  parece ser una estructura confusa. La herencia debería reflejar una relación "es un" entre las 
 *  clases, y un vehículo no es un tipo de motor. En su lugar, podría haber una composición o
 *  asociación entre un vehículo y un motor.
 * 2) Confusión de nombres: Los nombres _Peso1 y _Precio1 pueden ser confusos, ya que no proporcionan
 *  una clara distinción entre los campos de la clase base Motor y los campos específicos de la clase 
 *  Vehiculo. Sería útil utilizar nombres más descriptivos que indiquen claramente su propósito.
 * 3) Duplicación de campos: Aunque ahora no tienes campos duplicados con la clase base Motor, aún 
 *  se mantienen los campos de peso y precio en ambas clases. Esto puede ser innecesario si los campos
 *   en la clase base son suficientes para representar estas propiedades. 
 *****************************************************************************************************/
