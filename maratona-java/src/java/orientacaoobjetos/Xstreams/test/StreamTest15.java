package java.orientacaoobjetos.Xstreams.test;

import java.orientacaoobjetos.Xstreams.dominio.Category;
import java.orientacaoobjetos.Xstreams.dominio.LigthNovel;
import java.orientacaoobjetos.Xstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15 {

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
        Map<Category, DoubleSummaryStatistics> collect = ligthNovels.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory,
                        Collectors.summarizingDouble(LigthNovel::getPrice)));

        System.out.println(collect);

        java.util.Map<Category, Set<Promotion>> collect1 = ligthNovels.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));

        System.out.println(collect1);

        Map<Category, Collection<Promotion>> collect2 = ligthNovels.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(collect2);

    }

    private static Promotion getPromotion(LigthNovel ln){
        return ln.getPrice() < 8 ? Promotion.UNDER_PORMOTION: Promotion.NORMAL_PRICE;
    }
}
