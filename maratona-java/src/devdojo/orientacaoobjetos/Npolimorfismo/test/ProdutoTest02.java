package devdojo.orientacaoobjetos.Npolimorfismo.test;

import devdojo.orientacaoobjetos.Npolimorfismo.dominio.Computador;
import devdojo.orientacaoobjetos.Npolimorfismo.dominio.Produto;
import devdojo.orientacaoobjetos.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 5600);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------");
        Produto produto2 = new Tomate("Tomate Americano", 8);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
