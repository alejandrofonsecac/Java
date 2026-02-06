package devdojo.orientacaoobjetos.ClassesUtilitarias.Dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo e o primeiro dia da semana");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.DAY_OF_MONTH, 3);// Adiciona 3 dias ao dia do mes de agora
        c.add(Calendar.HOUR, 2);
        c.roll(Calendar.HOUR, 12); // Mesmo se passar das 24h ele nao muda o dia, afeta a hora apenas
        date = c.getTime();
        System.out.println(date);
    }
}
