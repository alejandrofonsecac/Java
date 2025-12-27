package devdojo.orientacaoobjetos.Npolimorfismo.service;

import devdojo.orientacaoobjetos.Npolimorfismo.dominio.Produto;
import devdojo.orientacaoobjetos.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de impsto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        System.out.println("-------------");

        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}

