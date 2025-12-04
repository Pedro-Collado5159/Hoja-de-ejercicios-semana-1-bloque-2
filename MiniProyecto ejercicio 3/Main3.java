public class Main3 {
    public static void main(String[] args) {

        GestorAlumnos gestor = new GestorAlumnos();

        Alumno a1 = new Alumno("Lucía", "B001", 8.7);
        Alumno a2 = new Alumno("Marco", "B002", 7.4);

        gestor.agregarAlumno(a1);
        gestor.agregarAlumno(a2);

        System.out.println("\nLista de alumnos:");
        gestor.mostrarAlumnos();

        System.out.println("\nBuscando alumno con matrícula B001:");
        Alumno encontrado = gestor.buscarAlumno("B001");

        if (encontrado != null) {
            encontrado.mostrarInfo();
            encontrado.actualizarNota(9.1);
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
}
