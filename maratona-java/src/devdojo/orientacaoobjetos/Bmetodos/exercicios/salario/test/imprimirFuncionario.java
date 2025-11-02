package devdojo.orientacaoobjetos.Bmetodos.exercicios.salario.test;
import devdojo.orientacaoobjetos.Bmetodos.exercicios.salario.dominio.Funcionario;

public class imprimirFuncionario {
    public void imprimi(Funcionario[] funcionario){

        for (Funcionario funcionario1 : funcionario){
            System.out.println(funcionario1.nome);
            System.out.println(funcionario1.idade);
            System.out.println(funcionario1.salario);
            System.out.println("---------------");
        }
    }
}
