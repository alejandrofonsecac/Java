package testesJava.SistemaDeControleDeVeiculos.dominio;

public class Carro extends Veiculo{
    private static final int KILOMETRAGEM = 387;
    private static final double CUSTOMANUTENCAOPORKM = 1.3;
    public double custoManutencao;

    public Carro(String nome, TipoVeiculo tipoVeiculo, int dataDeFabricacao, double valor) {
        super(nome, tipoVeiculo, dataDeFabricacao, valor);
    }

    @Override
    public double calcularManutencao() {
        System.out.println("Calculando preço da manutenção...");
        return custoManutencao = KILOMETRAGEM * CUSTOMANUTENCAOPORKM;
    }
}
