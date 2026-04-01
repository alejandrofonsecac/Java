package java.orientacaoobjetos.Rcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);

        nomes2.add("Correa");
        nomes2.add("Kevin");
        nomes.addAll(nomes2);

        nomes.add("Jorge");
        nomes.add("Fonseca");
        nomes.remove(1);
        nomes.add("Arthur");
        nomes.add("Vinicius");
        nomes.remove("Arthur");

        for(Object nome: nomes){
            System.out.println(nome);
        }

        System.out.println("------");
        nomes.add("Correa");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println(nomes);

        System.out.println("-----------");

        List<Integer> numbers  = new ArrayList<>();
        numbers.add(1);
        System.out.println(numbers);

    }
}
