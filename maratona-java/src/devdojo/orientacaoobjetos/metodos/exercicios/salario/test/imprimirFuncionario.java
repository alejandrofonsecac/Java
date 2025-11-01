package devdojo.orientacaoobjetos.metodos.exercicios.salario.test;
import devdojo.orientacaoobjetos.metodos.exercicios.salario.test.main;
import devdojo.orientacaoobjetos.metodos.exercicios.salario.dominio.Funcionario;

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
