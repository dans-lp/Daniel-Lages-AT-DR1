package Ex10;

import module java.base;

public class Ex10 {
    static void main(String[] args) {
        /*

        *
        */
        String nome1, nome2, nome3;
        int qtd1, qtd2, qtd3;
        double preco1, preco2, preco3;

        Scanner scanner = new Scanner(System.in);
        IO.print("Insira o nome dos 3 produtos [Nome_1 Nome_2 Nome_3]: ");
        nome1 = scanner.next();
        nome2 = scanner.next();
        nome3 = scanner.next();

        IO.print("Insira a quantidade dos 3 produtos [Qtd_1 Qtd_2 Qtd_3]: ");
        qtd1 = scanner.nextInt();
        qtd2 = scanner.nextInt();
        qtd3 = scanner.nextInt();

        IO.print("Insira o preço unitário dos 3 produtos [Preço_1 Preço_2 Preço_3]: ");
        preco1 = scanner.nextDouble();
        preco2 = scanner.nextDouble();
        preco3 = scanner.nextDouble();

        String registro = String.format("""

                --- Produto 1 ---
                Nome: %s
                Quantidade: %d
                Preço unitário: $%.2f

                --- Produto 2 ---
                Nome: %s
                Quantidade: %d
                Preço unitário: $%.2f

                --- Produto 3 ---
                Nome: %s
                Quantidade: %d
                Preço unitário: $%.2f
                """, nome1, qtd1, preco1, nome2, qtd2, preco2, nome3, qtd3, preco3
        );

        String filePath = "src/Ex10/compras.txt";

        try {
            File file = new File(filePath);

            if (file.createNewFile()){
                IO.println("Arquivo compras.txt criado");
            } else {
                IO.println("Arquivo já existe");
            }

            FileWriter writer = new FileWriter(file);
            writer.write(registro);
            writer.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            IO.println("--- Leitura do Arquivo ---");
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String linha;
            while ((linha = reader.readLine()) != null){
                IO.println(linha);
            }
            reader.close();


        } catch (FileNotFoundException e){
            IO.println("Arquivo não encontrado");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
