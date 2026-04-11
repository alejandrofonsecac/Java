package javacore.orientacaoobjetos.Sgenerics.test;

import javacore.orientacaoobjetos.Sgenerics.dominio.Barco;
import javacore.orientacaoobjetos.Sgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        BarcoRentavelService carroRentavelService = new BarcoRentavelService();
        Barco barco = carroRentavelService.buscarBarcoDisponivel();

        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarBarcoAlugado(barco);
    }
}
