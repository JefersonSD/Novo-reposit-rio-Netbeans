/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula_20_matrizes;

/**
 *
 * @author jsjef
 */
public class Matriz10x10 {

    public static void main(String[] args) {
//        2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o menor valor da 
//           linha 5 e qual é o maior e o menor valor da coluna 7.

        int[][] matrizM = new int[10][10];
        for (int i = 0; i < matrizM.length; i++) {
            System.out.println("Valores na posição " + (i + 1));
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = (int) (Math.random() * 9);

                System.out.print("["+matrizM[i][j]+"]");
            }
            System.out.println("");

        }
        int maiorLinha5 = matrizM[4][0];
        int maiorColuna7 = matrizM[0][6];
        int menorLinha5 = matrizM[4][0];
        int menorColuna7 = matrizM[0][6];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[4][j] >= maiorLinha5) {
                    maiorLinha5 = matrizM[4][j];
                } else if (matrizM[4][j] <= menorLinha5) {
                    menorLinha5 = matrizM[4][j];
                }
                if (matrizM[i][6] >= maiorColuna7) {
                    maiorColuna7 = matrizM[i][6];
                } else if (matrizM[i][6] <= menorColuna7) {
                    menorColuna7 = matrizM[i][6];
                }
            }

        }
        System.out.println("Maior número da linha 5: " + maiorLinha5);
        System.out.println("Menor número da linha 5: " + menorLinha5);
        System.out.println("Maior número da coluna 7: " + maiorColuna7);
        System.out.println("Menor número da coluna 7: " + menorColuna7);
    }

}
