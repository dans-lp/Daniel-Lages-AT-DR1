package Ex11;

import module java.base;

public class Ex11 {
    static void main(String[] args) {
        Random random = new Random();
        List<Integer> numeroSortidos = random.ints(1, 61)
                .distinct()
                .limit(6)
                .boxed()
                .toList();

        Scanner scanner = new Scanner(System.in);
        Set<Integer> numerosUsuario = new HashSet<>();

        IO.print("Insira 6 números entre 1 e 60: ");
        int valor;
        while (numerosUsuario.size() < 6){
            valor = scanner.nextInt();
            if (valor < 1 || valor > 60){
                IO.println(" !!! Numero fora do escopo !!!");
            } else if (!numerosUsuario.add(valor)) {
                System.out.println("!!! Numero repetido !!! ");
            }
        }

        Set<Integer> acertos = new HashSet<>(numerosUsuario);
        acertos.retainAll(numeroSortidos);
        IO.println("Numero Sortidos: " + numeroSortidos);
        IO.println("Numeros acertados: " + acertos + " - Qtd: " + acertos.size());

    }
}
