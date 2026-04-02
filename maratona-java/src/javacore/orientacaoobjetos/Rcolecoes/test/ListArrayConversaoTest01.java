package javacore.orientacaoobjetos.Rcolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);

        Integer[] listToArray = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("============");
        Integer[] numbersArray = new Integer[4];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;
        numbersArray[3] = 4;

        List<Integer> arrayToList = new ArrayList<>(Arrays.asList(numbersArray));
        arrayToList.add(15);
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(arrayToList);

        System.out.println("===========");

        List<String> strings = Arrays.asList("1", "2");
        System.out.println(strings);
    }
}
