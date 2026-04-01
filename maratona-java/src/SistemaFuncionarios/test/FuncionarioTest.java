package SistemaFuncionarios.test;

import SistemaFuncionarios.domain.Cargos;
import SistemaFuncionarios.domain.Funcionario;
import SistemaFuncionarios.repository.FuncionarioRepository;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuncionarioTest {
    public static void main(String[] args) {
        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        List<Funcionario> funcionarios = funcionarioRepository.getFuncionarios();

        System.out.println(funcionarios.stream()// Retorna os funcionarios com salario acima de 5000
                .filter(salario -> salario.getSalario() > 5000)
                .map(Funcionario::getNome)
                .collect(Collectors.joining(", ")));


        System.out.println("==================");

        System.out.println(funcionarios.stream()//Retorna o nome de todos os funcionarios
                .map(Funcionario::getNome)
                .collect(Collectors.joining(", ")));



        System.out.println(funcionarios.stream()
                .mapToDouble(Funcionario::getSalario)
                .average()//Para obter a media)
                .orElse(0));//O java nao sabe se ele nao ertorna nada então para ele nao retornarr Optional Double temos qe fazer tratamento

        funcionarios.stream()//Retorna funcionario mais velho
                .max(Comparator.comparing(Funcionario::getIdade))
                .ifPresent(System.out::println);


        System.out.println();

        System.out.println("Software Architects: ");
        funcionarios.stream()
                .filter(cargos -> cargos.getCargos() == Cargos.SOFTWARE_ARCHITECT)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Primeiro funcionario com mais de 4000 reais de salario: ");
        funcionarios.stream()
                .filter(salario -> salario.getSalario() > 4000)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println();

        System.out.println("===========");
       funcionarioRepository.getFuncionarios().stream()
               .sorted(Comparator.comparing(Funcionario::getSalario))
               .forEach(System.out::println);

        System.out.println();

        Map<Cargos, Funcionario> collect = funcionarios.stream()
                .collect(Collectors.toMap(Funcionario::getCargos, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(Funcionario::getNome))));
        System.out.println(collect);
    }
}
