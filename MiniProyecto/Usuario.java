public class Usuario {
    private String nombreUsuario;
    private String contraseña;

    public Usuario(String nombreUsuario,String contraseña){
        this.nombreUsuario=nombreUsuario;
        this.contraseña=contraseña;
    }

    public boolean verificarAcceso(String intento){
        return this.contraseña.equals(intento);
    }

    public boolean cambiarContraseña(String actual, String nueva) {
        if (verificarAcceso(actual)) {
            if (nueva.length() >= 4) {  // Ejemplo de validación
                this.contraseña = nueva;
                return true;
            } else {
                System.out.println("La nueva contraseña debe tener al menos 4 caracteres.");
                return false;
            }
        } else {
            System.out.println("La contraseña actual no es correcta.");
            return false;
        }
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
}

