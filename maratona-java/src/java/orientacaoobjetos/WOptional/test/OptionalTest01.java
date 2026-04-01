package java.orientacaoobjetos.WOptional.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("FNM");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("==========");

        Optional<String> nameOptional = findName("Alejandro");
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);
    }

    private static Optional<String> findName(String name){
        List<String> names = new ArrayList<>(Arrays.asList("Jorge", "Alejandro"));
        int i = names.indexOf(name);
        if (i != 0){
            return Optional.empty();
        }
        return null;
    }
}
