package Operadores04;

public class Aula04OperadoresLogicos {
    
    public static void main(String[] args) {
        

    //AND && (E)
    //OR || (OU)
    //NOT ! (negação)

    int idade = 36;
    float salario = 5900.34F;

    boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
    boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3612;
    System.out.println(isDentroDaLeiMaiorQueTrinta);
    System.out.println(isDentroDaLeiMenorQueTrinta);

    //OR ||

    double valorContaCorrente = 3000;
    double valorPopanca = 8000;
    float valorPlayStation = 5000;

    boolean playStationCompravel = valorContaCorrente > valorPlayStation || valorPopanca > valorPlayStation;
    System.out.println("playStationCompravel: " + playStationCompravel);
    }  
}
