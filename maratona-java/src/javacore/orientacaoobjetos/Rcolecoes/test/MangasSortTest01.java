package javacore.orientacaoobjetos.Rcolecoes.test;

import javacore.orientacaoobjetos.Rcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId()); //Comparar id manga1 com id manga2
    }
}

public class MangasSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);


        //Adicionando direto no constructor
        mangas.add(new Manga(1L, "Chainsaw Man", 20.7));
        mangas.add(new Manga(1L, "Berserk", 18.7));
        mangas.add(new Manga(9L, "AOT", 39.6));
        mangas.add(new Manga(4L, "Dragon Ball Z", 22.4));

        for (Manga manga: mangas){
            System.out.println(manga);
        }

        System.out.println("============");
        //Outra forma de comparar o id
        System.out.println("Outra forma de comparar o id");

        mangas.sort(new MangaByIdComparator());
        for (Manga manga: mangas){
            System.out.println(manga);
        }

        System.out.println("==============");
        // Comparando por preço

        mangas.sort(Comparator.comparing(Manga::getPreco));
        for (Manga manga: mangas){
            System.out.println(manga);
        }

        System.out.println("==============");
        //Caso o id for igual, comparar pelo nome
        mangas.sort(null);
        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
