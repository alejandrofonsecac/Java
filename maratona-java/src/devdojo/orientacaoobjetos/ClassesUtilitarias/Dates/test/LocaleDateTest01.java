package devdojo.orientacaoobjetos.ClassesUtilitarias.Dates.test;

import java.time.LocalDate;

public class LocaleDateTest01 {
    public static void main(String[] args) {

        // Local Date é imutavel, ou seja, não pode alteerar a data

        LocalDate date = LocalDate.of(2022, 12, 14); // Passando uma data especifica

        LocalDate dataAgora = LocalDate.now();

        System.out.println(date); // Retorna somente a data que podee ser util para ser salva no DB, pois e dessa mesma maneira qe ele aparece que ele e salvo no DB

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());

        System.out.println(date.isLeapYear()); //Se e ano bi-sexto ou não, retorna TRUE ou FALSE
        System.out.println(dataAgora);// retorna a data atual
    }
}
