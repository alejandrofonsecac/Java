package Arrays;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        //----- Valores padroes para cada tipo primitivo -----

        //byte, short, int, long, float, double = 0
        //char = '/u0000'
        //boolean = false
        //String = null 
        

        String [] nomes = new String[3];
        nomes[0] = "Joao";
        nomes[1] = "Maria";
        nomes[2] = "Mateus";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        nomes = new String[5]; //Substituindo o espaço e criando 2 novos
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
