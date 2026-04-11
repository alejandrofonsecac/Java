package javacore.orientacaoobjetos.Bmetodos.exercicios.salario.test;

import javacore.orientacaoobjetos.Bmetodos.exercicios.salario.dominio.Funcionario;

public class mediaSalarial {
    public void mediaDoSalario(Funcionario[] funcionarios){
        double soma = 0;
        double mediaSalarial = 0;

        for (Funcionario funcionario : funcionarios){
            soma += funcionario.salario;
            mediaSalarial = soma / funcionarios.length;
        }
        System.out.println("A media salarial da empresa é de: " + mediaSalarial);
    }
}
