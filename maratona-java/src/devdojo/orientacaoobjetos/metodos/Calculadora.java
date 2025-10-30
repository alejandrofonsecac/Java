package devdojo.orientacaoobjetos.metodos;

public class Calculadora{

    public void somaNumeros(){
    System.out.println(2+5);
    }

    public  void subtraiNumeros(){
        System.out.println(2-5);
    }

    public void multiplicaNumeros( int num1, int num2){
        System.out.println(num1*num2);
    }

    public double divideNumeros(double num1, double num2){
        if(num2!=0){
            return num1/num2;
        }
        return 0;
    }

    public void imprimiDivisao(int num1, int num2){
        if(num2==0){
            System.out.println("Na existem divisão por zero");
            return; //Particularidade do void
        }else {
            System.out.println(num1/num2);
        }
    }

    //Test04

    public int[] alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 67;

        System.out.println(num1);
        System.out.println(num2);

        int[] numeros = new int [2];
        numeros[0] = num1;
        numeros[1] = num2;

        return numeros;
    }
}

