package devdojo.orientacaoobjetos.ClassesUtilitarias.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        //j.fonsec@gmail.com
        String regex = "aba";
        String text = "abaaba";
        String text2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("texto:  " + text2);
        System.out.println("Indice: 0   123456789");
        System.out.println("regex:  " + regex);
        System.out.println("Posições econtradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " ");
        }
    }
}
