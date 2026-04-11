package javacore.orientacaoobjetos.Rcolecoes.test;

import javacore.orientacaoobjetos.Rcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

        mangas.add(new Manga(1L, "Chainsaw Man", 20.7));
        mangas.add(new Manga(3L, "Berserk", 18.7));
        mangas.add(new Manga(5L, "AOT", 39.6));
        mangas.add(new Manga(4L, "Dragon Ball Z", 22.4));

        Collections.sort(mangas);
        //Ordenando por id
        for (Manga manga: mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(5L, "AOT", 39.6);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
