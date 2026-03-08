package devdojo.orientacaoobjetos.Rcolecoes.test;

import devdojo.orientacaoobjetos.Rcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(1L, "Chainsaw Man", 17.5, 46));
        mangas.add(new Manga(6L, "AOT", 29.8, 0));
        mangas.add(new Manga(3L, "Naruto", 22.5, 105));
        mangas.add(new Manga(4L, "Oshi no Ko", 49.5, 98));
        mangas.add(new Manga(7L, "Dragon Ball Z", 29.5, 157));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
