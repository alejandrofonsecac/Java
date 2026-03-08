package devdojo.orientacaoobjetos.Rcolecoes.test;

import devdojo.orientacaoobjetos.Rcolecoes.dominio.Manga;
import devdojo.orientacaoobjetos.Rcolecoes.dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneMarcaComparator implements Comparator<SmartPhone> {

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
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

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
