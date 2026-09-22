package Ex4;

import module java.base;

public class Ex4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IO.print("Escreva seu nome: ");
        String nome = scanner.nextLine();

        IO.print("Escreva o valor do empréstimo: ");
        String textoValorEmprestimo = scanner.nextLine().replace(",", ".");

        IO.print("Escreva a quantidade de parcelas (mínimo 6, máximo 48): ");
        int qtdParcelas = scanner.nextInt();

        if (!nome.isBlank() && !textoValorEmprestimo.isBlank()){

            if (qtdParcelas > 5 && qtdParcelas < 49){
                double valorEmprestimo = Double.parseDouble(textoValorEmprestimo);
                double pagamentoMensal = valorEmprestimo * (0.03 * Math.pow(1 + 0.03, qtdParcelas)) / (Math.pow(1 + 0.03, qtdParcelas) - 1);
                double pagamentoTotal = pagamentoMensal * qtdParcelas;

                System.out.printf("""
                        \nNome do cliente: %s
                        Valor do empréstimo: $%.2f
                        Quantidade de parcelas: %d
                        Valor total pago: $%.3f
                        Valor parcela mensal: $%.3f
                        """, nome, valorEmprestimo, qtdParcelas, pagamentoTotal, pagamentoMensal);
            } else {
                IO.println("!!! Quantidade das parcelas fora do limite !!!");
            }

        } else {
            IO.println("!!! Nome e Valor do Empréstimo precisam estar preenchidos !!!");
        }
    }
}
