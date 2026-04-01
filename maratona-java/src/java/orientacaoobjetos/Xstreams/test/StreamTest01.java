package java.orientacaoobjetos.Xstreams.test;

import java.orientacaoobjetos.Xstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {

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
        ligthNovels.sort(Comparator.comparing(LigthNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LigthNovel ligthNovel : ligthNovels) {
            if (ligthNovel.getPrice() <= 8){
                titles.add(ligthNovel.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }

        System.out.println(ligthNovels);
        System.out.println(titles);
    }
}
