package javacore.orientacaoobjetos.Vlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class lambdaTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Arthur");
        names.add("Vinicius");
        names.add("Chris");
        forEach(names, (s) -> System.out.println(s));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T e: list){
            consumer.accept(e);
        }
    }
}
