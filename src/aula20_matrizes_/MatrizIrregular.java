/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20_matrizes_;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class MatrizIrregular {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.println("Quantidade de pessoas entrevistadas: ");
        int qtdEntrevistados = t.nextInt();

        String[][] nomesFilhos = new String[qtdEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++) {

            System.out.println("Informe a quantidade de filhos da " + (i + 1) + "ª pessoa: ");
            int qtdFilhos = t.nextInt();
            nomesFilhos[i] = new String[qtdFilhos];
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("Nome do " + (j + 1) + "º Filho:");
                nomesFilhos[i][j] = t.next();
            }

        }
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("A " + (i+1) + "ª pessoa tem " +nomesFilhos[i].length + " filhos");
            System.out.println("São eles: ");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);

            }

        }

    }

}
