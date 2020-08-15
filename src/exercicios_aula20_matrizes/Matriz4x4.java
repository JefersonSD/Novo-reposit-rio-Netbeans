/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula20_matrizes;

import java.util.Random;

/**
 *
 * @author jsjef
 */
public class Matriz4x4 {

    public static void main(String[] args) {

//        1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 - 9. Após isso determine o maior número da matriz e a sua 
//           posição (linha, coluna).
        int[][] matrizM = new int[4][4];

        for (int i = 0; i < matrizM.length; i++) {
            System.out.println("Conteúdo da " + (i + 1) + "ª linha: ");
            for (int j = 0; j < matrizM[i].length; j++) {
                // Outra forma de gerar números aleatórios ensinado pela Loiane
                // Random numeroRandom = new Random();                
                // matrizM[i][j] = numeroRandom.nextInt(9);
                matrizM[i][j] = (int) (Math.random() * 9);
                System.out.print("[" + matrizM[i][j]+ "]");
            }
            System.out.println("");
        }

        int maior = matrizM[0][0];
        int linha = 0, coluna = 0;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[i][j] > maior) {
                    maior = matrizM[i][j];
                    linha = i;
                    coluna = j;
                    
                }
            }

        }
        System.out.println("Maior número da matriz:" + maior);
        System.out.println("linha do maior número:" + linha);
        System.out.println("coluna do maior número:" + coluna);
    
    }

}
