package javacore.orientacaoobjetos.Zconcorrencia.ZZApadroesDeProjeto.test;

import javacore.orientacaoobjetos.Zconcorrencia.ZZApadroesDeProjeto.domain.Aircraft;
import javacore.orientacaoobjetos.Zconcorrencia.ZZApadroesDeProjeto.domain.AircraftSingletonEager;

public class AirCraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AirCraftTest01.bookSeat("1A");
    }

    static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getInstance());
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
