package devdojo.orientacaoobjetos.Vlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class lambdaTest02 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Natsuki");
        name.add("Subaru");
        name.add("REM");

        List<Integer> integers = map(name, String::length);
        List<String> names = map(name, String::toUpperCase);
        System.out.println(integers);
        System.out.println(names);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for(T e: list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
