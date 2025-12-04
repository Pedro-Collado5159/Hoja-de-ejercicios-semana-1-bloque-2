public class Main {
    public static void main(String[] args) {
        // Crear una cuenta con titular y saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);

        // Consultar el saldo
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        // Hacer un depósito válido
        cuenta.depositar(500);

        // Intentar un depósito negativo
        cuenta.depositar(-200);

        // Consultar el saldo final
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
