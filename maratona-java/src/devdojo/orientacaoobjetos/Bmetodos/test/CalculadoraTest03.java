package devdojo.orientacaoobjetos.Bmetodos.test;
import devdojo.orientacaoobjetos.Bmetodos.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideNumeros(20,4);
        System.out.println(result);
        System.out.println("----------------");

        calculadora.imprimiDivisao(86,2);
    }
}
