package testesJava.SistemaDeControleDeVeiculos.test;

import testesJava.SistemaDeControleDeVeiculos.dominio.Carro;
import testesJava.SistemaDeControleDeVeiculos.dominio.TipoVeiculo;
import testesJava.SistemaDeControleDeVeiculos.dominio.Veiculo;

public class SistemCar {
    public static void main(String[] args) {
        Veiculo veiculo = new Carro("Ferrari", TipoVeiculo.CARRO, 1987, 150000);
        Veiculo veiculo2 = new Carro("Honda", TipoVeiculo.MOTO, 2017, 20000);

        veiculo.exibirDetalhes(veiculo);


        System.out.println("Custo da manutenção: " + veiculo.calcularManutencao() + " Reais");
        System.out.println("---------------");
    }
}
