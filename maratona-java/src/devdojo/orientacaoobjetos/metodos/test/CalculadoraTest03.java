package devdojo.orientacaoobjetos.metodos.test;
import devdojo.orientacaoobjetos.metodos.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideNumeros(20,4);
        System.out.println(result);
    }
}
