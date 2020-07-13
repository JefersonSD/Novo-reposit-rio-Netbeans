/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula_20_matrizes;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class InputMatriz3x3 {

    public static void main(String[] args) {

//        3. Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima a matriz criada e encontre a 
//           quantidade de números pares, a quantidade de números ímpares.
        Scanner t = new Scanner(System.in);

        int[][] matrizM = new int[3][3];

        for (int i = 0; i < matrizM.length; i++) {
            System.out.println("Informe os valores da " + (i + 1) + "ª linha:");
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.println("Valor " + (j + 1) + ":");
                matrizM[i][j] = t.nextInt();

            }
        }
        int contPar = 0, contImpar = 0;
        System.out.println("Todos os valores da matriz:");
        for (int i = 0; i < matrizM.length; i++) {
            System.out.println("Valores na " + (i + 1) + "ª linha da matriz:");
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.print(" [ " + matrizM[i][j] + " ] ");
                if (matrizM[i][j] % 2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
                System.out.println("");
        }
        System.out.println("");
        System.out.println("Quantidade de números pares na matriz:" + contPar);
        System.out.println("Quantidade de números ímpares na matriz:" + contImpar);

    }

}
