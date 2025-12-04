public class Main4 {
    public static void main(String[] args){
        // Crear producto usando constructor por defecto
        Producto p1 = new Producto();

        // Crear productos usando constructor con parámetros
        Producto p2 = new Producto("Pan", 1.20, 50);
        Producto p3 = new Producto("Leche", 0.90, 30);

        // Mostrar datos
        p1.mostrarProducto();
        p2.mostrarProducto();
        p3.mostrarProducto();
    }
}
    

