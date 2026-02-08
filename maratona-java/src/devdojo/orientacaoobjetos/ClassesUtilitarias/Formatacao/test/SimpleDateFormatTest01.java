package devdojo.orientacaoobjetos.ClassesUtilitarias.Formatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String mascara = "yyyy.MM.dd G 'at' HH.mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat();

        System.out.println(sdf.format(new Date()));
    }
}
