package testesJava.calculadoraDeMatrizes.test;
import java.util.Scanner;

import testesJava.calculadoraDeMatrizes.dominio.somarMatrizes;

public class calculadoraExe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("--- BEM VINDO A CALCULADORA DE MATRIZES--- ");

        System.out.println("Digite o número de linhas: ");
        int linhas = input.nextInt();
        System.out.println("Digite o número de colunas: ");
        int colunas = input.nextInt();

        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];

        System.out.println("Digite os valores da primeira matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = input.nextInt();
            }
        }

        System.out.println("Digite os valores da segunda matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = input.nextInt();
            }
        }


        System.out.println("Escreva a operação da matriz: ");
        System.out.println("Digite 1 para somar: \nDigite 2 para subtrair: \nDigite 3 para multiplicar: ");
        int operacao = input.nextInt();

        switch(operacao){
            case 1:
                somarMatrizes.somaMatriz(matriz1, matriz2, linhas, colunas);
                break;

            case 2:

                    break;

                    case 3:

                    break;
        }
    }
}
