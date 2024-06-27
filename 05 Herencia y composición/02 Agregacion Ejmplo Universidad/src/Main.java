import java.util.Scanner;

public class Main {
	private static Controlador _Gestor;
	private static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		_Gestor = new Controlador();
		print("Bienvenidos!\n");
		_Gestor.NuevaUniversidad(pedirValor("Nombre de la Universidad: "));
		
		mostrarMenuPrincipal();
        
    }
	
	static void mostrarMenuPrincipal() {
        
        while (true) {
            print("\nMenú Principal:");
            print("1. Agregar Colaborador a departamento.");
            print("2. Matricular Estudiante");
            print("3. Crear departamento");
            print("4. Listar Colaboradores");
            print("5. Listar Estudiantes");
            
            print("0. Salir");

            print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
	            case "0":
	                System.out.println("¡Hasta luego!");
                return;
                
                case "1":
                	print("Estos son los departamentos existentes:"+_Gestor.ListarDepartamentos());
                	print(_Gestor.nuevoColaborador(pedirValor("Nombre del departamento: "), pedirValor("Nombre del nuevo colaborador: ")));
                    break;
                    
                case "2":
                    _Gestor.matricularEstudiante(pedirValor("Nombre del estudiante: "), Integer.parseInt(pedirValor("Edad cumplida: ")));
                    break;
                    
                case "3":
                	_Gestor.NuevoDepartamento(pedirValor("Nombre del departamento: "));
                    break;
                    
                case "4":
                    print(_Gestor.ListarColaboradores());
                    break;
                    
                case "5":
                	print(_Gestor.ListarEstudiantes());
                    break;
                
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
    	print(mensaje);
        return scanner.nextLine();
    }
    
	/**************************************************************
	 * Funcion centralizada que imprime a pantalla
	 *
	 * @param mensaje El mensaje para solicitar el valor.
	 **************************************************************/
    private static void print(String mensaje) {
        System.out.println(mensaje);
    }
    
    
}
