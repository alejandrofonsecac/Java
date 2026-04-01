package java.orientacaoobjetos.Xstreams.test;

import java.orientacaoobjetos.Xstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {

    private static List<LigthNovel> ligthNovels = new ArrayList<>(Arrays.asList(
            new LigthNovel("Mushoku Tensei", 6.99),
            new LigthNovel("Re:Zero", 7.99),
            new LigthNovel("Darling The Franxx", 5.99),
            new LigthNovel("Agel Next Door", 9.99),
            new LigthNovel("Berserk", 11.99),
            new LigthNovel("No Game no Life", 13.99),
            new LigthNovel("Naruto", 4.99),
            new LigthNovel("Class Roam of The Elite", 7.99)
    ));

    // STREAMS - FIND E MATCH:
        //
        // findFirst() -> retorna o primeiro elemento encontrado (Optional)
        // findAny()   -> retorna qualquer elemento (melhor para paralelo)
        //
        // anyMatch()  -> retorna true se pelo menos UM elemento atender a condição
        // allMatch()  -> retorna true se TODOS atenderem a condição
        // noneMatch() -> retorna true se NENHUM atender a condição
        //
        // OBS: find retorna Optional, match retorna boolean
        // OBS: todos usam Predicate (condição -> true/false)

    public static void main(String[] args) {
        System.out.println(ligthNovels.stream().anyMatch(ln -> ln.getPrice() > 8));

        System.out.println(ligthNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(ligthNovels.stream().noneMatch(ln -> ln.getPrice() > 0));

        ligthNovels.stream()
                .filter(ln -> ln.getPrice() > 5)//Ele retorna o primeiro que ele achar que esta dentro da condição
                .findAny()
                .ifPresent(System.out::println);

        ligthNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LigthNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        ligthNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LigthNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
