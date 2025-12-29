package testesJava.SistemaDeControleDeVeiculos.dominio;

public class Carro extends Veiculo{
    public double custoManutencao;

    public Carro(String nome, TipoVeiculo tipoVeiculo, int dataDeFabricacao, double valor) {
        super(nome, tipoVeiculo, dataDeFabricacao, valor);
    }

    @Override
    public double calcularManutencao() {
        double custoPorKm = 1.3;
        double KILOMETRAGEM = 314;
        System.out.println("Calculando preço da manutenção...");
        return custoManutencao = KILOMETRAGEM * custoPorKm;
    }
}
