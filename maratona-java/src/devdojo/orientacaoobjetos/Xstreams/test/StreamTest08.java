package devdojo.orientacaoobjetos.Xstreams.test;

import devdojo.orientacaoobjetos.Xstreams.classes.LigthNovel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest08 {

    private static List<LigthNovel> ligthNovels = new ArrayList<>(Arrays.asList(
            new LigthNovel("Mushoku Tensei", 6.99),
            new LigthNovel("Re:Zero", 7.99),
            new LigthNovel("Darling The Franxx", 5.99),
            new LigthNovel("Agel Next Door", 9.99),
            new LigthNovel("Berserk", 11.99),
            new LigthNovel("No Game no Life", 13.99),
            new LigthNovel("Naruto", 4.99),
            new LigthNovel("Class Roam of The Elite", 7.99)
    ));

    public static void main(String[] args) {
        ligthNovels.stream()
                .map(LigthNovel::getPrice)
                .filter(price -> price > 5)
                .reduce(Double::sum)
                .ifPresent(System.out::println);


        double sum = ligthNovels.stream()
                .mapToDouble(LigthNovel::getPrice)
                .filter(price -> price > 5)
                .sum();
        System.out.println(sum);
    }
}
