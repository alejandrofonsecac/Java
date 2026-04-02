package javacore.orientacaoobjetos.Xstreams.test;

import javacore.orientacaoobjetos.Xstreams.dominio.LigthNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest11ToDoble {

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
        System.out.println(ligthNovels.stream().count());
        System.out.println(ligthNovels.stream().collect(Collectors.counting()));

        ligthNovels.stream()
                .max(Comparator.comparing(LigthNovel::getPrice))
                .ifPresent(System.out::println);

        ligthNovels.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice)))
                .ifPresent(System.out::println);

        System.out.println("===========");

        System.out.println(ligthNovels.stream()
                .mapToDouble(LigthNovel::getPrice).sum());

        System.out.println(ligthNovels.stream()
                .collect(Collectors.summingDouble(LigthNovel::getPrice)));

        System.out.println("=============");

        ligthNovels.stream()
                .mapToDouble(LigthNovel::getPrice)
                .average()
                .ifPresent(System.out::println);

        System.out.println(ligthNovels.stream()
                .collect(Collectors.averagingDouble(LigthNovel::getPrice)));

        System.out.println("==============");

        DoubleSummaryStatistics collect = ligthNovels.stream()
                .collect(Collectors.summarizingDouble(LigthNovel::getPrice));

        System.out.println(collect);
        //collect.getMax()
        //collect.getMin()
        //collect.getCount()


        System.out.println(ligthNovels.stream()
                .map(LigthNovel::getTitle)
                .collect(Collectors.joining(", ")));
    }
}
