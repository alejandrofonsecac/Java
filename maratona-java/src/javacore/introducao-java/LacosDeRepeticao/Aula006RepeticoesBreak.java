package LacosDeRepeticao;

public class Aula006RepeticoesBreak {
    public static void main(String[] args) {

        //Usamos break em switch e laços de repetição

        int valorMax = 50;
        for(int i = 0; i <= valorMax; i++){
            if(i > 25){
                break;
            }
            System.out.println("i = "+i);
        }
    }
}
