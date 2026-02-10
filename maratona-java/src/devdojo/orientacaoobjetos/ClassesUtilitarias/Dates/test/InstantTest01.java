package devdojo.orientacaoobjetos.ClassesUtilitarias.Dates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        //Instant salva a data em ZULU TIME, que e como um UTC que serve para comparar datas entre regioes

        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());

        System.out.println(now.ofEpochSecond(3, 5_000));
    }
}
