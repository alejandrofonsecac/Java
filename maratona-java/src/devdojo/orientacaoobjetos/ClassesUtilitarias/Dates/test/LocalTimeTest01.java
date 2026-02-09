package devdojo.orientacaoobjetos.ClassesUtilitarias.Dates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,32,12);
        LocalTime timeNow = LocalTime.now();

        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(timeNow.getHour());
        System.out.println(timeNow.getMinute());
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
    }
}
