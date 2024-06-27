package Logica.Agregacion.Objeto;

import java.util.ArrayList;
import java.util.List;

import Logica.General.Objetos.Motor;

/**
 * Clase que representa un vehículo que puede contener una lista de motores y tiene atributos de peso y precio.
 */
public class Vehiculo {
    private List<Motor> _Motores;
    private int _Peso;
    private int _Precio;

    public int getPeso() {
        return _Peso;
    }

    public void setPeso(int peso) {
        _Peso = peso;
    }

    public int getPrecio() {
        return _Precio;
    }

    public void setPrecio(int precio) {
        _Precio = precio;
    }

    /**
     * Constructor para crear un nuevo vehículo con un peso y precio iniciales.
     *
     * @param pesoVehiculo   El peso inicial del vehículo.
     * @param precioVehiculo El precio inicial del vehículo.
     */
    public Vehiculo(int pesoVehiculo, int precioVehiculo) {
        _Motores = new ArrayList<>();
        _Peso = pesoVehiculo;
        _Precio = precioVehiculo;
    }

    /**
     * Constructor para crear un nuevo vehículo con un peso y precio iniciales y una lista de motores.
     *
     * @param pesoVehiculo El peso inicial del vehículo.
     * @param precioVehiculo El precio inicial del vehículo.
     * @param motores La lista de motores asociada al vehículo.
     */
    public Vehiculo(int pesoVehiculo, int precioVehiculo, List<Motor> motores) {
        _Motores = new ArrayList<>();
        _Motores.addAll(motores);
        _Peso = pesoVehiculo;
        _Precio = precioVehiculo;
    }

    /**
     * Obtiene el peso total del vehículo.
     *
     * @param bTotal Indica si se debe incluir el peso de los motores en el cálculo.
     * @return El peso total del vehículo.
     */
    public int obtenerPeso(boolean bTotal) {
        int tPeso = _Peso;

        if (bTotal) {
            for (Motor m : _Motores) {
                tPeso += m.getPeso();
            }
        }

        return tPeso;
    }

    /**
     * Obtiene el precio total del vehículo.
     *
     * @param bTotal Indica si se debe incluir el precio de los motores en el cálculo.
     * @return El precio total del vehículo.
     */
    public int obtenerPrecio(boolean bTotal) {
        int tPrecio = _Precio;

        if (bTotal) {
            for (Motor m : _Motores) {
                tPrecio += m.getPrecio();
            }
        }

        return tPrecio;
    }

    /**
     * Agrega un motor a la lista de motores del vehículo.
     *
     * @param motor El motor a agregar.
     */
    public void agregarMotor(Motor motor) {
        _Motores.add(motor);
    }

    /**
     * Elimina un motor específico de la lista de motores del vehículo.
     *
     * @param motorAEliminar El motor a eliminar.
     */
    public void eliminarMotor(Motor motorAEliminar) {
        _Motores.remove(motorAEliminar);
    }

    /**
     * Busca un motor en la lista de motores del vehículo por cilindraje.
     *
     * @param cilindrajeABuscar El cilindraje del motor a buscar.
     * @return El motor encontrado o null si no se encuentra.
     */
    public Motor buscarMotor(String cilindrajeABuscar) {
        for (Motor m : _Motores) {
            if (m.getCilindraje().equals(cilindrajeABuscar)) {
                return m;
            }
        }
        return null;
    }
}
