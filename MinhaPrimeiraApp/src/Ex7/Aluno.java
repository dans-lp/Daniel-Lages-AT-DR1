package Ex7;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;


    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao(){
        double media = calcularMedia();
        String resultado = (media >= 7) ? "Aprovado" : "Reprovado";
        System.out.printf("""
                Aluno: %s
                Matrícula: %s
                Nota 1: %.2f | Nota 2: %.2f | Nota 3: %.2f
                Media: %.2f | Situação: %s
                """, nome, matricula, nota1, nota2, nota3, media, resultado
        );

    }
}
