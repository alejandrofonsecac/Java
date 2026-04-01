package java.orientacaoobjetos.Rcolecoes.test;

import java.orientacaoobjetos.Rcolecoes.dominio.Consumidor;
import java.orientacaoobjetos.Rcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Jorge");
        Consumidor consumidor2 = new Consumidor("Daniel");

        Manga manga1 = new Manga(1L, "Chainsaw Man", 20.7);
        Manga manga2 = new Manga(3L, "Berserk", 18.7);
        Manga manga3 = new Manga(5L, "AOT", 39.6);
        Manga manga4 = new Manga(4L, "Dragon Ball Z", 22.4);

        List<Manga> mangaConsumidor1List = new ArrayList<>();
        mangaConsumidor1List.add(0, manga1);
        mangaConsumidor1List.add(1, manga2);
        mangaConsumidor1List.add(2, manga3);

        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangaConsumidor1List);

        for (Map.Entry<Consumidor, List<Manga>> entry: consumidorManga.entrySet()) {
            System.out.println(" ----- " + entry.getKey().getNome() + " ----- ");
            for (Manga manga: entry.getValue()){
                System.out.println(manga.getNome());
            }
        }

    }
}
