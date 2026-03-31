package devdojo.orientacaoobjetos.Xstreams.test;

import devdojo.orientacaoobjetos.Xstreams.dominio.Category;
import devdojo.orientacaoobjetos.Xstreams.dominio.LigthNovel;
import devdojo.orientacaoobjetos.Xstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {

    private static List<LigthNovel> ligthNovels = new ArrayList<>(Arrays.asList(
            new LigthNovel("Mushoku Tensei", 6.99, Category.ISEKAI),
            new LigthNovel("Re:Zero", 7.99, Category.ISEKAI),
            new LigthNovel("Darling The Franxx", 5.99, Category.ROMANCE),
            new LigthNovel("Agel Next Door", 9.99, Category.ROMANCE),
            new LigthNovel("Berserk", 11.99, Category.SEINEN),
            new LigthNovel("No Game no Life", 13.99, Category.ISEKAI),
            new LigthNovel("Naruto", 4.99, Category.SHOUNEN),
            new LigthNovel("Class Roam of The Elite", 7.99, Category.SHOUNEN)
    ));
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;

        sumStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLonglStreamIterate(num);
    }

    private  static void sumStreamIterate(long num){
        System.out.println("Sum StreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();

        result = Stream.iterate(1L,i -> i + 1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + " ms");
    }

    private  static void sumLongStreamIterate(long num){
        System.out.println("Sum sumLonglStreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private  static void sumParallelLonglStreamIterate(long num){
        System.out.println("Sum sumParallelLonglStreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }
}
