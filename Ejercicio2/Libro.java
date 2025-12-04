public class Libro {
    private String título;
    private String autor;
    private int año;

    public Libro(String título, String autor, int año){
        this.autor=autor;
        this.título=título;
        this.año=año;
    }

    public void mostrarInfo(){
        System.out.println("Este libro titulado " + título +" fue publicado por " + autor +" en el año " + año);
    }
    
}
