package java.orientacaoobjetos.TclassesInternas.test;


import java.orientacaoobjetos.Sgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ClassesAnonimasTest02 {


    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>();
        barcoList.add(new Barco("Lancha"));
        barcoList.add(new Barco("Canoa"));
        barcoList.add(new Barco("A so para ver se o comparator ta certo"));

        barcoList.sort(new Comparator<Barco>() {//Uso para classes anonimas
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(barcoList);
    }
}
