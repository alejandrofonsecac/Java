package devdojo.orientacaoobjetos.Rcolecoes.test;

import devdojo.orientacaoobjetos.Rcolecoes.dominio.Consumidor;
import devdojo.orientacaoobjetos.Rcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Jorge");
        Consumidor consumidor2 = new Consumidor("Alejandro");
        Consumidor consumidor3 = new Consumidor("Daniel");

        Manga manga1 = new Manga(1L, "Chainsaw Man", 20.7);
        Manga manga2 = new Manga(3L, "Berserk", 18.7);
        Manga manga3 = new Manga(5L, "AOT", 39.6);
        Manga manga4 = new Manga(4L, "Dragon Ball Z", 22.4);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga3);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
