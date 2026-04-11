package Operadores04;
public class Aula04OperadoresAtribuicao {

    public static void main(String[] args) {
        
        double bonus = 900;
        bonus += 1000;
        System.out.println("O seu bonus agora e de: "+bonus);

        bonus *= 2;
        System.out.println("O seu bonus dobrou! "+bonus);

        bonus /= 1.5;
        System.out.println("o seu bonus caiu: "+bonus);

        //--- Increment ---
        int contador = 0;
        contador ++; //adiciona 1 ao contador
        System.out.println(contador);
        contador --;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador++);//Primeiro imprimi depois adiciona
        System.out.println(++contador2);//Primeiro adiciona depois imprimi
    }
} 
    
