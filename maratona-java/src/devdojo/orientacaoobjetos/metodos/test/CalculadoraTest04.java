package devdojo.orientacaoobjetos.metodos.test;
import devdojo.orientacaoobjetos.metodos.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("----------");
        Calculadora calculadora = new Calculadora();

        calculadora.alteraDoisNumeros(num1,num2);

        int[] resultado = calculadora.alteraDoisNumeros(num1,num2);

        System.out.println("O array retornado da outra classe"
                + "tem tamanho de: " + resultado.length);
        System.out.println("Primeiro numero: " + resultado[0]);
        System.out.println("Segundo numero: " + resultado[1]);
    }
}
