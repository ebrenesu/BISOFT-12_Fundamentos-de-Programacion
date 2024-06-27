import java.util.ArrayList;
import java.util.List;

public class DepartamentoAcademico {
    private String nombre;
    private List<String> profesores;

    public DepartamentoAcademico(String nombre) {
        this.setNombre(nombre);
        this.profesores = new ArrayList<>();
    }

    public void agregarProfesor(String profesor) {
        profesores.add(profesor);
    }

    public List<String> getProfesores() {
        return profesores;
    }

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

