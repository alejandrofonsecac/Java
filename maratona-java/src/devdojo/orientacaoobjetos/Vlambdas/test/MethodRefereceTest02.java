package devdojo.orientacaoobjetos.Vlambdas.test;

import devdojo.orientacaoobjetos.Vlambdas.dominio.Anime;
import devdojo.orientacaoobjetos.Vlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Reference to on instance method of a particular object
public class MethodRefereceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList =new ArrayList<>(Arrays.asList(new Anime("Berserk", 24), new Anime("Darling the Franxx", 25)));

        animeList.sort(animeComparators::compareByEpisodiesNoNEstatic);
        System.out.println(animeList);
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodiesNoNEstatic(a1, a2));
        System.out.println(animeList);
    }
}
