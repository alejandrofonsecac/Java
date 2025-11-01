package devdojo.orientacaoobjetos.metodos.exercicios.salario.test;
import devdojo.orientacaoobjetos.metodos.exercicios.salario.dominio.Funcionario;
import devdojo.orientacaoobjetos.metodos.exercicios.salario.test.imprimirFuncionario;
import devdojo.orientacaoobjetos.metodos.exercicios.salario.test.mediaSalarial;

public class main {
    public static void main(String[] args) {
        Funcionario[] funcionario = new Funcionario[]{new Funcionario(), new Funcionario(), new Funcionario()};
        imprimirFuncionario impressoraDeFuncionarios = new imprimirFuncionario();
        mediaSalarial  mediaSalarial = new mediaSalarial();

        funcionario[0].nome = "Joao";
        funcionario[0].idade = 18;
        funcionario[0].salario = 2000;

        funcionario[1].nome = "Maria";
        funcionario[1].idade = 19;
        funcionario[1].salario = 3000;

        funcionario[2].nome = "Pedro";
        funcionario[2].idade = 22;
        funcionario[2].salario = 4000;

        impressoraDeFuncionarios.imprimi(funcionario);
        mediaSalarial.mediaDoSalario(funcionario);
    }
}
