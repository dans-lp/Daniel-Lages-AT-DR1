package Ex9;

public class Ex9 {
    static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Daniel Lages", 9820.66);

        contaBancaria.exibirSaldo();
        contaBancaria.sacar(9821);
        contaBancaria.depositar(14500);
        contaBancaria.exibirSaldo();
        contaBancaria.sacar(9820.66);
        contaBancaria.exibirSaldo();

    }
}
