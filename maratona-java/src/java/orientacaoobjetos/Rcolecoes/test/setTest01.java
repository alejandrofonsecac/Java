package java.orientacaoobjetos.Rcolecoes.test;

import java.orientacaoobjetos.Rcolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class setTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        //Podemos sar LinkedHashSet para aparecer na ordem de incersão poise uma lista ligada
        // -- Set e um conjnto que não permite elemeentos duplicados.
        //    e ele não tem indice
        mangas.add(new Manga(1L, "Chainsaw Man", 17.5, 46));
        mangas.add(new Manga(6L, "AOT", 29.8, 0));
        mangas.add(new Manga(3L, "Naruto", 22.5, 105));
        mangas.add(new Manga(4L, "Oshi no Ko", 49.5, 98));
        mangas.add(new Manga(7L, "Dragon Ball Z", 29.5, 0));


        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
