package Condicionais;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Aula005TabelaVerdadeExercicio {
    public static void main(String[] args) {
        
        float salario = 4563.6F;
        double taxa;

        if(salario > 34712){
            System.out.println("Sua taxa e de 37,35%");
            taxa = 37.35;
        } else if ( salario > 68508 ){
            System.out.println("Sua taxa e de 49,50%");
            taxa = 49.50;
        } else {
            System.out.println("Sua taxa e de 9,70%");
            taxa = 9.70;
        }

        

        double taxaPagar = (salario * taxa) / 100.0; //Obtem a porcentagem


        // --- .2 apos a virgula
        BigDecimal valorExato = new BigDecimal(taxaPagar);

        BigDecimal taxaPagarArredondada = valorExato.setScale(2, RoundingMode.HALF_UP);

        double salarioLiquido = salario - taxaPagar;


        System.out.println("Se seu salario e de "+salario+ " e voce recebeu uma taxa de "+taxa+ " voce deve pagar " + taxaPagarArredondada + " ao governo;");

        System.out.println("O seu salario liquido e de: "+salarioLiquido);
    }
}
