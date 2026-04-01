package java.orientacaoobjetos.Vlambdas.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Reference to on instance method of a particular object
public class MethodRefereceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Rimuru", "NOme 2", "Algum nome"));
        names.sort(String::compareTo);
        System.out.println(names);

        Function<String, Integer> numStringToInterger = Integer::parseInt;
        Integer num = numStringToInterger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names, "Rimuru"));
    }
}
