package devdojo.orientacaoobjetos.UComportamento.test;

import devdojo.orientacaoobjetos.UComportamento.dominio.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComportamentoPorParamatroTest01 {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        cars.add(new Car("green", 1995));
        cars.add(new Car("black", 2019));
        cars.add(new Car("red", 1985));

        System.out.println(filterByCar(cars, "red"));
        System.out.println("====");

        System.out.println(filterByYear(cars, 1991));
    }

    private static List<Car> filterByCar(List<Car> cars, String color){
        List<Car> filterCar = new ArrayList<>();
        for (Car car: cars){
            if (car.getColor().equals(color)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterByYear(List<Car> cars, int year){
        List<Car> filterCarbyYear = new ArrayList<>();
        for (Car car: cars){
            if (car.getYear() > year){
                filterCarbyYear.add(car);
            }
        }
        return filterCarbyYear;
    }
}
