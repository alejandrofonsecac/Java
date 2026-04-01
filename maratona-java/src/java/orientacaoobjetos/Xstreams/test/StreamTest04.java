package java.orientacaoobjetos.Xstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> graphicDesigners = new ArrayList<>(Arrays.asList("Fransisco", "Arthur", "Mateus"));
        List<String> developers = new ArrayList<>(Arrays.asList("William", "David", "Harisson"));
        List<String> students = new ArrayList<>(Arrays.asList("Kaua", "Leonardo", "Maria"));

        list.add(graphicDesigners);
        list.add(developers);
        list.add(students);

        for (List<String> people : list) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("=======");

        list.stream()
                .flatMap(Collection::stream).forEach(System.out::println);
    }
}
