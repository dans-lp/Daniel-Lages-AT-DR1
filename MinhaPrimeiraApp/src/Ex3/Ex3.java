package Ex3;

import module java.base;

public class Ex3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IO.print("Escreva seu nome: ");
        String nome = scanner.nextLine();

        IO.print("Escreva o valor salário mensal: ");
        String textoSalarioMensal = scanner.nextLine().replace(",", ".");

        if (!nome.isBlank() && !textoSalarioMensal.isBlank()){
            double salarioMensal = Double.parseDouble(textoSalarioMensal);
            double salarioLiquido;

            double valorImposto;
            String textoImposto;
            if (salarioMensal >= 22847.77 && salarioMensal <= 33919.80){
                valorImposto = 0.075;
                textoImposto = "7,5%";
            } else if (salarioMensal >= 33919.80 && salarioMensal <= 45012.60) {
                valorImposto = 0.15;
                textoImposto = "15%";
            } else if (salarioMensal > 45012.60 ) {
                valorImposto = 0.275;
                textoImposto = "27,5%";
            } else {
                valorImposto = 0;
                textoImposto = "Isento";
            }

            salarioLiquido = salarioMensal + (salarioMensal * valorImposto);
            System.out.printf("""
                \nNome do usuário: %s
                Salário Mensal: $%.3f
                Valor do Imposto: %s
                Salário Líquido: $%.3f
                """, nome, salarioMensal, textoImposto, salarioLiquido
            );
        } else {
            IO.println("!!! Nome e Salário Mensal precisam estar preenchidos !!!");
        }
    }
}
