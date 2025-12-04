import java.util.ArrayList;

public class GestorAlumnos {

    private ArrayList<Alumno> alumnos;

    public GestorAlumnos() {
        alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
        System.out.println("Alumno añadido correctamente.");
    }

    public Alumno buscarAlumno(String matricula) {
        for (Alumno a : alumnos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }

    public void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno a : alumnos) {
                a.mostrarInfo();
            }
        }
    }
}
