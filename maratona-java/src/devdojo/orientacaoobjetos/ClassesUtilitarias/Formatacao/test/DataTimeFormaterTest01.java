package devdojo.orientacaoobjetos.ClassesUtilitarias.Formatacao.test;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DataTimeFormaterTest01 {
    public static void main(String[] args) {

        // parse = String -> Objeto
        // format = objeto -> String

        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("2026-12-02", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBr);
        System.out.println(formatBr);
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
    }
}
