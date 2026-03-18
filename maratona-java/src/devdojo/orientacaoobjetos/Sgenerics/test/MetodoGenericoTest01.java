package devdojo.orientacaoobjetos.Sgenerics.test;

import devdojo.orientacaoobjetos.Sgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArraycomUmObjeto(new Barco("Canoa"));
    }

    private static <T extends Comparable<T>> List<T> criarArraycomUmObjeto(T t){
        List<T> list = new ArrayList<>();
        return list; // Ira dar erro pois T não e extensão de Comparable
    }

//    private  static <T extends Comparable<T>> List<T> criarArraycomUmObjeto(T t){
//        List<T> list = new ArrayList<>(Arrays.asList(t));
//        list.add(t);
//        return list;
//    }
}
