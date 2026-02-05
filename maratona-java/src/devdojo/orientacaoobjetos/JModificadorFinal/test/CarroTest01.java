package devdojo.orientacaoobjetos.JModificadorFinal.test;

import devdojo.orientacaoobjetos.JModificadorFinal.dominio.Carro;
import devdojo.orientacaoobjetos.JModificadorFinal.dominio.Comprador;
import devdojo.orientacaoobjetos.JModificadorFinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        //carro.COMPRADOR = new Comprador();  // => Da erro pois nao posso colocar outra referencia para COMPRADOR pois ele é constante

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR); // Ira dar NULL
        carro.COMPRADOR.setNome("Alejandro");
        System.out.println(carro.COMPRADOR.getNome());

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari F40");
        ferrari.imprime();
    }
}
