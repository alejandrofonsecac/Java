package devdojo.orientacaoobjetos.Rcolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        // Podemos usar LinkedHashMap para colocar tudo linkado (fila) assim fica ordenado
        map.put(2, "Jorge");
        map.put(3, "Mateus");
        map.put(5, "Fransisco");

        for (Integer key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        System.out.println("--------");

        for (String value: map.values()){
            System.out.println(value);
        }

        System.out.println("--------");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
