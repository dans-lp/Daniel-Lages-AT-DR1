package Ex6;

public class Ex6 {
    static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo(
                "GGQ-1688",
                "Volkswagen Gol",
                2020,
                45666
        );

        System.out.println("\n--- Veículo 1 --- ");
        veiculo1.exibirDetalhes();
        veiculo1.registrarViagem(72500.77);

        System.out.println("\n--- Veículo 1 pós-viagem --- ");
        veiculo1.exibirDetalhes();
        System.out.println("-----------------------");

        Veiculo veiculo2 = new Veiculo(
                "BNJ-6832",
                "Fiat Palio",
                2018,
                92100.30
        );

        System.out.println("\n --- Veículo 2 --- ");
        veiculo2.exibirDetalhes();
        veiculo2.registrarViagem(11000);
        System.out.println("\n--- Veículo 2 pós-viagem --- ");
        veiculo2.exibirDetalhes();

    }
}
