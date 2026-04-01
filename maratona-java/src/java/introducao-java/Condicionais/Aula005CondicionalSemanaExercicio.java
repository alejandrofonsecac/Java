package Condicionais;

public class Aula005CondicionalSemanaExercicio {
    public static void main(String[] args) {
        
        byte dia = 5;

        switch (dia){

            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia util");
                break;
            case 3:
                System.out.println("Dia util");
                break;
            case 4:
                System.out.println("Dia util");
                break;
            case 5:
                System.out.println("Dia util");
                break;
            case 6:
                System.out.println("Dia util");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
        }

        //Segunda Forma (Achei melhor)

        byte day = 7;
        String diaHoje;
        if(day == 1 || day == 7){
            diaHoje = "Final de Semana";
        } else if(day > 7){
            diaHoje = "Dia da semana invalido";
        }else{
            diaHoje = "Dia Util";
        }

        System.out.println(diaHoje);

    }
}
