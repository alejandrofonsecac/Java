package javacore.orientacaoobjetos.Xstreams.test;

import javacore.orientacaoobjetos.Xstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {

    //1. Order by Title
    //2. Order the first 3 titles with price less than 8 dolars
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
        System.out.println(ligthNovels);

        List<String> titles = ligthNovels.stream()
                .sorted(Comparator.comparing(LigthNovel::getTitle))
                .filter(ln -> ln.getPrice() >= 8)
                .limit(3)
                .map(LigthNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
