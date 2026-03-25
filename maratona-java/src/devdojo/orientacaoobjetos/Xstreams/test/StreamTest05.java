package devdojo.orientacaoobjetos.Xstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Boa noite", "Cafe da Manha", "Estudos","Objetos"));

        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());

        List<String> letters2 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(letters2 );
    }
}
