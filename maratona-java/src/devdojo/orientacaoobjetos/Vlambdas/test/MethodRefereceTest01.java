package devdojo.orientacaoobjetos.Vlambdas.test;

import devdojo.orientacaoobjetos.Vlambdas.dominio.Anime;
import devdojo.orientacaoobjetos.Vlambdas.service.AnimeComparators;

import java.util.*;

//Reference

public class MethodRefereceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<Anime>(Arrays.asList(new Anime("Berserk", 24), new Anime("One Piece", 1250), new Anime("Evangelion", 35))) {
        };

//        Collections.sort(animes, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animes.sort(AnimeComparators::compareByTitle);
        System.out.println(animes);

        animes.sort(AnimeComparators::compareByEpisodies);
        System.out.println(animes);
    }
}
