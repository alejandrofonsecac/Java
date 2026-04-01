package java.orientacaoobjetos.Xstreams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamTest07reduce {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        numbers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        numbers.stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);

        System.out.println(numbers.stream().reduce(1, Integer::sum));

        System.out.println("=========");

        numbers.stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);
    }
}
