package Condicionais;

public class Aula005OperadorTernario {
    public static void main(String[] args) {
        
        // (condição) ? verdadeiro : falso

    double salario = 6000;
    String mensagemDoar = "Vou doar 500 reais para o DevDojo";
    String mensagemNaoDoar = "Nao tenho condicoes";
    String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

    System.out.println(resultado);
    }
}
