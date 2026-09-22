package Ex6;


public class Veiculo {

    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;


    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes(){
        System.out.printf("""
                Placa: %s
                Modelo: %s
                Ano de fabricação: %d
                Quilometragem: %.2f Km/h
                """, placa, modelo, anoFabricacao, quilometragem);
    }

    public void registrarViagem(double km){
        quilometragem += km;
    }

}
