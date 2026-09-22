package Ex7;
import module java.base;

public class Ex7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IO.print("Nome do Aluno: ");
        String nome = scanner.nextLine();
        IO.print("Número Matrícula: ");
        String matricula = scanner.nextLine();
        IO.print("Notas [1ª 2ª 3ª]: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        IO.println("\n--- Situação Final ---");
        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);
        aluno.verificarAprovacao();
    }
}
