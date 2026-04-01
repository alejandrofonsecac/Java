package java.orientacaoobjetos.Sgenerics.service;

import java.orientacaoobjetos.Sgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(Arrays.asList(new Carro("BMW"), new Carro("Mercedes")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro disponivel");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis para aluagar:");
        System.out.println(carrosDisponiveis);
    }
}
