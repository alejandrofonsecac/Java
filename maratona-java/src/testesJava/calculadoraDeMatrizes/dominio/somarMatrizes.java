package testesJava.calculadoraDeMatrizes.dominio;

public class somarMatrizes {
    public static void  somaMatriz(int[][] matriz1, int[][] matriz2, int linhas, int colunas){
        int resMatriz;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println(); // quebra de linha depois de imprimir uma linha completa
        }
    }
}
