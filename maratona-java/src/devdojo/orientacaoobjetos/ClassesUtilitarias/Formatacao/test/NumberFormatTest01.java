package devdojo.orientacaoobjetos.ClassesUtilitarias.Formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefalt = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJPN = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJPN);
        nfa[2] = NumberFormat.getInstance(localePT);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_0000.2130;
        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(valor));
        }
    }
}
