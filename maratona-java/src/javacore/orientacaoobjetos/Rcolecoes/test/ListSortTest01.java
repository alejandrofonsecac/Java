package javacore.orientacaoobjetos.Rcolecoes.test;

import javacore.orientacaoobjetos.Rcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("AOT");
        mangas.add("Chainsaw Man");
        mangas.add("Pokemon");
        mangas.add("Berserk");

        Collections.sort(mangas);

        for (String manga: mangas){
            System.out.println(manga);
        }

        System.out.println("=============");

        List<Double> saldos = new ArrayList<>();
        saldos.add(23423.1D);
        saldos.add(905.0D);
        saldos.add(1567.5D);
        Collections.sort(saldos);

        for (Double saldo : saldos){
            System.out.println(saldo);
        }

        new Manga(null, null, 0);
    }
}
