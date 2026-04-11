package javacore.orientacaoobjetos.ZZApadroesDeProjeto.test;

import javacore.orientacaoobjetos.ZZApadroesDeProjeto.domain.AircraftSingletonEager;

public class AircraftSingeltonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getInstance());
        AircraftSingletonEager aircraft = AircraftSingletonEager.getInstance();
        System.out.println(aircraft.bookSeat("1A"));
    }
}
