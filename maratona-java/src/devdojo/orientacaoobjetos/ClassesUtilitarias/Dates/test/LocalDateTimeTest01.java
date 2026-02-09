package devdojo.orientacaoobjetos.ClassesUtilitarias.Dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2026-08-14");
        LocalTime time = LocalTime.of(9, 55, 3); // tambem e possivel usar o parse

        LocalDateTime ltd1 = date.atTime(time);
        System.out.println(ltd1);

        System.out.println(localDateTime);
        System.out.println(date);
    }
}
