package Logica.General.Controladores;

import java.util.ArrayList;
import Logica.General.Objetos.Motor;

public class Gestor {
    private Logica.Herencia.Objeto.Vehiculo _VehiculoHerencia;
    private Logica.Agregacion.Objeto.Vehiculo _VehiculoAgregacion;

    /**************************************************************
     * Cambia el precio del vehículo usando herencia.
     *
     * @param precio El nuevo precio en formato de cadena.
     **************************************************************/
    public void cambiarPrecioHerencia(String precio) {
        _VehiculoHerencia.AgregarPrecio(Integer.parseInt(precio));
    }

    /**************************************************************
     * Cambia el peso del vehículo usando herencia.
     *
     * @param peso El nuevo peso en formato de cadena.
     **************************************************************/
    public void cambiarPesoHerencia(String peso) {
        _VehiculoHerencia.AgregarPeso(Integer.parseInt(peso));
    }

    /**************************************************************
     * Obtiene el peso del vehículo usando herencia.
     *
     * @return El peso del vehículo en formato de cadena.
     **************************************************************/
    public String obtenerPesoHerencia() {
        return _VehiculoHerencia.ObtenerPeso(true) + " toneladas";
    }

    /**************************************************************
     * Obtiene el precio del vehículo usando herencia.
     *
     * @return El precio del vehículo en formato de cadena.
     **************************************************************/
    public String obtenerPrecioHerencia() {
        return "$" + _VehiculoHerencia.ObtenerPrecio(true);
    }

    /**************************************************************
     * Crea un nuevo vehículo usando herencia.
     *
     * @param list Lista de valores para inicializar el vehículo.
     **************************************************************/
    public void nuevoVehiculoHerencia(ArrayList<String> list) {
        _VehiculoHerencia = new Logica.Herencia.Objeto.Vehiculo(
            Integer.parseInt(list.get(0)), list.get(1), Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3))
        );
    }

    /**************************************************************
     * Crea un nuevo vehículo usando agregación.
     *
     * @param list    Lista de valores para inicializar el vehículo.
     * @param bMotor  Indica si se debe agregar un motor al vehículo.
     **************************************************************/
    public void nuevoVehiculoAgregacion(ArrayList<String> list, boolean bMotor) {
        if (bMotor) {
        	ArrayList<Motor> motores = new ArrayList<>();
            motores.add(new Motor(Integer.parseInt(list.get(2)), list.get(3), Integer.parseInt(list.get(4)), Integer.parseInt(list.get(5))));
            _VehiculoAgregacion = new Logica.Agregacion.Objeto.Vehiculo(
                Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)), motores
            );
        } else {
            _VehiculoAgregacion = new Logica.Agregacion.Objeto.Vehiculo(
                Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1))
            );
        }
    }

    /**************************************************************
     * Cambia el peso del vehículo usando agregación.
     *
     * @param peso El nuevo peso en formato de cadena.
     **************************************************************/
    public void cambiarPesoVehiculo(String peso) {
        _VehiculoAgregacion.setPeso(Integer.parseInt(peso));
    }

    /**************************************************************
     * Cambia el precio del vehículo usando agregación.
     *
     * @param precio El nuevo precio en formato de cadena.
     **************************************************************/
    public void cambiarPrecioVehiculo(String precio) {
        _VehiculoAgregacion.setPrecio(Integer.parseInt(precio));
    }

    /**************************************************************
     * Obtiene el precio del vehículo usando agregación.
     *
     * @param incluirMotor Indica si se debe incluir el precio del motor.
     * @return El precio del vehículo en formato de cadena.
     **************************************************************/
    public String obtenerPrecioAgregacion(boolean incluirMotor) {
        return "$" + _VehiculoAgregacion.obtenerPrecio(incluirMotor);
    }

    /**************************************************************
     * Obtiene el peso del vehículo usando agregación.
     *
     * @param incluirMotor Indica si se debe incluir el peso del motor.
     * @return El peso del vehículo en formato de cadena.
     **************************************************************/
    public String obtenerPesoAgregacion(boolean incluirMotor) {
        return _VehiculoAgregacion.obtenerPeso(incluirMotor) + " toneladas";
    }

    /**************************************************************
     * Agrega un motor al vehículo usando agregación.
     *
     * @param list Lista de valores para inicializar el motor.
     **************************************************************/
    public void agregarMotorVehiculoAgregacion(ArrayList<String> list) {
        _VehiculoAgregacion.agregarMotor(new Motor(
            Integer.parseInt(list.get(0)), list.get(1), Integer.parseInt(list.get(2)), Integer.parseInt(list.get(3))
        ));
    }

    /**************************************************************
     * Cambia el precio de un motor en el vehículo usando agregación.
     *
     * @param list Lista de valores que incluye el número de serie del motor y el nuevo precio.
     **************************************************************/
    public void cambiarPrecioMotorVehiculo(ArrayList<String> list) {
        Motor mtr = _VehiculoAgregacion.buscarMotor(list.get(0));
        mtr.setPrecio(Integer.parseInt(list.get(1)));
    }

    /**************************************************************
     * Cambia el peso de un motor en el vehículo usando agregación.
     *
     * @param list Lista de valores que incluye el número de serie del motor y el nuevo peso.
     **************************************************************/
    public void cambiarPesoMotorVehiculo(ArrayList<String> list) {
        Motor mtr = _VehiculoAgregacion.buscarMotor(list.get(0));
        mtr.setPeso(Integer.parseInt(list.get(1)));
    }

    /**************************************************************
     * Elimina un motor del vehículo usando agregación.
     *
     * @param cc El número de serie del motor a eliminar.
     **************************************************************/
    public void eliminarMotorVehiculo(String cc) {
        _VehiculoAgregacion.eliminarMotor(_VehiculoAgregacion.buscarMotor(cc));
    }

    /**************************************************************
     * Obtiene el precio de un motor en el vehículo usando agregación.
     *
     * @param cc El número de serie del motor.
     * @return El precio del motor en formato de cadena.
     **************************************************************/
    public String precioMotorVehiculo(String cc) {
        return "$" + _VehiculoAgregacion.buscarMotor(cc).getPrecio();
    }

    /**************************************************************
     * Obtiene el peso de un motor en el vehículo usando agregación.
     *
     * @param cc El número de serie del motor.
     * @return El peso del motor en formato de cadena.
     **************************************************************/
    public String pesoMotorVehiculo(String cc) {
        return _VehiculoAgregacion.buscarMotor(cc).getPeso() + " toneladas";
    }
}
