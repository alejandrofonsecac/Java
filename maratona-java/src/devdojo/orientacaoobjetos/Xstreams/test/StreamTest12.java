package devdojo.orientacaoobjetos.Xstreams.test;

import devdojo.orientacaoobjetos.Xstreams.dominio.Category;
import devdojo.orientacaoobjetos.Xstreams.dominio.LigthNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {

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
        Map<Category, List<LigthNovel>> categoryLighNovelMap = new HashMap<>();

        Map<Category, List<LigthNovel>> collect = ligthNovels.stream()
                .collect(Collectors.groupingBy(LigthNovel::getCategory));

        System.out.println(collect);
    }
}
