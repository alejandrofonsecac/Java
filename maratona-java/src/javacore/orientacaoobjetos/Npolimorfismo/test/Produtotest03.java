package javacore.orientacaoobjetos.Npolimorfismo.test;

import javacore.orientacaoobjetos.Npolimorfismo.dominio.Computador;
import javacore.orientacaoobjetos.Npolimorfismo.dominio.Produto;
import javacore.orientacaoobjetos.Npolimorfismo.dominio.Tomate;
import javacore.orientacaoobjetos.Npolimorfismo.service.CalculadoraImposto;

public class Produtotest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 4000);
        Tomate tomate = new Tomate("Americano", 9);

        tomate.setDataValidade("05/01/2026");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
