package Ex2;

import module java.base;

public class Ex2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IO.print("Escreva seu nome: ");
        String nome = scanner.nextLine();

        IO.print("Escreva sua senha: ");
        String senha = scanner.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()-+]).{8,}$";

        Pattern pattern = Pattern.compile(regex);

        if (!nome.isBlank() && pattern.matcher(senha).matches()){
            IO.println("Cadastro efetuado com sucesso!");
        } else {
            IO.println("!!! Nome ou Senha inválidos !!!");
        }
    }
}
