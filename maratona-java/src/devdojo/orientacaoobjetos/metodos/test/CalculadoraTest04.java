package devdojo.orientacaoobjetos.metodos.test;
import devdojo.orientacaoobjetos.metodos.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);

        //O mudança do num1 e 2 ocorre apenas na classe
        // e ele nao vem para ese main

        System.out.println(num1);
        System.out.println(num2);
    }
}
