import java.util.ArrayList;

public class Controlador {
	private Universidad _Universidad;
	private ArrayList<Estudiante> _Estudiantes;
	
	public Controlador() {
		_Universidad = null;
		_Estudiantes = new ArrayList<Estudiante>();
	}
	
	public String NuevaUniversidad(String nombre) {
		_Universidad = new Universidad(nombre);
		
		return "Universidad " + nombre + "creada";
	}
	
	public void NuevoDepartamento(String nombre) {
		_Universidad.NuevoDepartamento(nombre);
	}
	
	public String nuevoColaborador(String departamento, String nombre) {
		return this._Universidad.agregarProfesorADepartamento(departamento, nombre);
	}
	
	public void matricularEstudiante(String nombre, int edad) {
		Estudiante es = new Estudiante (nombre, edad);
		this._Estudiantes.add(es);
		this._Universidad.matricularEstudiante(es);
	}
	
	public String ListarColaboradores() {
		return this._Universidad.ListarColaboradores();
	}
	
	public String ListarEstudiantes() {
		return this._Universidad.ListarEstudiantes();
	}
	
	public String ListarDepartamentos() {
		return this._Universidad.ListarDepartamentos();
	}
}
