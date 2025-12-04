public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        System.out.println("Cuenta creada. Saldo inicial: " + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado: " + cantidad);
        } else {
            System.out.println("Error: no se puede depositar una cantidad negativa.");
        }
        System.out.println("Saldo actualizado: " + saldo);
    }
}
