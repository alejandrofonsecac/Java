package Arrays.ArraysMultidimensionais09;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        
        //1, 2, 3, 4, 5 Meses (Jan, Fev, Mar..)
        //31, 28, 31, 30 Dias dos Meses (MAX)

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 15;
        dias[1][1] = 24;
        dias[1][2] = 12;

        dias[2][0] = 11;
        dias[2][1] = 33;
        dias[2][2] = 44;
        

        for(int i = 0; i < dias.length; i++){
            for(int j = 0; j <  dias[i].length;j++){
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("------------");

        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }

    }
}
