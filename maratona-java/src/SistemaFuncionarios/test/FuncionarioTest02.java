package SistemaFuncionarios.test;

import SistemaFuncionarios.domain.Cargos;
import SistemaFuncionarios.domain.Funcionario;
import SistemaFuncionarios.repository.FuncionarioRepository;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        List<Funcionario> funcionarios = funcionarioRepository.getFuncionarios();

        Map<Cargos, List<Funcionario>> collect = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargos));
        System.out.println(collect);

        System.out.println();

        Map<Cargos, Double> mediaSalarialPorCargo = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargos, Collectors.averagingDouble(Funcionario::getSalario)));
        System.out.println(mediaSalarialPorCargo);

        System.out.println();

        System.out.println("============");
        funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargos, Collectors.maxBy(Comparator.comparing(Funcionario::getSalario))))
                .forEach((cargos, funcionario) ->
                        funcionario.ifPresent(f -> System.out.println(f)));

        System.out.println();

        System.out.println("Soma dos salarios por cargo");
        Map<Cargos, Double> collect1 = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargos, Collectors.summingDouble(Funcionario::getSalario)));
        System.out.println(collect1);

        collect1.forEach(((cargos, total) -> System.out.println(cargos + " -> " + total)));

        System.out.println();

        System.out.println("=== FLAPMAP ===");

        funcionarios.stream()
                .flatMap(funcionario -> funcionario.getHabilidades().stream())
                .distinct()
                .forEach(System.out::println);

        System.out.println();

        funcionarios.stream()
                .flatMap(funcionario -> funcionario.getHabilidades().stream()
                        .map(habilidades -> funcionario.getNome() + " - " + habilidades)).
                forEach(System.out::println);
    }
}
