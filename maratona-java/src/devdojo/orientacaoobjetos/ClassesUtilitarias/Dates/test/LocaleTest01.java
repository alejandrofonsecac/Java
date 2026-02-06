package devdojo.orientacaoobjetos.ClassesUtilitarias.Dates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeFrance = new Locale("fra", "FRA");
        Locale localeJapan = new Locale("jpn", "JPNf");
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly); // Transforma a data para um objeto e usando os padrões do país passado
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);


        System.out.println("Italia: " + df1.format(calendar.getTime())); // O .getTime retorna a hora mas tambem retorna os dias
        // .format tranforma tdoo em uma String (calendar.getTime)
        System.out.println("França: " + df2.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());// Retorna nome do pais conforme o seu Windows
        System.out.println(localeJapan.getDisplayCountry(localeJapan)); // Retorna o nome do pais conforme o padrão do pais
    }
}
