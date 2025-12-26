package devdojo.orientacaoobjetos.Npolimorfismo.test;


import devdojo.orientacaoobjetos.Npolimorfismo.dominio.Computador;
import devdojo.orientacaoobjetos.Npolimorfismo.dominio.Televisao;
import devdojo.orientacaoobjetos.Npolimorfismo.dominio.Tomate;
import devdojo.orientacaoobjetos.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("R15 Vision POSITIVO", 2300);
        Tomate tomate = new Tomate("Tomate Vermelho", 10);
        Televisao televisao = new Televisao("Sansung 75\"", 7000);

        System.out.println("====================");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("====================");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("====================");
        CalculadoraImposto.calcularImposto(televisao);


    }
}
