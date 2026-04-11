package javacore.orientacaoobjetos.Zconcorrencia.ZZApadroesDeProjeto.domain;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private final Set<String> avaliableSeats = new HashSet<>();
    private final String name;

    {
        avaliableSeats.add("1A");
        avaliableSeats.add("1B");
    }

    public Aircraft(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return avaliableSeats.remove(seat);
    }
}
