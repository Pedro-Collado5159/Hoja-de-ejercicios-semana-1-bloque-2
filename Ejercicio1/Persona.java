public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int edad, String ciudad){
        this.ciudad=ciudad;
        this.nombre=nombre;
        this.edad=edad;
    }

    public void saludar(){
        System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y soy de " + ciudad);

    }

}
