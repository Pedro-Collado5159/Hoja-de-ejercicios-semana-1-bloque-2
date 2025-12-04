import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario("admin", "1234");

        System.out.println("=== Sistema de Login ===");
        System.out.print("Ingrese nombre de usuario: ");
        String nombre = sc.nextLine();

        if (!nombre.equals(usuario.getNombreUsuario())) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        System.out.print("Ingrese contraseña: ");
        String pass = sc.nextLine();

        if (usuario.verificarAcceso(pass)) {
            System.out.println("Acceso concedido. Bienvenido " + nombre + "!");
        } else {
            System.out.println("Acceso denegado. Contraseña incorrecta.");
            return;
        }

        System.out.println("\n¿Desea cambiar su contraseña? (si/no)");
        String opcion = sc.nextLine();

        if (opcion.equalsIgnoreCase("si")) {
            System.out.print("Contraseña actual: ");
            String actual = sc.nextLine();

            System.out.print("Nueva contraseña: ");
            String nueva = sc.nextLine();

            if (usuario.cambiarContraseña(actual, nueva)) {
                System.out.println("Contraseña cambiada correctamente.");
            } else {
                System.out.println("No se pudo cambiar la contraseña.");
            }
        }

        sc.close();
    }
}
