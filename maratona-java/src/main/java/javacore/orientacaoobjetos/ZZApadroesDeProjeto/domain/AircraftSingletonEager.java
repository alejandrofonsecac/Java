package javacore.orientacaoobjetos.ZZApadroesDeProjeto.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> avaliableSeats = new HashSet<>();
    private final String name;
    {
        avaliableSeats.add("1A");
        avaliableSeats.add("1B");
    }

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public static AircraftSingletonEager getInstance(){
        return INSTANCE;
    }

    public boolean bookSeat(String seat){
        return avaliableSeats.remove(seat);
    }
}