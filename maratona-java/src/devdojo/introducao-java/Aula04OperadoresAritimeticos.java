public class Aula04OperadoresAritimeticos {
    public static void main (String[] args){
        //O resultado de dois numeros int deve ser int!!!

        int n1 = 10;
        int n2 = 20;
        int res = n1 * n2;
        System.out.println(res);

        double n3 = 10;
        double n4 = 20;
        double res2 = n3 / n4;
        System.out.println(res2);

        // Resto (%)
            //Serve para par e impar
        int resto = 21 % 3;
        System.out.println(resto);

        
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
