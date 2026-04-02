package javacore.orientacaoobjetos.Vlambdas.test;

import javacore.orientacaoobjetos.Vlambdas.dominio.Anime;
import javacore.orientacaoobjetos.Vlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constrctor
public class MethodRefereceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();

        List<Anime> animeList =new ArrayList<>(Arrays.asList(new Anime("Berserk", 24), new Anime("Darling the Franxx", 25)));


        animeList.sort(animeComparators::compareByEpisodiesNoNEstatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);

        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;

        System.out.println(animeBiFunction2.apply("NomesNON", 48));
    }
}
