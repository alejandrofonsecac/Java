package devdojo.orientacaoobjetos.metodos.test;
import devdojo.orientacaoobjetos.metodos.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaNumeros();
        System.out.println("Finalizando soma dos numeros");
        calc.subtraiNumeros();
        System.out.println("Finalizando subtração dos numeros");
    }
}
