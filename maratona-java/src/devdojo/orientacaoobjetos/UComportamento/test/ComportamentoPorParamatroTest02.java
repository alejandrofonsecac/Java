package devdojo.orientacaoobjetos.UComportamento.test;

import devdojo.orientacaoobjetos.UComportamento.dominio.Car;
import devdojo.orientacaoobjetos.UComportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParamatroTest02 {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        cars.add(new Car("green", 1995));
        cars.add(new Car("black", 2019));
        cars.add(new Car("red", 1985));

//        filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
//
//        System.out.println(cars);
//
//        System.out.println("====");
        cars = filter(cars, (CarPredicate) car -> car.getName().equals("green"));

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();

        for (Car car: cars){
            if (carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return  filteredCar;
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e: filteredList){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
