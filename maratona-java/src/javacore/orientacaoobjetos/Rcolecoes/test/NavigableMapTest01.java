package javacore.orientacaoobjetos.Rcolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {

    //{1} Poderia funcionar tambem se estivesse trabalhando com preços ou numeros, assim retornaria um elemento ou produto menor que <valor>

    //{2} No .remove podemos remover (retornar no caso do sout) um valor dentro da 'lista' que o headMap retorna

    //{3} Com o true podemos retornar todos os valores inclusive o d (D e menor que D)

    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("a", "Letra A");
        map.put("b", "Letra B");
        map.put("c", "Letra C");
        map.put("d", "Letra D");
        map.put("e", "Letra E");

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(map.headMap("c").remove("b")); //retorna todos menores do que c {1}; {2}

        System.out.println(map.headMap("d", true)); //{3}

        //Alguns outros metodos que tinha no NavigableSet e tambem tem no NavigableMap
        // lower <
        // floor <=
        // higher >
        // ceiling >=
    }
}
