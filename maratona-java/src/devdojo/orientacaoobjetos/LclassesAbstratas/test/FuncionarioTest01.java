package devdojo.orientacaoobjetos.LclassesAbstratas.test;
import devdojo.orientacaoobjetos.LclassesAbstratas.dominio.Funcionario;
import devdojo.orientacaoobjetos.LclassesAbstratas.dominio.Gerente;
import devdojo.orientacaoobjetos.LclassesAbstratas.dominio.Desenvolvedor;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Fonseca" , 10230);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alejandro" , 8900);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
