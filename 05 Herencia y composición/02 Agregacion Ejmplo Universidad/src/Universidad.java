import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<DepartamentoAcademico> departamentos; // Composición
    private ArrayList<Estudiante> estudiantes;  // Agregación

    public Universidad(String nombre) {
        this.nombre = nombre;
        estudiantes = new ArrayList<Estudiante>();
        this.departamentos = new ArrayList<DepartamentoAcademico>();
        
        NuevoDepartamento("Administrativo"); 
        agregarProfesorADepartamento("Administrativo", "Alvaro Ospina");
    }

    public void matricularEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public DepartamentoAcademico getDepartamento(int idDepartamento) {
        return departamentos.get(idDepartamento);
    }

    public String getNombre() {
        return nombre;
    }
    
    public void NuevoDepartamento(String nombre) {
    	this.departamentos.add(new DepartamentoAcademico(nombre));
    }
    
    public String agregarProfesorADepartamento(String nombreDepartamento, String nombreProfesor) {
    	String respuesta = "Departamento '" + nombreDepartamento + "' no encontrado.";

        for (DepartamentoAcademico departamento : departamentos) {
            if (departamento.getNombre().equals(nombreDepartamento)) {
                departamento.agregarProfesor(nombreProfesor);
                respuesta = ("Profesor '" + nombreProfesor + "' agregado al departamento '" + nombreDepartamento + "'.");
                break;
            }
        }
        return respuesta;
    }
    
	public String ListarColaboradores() {
		String listado = "";
		for (DepartamentoAcademico departamento : departamentos) {
			listado +="\n"+departamento.getNombre()+":\n";
			for (String colaborador : departamento.getProfesores()) 
				listado += colaborador;
	        
        }
		
		return listado;
			
	}
	
	public String ListarEstudiantes() {
		String listado = "";
		for (Estudiante estudiante : estudiantes) 
			listado +=estudiante.getNombre()+" - " + estudiante.getEdad() + " annos de edad";
        
		if(listado.length()==0)
			return "No hay estudiantes matriculados";
		
		return listado;
	}
	
	public String ListarDepartamentos() {
		String listado = "";
		
		for (DepartamentoAcademico departamento : departamentos) 
			listado +="\n"+departamento.getNombre()+".";
        
		return listado;
			
	}
}
