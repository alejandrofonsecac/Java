package java.orientacaoobjetos.Xstreams.test;

import java.orientacaoobjetos.Xstreams.dominio.Category;
import java.orientacaoobjetos.Xstreams.dominio.LigthNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {

    private static List<LigthNovel> ligthNovels = new ArrayList<>(Arrays.asList(
            new LigthNovel("Mushoku Tensei", 6.99, Category.ISEKAI),
            new LigthNovel("Re:Zero", 7.99, Category.ISEKAI),
            new LigthNovel("Darling The Franxx", 5.99, Category.ROMANCE),
            new LigthNovel("Agel Next Door", 9.99, Category.ROMANCE),
            new LigthNovel("Berserk", 11.99, Category.SEINEN),
            new LigthNovel("No Game no Life", 13.99, Category.ISEKAI),
            new LigthNovel("Naruto", 4.99, Category.SHOUNEN),
            new LigthNovel("Class Roam of The Elite", 7.99, Category.SHOUNEN)
    ));
    public static void main(String[] args) {
        Map<Category, Long> collect = ligthNovels.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.counting()));

        System.out.println(collect);

        Map<Category, Optional<LigthNovel>> collect1 = ligthNovels.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice))));

        System.out.println(collect1);

        Map<Category, LigthNovel> collect2 = ligthNovels.stream()
                        .collect(Collectors.groupingBy(LigthNovel::getCategory,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice)), Optional::get)));

        System.out.println(collect2);

        System.out.println("==========");

        Map<Category, LigthNovel> collect3 = ligthNovels.stream()
                .collect(Collectors.toMap(LigthNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LigthNovel::getPrice))));

        System.out.println(collect3);
    }
}
