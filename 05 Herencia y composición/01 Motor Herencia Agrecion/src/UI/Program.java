package UI;

import Logica.General.Controladores.Gestor;
import java.util.*;

public class Program {
    private static Gestor _Gestor;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("¡Bienvenido al programa!");
        _Gestor = new Gestor();
        mostrarMenuPrincipal();
    }

    /**************************************************************
     * Muestra el menú principal.
     **************************************************************/
    static void mostrarMenuPrincipal() {
        
        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Ver ejemplo de herencia");
            System.out.println("2. Ver ejemplo de agregación");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    mostrarMenuHerencia();
                    break;
                case "2":
                    mostrarMenuAgregacion();
                    break;
                case "0":
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    /**************************************************************
     * Muestra el menú del ejemplo de herencia.
     **************************************************************/
    static void mostrarMenuHerencia() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú Ejemplo de Herencia:");
            System.out.println("1. Crear nuevo vehiculo - motor.");
            System.out.println("2. Cambiar precio.");
            System.out.println("3. Cambiar peso.");
            System.out.println("4. Mostrar precio.");
            System.out.println("5. Mostrar peso.");
            System.out.println("0. Volver al menu principal.");

            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();
            System.out.print("");

            switch (opcion) {
                case "1":
                    System.out.println("Creando nuevo vehículo con motor...");
                    _Gestor.nuevoVehiculoHerencia(pedirValoresMotorVehiculo());
                    break;
                case "2":
                    System.out.print("Ingrese el nuevo precio: ");
                    _Gestor.cambiarPrecioHerencia(scanner.nextLine());
                    break;
                case "3":
                    System.out.print("Ingrese el nuevo peso: ");
                    _Gestor.cambiarPesoHerencia(scanner.nextLine());
                    break;
                case "4":
                    System.out.println("El precio del vehiculo es " + _Gestor.obtenerPrecioHerencia());
                    break;
                case "5":
                    System.out.println("El peso del vehiculo es " + _Gestor.obtenerPesoHerencia());
                    break;
                case "0":
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    /**************************************************************
     * Muestra el menú del ejemplo de agregación.
     **************************************************************/
    static void mostrarMenuAgregacion() {
        while (true) {
            System.out.println("\nMenú Ejemplo de Agregación:");
            System.out.println("1. Crear nuevo vehículo sin motor.");
            System.out.println("2. Crear nuevo vehículo con motor.");
            System.out.println("3. Cambiar precio vehiculo.");
            System.out.println("4. Cambiar peso vehiculo.");
            System.out.println("5. Mostrar precio vehiculo.");
            System.out.println("6. Mostrar precio total.");
            System.out.println("7. Mostrar peso vehiculo.");
            System.out.println("8. Mostrar peso total.");
            System.out.println("9. Opciones del motor.");
            System.out.println("0. Volver al menu principal.");

            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();
            System.out.print("");

            switch (opcion) {
                case "1":
                    System.out.println("Creando nuevo vehículo sin motor...");
                    _Gestor.nuevoVehiculoAgregacion(pedirValoresVehiculoAgregacion(false),false);
                    break;
                case "2":
                    System.out.println("Creando nuevo vehículo con motor...");
                    _Gestor.nuevoVehiculoAgregacion(pedirValoresVehiculoAgregacion(true), true);
                    break;
                case "3":
                    System.out.print("Ingrese el nuevo precio del vehiculo (chasis): ");
                    _Gestor.cambiarPrecioVehiculo(scanner.nextLine());
                    break;
                case "4":
                    System.out.print("Ingrese el nuevo peso del vehiculo (chasis): ");
                    _Gestor.cambiarPrecioVehiculo(scanner.nextLine());
                    break;
                case "5":
                    System.out.println("El precio del vehiculo (chasis) es de: " + _Gestor.obtenerPrecioAgregacion(false));
                    break;
                case "6":
                    System.out.println("El precio del vehiculo total es de: " + _Gestor.obtenerPrecioAgregacion(true));
                    break;
                case "7":
                    System.out.println("El peso del vehiculo (chasis) es de: " + _Gestor.obtenerPesoAgregacion(false));
                    break;
                case "8":
                    System.out.println("El peso del vehiculo total es de: " + _Gestor.obtenerPesoAgregacion(true));
                    break;
                case "9":
                    mostrarMenuMotor();
                    break;
                case "0":
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    /**************************************************************
     * Muestra el menú del motor en agregación.
     **************************************************************/
    static void mostrarMenuMotor() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú Motor en Agregación:");
            System.out.println("1. Crear nuevo motor.");
            System.out.println("2. Buscar motor y cambiar el precio.");
            System.out.println("3. Buscar motor y cambiar el peso.");
            System.out.println("4. Buscar motor y eliminarlo de la lista.");
            System.out.println("5. Buscar motor y mostrar el precio.");
            System.out.println("6. Buscar motor y mostrar el peso.");
            System.out.println("0. Volver al menu principal.");

            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Creando nuevo motor");
                    _Gestor.agregarMotorVehiculoAgregacion(pedirValoresMotorVehiculo());
                    break;
                case "2":
                    _Gestor.cambiarPrecioMotorVehiculo(cambioValorMotor("Nuevo precio del motor: "));
                    break;
                case "3":
                    _Gestor.cambiarPesoMotorVehiculo(cambioValorMotor("Nuevo peso del motor: "));
                    break;
                case "4":
                    _Gestor.eliminarMotorVehiculo(pedirValor("Escriba el CC del motor a eliminar: "));
                    break;
                case "5":
                    System.out.println("El precio del motor es de " +
                            (_Gestor.precioMotorVehiculo(pedirValor("Escriba el CC del motor para mostrar su precio: "))));
                    break;
                case "6":
                    System.out.println("El peso del motor es de " +
                            (_Gestor.pesoMotorVehiculo(pedirValor("Escriba el CC del motor para mostrar su peso: "))));
                    break;
                case "0":
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    /**************************************************************
     * Pide un valor al usuario con un mensaje dado.
     *
     * @param mensaje El mensaje para solicitar el valor.
     * @return El valor ingresado por el usuario.
     **************************************************************/
    private static String pedirValor(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    /**************************************************************
     * Pide valores para un motor de vehículo al usuario.
     *
     * @return Una lista de valores ingresados por el usuario.
     **************************************************************/
    public static ArrayList<String> pedirValoresMotorVehiculo() {
        ArrayList<String> valores = new ArrayList<>();

        valores.add(pedirValor("Ingrese la potencia: "));
        valores.add(pedirValor("Ingrese el cilindraje (CC): "));
        valores.add(pedirValor("Ingrese el peso en toneladas: "));
        valores.add(pedirValor("Ingrese el precio en dolares: "));

        return valores;
    }

    /**************************************************************
     * Pide un valor al usuario para un motor existente.
     *
     * @param mensaje El mensaje para solicitar el valor.
     * @return Una lista de valores ingresados por el usuario.
     **************************************************************/
    public static ArrayList<String> cambioValorMotor(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> valores = new ArrayList<>();

        valores.add(pedirValor("Ingrese el cilindraje del motor existente: "));
        valores.add(pedirValor(mensaje));

        return valores;
    }

    /**************************************************************
     * Pide valores para un vehículo en agregación al usuario.
     *
     * @param bMotor Indica si se debe pedir información del motor.
     * @return Una lista de valores ingresados por el usuario.
     **************************************************************/
    public static ArrayList<String> pedirValoresVehiculoAgregacion(boolean bMotor) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> valores = new ArrayList<>();

        valores.add(pedirValor("Ingrese el peso del vehiculo en toneladas: "));
        valores.add(pedirValor("Ingrese el precio del vehiculo en dolares: "));

        if (bMotor) {
            valores.add(pedirValor("Ingrese la potencia del motor: "));
            valores.add(pedirValor("Ingrese el cilindraje del motor: "));
            valores.add(pedirValor("Ingrese el peso del motor en toneladas: "));
            valores.add(pedirValor("Ingrese el precio del motor en dolares: "));
        }

        return valores;
    }
}
