package SistemaFuncionarios.repository;

import SistemaFuncionarios.domain.Cargos;
import SistemaFuncionarios.domain.Funcionario;
import SistemaFuncionarios.domain.Habilidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuncionarioRepository {
    List<Funcionario> funcionarios = new ArrayList<>();

    {
        funcionarios.add(new Funcionario("João Silva", 22, 2500, Cargos.JUNIOR, Arrays.asList(Habilidades.JAVA, Habilidades.SQL)));
        funcionarios.add(new Funcionario("Maria Souza", 28, 4500, Cargos.PLENO, Arrays.asList(Habilidades.JAVA, Habilidades.SPRING)));
        funcionarios.add(new Funcionario("Carlos Oliveira", 35, 8000, Cargos.SENIOR, Arrays.asList(Habilidades.JAVA, Habilidades.AWS)));
        funcionarios.add(new Funcionario("Ana Costa", 30, 4000, Cargos.QA, Arrays.asList(Habilidades.JUNIT, Habilidades.SQL)));
        funcionarios.add(new Funcionario("Pedro Santos", 40, 5000, Cargos.RH, Arrays.asList(Habilidades.SCRUM)));
        funcionarios.add(new Funcionario("Lucas Almeida", 23, 2700, Cargos.JUNIOR, Arrays.asList(Habilidades.JAVA)));
        funcionarios.add(new Funcionario("Fernanda Lima", 29, 4800, Cargos.PLENO, Arrays.asList(Habilidades.SPRING, Habilidades.SQL)));
        funcionarios.add(new Funcionario("Ricardo Pereira", 38, 9000, Cargos.SENIOR, Arrays.asList(Habilidades.AWS, Habilidades.DOCKER)));
        funcionarios.add(new Funcionario("Juliana Rocha", 31, 4200, Cargos.QA, Arrays.asList(Habilidades.JUNIT)));
        funcionarios.add(new Funcionario("Bruno Martins", 45, 12000, Cargos.SOFTWARE_ARCHITECT, Arrays.asList(Habilidades.JAVA, Habilidades.AWS)));
        funcionarios.add(new Funcionario("Camila Ribeiro", 33, 7000, Cargos.DEVOPS_ENGINEER, Arrays.asList(Habilidades.DOCKER)));
        funcionarios.add(new Funcionario("Rafael Gomes", 36, 8500, Cargos.PRODUCT_MANAGER, Arrays.asList(Habilidades.SCRUM)));
        funcionarios.add(new Funcionario("Aline Barros", 24, 2600, Cargos.JUNIOR, Arrays.asList(Habilidades.JAVA)));
        funcionarios.add(new Funcionario("Gustavo Fernandes", 27, 4600, Cargos.PLENO, Arrays.asList(Habilidades.SQL)));
        funcionarios.add(new Funcionario("Daniela Carvalho", 41, 9500, Cargos.SENIOR, Arrays.asList(Habilidades.AWS)));
        funcionarios.add(new Funcionario("Felipe Teixeira", 34, 4300, Cargos.QA, Arrays.asList(Habilidades.JUNIT)));
        funcionarios.add(new Funcionario("Patrícia Mendes", 39, 5200, Cargos.RH, Arrays.asList(Habilidades.SCRUM)));
        funcionarios.add(new Funcionario("Eduardo Nunes", 32, 7200, Cargos.DEVOPS_ENGINEER, Arrays.asList(Habilidades.DOCKER)));
        funcionarios.add(new Funcionario("Vanessa Duarte", 37, 8800, Cargos.PRODUCT_MANAGER, Arrays.asList(Habilidades.SCRUM)));
        funcionarios.add(new Funcionario("Thiago Lopes", 44, 11500, Cargos.SOFTWARE_ARCHITECT, Arrays.asList(Habilidades.AWS)));
    }

    public List<Funcionario> getFuncionarios(){
        return funcionarios;
    }
}


