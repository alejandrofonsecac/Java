package testesJava.SistemaDeControleDeVeiculos.dominio;

public class Moto extends Veiculo{

    public Moto(String nome, TipoVeiculo tipoVeiculo, int dataDeFabricacao, double valor) {
        super(nome, tipoVeiculo, dataDeFabricacao, valor);
    }

    @Override
    public double calcularManutencao() {
        double custoManutencaoPorIdade = 225;
        double idade = calcularIdade();
        return idade * custoManutencaoPorIdade;
    }
}
