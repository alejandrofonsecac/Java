package LacosDeRepeticao;

public class Aula006EstruturaDeRepeticao {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        do{
            System.out.println("E dentro");
        }while (count < 10);//Neste ponto count ja ira ser 10


        for(int i = 0; i < 10; i++){
            System.out.println("For: "+i);
        }
    }
}
