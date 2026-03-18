package devdojo.orientacaoobjetos.Sgenerics.test;

import devdojo.orientacaoobjetos.Sgenerics.dominio.Barco;
import devdojo.orientacaoobjetos.Sgenerics.dominio.Carro;
import devdojo.orientacaoobjetos.Sgenerics.service.BarcoRentavelService;
import devdojo.orientacaoobjetos.Sgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        BarcoRentavelService carroRentavelService = new BarcoRentavelService();
        Barco barco = carroRentavelService.buscarBarcoDisponivel();

        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarBarcoAlugado(barco);
    }
}
