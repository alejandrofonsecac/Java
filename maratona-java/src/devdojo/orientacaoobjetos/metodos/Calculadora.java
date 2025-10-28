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
}

