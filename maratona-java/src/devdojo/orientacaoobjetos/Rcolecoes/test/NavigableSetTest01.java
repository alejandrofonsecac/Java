package devdojo.orientacaoobjetos.Rcolecoes.test;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import devdojo.orientacaoobjetos.Rcolecoes.dominio.Manga;
import devdojo.orientacaoobjetos.Rcolecoes.dominio.SmartPhone;
import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneMarcaComparator implements Comparator<SmartPhone> {

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class  MangaPrecoComparator implements  Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartPhoneMarcaComparator());
        SmartPhone smartPhone = new SmartPhone("123123", "iPhone");

        set.add(smartPhone);
        System.out.println(set);

        System.out.println("=================");

        NavigableSet<Manga> mangas = new TreeSet<>();
        // -- O treeSet sempre faz a orgnaização dos elementos com base no CompareTo


        mangas.add(new Manga(1L, "Chainsaw Man", 17.5, 46));
        mangas.add(new Manga(6L, "AOT", 29.8, 0));
        mangas.add(new Manga(3L, "Naruto", 22.5, 105));
        mangas.add(new Manga(4L, "Oshi no Ko", 49.5, 98));
        mangas.add(new Manga(7L, "Dragon Ball Z", 29.5, 0));

        for (Manga manga : mangas.descendingSet()) {//Inverter ordem
            System.out.println(manga);
        }

        System.out.println("==============");

        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(5);
        numeros.add(4);
        numeros.add(1);
        numeros.add(2);
        numeros.add(6);

        System.out.println(numeros.lower(5));// Retorna maior número menor que o valor
        System.out.println(numeros.last()); // Retorna o ultimo numero da coleção

        System.out.println(numeros.higher(1)); // Retorna menor número maior que o valor

        System.out.println(numeros.floor(3)); // Retorna menor o igual na coleção
        System.out.println(numeros.ceiling(3)); // Retorna maior ou igual

        System.out.println("Outros metodos: ");

        // Outros metodos
        System.out.println(numeros.first()); // Menor elemento da coleção
        System.out.println(numeros.last());  // Ultimo elemento da coleção (maior)
        System.out.println(numeros.pollFirst()); // Tira o primeiro elemento da coleção
        System.out.println(numeros.pollLast()); // Tira o ultimo elemento da coleção
        System.out.println(numeros.size());

        System.out.println("===");

        for (Integer number: numeros){
            System.out.println(number);
        }

        // lower <
        // floor <=
        // higher >
        // ceiling >=



    }
}
