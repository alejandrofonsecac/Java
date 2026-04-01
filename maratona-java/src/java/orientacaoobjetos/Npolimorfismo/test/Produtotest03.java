package java.orientacaoobjetos.Npolimorfismo.test;

import java.orientacaoobjetos.Npolimorfismo.dominio.Computador;
import java.orientacaoobjetos.Npolimorfismo.dominio.Produto;
import java.orientacaoobjetos.Npolimorfismo.dominio.Tomate;
import java.orientacaoobjetos.Npolimorfismo.service.CalculadoraImposto;

public class Produtotest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 4000);
        Tomate tomate = new Tomate("Americano", 9);

        tomate.setDataValidade("05/01/2026");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
