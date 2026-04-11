package Arrays.ArraysMultidimensionais09;

public class Aula008ArraysMultidimensionaisInicializacao {
    public static void main(String[] args) {
        
        int[][] arrayInt = new int[3][];
        int[] array = {1, 2, 3};//Da valor ao arrayInt[1]
        
        arrayInt[0] = new int[]{ 5, 8};
        arrayInt[1] = array; //Outra forma de inizialização
        arrayInt[2] = new int[6];

        for(int[] arrayBase : arrayInt){
            for(int num: arrayBase){
                System.out.println(num);
            }
        }

        System.out.println("------------");

        int[][] arrayInt2 = {

            {
                77,
                44,
            },

            {
                33,
                99,
                88
            }
        };

        for(int[] novoArray: arrayInt2){
            for(int num2: novoArray){
                System.out.println(num2);
            }
        }
    }
}
