package javacore.orientacaoobjetos.Sgenerics.service;

import javacore.orientacaoobjetos.Sgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<Barco>(Arrays.<Barco>asList(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando carro disponivel");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + barco);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo carro " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Carros disponiveis para aluagar:");
        System.out.println(barcosDisponiveis);
    }
}
