package testesJava.SistemaDeControleDeVeiculos.test;

import testesJava.SistemaDeControleDeVeiculos.dominio.Carro;
import testesJava.SistemaDeControleDeVeiculos.dominio.TipoVeiculo;
import testesJava.SistemaDeControleDeVeiculos.dominio.Veiculo;

public class SistemCar {
    public static void main(String[] args) {
        Veiculo veiculo = new Carro("Ferrari", TipoVeiculo.CARRO, 1987, 150000);

        veiculo.exibirDetalhes(veiculo);
        veiculo.calcularIdadeVeiculo();

        veiculo.calcularManutencao();
    }
}
