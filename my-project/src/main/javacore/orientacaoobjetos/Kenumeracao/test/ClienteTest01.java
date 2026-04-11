package javacore.orientacaoobjetos.Kenumeracao.test;

import javacore.orientacaoobjetos.Kenumeracao.dominio.Cliente;
import javacore.orientacaoobjetos.Kenumeracao.dominio.TipoCliente;
import javacore.orientacaoobjetos.Kenumeracao.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alejandro", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Arthur", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("---------------------");
        System.out.println("O valor do desconto do produto é de:" + " " + TipoPagamento.CREDITO.calcularDesconto(100));

        System.out.println("--------------------------------");
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("PESSOA FISICA");
        System.out.println("\n" + tipoCliente2);
    }
}
