public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(){
        nombre="Sin nombre";
        precio=0.0;
        stock=0;
    }

    public Producto(String nombre,double precio,int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    void mostrarProducto() {
        System.out.println(nombre + " - " + precio + "$ - Stock: " + stock);
    }
}

