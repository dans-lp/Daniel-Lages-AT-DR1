package Ex9;

public class ContaBancaria {
    private String titular;
    private double saldo;


    public ContaBancaria(String titular, double saldo) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular não pode ser vazio");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }

        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double valor){
        System.out.println("Depósito de $" + valor);

        if (valor <= 0){
            System.out.println("!!! Valor de depósito inválido !!!");
            return;
        }
        saldo += valor;
    }

    public void sacar(double valor){
        System.out.println("Saque de $" + valor);

        if (saldo < valor || valor == 0){
            System.out.println("!!! Saldo insuficiente para saque !!!");
            return;
        }
        saldo -= valor;
    }

    public void exibirSaldo(){
        System.out.printf("Saldo da conta de %s: $%.2f\n", titular, saldo);
    }
}
