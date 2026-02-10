package devdojo.orientacaoobjetos.ClassesUtilitarias.Dates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario =  LocalDateTime.of(1984, Month.AUGUST, 6, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
    }
}
