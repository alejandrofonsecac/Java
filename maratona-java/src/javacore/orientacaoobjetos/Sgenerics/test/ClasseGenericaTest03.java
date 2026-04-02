package javacore.orientacaoobjetos.Sgenerics.test;

import javacore.orientacaoobjetos.Sgenerics.dominio.Barco;
import javacore.orientacaoobjetos.Sgenerics.dominio.Carro;
import javacore.orientacaoobjetos.Sgenerics.dominio.RentalService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(Arrays.asList(new Carro("Mercedes"), new Carro("BMW")));

        List<Barco> barcosDisponiveis = new ArrayList<>(Arrays.asList(new Barco("Lancha"), new Barco("Iate")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);

        Carro carro = rentalService.buscarCarroDisponivel();
        System.out.println("Usando o carro por mês: ");
        rentalService.retornarObjetoAlugado(carro);
    }
}
