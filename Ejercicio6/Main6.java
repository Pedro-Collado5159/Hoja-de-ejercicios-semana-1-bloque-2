public class Main6 {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Ana", 1500);
        Empleado e2 = new Empleado("Luis", 1800);
        Empleado e3 = new Empleado("Carlos", -500); // dará error

        // Mostrar info
        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
    }
}
