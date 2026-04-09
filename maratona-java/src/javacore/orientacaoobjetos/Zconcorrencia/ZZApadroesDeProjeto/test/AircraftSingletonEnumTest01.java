package javacore.orientacaoobjetos.Zconcorrencia.ZZApadroesDeProjeto.test;

import javacore.orientacaoobjetos.Zconcorrencia.ZZApadroesDeProjeto.domain.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args){
        bookSeat("1A");
        bookSeat("1B");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat("1A"));
    }
}
