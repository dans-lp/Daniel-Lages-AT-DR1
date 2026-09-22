package Ex8;

public class Ex8 {
    static void main(String[] args) {
        String nomeGerente = "Thiago";
        double salarioBaseGerente = 12455.70;

        String nomeEstagiario = "Daniel";
        double salarioBaseEstagiario = 1300;

        Gerente gerente = new Gerente(nomeGerente, salarioBaseGerente);
        double salarioFinalGerente = gerente.calculaSalarioFinal();

        Estagiario estagiario = new Estagiario(nomeEstagiario,salarioBaseEstagiario);
        double salarioFinalEstagiario = estagiario.calculaSalarioFinal();

        System.out.printf("""
                --- Funcionario Gerente ---
                Nome: %s
                Salário Base: $%.2f
                Salário Final (bônus de 20%%): $%.2f
                
                ---- Funcionario Estágiario ---
                Nome: %s
                Salário Base: $%.2f
                Salário Final (desconto de 10%%): $%.2f
                """,
                nomeGerente,
                salarioBaseGerente,
                salarioFinalGerente,
                nomeEstagiario,
                salarioBaseEstagiario,
                salarioFinalEstagiario
        );
    }
}
