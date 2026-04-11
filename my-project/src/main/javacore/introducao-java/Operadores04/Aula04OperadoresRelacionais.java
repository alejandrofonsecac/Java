package Operadores04;

public class Aula04OperadoresRelacionais {

    public static void main(String[] args) {
        // <>   <=  >=  ==   !=
            //<> Maior ou menor
            // >= / <= Maior que ou Menor que
            // == Igual
            // != Diferente
            // ----- ELES SEMPRE RETORNAM VALORES BOLEANOS -----
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("IsDezMaiorQueVinte: "+ isDezMaiorQueVinte); //Retorna false ou true (0, 1)

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);  
        
        boolean isDezIgualQueVinte = 10 == 20;
        System.out.println("isDezIgualQueVinte: " + isDezIgualQueVinte);

        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezDiferenteQueVinte: " + isDezDiferenteQueVinte);
    }
}