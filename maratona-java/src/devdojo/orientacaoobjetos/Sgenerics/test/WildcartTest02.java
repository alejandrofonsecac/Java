package devdojo.orientacaoobjetos.Sgenerics.test;

import java.util.*;

public class WildcartTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros;
        cachorros = new ArrayList<>(Arrays.asList(new Cachorro(), new Cachorro()));

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals){
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
