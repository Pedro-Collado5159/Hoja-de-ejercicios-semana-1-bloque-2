public class Alumno {
    private String nombre;
    private String matrícula;
    private double notaMedia;

    public Alumno(String nombre, String matrícula, double notaMedia){
        this.nombre=nombre;
        this.matrícula=matrícula;
        this.notaMedia=notaMedia;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre +  ", Matrícula: " + matrícula  +", Nota media: " + notaMedia);
    }

    public void actualizarNota(double nuevaNota){
        this.notaMedia=nuevaNota;
        System.out.println("Nota media actualizada a: " + nuevaNota);
    }

    public String getMatricula(){
        return matrícula;
    }
}
