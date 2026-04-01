package java.orientacaoobjetos.Rcolecoes.test;

import java.orientacaoobjetos.Rcolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        //Reverseed para inverter a ordem, antes era do menor para o maior agora e o maior para o menor
        mangas.add(new Manga(1L, "Chainsaw Man", 20.7));
        mangas.add(new Manga(1L, "Berserk", 18.7));
        mangas.add(new Manga(9L, "AOT", 39.6));
        mangas.add(new Manga(4L, "Dragon Ball Z", 22.4));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}