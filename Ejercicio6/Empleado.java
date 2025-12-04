public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        setSueldo(sueldo); 
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double nuevoSueldo) {
        if (nuevoSueldo < 0) {
            System.out.println("Error: el sueldo no puede ser negativo.");
        } else {
            this.sueldo = nuevoSueldo;
        }
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | Sueldo: " + sueldo + "€");
    }
}
