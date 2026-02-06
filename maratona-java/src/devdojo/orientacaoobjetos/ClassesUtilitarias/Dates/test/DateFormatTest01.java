package devdojo.orientacaoobjetos.ClassesUtilitarias.Dates.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getDateInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.LONG);
        df[5] = DateFormat.getDateInstance(DateFormat.FULL);
        df[6] = DateFormat.getDateInstance(DateFormat.MEDIUM); // Medium como padrão

        for(DateFormat dateFormat : df){
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
