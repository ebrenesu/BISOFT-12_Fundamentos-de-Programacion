package Logica.General.Objetos;

/**
 * Clase que representa un motor con atributos de potencia, cilindraje, peso y precio.
 */
public class Motor {
    // Atributos
    private int _Potencia;
    private String _Cilindraje;
    private int _Peso;
    private int _Precio;

    /**
     * Constructor para crear una instancia de Motor con valores iniciales.
     *
     * @param potencia   La potencia del motor.
     * @param cilindraje El cilindraje del motor.
     * @param peso       El peso del motor.
     * @param precio     El precio del motor.
     */
    public Motor(int potencia, String cilindraje, int peso, int precio) {
        _Potencia = potencia;
        _Cilindraje = cilindraje;
        _Peso = peso;
        _Precio = precio;
    }

    /**
     * Obtiene la potencia del motor.
     *
     * @return La potencia del motor.
     */
    public int getPotencia() {
        return _Potencia;
    }

    /**
     * Establece la potencia del motor.
     *
     * @param potencia La nueva potencia del motor.
     */
    public void setPotencia(int potencia) {
        _Potencia = potencia;
    }

    /**
     * Obtiene el cilindraje del motor.
     *
     * @return El cilindraje del motor.
     */
    public String getCilindraje() {
        return _Cilindraje;
    }

    /**
     * Establece el cilindraje del motor.
     *
     * @param cilindraje El nuevo cilindraje del motor.
     */
    public void setCilindraje(String cilindraje) {
        _Cilindraje = cilindraje;
    }

    /**
     * Obtiene el peso del motor.
     *
     * @return El peso del motor.
     */
    public int getPeso() {
        return _Peso;
    }

    /**
     * Establece el peso del motor.
     *
     * @param peso El nuevo peso del motor.
     */
    public void setPeso(int peso) {
        _Peso = peso;
    }

    /**
     * Obtiene el precio del motor.
     *
     * @return El precio del motor.
     */
    public int getPrecio() {
        return _Precio;
    }

    /**
     * Establece el precio del motor.
     *
     * @param precio El nuevo precio del motor.
     */
    public void setPrecio(int precio) {
        _Precio = precio;
    }
    
    public String hacerRuido() {return "tic tic tic";}
    	
}