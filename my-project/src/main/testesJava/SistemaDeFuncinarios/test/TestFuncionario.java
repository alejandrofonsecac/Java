package testesJava.SistemaDeFuncinarios.test;

import testesJava.SistemaDeFuncinarios.dominio.Departamento;
import testesJava.SistemaDeFuncinarios.dominio.Funcionario;
import testesJava.SistemaDeFuncinarios.dominio.FuncionarioCLT;
import testesJava.SistemaDeFuncinarios.dominio.FuncionarioPJ;


public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Alejandro", 2566.4, Departamento.TI);
        Funcionario funcionario2 = new Funcionario("Mateus", 4762.4, Departamento.COMERCIAL);
        Funcionario funcionario3 = new Funcionario("Maria", 3987.4, Departamento.RH);

        Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3};

        funcionario1.imprimirFuncionario();

        funcionario1.setFuncionarios(funcionarios);
        funcionario1.imprimirFuncionarios();

        FuncionarioCLT funcionarioCLT1 = new FuncionarioCLT("Alejandro", 2566.4, Departamento.TI);
        funcionarioCLT1.setHorasExtras(4.5);
        funcionarioCLT1.imprimirFuncionario();

    }
}
